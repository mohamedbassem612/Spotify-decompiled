package defpackage;

import p.a8d1;
import p.bw91;
import p.c380;
import p.c9n;
import p.d9n;
import p.eg;
import p.hap1;
import p.hkm1;
import p.hm5;
import p.jsg;
import p.lnm;
import p.o7h;
import p.o95;
import p.rih1;
import p.vu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class c extends a8d1 implements vu30 {
    public int a;
    public boolean b;
    public final /* synthetic */ o95 c;
    public final /* synthetic */ bw91 d;
    public final /* synthetic */ c380 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o95 o95Var, bw91 bw91Var, c380 c380Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = o95Var;
        this.d = bw91Var;
        this.e = c380Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new c(this.c, this.d, this.e, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            i = 0;
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i2 = this.a;
            hm5.M(obj);
            i = i2;
        }
        while (true) {
            o95 o95Var = this.c;
            if (((Number) o95Var.e()).floatValue() >= 2000.0f) {
                return rih1.a;
            }
            int i3 = i + 1;
            hkm1 hkm1Var = new hkm1(i, i >> 31);
            String str = (String) o7h.P0(this.e, hkm1Var);
            float fE = hkm1Var.e();
            jsg jsgVar = f.a;
            this.d.add(new a(str, fE, (float) hkm1Var.d(jsgVar.a, jsgVar.b), ((Number) o95Var.e()).floatValue()));
            this.a = i3;
            this.b = true;
            Object objI = hap1.i(40L, this);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
            i = i3;
        }
    }
}
