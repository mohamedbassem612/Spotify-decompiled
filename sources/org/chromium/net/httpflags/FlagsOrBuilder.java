package org.chromium.net.httpflags;

import java.util.Map;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public interface FlagsOrBuilder extends v2j0 {
    boolean containsFlags(String str);

    /* synthetic */ s2j0 getDefaultInstanceForType();

    @Deprecated
    Map<String, FlagValue> getFlags();

    int getFlagsCount();

    Map<String, FlagValue> getFlagsMap();

    FlagValue getFlagsOrDefault(String str, FlagValue flagValue);

    FlagValue getFlagsOrThrow(String str);

    /* synthetic */ boolean isInitialized();
}
