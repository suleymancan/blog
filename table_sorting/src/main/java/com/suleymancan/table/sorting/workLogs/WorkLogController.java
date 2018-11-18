package com.suleymancan.table.sorting.workLogs;

import com.suleymancan.table.sorting.model.WorkLog;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created on October, 2018
 *
 * @author suleymancan
 */
@Controller
@AllArgsConstructor
@RequestMapping("/workLogs")
public class WorkLogController {

	private final WorkLogService workLogService;

	@GetMapping
	public String index(final Model model, final Pageable pageable){
		model.addAttribute("workLogs", workLogService.getWorkLogs(pageable));
		return "workLogs/index";
	}
}