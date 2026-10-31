package p;

import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.ObservableSource;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yfo0 extends ov61 {
    public final b7n a;
    public final vqb0 b;
    public final x5u c;
    public final jqb0 d;
    public final lt20 e;

    public yfo0(b7n b7nVar, vqb0 vqb0Var, x5u x5uVar, jqb0 jqb0Var) {
        this.a = b7nVar;
        this.b = vqb0Var;
        this.c = x5uVar;
        this.d = jqb0Var;
        this.e = new lt20(new tu41(new x010(yoi1.g((ObservableSource) vqb0Var.invoke()), b7nVar.a(n6n.a), new a82(3, (lnm) null, (byte) 4), (byte) 1), (byte) 9), new q8t0(3, (lnm) null, (byte) 13), (byte) 0);
    }

    public final mr20 getValue() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007e A[PHI: r7
      0x007e: PHI (r7v2 boolean) = (r7v1 boolean), (r7v1 boolean), (r7v4 boolean) binds: [B:22:0x0064, B:24:0x007b, B:16:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x0091  */
    /* JADX WARN: Code duplicated, block: B:32:0x009a  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object setValue(Boolean bool, boolean z, tv80 tv80Var, lnm lnmVar) {
        xfo0 xfo0Var;
        boolean z2;
        if (lnmVar instanceof xfo0) {
            xfo0Var = (xfo0) lnmVar;
            int i = xfo0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xfo0Var.d = i - Integer.MIN_VALUE;
            } else {
                xfo0Var = new xfo0(this, (onm) lnmVar);
            }
        } else {
            xfo0Var = new xfo0(this, (onm) lnmVar);
        }
        Object objI = xfo0Var.b;
        int i2 = xfo0Var.d;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objI);
            ezc ezcVarG = yoi1.g((ObservableSource) this.b.invoke());
            xfo0Var.a = z;
            xfo0Var.d = 1;
            objI = b5p1.i(ezcVarG, xfo0Var);
            if (objI != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            z = xfo0Var.a;
            hm5.M(objI);
        } else {
            if (i2 == 2) {
                z = xfo0Var.a;
                hm5.M(objI);
                Boolean boolValueOf = Boolean.valueOf(z);
                xfo0Var.a = z;
                xfo0Var.d = 3;
                objI = this.a.b(n6n.a, boolValueOf, xfo0Var);
                if (objI != d9nVar) {
                    z2 = z;
                }
                return d9nVar;
            }
            if (i2 != 3) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = xfo0Var.a;
            hm5.M(objI);
        }
        return ((Boolean) objI).booleanValue() ? new it61(Boolean.valueOf(z2)) : new ht61((Integer) null, 0);
        if (((Boolean) objI).booleanValue()) {
            this.c.invoke();
            CompletableSource completableSource = (CompletableSource) this.d.invoke();
            xfo0Var.a = z;
            xfo0Var.d = 2;
            if (fc11.i(completableSource, xfo0Var) != d9nVar) {
                Boolean boolValueOf2 = Boolean.valueOf(z);
                xfo0Var.a = z;
                xfo0Var.d = 3;
                objI = this.a.b(n6n.a, boolValueOf2, xfo0Var);
                if (objI != d9nVar) {
                    z2 = z;
                    if (((Boolean) objI).booleanValue()) {
                    }
                }
            }
        } else {
            Boolean boolValueOf3 = Boolean.valueOf(z);
            xfo0Var.a = z;
            xfo0Var.d = 3;
            objI = this.a.b(n6n.a, boolValueOf3, xfo0Var);
            if (objI != d9nVar) {
                z2 = z;
                if (((Boolean) objI).booleanValue()) {
                }
            }
        }
        return d9nVar;
    }

    public final /* bridge */ /* synthetic */ Object setValue(Object obj, Object obj2, tv80 tv80Var, lnm lnmVar) {
        return setValue((Boolean) obj, ((Boolean) obj2).booleanValue(), tv80Var, lnmVar);
    }
}
