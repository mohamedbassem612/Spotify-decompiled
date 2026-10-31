package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b6e0 {
    public final w701 a;
    public final uu00 b;
    public final oi c;
    public final iac0 d;
    public final q8n e;
    public final boolean f;
    public final dt71 g;
    public final ht20 h;

    public b6e0(w701 w701Var, uu00 uu00Var, oi oiVar, iac0 iac0Var, q8n q8nVar, boolean z) {
        this.a = w701Var;
        this.b = uu00Var;
        this.c = oiVar;
        this.d = iac0Var;
        this.e = q8nVar;
        this.f = z;
        dt71 dt71VarE = mgo1.e(1, 0, 0, 6);
        this.g = dt71VarE;
        this.h = new ht20(dt71VarE, new pk50(2, (lnm) null, (byte) 7));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        z5e0 z5e0Var;
        if (onmVar instanceof z5e0) {
            z5e0Var = (z5e0) onmVar;
            int i = z5e0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                z5e0Var.c = i - Integer.MIN_VALUE;
            } else {
                z5e0Var = new z5e0(this, onmVar);
            }
        } else {
            z5e0Var = new z5e0(this, onmVar);
        }
        Object objL = z5e0Var.a;
        int i2 = z5e0Var.c;
        if (i2 == 0) {
            hm5.M(objL);
            Observable map = this.b.b(new oi("transcript-npv", false, new z9b0(str, (byte) 9))).filter(ak20.i).map(new j2e0(str, this, (byte) 2));
            z5e0Var.c = 1;
            objL = fc11.l(map, 1, (Object) null, z5e0Var);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objL);
        }
        return objL;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x009e  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:62:0x00df  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b9, code lost:
    
        if (r9.emit(r6, r0) == r11) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r13, p.onm r14) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.b6e0.b(java.lang.String, p.onm):java.lang.Object");
    }
}
