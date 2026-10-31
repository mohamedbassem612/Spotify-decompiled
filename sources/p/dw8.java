package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dw8 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw8(boolean z, a680 a680Var, String str, boolean z2, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.c = z;
        this.f = a680Var;
        this.d = str;
        this.e = z2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        Object obj3 = this.f;
        switch (b) {
            case 0:
                return new dw8(obj3, this.c, (String) obj2, this.e, lnmVar, (byte) 0);
            case 1:
                return new dw8(this.c, (a680) obj3, (String) obj2, this.e, lnmVar);
            case 2:
                return new dw8(this.c, this.e, obj3, (ven0) obj2, lnmVar, (byte) 2);
            case 3:
                return new dw8(obj3, this.c, (String) obj2, this.e, lnmVar, (byte) 3);
            default:
                return new dw8(this.c, this.e, obj3, (ven0) obj2, lnmVar, (byte) 4);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:150:0x032c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x032e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:152:0x0330  */
    /* JADX WARN: Code duplicated, block: B:153:0x0334  */
    /* JADX WARN: Code duplicated, block: B:157:0x0340 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:158:0x0342  */
    /* JADX WARN: Code duplicated, block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0072  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ad A[PHI: r10 r12
      0x01ad: PHI (r10v6 p.ven0) = (r10v4 p.ven0), (r10v7 p.ven0) binds: [B:91:0x0229, B:63:0x01a8] A[DONT_GENERATE, DONT_INLINE]
      0x01ad: PHI (r12v7 int) = (r12v5 int), (r12v8 int) binds: [B:91:0x0229, B:63:0x01a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:87:0x0216 A[PHI: r10 r12
      0x0216: PHI (r10v2 p.ven0) = (r10v1 p.ven0), (r10v3 p.ven0) binds: [B:85:0x0213, B:66:0x01b8] A[DONT_GENERATE, DONT_INLINE]
      0x0216: PHI (r12v3 int) = (r12v2 int), (r12v4 int) binds: [B:85:0x0213, B:66:0x01b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x0220 A[PHI: r10 r12
      0x0220: PHI (r10v4 p.ven0) = (r10v2 p.ven0), (r10v5 p.ven0) binds: [B:88:0x021d, B:65:0x01b1] A[DONT_GENERATE, DONT_INLINE]
      0x0220: PHI (r12v5 int) = (r12v3 int), (r12v6 int) binds: [B:88:0x021d, B:65:0x01b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x0235 A[PHI: r12
      0x0235: PHI (r12v9 int) = (r12v7 int), (r12v10 int) binds: [B:94:0x0232, B:62:0x01a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0290, code lost:
    
        if (r0.a(r4, r29) == r15) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02a5, code lost:
    
        if (r0.e(r4, r29) == r15) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
    
        if (p.rc2.O(400, r1, r29) == r15) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0126, code lost:
    
        if (r1 == r15) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 882
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.dw8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dw8(Object obj, boolean z, String str, boolean z2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.f = obj;
        this.c = z;
        this.d = str;
        this.e = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dw8(boolean z, boolean z2, Object obj, ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = z;
        this.e = z2;
        this.f = obj;
        this.d = ven0Var;
    }
}
