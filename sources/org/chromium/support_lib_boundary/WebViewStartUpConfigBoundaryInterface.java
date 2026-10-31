package org.chromium.support_lib_boundary;

import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public interface WebViewStartUpConfigBoundaryInterface {
    Executor getBackgroundExecutor();

    Set<String> getProfileNamesToLoad();

    boolean shouldRunUiThreadStartUpTasks();
}
