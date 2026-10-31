package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n0o1 extends a8d1 implements iu30 {
    public zwo1 a;
    public byte b;
    public final /* synthetic */ zwo1 c;
    public final /* synthetic */ u9c d;
    public final /* synthetic */ String e;
    public final /* synthetic */ vrv0 f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0o1(zwo1 zwo1Var, u9c u9cVar, String str, vrv0 vrv0Var, String str2, lnm lnmVar) {
        super(1, lnmVar);
        this.c = zwo1Var;
        this.d = u9cVar;
        this.e = str;
        this.f = vrv0Var;
        this.g = str2;
    }

    public final lnm create(lnm lnmVar) {
        return new n0o1(this.c, this.d, this.e, this.f, this.g, lnmVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return create((lnm) obj).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (((p.qwo1) r9).a(r0, r8) == r7) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Exception {
        /*
            r8 = this;
            byte r0 = r8.b
            r5 = 0
            r1 = 1
            p.d9n r7 = p.d9n.a
            if (r0 == 0) goto L14
            if (r0 == r1) goto Le
            p.hm5.M(r9)     // Catch: java.lang.Exception -> L43
            goto L40
        Le:
            p.zwo1 r0 = r8.a
            p.hm5.M(r9)     // Catch: java.lang.Exception -> L43
            goto L32
        L14:
            p.hm5.M(r9)
            p.zwo1 r0 = r8.c     // Catch: java.lang.Exception -> L43
            p.u9c r4 = r8.d     // Catch: java.lang.Exception -> L43
            p.vrv0 r2 = r8.f     // Catch: java.lang.Exception -> L43
            java.lang.String r3 = r8.g     // Catch: java.lang.Exception -> L43
            r8.a = r0     // Catch: java.lang.Exception -> L43
            r8.b = r1     // Catch: java.lang.Exception -> L43
            p.z0i1 r1 = new p.z0i1     // Catch: java.lang.Exception -> L43
            r6 = 9
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L43
            p.qwo1 r9 = new p.qwo1     // Catch: java.lang.Exception -> L43
            r9.<init>(r1)     // Catch: java.lang.Exception -> L43
            if (r9 != r7) goto L32
            goto L3f
        L32:
            p.qwo1 r9 = (p.qwo1) r9     // Catch: java.lang.Exception -> L43
            r8.a = r5     // Catch: java.lang.Exception -> L43
            r1 = 2
            r8.b = r1     // Catch: java.lang.Exception -> L43
            java.lang.Object r8 = r9.a(r0, r8)     // Catch: java.lang.Exception -> L43
            if (r8 != r7) goto L40
        L3f:
            return r7
        L40:
            p.rih1 r8 = p.rih1.a
            return r8
        L43:
            r0 = move-exception
            r8 = r0
            r8.getMessage()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.n0o1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
