package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cgu extends a8d1 implements vu30 {
    public jfe a;
    public uac b;
    public int c;
    public int d;
    public int e;
    public byte f;
    public final /* synthetic */ dgu g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgu(dgu dguVar, lnm lnmVar) {
        super(2, lnmVar);
        this.g = dguVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new cgu(this.g, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    /* JADX WARN: Code duplicated, block: B:21:0x005b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069 A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #1 {all -> 0x001f, blocks: (B:7:0x0017, B:18:0x0048, B:22:0x0061, B:24:0x0069, B:14:0x0032, B:17:0x003d), top: B:35:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0082  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        if (r11.invoke(r10) == r4) goto L26;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007f -> B:8:0x001a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            byte r0 = r10.f
            r1 = 2
            r2 = 1
            r3 = 0
            p.d9n r4 = p.d9n.a
            if (r0 == 0) goto L36
            if (r0 == r2) goto L28
            if (r0 != r1) goto L22
            int r0 = r10.e
            int r5 = r10.d
            int r6 = r10.c
            p.uac r7 = r10.b
            p.jfe r8 = r10.a
            p.hm5.M(r11)     // Catch: java.lang.Throwable -> L1f
        L1a:
            r11 = r6
            r6 = r0
            r0 = r11
            r11 = r7
            goto L48
        L1f:
            r10 = move-exception
            goto L88
        L22:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r3
        L28:
            int r0 = r10.e
            int r5 = r10.d
            int r6 = r10.c
            p.uac r7 = r10.b
            p.jfe r8 = r10.a
            p.hm5.M(r11)     // Catch: java.lang.Throwable -> L1f
            goto L61
        L36:
            p.hm5.M(r11)
            p.dgu r11 = r10.g
            p.bbc r8 = r11.e
            r8.getClass()     // Catch: java.lang.Throwable -> L1f
            p.uac r11 = new p.uac     // Catch: java.lang.Throwable -> L1f
            r11.<init>(r8)     // Catch: java.lang.Throwable -> L1f
            r0 = 0
            r5 = r0
            r6 = r5
        L48:
            r10.a = r8     // Catch: java.lang.Throwable -> L1f
            r10.b = r11     // Catch: java.lang.Throwable -> L1f
            r10.c = r0     // Catch: java.lang.Throwable -> L1f
            r10.d = r5     // Catch: java.lang.Throwable -> L1f
            r10.e = r6     // Catch: java.lang.Throwable -> L1f
            r10.f = r2     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r7 = r11.a(r10)     // Catch: java.lang.Throwable -> L1f
            if (r7 != r4) goto L5b
            goto L81
        L5b:
            r9 = r7
            r7 = r11
            r11 = r9
            r9 = r6
            r6 = r0
            r0 = r9
        L61:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L1f
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L1f
            if (r11 == 0) goto L82
            java.lang.Object r11 = r7.c()     // Catch: java.lang.Throwable -> L1f
            p.iu30 r11 = (p.iu30) r11     // Catch: java.lang.Throwable -> L1f
            r10.a = r8     // Catch: java.lang.Throwable -> L1f
            r10.b = r7     // Catch: java.lang.Throwable -> L1f
            r10.c = r6     // Catch: java.lang.Throwable -> L1f
            r10.d = r5     // Catch: java.lang.Throwable -> L1f
            r10.e = r0     // Catch: java.lang.Throwable -> L1f
            r10.f = r1     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r11 = r11.invoke(r10)     // Catch: java.lang.Throwable -> L1f
            if (r11 != r4) goto L1a
        L81:
            return r4
        L82:
            r8.d(r3)
            p.rih1 r10 = p.rih1.a
            return r10
        L88:
            throw r10     // Catch: java.lang.Throwable -> L89
        L89:
            r11 = move-exception
            p.ulo1.j(r8, r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p.cgu.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
