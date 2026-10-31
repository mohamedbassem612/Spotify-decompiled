package com.spotify.widgets.npvwidget;

import p.a8d1;
import p.c9n;
import p.d9n;
import p.e331;
import p.eg;
import p.hm5;
import p.lnm;
import p.m231;
import p.ou80;
import p.rih1;
import p.tv80;
import p.vu30;
import p.y210;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f extends a8d1 implements vu30 {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ k c;
    public final /* synthetic */ WidgetInteraction.ItemClick d;
    public final /* synthetic */ tv80 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, WidgetInteraction.ItemClick itemClick, tv80 tv80Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = kVar;
        this.d = itemClick;
        this.e = tv80Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        f fVar = new f(this.c, this.d, this.e, lnmVar);
        fVar.b = obj;
        return fVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        ou80 m231Var;
        boolean z = this.a;
        try {
            if (!z) {
                hm5.M(obj);
                k kVar = this.c;
                WidgetInteraction.ItemClick itemClick = this.d;
                tv80 tv80Var = this.e;
                y210 y210Var = kVar.d;
                String string = itemClick.getUri().toString();
                this.b = null;
                this.a = true;
                obj = y210Var.a(string, tv80Var, this);
                d9n d9nVar = d9n.a;
                if (obj == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (!z) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            m231Var = (ou80) obj;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        return new e331(m231Var);
    }
}
