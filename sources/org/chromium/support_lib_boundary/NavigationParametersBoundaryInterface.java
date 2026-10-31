package org.chromium.support_lib_boundary;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public interface NavigationParametersBoundaryInterface extends FeatureFlagHolderBoundaryInterface {
    Map<String, String> getAdditionalHeaders();

    boolean getShouldReplaceCurrentEntry();
}
