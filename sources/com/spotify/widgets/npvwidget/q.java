package com.spotify.widgets.npvwidget;

import p.onm;
import p.tv80;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class q extends onm {
    public WidgetInteraction.NpvMetadata a;
    public String b;
    public tv80 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ t e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(t tVar, onm onmVar) {
        super(onmVar);
        this.e = tVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.e(null, null, null, this);
    }
}
