package p;

import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cp20 implements zob1 {
    public final zob1 a;
    public final iu30 b;
    public mmr0 c;

    public cp20(iu30 iu30Var, zob1 zob1Var) {
        this.a = zob1Var;
        this.b = iu30Var;
    }

    public final List c() {
        return f(this.a.getValue()).c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        bp20 bp20Var;
        if (lnmVar instanceof bp20) {
            bp20Var = (bp20) lnmVar;
            int i = bp20Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bp20Var.c = i - Integer.MIN_VALUE;
            } else {
                bp20Var = new bp20(this, lnmVar);
            }
        } else {
            bp20Var = new bp20(this, lnmVar);
        }
        Object obj = bp20Var.a;
        int i2 = bp20Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            jge jgeVarE = hu20.e(this.a, new uls((lnm) null, this, (byte) 18));
            oq0 oq0Var = new oq0(vr20Var, (byte) 14);
            bp20Var.c = 1;
            Object objCollect = jgeVarE.collect(oq0Var, bp20Var);
            d9n d9nVar = d9n.a;
            if (objCollect == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        eg.m("StateFlow collection should never complete");
        return null;
    }

    public final zob1 f(Object obj) {
        mmr0 mmr0Var = this.c;
        if (mmr0Var != null) {
            Object obj2 = mmr0Var.a;
            WeakReference weakReference = (WeakReference) mmr0Var.b;
            if (!u890.j(obj2, obj)) {
                weakReference = null;
            }
            zob1 zob1Var = weakReference != null ? (zob1) weakReference.get() : null;
            if (zob1Var != null) {
                return zob1Var;
            }
        }
        zob1 zob1Var2 = (zob1) this.b.invoke(obj);
        this.c = oqn1.n(obj, new WeakReference(zob1Var2));
        return zob1Var2;
    }

    public final Object getValue() {
        return f(this.a.getValue()).getValue();
    }
}
