package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zpo1 extends a8d1 implements vu30 {
    public vgn0 a;
    public i2x0 b;
    public lqo1 c;
    public String d;
    public short e;
    public byte f;
    public final /* synthetic */ lqo1 g;
    public final /* synthetic */ i2x0 h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpo1(lqo1 lqo1Var, i2x0 i2x0Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.g = lqo1Var;
        this.h = i2x0Var;
        this.i = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new zpo1(this.g, this.h, this.i, lnmVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
    
        if (r0 != r4) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [byte] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v5, types: [p.vgn0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            byte r1 = r0.f
            r2 = 1
            r3 = 0
            p.d9n r4 = p.d9n.a
            if (r1 == 0) goto L2c
            if (r1 == r2) goto L18
            p.vgn0 r1 = r0.a
            p.hm5.M(r19)     // Catch: java.lang.Throwable -> L15
            r0 = r19
            goto L95
        L15:
            r0 = move-exception
            goto L9b
        L18:
            short r1 = r0.e
            long r1 = (long) r1
            java.lang.String r5 = r0.d
            p.lqo1 r6 = r0.c
            p.i2x0 r7 = r0.b
            p.vgn0 r8 = r0.a
            p.hm5.M(r19)
            r11 = r1
            r1 = r8
        L28:
            r14 = r5
            r13 = r6
            r15 = r7
            goto L51
        L2c:
            p.hm5.M(r19)
            p.lqo1 r6 = r0.g
            java.lang.Object r1 = r6.c
            p.xgn0 r1 = (p.xgn0) r1
            r0.a = r1
            p.i2x0 r7 = r0.h
            r0.b = r7
            r0.c = r6
            java.lang.String r5 = r0.i
            r0.d = r5
            r8 = 10000(0x2710, float:1.4013E-41)
            r0.e = r8
            r0.f = r2
            java.lang.Object r2 = r1.a(r0)
            if (r2 == r4) goto L9f
            r8 = 10000(0x2710, double:4.9407E-320)
            r11 = r8
            goto L28
        L51:
            p.i2x0 r2 = p.i2x0.X0     // Catch: java.lang.Throwable -> L15
            boolean r2 = p.u890.j(r15, r2)     // Catch: java.lang.Throwable -> L15
            r5 = 2
            if (r2 == 0) goto L5c
            r2 = 3
            goto L67
        L5c:
            p.i2x0 r2 = p.i2x0.Y0     // Catch: java.lang.Throwable -> L15
            boolean r2 = p.u890.j(r15, r2)     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L66
            r2 = 4
            goto L67
        L66:
            r2 = r5
        L67:
            java.lang.Object r6 = r13.b     // Catch: java.lang.Throwable -> L15
            p.rlf1 r6 = (p.rlf1) r6     // Catch: java.lang.Throwable -> L15
            p.yuo1 r6 = r6.a()     // Catch: java.lang.Throwable -> L15
            java.lang.Object r7 = r13.b     // Catch: java.lang.Throwable -> L15
            p.rlf1 r7 = (p.rlf1) r7     // Catch: java.lang.Throwable -> L15
            p.den1 r7 = r7.b()     // Catch: java.lang.Throwable -> L15
            p.uwn1 r10 = new p.uwn1     // Catch: java.lang.Throwable -> L15
            r16 = 0
            r17 = 1
            r10.<init>(r11, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L15
            r0.a = r1     // Catch: java.lang.Throwable -> L15
            r0.b = r3     // Catch: java.lang.Throwable -> L15
            r0.c = r3     // Catch: java.lang.Throwable -> L15
            r0.d = r3     // Catch: java.lang.Throwable -> L15
            r0.f = r5     // Catch: java.lang.Throwable -> L15
            p.swo1 r5 = new p.swo1     // Catch: java.lang.Throwable -> L15
            r5.<init>(r6, r7, r14, r2)     // Catch: java.lang.Throwable -> L15
            java.lang.Object r0 = r10.invoke(r5, r0)     // Catch: java.lang.Throwable -> L15
            if (r0 == r4) goto L9f
        L95:
            p.xoo1 r0 = (p.xoo1) r0     // Catch: java.lang.Throwable -> L15
            r1.c(r3)
            return r0
        L9b:
            r1.c(r3)
            throw r0
        L9f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.zpo1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
