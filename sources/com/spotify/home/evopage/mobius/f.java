package com.spotify.home.evopage.mobius;

import p.a8d1;
import p.any;
import p.b5p1;
import p.bpb1;
import p.d9n;
import p.eg;
import p.hm5;
import p.lnm;
import p.mr20;
import p.oxd1;
import p.qmd1;
import p.rih1;
import p.u4p1;
import p.vr20;
import p.vu30;
import p.ynb0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f extends a8d1 implements vu30 {
    public byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ mr20 c;
    public final /* synthetic */ ynb0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(mr20 mr20Var, ynb0 ynb0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = mr20Var;
        this.d = ynb0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        f fVar = new f(this.c, this.d, lnmVar);
        fVar.b = obj;
        return fVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        vr20 vr20Var = (vr20) this.b;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            any anyVar = new any(this.c, (byte) 10);
            this.b = vr20Var;
            this.a = (byte) 1;
            if (b5p1.i(anyVar, this) != d9nVar) {
            }
            return d9nVar;
        }
        if (b != 1) {
            if (b == 2) {
                hm5.M(obj);
                return rih1.a;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        bpb1 bpb1Var = ((oxd1) this.d.get()).a.a;
        this.b = null;
        this.a = (byte) 2;
        u4p1.S(vr20Var);
        bpb1Var.collect(new qmd1(vr20Var, (byte) 5), this);
        return d9nVar;
    }
}
