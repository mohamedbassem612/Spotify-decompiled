package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fo71 implements bo71 {
    public final zwz0 a;
    public final ao71 b;
    public final ao71 c;
    public final o3q0 d;
    public final g871 e;
    public final u690 f;

    public fo71(zwz0 zwz0Var, ao71 ao71Var, ao71 ao71Var2, o3q0 o3q0Var, g871 g871Var, u690 u690Var) {
        this.a = zwz0Var;
        this.b = ao71Var;
        this.c = ao71Var2;
        this.d = o3q0Var;
        this.e = g871Var;
        this.f = u690Var;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    /* JADX WARN: Code duplicated, block: B:61:0x0108  */
    /* JADX WARN: Code duplicated, block: B:64:0x012c A[PHI: r7 r8
      0x012c: PHI (r7v3 java.lang.Object) = (r7v2 java.lang.Object), (r7v4 java.lang.Object), (r7v4 java.lang.Object), (r7v4 java.lang.Object) binds: [B:53:0x00c2, B:59:0x0105, B:62:0x010e, B:63:0x0110] A[DONT_GENERATE, DONT_INLINE]
      0x012c: PHI (r8v2 ??) = (r8v7 ??), (r8v8 ??), (r8v9 ??), (r8v10 ??) binds: [B:53:0x00c2, B:59:0x0105, B:62:0x010e, B:63:0x0110] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0133  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0141, code lost:
    
        if (r0 == r11) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [p.fo71] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r8v1, types: [p.go71] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [p.go71] */
    /* JADX WARN: Type inference failed for: r8v3, types: [p.go71] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // p.bo71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(p.go71 r25, p.onm r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.fo71.a(p.go71, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(bo71 bo71Var, go71 go71Var, onm onmVar) {
        do71 do71Var;
        if (onmVar instanceof do71) {
            do71Var = (do71) onmVar;
            int i = do71Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                do71Var.e = i - Integer.MIN_VALUE;
            } else {
                do71Var = new do71(this, onmVar);
            }
        } else {
            do71Var = new do71(this, onmVar);
        }
        Object objA = do71Var.c;
        int i2 = do71Var.e;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objA);
            do71Var.a = go71Var;
            do71Var.e = 1;
            objA = bo71Var.a(go71Var, do71Var);
            if (objA != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj2 = do71Var.b;
            hm5.M(objA);
            return obj2;
        }
        go71Var = do71Var.a;
        hm5.M(objA);
        String str = go71Var.a;
        String str2 = ((yn71) objA).b;
        do71Var.a = null;
        do71Var.b = objA;
        do71Var.e = 2;
        return c(str, str2, do71Var) == obj ? obj : objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, String str2, onm onmVar) {
        eo71 eo71Var;
        if (onmVar instanceof eo71) {
            eo71Var = (eo71) onmVar;
            int i = eo71Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                eo71Var.e = i - Integer.MIN_VALUE;
            } else {
                eo71Var = new eo71(this, onmVar);
            }
        } else {
            eo71Var = new eo71(this, onmVar);
        }
        Object objI = eo71Var.c;
        int i2 = eo71Var.e;
        if (i2 == 0) {
            hm5.M(objI);
            eo71Var.a = str;
            eo71Var.b = str2;
            eo71Var.e = 1;
            objI = b5p1.i(this.a.c(), eo71Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = eo71Var.b;
            str = eo71Var.a;
            hm5.M(objI);
        }
        if (((Boolean) objI).booleanValue() && nhc1.Y(str, "spotify:track", false)) {
            this.d.a.b(str, str2).p(new dgb((byte) 18));
        }
        return rih1.a;
    }
}
