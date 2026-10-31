package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qag1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 2;
    public byte b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qag1(Function0 function0, o95 o95Var, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, lnm lnmVar) {
        super(2, lnmVar);
        this.d = function0;
        this.e = o95Var;
        this.f = ven0Var;
        this.g = ven0Var2;
        this.h = ven0Var3;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (b) {
            case 0:
                qag1 qag1Var = new qag1((kb61) obj3, (String) this.f, (uu00) obj2, lnmVar);
                qag1Var.c = obj;
                return qag1Var;
            case 1:
                qag1 qag1Var2 = new qag1((xtl1) this.e, (trc0) this.f, (jge) obj3, (aek1) obj2, lnmVar);
                qag1Var2.c = obj;
                return qag1Var2;
            case 2:
                qag1 qag1Var3 = new qag1((Function0) this.d, (o95) this.e, (ven0) this.f, (ven0) obj3, (ven0) obj2, lnmVar);
                qag1Var3.c = obj;
                return qag1Var3;
            case 3:
                qag1 qag1Var4 = new qag1((ieo1) this.f, (yln1) obj3, (zwo1) obj2, lnmVar);
                qag1Var4.e = obj;
                return qag1Var4;
            default:
                qag1 qag1Var5 = new qag1((f0p1) obj3, (nhn1) obj2, lnmVar);
                qag1Var5.c = obj;
                return qag1Var5;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((rvo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((rvo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:154:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0157  */
    /* JADX WARN: Code duplicated, block: B:47:0x016c  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007b, code lost:
    
        if (r23.a(r2, r4, r24) != r12) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x021b, code lost:
    
        if (p.hap1.i(400, r24) == r12) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0232, code lost:
    
        if (r1.g(r2, r24) == r12) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v47, types: [byte] */
    /* JADX WARN: Type inference failed for: r1v54, types: [p.vgn0] */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v60 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 1018
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.qag1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qag1(kb61 kb61Var, String str, uu00 uu00Var, lnm lnmVar) {
        super(2, lnmVar);
        this.g = kb61Var;
        this.f = str;
        this.h = uu00Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qag1(xtl1 xtl1Var, trc0 trc0Var, jge jgeVar, aek1 aek1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.e = xtl1Var;
        this.f = trc0Var;
        this.g = jgeVar;
        this.h = aek1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qag1(ieo1 ieo1Var, yln1 yln1Var, zwo1 zwo1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.f = ieo1Var;
        this.g = yln1Var;
        this.h = zwo1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qag1(f0p1 f0p1Var, nhn1 nhn1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.g = f0p1Var;
        this.h = nhn1Var;
    }
}
