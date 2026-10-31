package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class icd1 implements iu30 {
    public final ssy0 a;
    public final qpy0 b;
    public final ofd c;
    public final jkp0 d;
    public final ek1 e;
    public final p8o f;
    public final jqb0 g;

    public icd1(ssy0 ssy0Var, qpy0 qpy0Var, ofd ofdVar, jkp0 jkp0Var, ek1 ek1Var, p8o p8oVar, jqb0 jqb0Var) {
        this.a = ssy0Var;
        this.b = qpy0Var;
        this.c = ofdVar;
        this.d = jkp0Var;
        this.e = ek1Var;
        this.f = p8oVar;
        this.g = jqb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(lnm lnmVar) {
        gcd1 gcd1Var;
        if (lnmVar instanceof gcd1) {
            gcd1Var = (gcd1) lnmVar;
            int i = gcd1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gcd1Var.c = i - Integer.MIN_VALUE;
            } else {
                gcd1Var = new gcd1(this, lnmVar);
            }
        } else {
            gcd1Var = new gcd1(this, lnmVar);
        }
        Object obj = gcd1Var.a;
        int i2 = gcd1Var.c;
        rih1 rih1Var = rih1.a;
        lnm lnmVar2 = null;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        if (this.b.a()) {
            lt20 lt20Var = new lt20(new fu20((mr20) this.c.invoke(), new cy9((Object) this, lnmVar2, (byte) 14), (byte) 1), new bi61(3, (lnm) null, (byte) 2), (byte) 0);
            gcd1Var.c = 1;
            Object objP = l4p1.p(lt20Var, gcd1Var);
            d9n d9nVar = d9n.a;
            if (objP == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a4, code lost:
    
        if (r11 == r5) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(int r10, p.onm r11) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.icd1.d(int, p.onm):java.lang.Object");
    }
}
