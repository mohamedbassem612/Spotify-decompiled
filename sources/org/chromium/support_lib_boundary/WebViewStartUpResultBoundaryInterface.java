package org.chromium.support_lib_boundary;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public interface WebViewStartUpResultBoundaryInterface {
    List<Throwable> getAsyncStartUpLocations();

    List<Throwable> getBlockingStartUpLocations();

    Long getMaxTimePerTaskInUiThreadMillis();

    Long getTotalTimeInUiThreadMillis();
}
