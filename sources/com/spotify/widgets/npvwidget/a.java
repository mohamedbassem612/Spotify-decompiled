package com.spotify.widgets.npvwidget;

import p.onm;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class a extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ k c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(k kVar, onm onmVar) {
        super(onmVar);
        this.c = kVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, null, this);
    }
}
