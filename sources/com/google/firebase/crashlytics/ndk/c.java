package com.google.firebase.crashlytics.ndk;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class c implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean z = JniNativeApi.b;
        return str.toLowerCase().endsWith(".apk");
    }
}
