package com.comscore.android.util.update;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class UpdateFrom5_4_x$b implements FilenameFilter {
    final /* synthetic */ UpdateFrom5_4_x a;

    public UpdateFrom5_4_x$b(UpdateFrom5_4_x updateFrom5_4_x) {
        this.a = updateFrom5_4_x;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return str.startsWith("cs_cache_");
    }
}
