package io.sdb.model;

import io.sdb.model.base.BaseScheduleJob;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class ScheduleJob extends BaseScheduleJob<ScheduleJob> {
	public static final ScheduleJob dao = new ScheduleJob().dao();

	/**
	 * 任务调度参数key
	 */
	public static final String JOB_PARAM_KEY = "JOB_PARAM_KEY";
}
