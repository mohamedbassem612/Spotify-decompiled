package com.google.android.gms.common.internal;

import p.lal;
import p.zod;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zzaf extends Exception {
    public final lal a;

    public zzaf(lal lalVar) {
        zod.j("ResolvableConnectionException can only be created with a connection result containing a resolution.", (lalVar.b == 0 || lalVar.c == null) ? false : true);
        this.a = lalVar;
    }
}
