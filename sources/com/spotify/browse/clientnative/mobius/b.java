package com.spotify.browse.clientnative.mobius;

import p.b1e0;
import p.cxo1;
import p.ezc;
import p.hs00;
import p.iac0;
import p.q8n;
import p.xvo;
import p.yoi1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b {
    public final q8n a;
    public final q8n b;
    public final b1e0 c;
    public final ezc d;
    public final ezc e;

    public b(q8n q8nVar, q8n q8nVar2, b1e0 b1e0Var, iac0 iac0Var, hs00 hs00Var, xvo xvoVar) {
        this.a = q8nVar;
        this.b = q8nVar2;
        this.c = b1e0Var;
        this.d = yoi1.g(hs00Var.d().skip(1L).map(a.a));
        this.e = yoi1.g(xvoVar.a(true).skip(1L).distinctUntilChanged().map(cxo1.N0));
    }
}
