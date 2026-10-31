package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class umd1 implements p421 {
    public final zob1 a;
    public final /* synthetic */ y1c1 b;

    public umd1(y1c1 y1c1Var) {
        this.b = y1c1Var;
        this.a = ((w2c1) y1c1Var).U(b521.class);
    }

    public final zob1 a() {
        return this.a;
    }

    public final void b(String str) {
        ((w2c1) this.b).T(new y421(str));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, lnm lnmVar) {
        tmd1 tmd1Var;
        if (lnmVar instanceof tmd1) {
            tmd1Var = (tmd1) lnmVar;
            int i = tmd1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tmd1Var.d = i - Integer.MIN_VALUE;
            } else {
                tmd1Var = new tmd1(this, (onm) lnmVar);
            }
        } else {
            tmd1Var = new tmd1(this, (onm) lnmVar);
        }
        Object objJ = tmd1Var.b;
        int i2 = tmd1Var.d;
        if (i2 == 0) {
            hm5.M(objJ);
            w421 w421Var = new w421(str);
            w2c1 w2c1Var = (w2c1) this.b;
            w2c1Var.T(w421Var);
            p90 p90Var = new p90(w2c1Var.U(b521.class), (byte) 14);
            ytw0 ytw0Var = jfv.b;
            lt20 lt20Var = new lt20(r4p1.w(p90Var, fdg1.k0(60, ngv.e)), new u9a1(3, (lnm) null, (byte) 3), (byte) 0);
            lm9 lm9Var = new lm9((lnm) null, str, (byte) 7);
            tmd1Var.a = str;
            tmd1Var.d = 1;
            objJ = b5p1.j(lt20Var, lm9Var, tmd1Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = tmd1Var.a;
            hm5.M(objJ);
        }
        Object obj = ((e331) objJ).a;
        boolean z = obj instanceof m231;
        ynl ynlVar = ynl.a;
        if (!z && (obj = (aol) ((b521) obj).a.get(str)) == null) {
            obj = ynlVar;
        }
        return obj instanceof m231 ? ynlVar : obj;
    }
}
