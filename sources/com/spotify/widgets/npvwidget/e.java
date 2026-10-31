package com.spotify.widgets.npvwidget;

import p.epl1;
import p.hab0;
import p.iu30;
import p.kb61;
import p.rih1;
import p.tv80;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e extends hab0 implements iu30 {
    public final /* synthetic */ tv80 a;
    public final /* synthetic */ WidgetInteraction.ItemClick b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(tv80 tv80Var, WidgetInteraction.ItemClick itemClick, String str) {
        super(1);
        this.a = tv80Var;
        this.b = itemClick;
        this.c = str;
    }

    public final Object invoke(Object obj) {
        ((kb61) obj).P().a(new epl1(this.a.a.a, this.b.getUri().toString(), this.c));
        return rih1.a;
    }
}
