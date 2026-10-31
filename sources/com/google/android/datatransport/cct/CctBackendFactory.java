package com.google.android.datatransport.cct;

import android.content.Context;
import p.fog1;
import p.n09;
import p.r9e;
import p.zrn;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class CctBackendFactory {
    public fog1 create(zrn zrnVar) {
        Context context = ((n09) zrnVar).a;
        n09 n09Var = (n09) zrnVar;
        return new r9e(context, n09Var.b, n09Var.c);
    }
}
