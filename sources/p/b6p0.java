package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b6p0 {
    public final x5p0 a;
    public final yqg b;
    public final iac0 c;
    public final bpb1 d;
    public final xe01 e;
    public final bpb1 f;
    public Long g;
    public hfu0 h;
    public hfu0 i;
    public boolean j;
    public xab1 k;

    public b6p0(x5p0 x5p0Var, yqg yqgVar, iac0 iac0Var) {
        this.a = x5p0Var;
        this.b = yqgVar;
        this.c = iac0Var;
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.d = bpb1VarB;
        this.e = d5p1.h(bpb1VarB);
        this.f = gio1.b(Boolean.FALSE);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0079 A[PHI: r1 r10 r12
      0x0079: PHI (r1v3 p.hfu0) = (r1v1 p.hfu0), (r1v4 p.hfu0) binds: [B:30:0x0076, B:17:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x0079: PHI (r10v3 long) = (r10v1 long), (r10v7 long) binds: [B:30:0x0076, B:17:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x0079: PHI (r12v11 java.lang.Object) = (r12v6 java.lang.Object), (r12v1 java.lang.Object) binds: [B:30:0x0076, B:17:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0083 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0085  */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:40:0x008f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x0090  */
    /* JADX WARN: Code duplicated, block: B:43:0x0094  */
    /* JADX WARN: Code duplicated, block: B:45:0x0097  */
    /* JADX WARN: Code duplicated, block: B:47:0x009b  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ae A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (r12 == r8) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r10, p.onm r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof p.a6p0
            if (r0 == 0) goto L13
            r0 = r12
            p.a6p0 r0 = (p.a6p0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.a6p0 r0 = new p.a6p0
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.c
            int r1 = r0.e
            p.j5p0 r2 = p.j5p0.a
            r3 = 0
            r4 = 3
            p.x5p0 r5 = r9.a
            r6 = 2
            r7 = 1
            p.d9n r8 = p.d9n.a
            if (r1 == 0) goto L46
            if (r1 == r7) goto L40
            if (r1 == r6) goto L38
            if (r1 != r4) goto L32
            p.hm5.M(r12)
            return r12
        L32:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r3
        L38:
            long r10 = r0.a
            p.hfu0 r1 = r0.b
            p.hm5.M(r12)
            goto L79
        L40:
            long r10 = r0.a
            p.hm5.M(r12)
            goto L5d
        L46:
            p.hm5.M(r12)
            p.hfu0 r12 = r9.h
            if (r12 != 0) goto L69
            r0.a = r10
            r0.e = r7
            p.v5p0 r12 = new p.v5p0
            r12.<init>(r5, r10, r3)
            java.lang.Object r12 = r5.d(r2, r12, r0)
            if (r12 != r8) goto L5d
            goto Lad
        L5d:
            p.l5p0 r12 = (p.l5p0) r12
            boolean r1 = r12 instanceof p.i5p0
            if (r1 == 0) goto L6b
            p.i5p0 r12 = (p.i5p0) r12
            p.hfu0 r12 = r12.a
            r9.h = r12
        L69:
            r1 = r12
            goto L6c
        L6b:
            return r12
        L6c:
            r0.b = r1
            r0.a = r10
            r0.e = r6
            java.lang.Enum r12 = r5.a(r0)
            if (r12 != r8) goto L79
            goto Lad
        L79:
            p.m5p0 r12 = (p.m5p0) r12
            int r12 = r12.ordinal()
            if (r12 == 0) goto L97
            if (r12 == r7) goto L94
            if (r12 != r6) goto L90
            p.hfu0 r9 = r9.i
            if (r9 == 0) goto L8f
            p.i5p0 r10 = new p.i5p0
            r10.<init>(r9)
            return r10
        L8f:
            return r2
        L90:
            p.eg.o()
            return r3
        L94:
            p.k5p0 r9 = p.k5p0.a
            return r9
        L97:
            p.hfu0 r9 = r9.i
            if (r9 == 0) goto La1
            p.i5p0 r10 = new p.i5p0
            r10.<init>(r9)
            return r10
        La1:
            r0.b = r3
            r0.a = r10
            r0.e = r4
            java.lang.Object r9 = r5.e(r1, r0)
            if (r9 != r8) goto Lae
        Lad:
            return r8
        Lae:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.b6p0.a(long, p.onm):java.lang.Object");
    }
}
