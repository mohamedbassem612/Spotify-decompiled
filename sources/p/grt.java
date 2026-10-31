package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class grt extends ov61 {
    public final vfl a;
    public final kt91 b;
    public final kly0 c;
    public final kst d;
    public final lt20 e = x4p1.h(h4p1.g(new eum(this, (lnm) null, (byte) 28)), new re1((byte) 20));

    public grt(vfl vflVar, kt91 kt91Var, g5t g5tVar, kst kstVar) {
        this.a = vflVar;
        this.b = kt91Var;
        this.c = g5tVar;
        this.d = kstVar;
    }

    public final mr20 getValue() {
        return this.e;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object setValue(Boolean bool, boolean z, tv80 tv80Var, lnm lnmVar) throws NoWhenBranchMatchedException {
        frt frtVar;
        Object objB;
        if (lnmVar instanceof frt) {
            frtVar = (frt) lnmVar;
            int i = frtVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                frtVar.d = i - Integer.MIN_VALUE;
            } else {
                frtVar = new frt(this, (onm) lnmVar);
            }
        } else {
            frtVar = new frt(this, (onm) lnmVar);
        }
        Object obj = frtVar.b;
        int i2 = frtVar.d;
        if (i2 == 0) {
            hm5.M(obj);
            String strA = hrt.a(3);
            frtVar.a = z;
            frtVar.d = 1;
            objB = ((yfl) this.a).b("settings", strA, frtVar, z);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = frtVar.a;
            hm5.M(obj);
            objB = ((e331) obj).a;
        }
        if (e331.a(objB) != null) {
            return new ht61((Integer) null, 0);
        }
        if (!z) {
            er91 er91VarC = k4k.p(2131961685).c();
            kt91 kt91Var = this.b;
            if (kt91Var.g()) {
                kt91Var.k(er91VarC);
            } else {
                kt91Var.o(er91VarC);
            }
        }
        return new it61(yah0.m(z));
    }

    public final /* bridge */ /* synthetic */ Object setValue(Object obj, Object obj2, tv80 tv80Var, lnm lnmVar) {
        return setValue((Boolean) obj, ((Boolean) obj2).booleanValue(), tv80Var, lnmVar);
    }
}
