package com.spotify.widgets.npvwidget;

import p.onm;
import p.tv80;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r extends onm {
    public String a;
    public tv80 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ t d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar, onm onmVar) {
        super(onmVar);
        this.d = tVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.f(null, null, null, this);
    }
}
