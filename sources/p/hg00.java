package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hg00 extends a8d1 implements xu30 {
    public byte a;
    public /* synthetic */ vr20 b;
    public /* synthetic */ lf00 c;
    public final /* synthetic */ uo5 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ khc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg00(uo5 uo5Var, long j, khc khcVar, lnm lnmVar) {
        super(3, lnmVar);
        this.d = uo5Var;
        this.e = j;
        this.f = khcVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = this.e;
        khc khcVar = this.f;
        hg00 hg00Var = new hg00(this.d, j, khcVar, (lnm) obj3);
        hg00Var.b = (vr20) obj;
        hg00Var.c = (lf00) obj2;
        return hg00Var.invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x006b A[Catch: Exception -> 0x008b, CancellationException -> 0x00a2, PHI: r14
      0x006b: PHI (r14v8 java.lang.Object) = (r14v4 java.lang.Object), (r14v0 java.lang.Object) binds: [B:28:0x0068, B:13:0x002c] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {CancellationException -> 0x00a2, Exception -> 0x008b, blocks: (B:12:0x0027, B:13:0x002c, B:30:0x006b, B:31:0x006d, B:14:0x0030, B:27:0x005c, B:16:0x0034, B:22:0x004a, B:24:0x004d, B:19:0x003b), top: B:41:0x0010 }] */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
    
        if (r0.emit(r2, r13) == r10) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009c, code lost:
    
        if (r0.emit(r14, r13) == r10) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            p.vr20 r0 = r13.b
            p.lf00 r1 = r13.c
            byte r2 = r13.a
            p.uo5 r3 = r13.d
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            p.d9n r10 = p.d9n.a
            if (r2 == 0) goto L38
            if (r2 == r8) goto L34
            if (r2 == r7) goto L30
            if (r2 == r6) goto L2c
            if (r2 == r5) goto L27
            if (r2 != r4) goto L21
            p.hm5.M(r14)
            goto L9f
        L21:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r13)
            return r9
        L27:
            p.hm5.M(r14)     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> La2
            goto L9f
        L2c:
            p.hm5.M(r14)     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> La2
            goto L6b
        L30:
            p.hm5.M(r14)     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> La2
            goto L5c
        L34:
            p.hm5.M(r14)     // Catch: java.io.IOException -> L4d java.lang.Exception -> L8b java.util.concurrent.CancellationException -> La2
            goto L4a
        L38:
            p.hm5.M(r14)
            java.lang.String r14 = r1.f     // Catch: java.io.IOException -> L4d java.lang.Exception -> L8b java.util.concurrent.CancellationException -> La2
            r13.b = r0     // Catch: java.io.IOException -> L4d java.lang.Exception -> L8b java.util.concurrent.CancellationException -> La2
            r13.c = r1     // Catch: java.io.IOException -> L4d java.lang.Exception -> L8b java.util.concurrent.CancellationException -> La2
            r13.a = r8     // Catch: java.io.IOException -> L4d java.lang.Exception -> L8b java.util.concurrent.CancellationException -> La2
            java.lang.Object r14 = r3.D(r14, r13)     // Catch: java.io.IOException -> L4d java.lang.Exception -> L8b java.util.concurrent.CancellationException -> La2
            if (r14 != r10) goto L4a
            goto L9e
        L4a:
            com.spotify.concertview.concertfeedview.v1.GetFeedNextPageResponse r14 = (com.spotify.concertview.concertfeedview.v1.GetFeedNextPageResponse) r14     // Catch: java.io.IOException -> L4d java.lang.Exception -> L8b java.util.concurrent.CancellationException -> La2
            goto L6d
        L4d:
            long r11 = r13.e     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> La2
            r13.b = r0     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> La2
            r13.c = r1     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> La2
            r13.a = r7     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> La2
            java.lang.Object r14 = p.hap1.j(r11, r13)     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> La2
            if (r14 != r10) goto L5c
            goto L9e
        L5c:
            java.lang.String r14 = r1.f     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> La2
            r13.b = r0     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> La2
            r13.c = r1     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> La2
            r13.a = r6     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> La2
            java.lang.Object r14 = r3.D(r14, r13)     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> La2
            if (r14 != r10) goto L6b
            goto L9e
        L6b:
            com.spotify.concertview.concertfeedview.v1.GetFeedNextPageResponse r14 = (com.spotify.concertview.concertfeedview.v1.GetFeedNextPageResponse) r14     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> La2
        L6d:
            p.ah00 r2 = new p.ah00     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> La2
            java.lang.String r3 = r1.f     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> La2
            p.khc r6 = r13.f     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> La2
            p.rod0 r7 = r1.e     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> La2
            java.lang.Object r14 = r6.apply(r7, r14)     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> La2
            p.rod0 r14 = (p.rod0) r14     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> La2
            r2.<init>(r3, r14)     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> La2
            r13.b = r0     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> La2
            r13.c = r1     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> La2
            r13.a = r5     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> La2
            java.lang.Object r13 = r0.emit(r2, r13)     // Catch: java.lang.Exception -> L8b java.util.concurrent.CancellationException -> La2
            if (r13 != r10) goto L9f
            goto L9e
        L8b:
            p.zg00 r14 = new p.zg00
            java.lang.String r1 = r1.f
            r14.<init>(r1)
            r13.b = r9
            r13.c = r9
            r13.a = r4
            java.lang.Object r13 = r0.emit(r14, r13)
            if (r13 != r10) goto L9f
        L9e:
            return r10
        L9f:
            p.rih1 r13 = p.rih1.a
            return r13
        La2:
            r13 = move-exception
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hg00.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
