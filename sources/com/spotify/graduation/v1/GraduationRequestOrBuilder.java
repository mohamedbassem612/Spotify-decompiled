package com.spotify.graduation.v1;

import java.util.List;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public interface GraduationRequestOrBuilder extends v2j0 {
    /* synthetic */ s2j0 getDefaultInstanceForType();

    DownloadLevel getLevels(int i);

    int getLevelsCount();

    List<DownloadLevel> getLevelsList();

    int getLevelsValue(int i);

    List<Integer> getLevelsValueList();

    /* synthetic */ boolean isInitialized();
}
