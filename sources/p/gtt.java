package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gtt {
    public final aje0 a;
    public final qrt b;
    public final yqg c;
    public final crt d;
    public final ptf1 e;
    public final vfl f;
    public final prt g;

    public gtt(aje0 aje0Var, qrt qrtVar, yqg yqgVar, crt crtVar, ptf1 ptf1Var, vfl vflVar, prt prtVar) {
        this.a = aje0Var;
        this.b = qrtVar;
        this.c = yqgVar;
        this.d = crtVar;
        this.e = ptf1Var;
        this.f = vflVar;
        this.g = prtVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:66:0x0121  */
    /* JADX WARN: Code duplicated, block: B:68:0x0124  */
    /* JADX WARN: Code duplicated, block: B:73:0x0140  */
    /* JADX WARN: Code duplicated, block: B:74:0x0142  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x015a  */
    /* JADX WARN: Code duplicated, block: B:82:0x015c  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00df, code lost:
    
        if (r0 == r5) goto L45;
     */
    /* JADX WARN: Type inference failed for: r14v0, types: [int, short] */
    /* JADX WARN: Type inference failed for: r7v6, types: [int, short] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r21, java.lang.String r23, p.onm r24) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.gtt.a(long, java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v10, types: [int, short] */
    /* JADX WARN: Type inference failed for: r12v3, types: [int, short] */
    public final Object b(long j, String str, onm onmVar) throws NoWhenBranchMatchedException {
        ftt fttVar;
        Object objA;
        if (onmVar instanceof ftt) {
            fttVar = (ftt) onmVar;
            int i = fttVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                fttVar.e = i - Integer.MIN_VALUE;
            } else {
                fttVar = new ftt(this, onmVar);
            }
        } else {
            fttVar = new ftt(this, onmVar);
        }
        Object obj = fttVar.c;
        int i2 = fttVar.e;
        qrt qrtVar = this.b;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            if (!qrtVar.a()) {
                return xst.a;
            }
            fttVar.b = str;
            fttVar.a = (int) j;
            fttVar.e = 1;
            objA = ((yfl) this.f).a("fetch_consent_gate", fttVar);
            if (objA != d9nVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = fttVar.a;
        str = fttVar.b;
        hm5.M(obj);
        objA = ((e331) obj).a;
        Throwable thA = e331.a(objA);
        if (thA != null) {
            if (str == null) {
                str = "unspecified";
            }
            this.g.c(3, "consentLoadFailed", str, 0L);
            return new wst(new krt(thA));
        }
        cgl cglVar = (cgl) objA;
        if (cglVar == cgl.b) {
            return vst.a;
        }
        if (cglVar != cgl.c) {
            return ust.a;
        }
        if (!qrtVar.b()) {
            return yst.a;
        }
        fttVar.b = null;
        fttVar.a = (int) j;
        fttVar.e = 2;
        Object objA2 = a(j, str, fttVar);
        return objA2 == d9nVar ? d9nVar : objA2;
    }
}
