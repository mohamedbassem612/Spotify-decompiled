package com.spotify.widgets.npvwidget;

import p.cv71;
import p.onm;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class s extends onm {
    public cv71 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ t d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, onm onmVar) {
        super(onmVar);
        this.d = tVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.g(null, this);
    }
}
