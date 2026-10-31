package org.chromium.net.httpflags;

import java.util.Map;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public interface BaseFeatureOverridesOrBuilder extends v2j0 {
    boolean containsFeatureStates(String str);

    /* synthetic */ s2j0 getDefaultInstanceForType();

    @Deprecated
    Map<String, BaseFeatureOverrides.FeatureState> getFeatureStates();

    int getFeatureStatesCount();

    Map<String, BaseFeatureOverrides.FeatureState> getFeatureStatesMap();

    BaseFeatureOverrides.FeatureState getFeatureStatesOrDefault(String str, BaseFeatureOverrides.FeatureState featureState);

    BaseFeatureOverrides.FeatureState getFeatureStatesOrThrow(String str);

    /* synthetic */ boolean isInitialized();
}
