package com.spotify.mobius.android;

import p.k8c0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public /* synthetic */ class MutableLiveQueue$1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[k8c0.values().length];
        a = iArr;
        try {
            iArr[k8c0.ON_RESUME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[k8c0.ON_PAUSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[k8c0.ON_DESTROY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
