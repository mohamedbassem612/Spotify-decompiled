package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lsj1 extends a8d1 implements bv30 {
    public boolean a;
    public /* synthetic */ nuj1 b;
    public /* synthetic */ ouj1 c;
    public /* synthetic */ muj1 d;
    public /* synthetic */ tqw e;
    public final /* synthetic */ msj1 f;
    public final /* synthetic */ iu30 g;
    public final /* synthetic */ ywv0 h;
    public final /* synthetic */ tgt0 i;
    public final /* synthetic */ gn10 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lsj1(msj1 msj1Var, iu30 iu30Var, ywv0 ywv0Var, tgt0 tgt0Var, gn10 gn10Var, lnm lnmVar) {
        super(5, lnmVar);
        this.f = msj1Var;
        this.g = iu30Var;
        this.h = ywv0Var;
        this.i = tgt0Var;
        this.t = gn10Var;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        tgt0 tgt0Var = this.i;
        gn10 gn10Var = this.t;
        lsj1 lsj1Var = new lsj1(this.f, this.g, this.h, tgt0Var, gn10Var, (lnm) obj5);
        lsj1Var.b = (nuj1) obj;
        lsj1Var.c = (ouj1) obj2;
        lsj1Var.d = (muj1) obj3;
        lsj1Var.e = (tqw) obj4;
        return lsj1Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        iu30 iu30Var;
        nuj1 nuj1Var = this.b;
        ouj1 ouj1Var = this.c;
        muj1 muj1Var = this.d;
        tqw tqwVar = this.e;
        boolean z = this.a;
        iu30 iu30Var2 = this.g;
        if (!z) {
            hm5.M(obj);
            boolean z2 = muj1Var instanceof huj1;
            msj1 msj1Var = this.f;
            if (z2) {
                ou80 ou80Var = tqwVar != null ? n3o1.y(tqwVar).a : null;
                ytp0 ytp0Var = msj1Var.f;
                huj1 huj1Var = (huj1) muj1Var;
                String str = huj1Var.b;
                m4m m4mVar = huj1Var.d;
                ksj1 ksj1Var = new ksj1(this.h, muj1Var, msj1Var, nuj1Var, ouj1Var, ou80Var, this.i, this.t, null);
                this.b = null;
                this.c = null;
                this.d = muj1Var;
                this.e = null;
                this.a = true;
                iu30Var = iu30Var2;
                Object objM = ytp0Var.m(str, m4mVar, (tv80) null, ksj1Var, this);
                d9n d9nVar = d9n.a;
                if (objM == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (muj1Var instanceof iuj1) {
                    throw null;
                }
                if (muj1Var instanceof juj1) {
                    juj1 juj1Var = (juj1) muj1Var;
                    iu30Var2.invoke(new juj1(juj1Var.a, juj1Var.b));
                } else if (muj1Var instanceof luj1) {
                    luj1 luj1Var = (luj1) muj1Var;
                    iu30Var2.invoke(new luj1(luj1Var.a, luj1Var.b));
                } else {
                    if (!(muj1Var instanceof kuj1)) {
                        eg.o();
                        return null;
                    }
                    lzn0 lzn0Var = msj1Var.a;
                    kuj1 kuj1Var = (kuj1) muj1Var;
                    String str2 = kuj1Var.c;
                    if (str2.length() > 0) {
                        lzn0Var.f(new dwn0(str2, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tqwVar != null ? new bwn0(n3o1.y(tqwVar)) : null));
                    }
                    iu30Var2.invoke(new kuj1(kuj1Var.a, kuj1Var.b, str2));
                }
            }
            return rih1.a;
        }
        if (!z) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        iu30Var = iu30Var2;
        huj1 huj1Var2 = (huj1) muj1Var;
        iu30Var.invoke(new huj1(huj1Var2.a, huj1Var2.b, huj1Var2.c, huj1Var2.d));
        return rih1.a;
    }
}
