package p;

import io.reactivex.rxjava3.core.Completable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u5x extends ov61 {
    public final yqg a;
    public final o241 b;
    public final rh11 c;
    public final luw0 d;

    public u5x(yqg yqgVar, o241 o241Var, rh11 rh11Var, luw0 luw0Var) {
        this.a = yqgVar;
        this.b = o241Var;
        this.c = rh11Var;
        this.d = luw0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i, onm onmVar) {
        r5x r5xVar;
        String strValueOf;
        int i2;
        if (onmVar instanceof r5x) {
            r5xVar = (r5x) onmVar;
            int i3 = r5xVar.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                r5xVar.d = i3 - Integer.MIN_VALUE;
            } else {
                r5xVar = new r5x(this, onmVar);
            }
        } else {
            r5xVar = new r5x(this, onmVar);
        }
        Object obj = r5xVar.b;
        int i4 = r5xVar.d;
        d9n d9nVar = d9n.a;
        if (i4 != 0) {
            if (i4 == 1) {
                i = r5xVar.a;
                hm5.M(obj);
            } else {
                if (i4 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = r5xVar.a;
                hm5.M(obj);
            }
            return new it61(new Integer(i2));
        }
        hm5.M(obj);
        if (i == v5x.c.a) {
            strValueOf = "2";
        } else {
            strValueOf = i == v5x.b.a ? "1" : String.valueOf(this.a.b() / 1000);
        }
        Completable completableA = this.d.a("employee-free-opt-in", strValueOf);
        r5xVar.a = i;
        r5xVar.d = 1;
        if (fc11.i(completableA, r5xVar) != d9nVar) {
        }
        return d9nVar;
        mr20 value = getValue();
        s5x s5xVar = new s5x(i, null, (byte) 0);
        r5xVar.a = i;
        r5xVar.d = 2;
        if (b5p1.j(value, s5xVar, r5xVar) != d9nVar) {
            i2 = i;
            return new it61(new Integer(i2));
        }
        return d9nVar;
    }

    public final mr20 getValue() {
        return new lt20(new tu41(new pzs(yoi1.g(this.b.a), this, (byte) 18), (byte) 9), new q8t0(3, (lnm) null, (byte) 13), (byte) 0);
    }

    public final /* bridge */ /* synthetic */ Object setValue(Object obj, Object obj2, tv80 tv80Var, lnm lnmVar) {
        return a(((Number) obj2).intValue(), (onm) lnmVar);
    }
}
