package com.comscore.android.task;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public interface TaskExceptionHandler {
    void exception(Exception exc, TaskExecutor taskExecutor, Runnable runnable);
}
