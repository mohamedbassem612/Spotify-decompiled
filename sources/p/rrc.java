package p;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rrc {
    public final jn7 a;
    public final bpb1 b;
    public final xe01 c;
    public final AtomicLong d;
    public final AtomicLong e;

    public rrc(jn7 jn7Var) {
        this.a = jn7Var;
        bpb1 bpb1VarB = gio1.b(nrc.a);
        this.b = bpb1VarB;
        this.c = d5p1.h(bpb1VarB);
        this.d = new AtomicLong();
        this.e = new AtomicLong();
    }

    public final void a(Long l) {
        Long l2;
        while (true) {
            bpb1 bpb1Var = this.b;
            Object value = bpb1Var.getValue();
            orc mrcVar = (orc) value;
            if (mrcVar instanceof mrc) {
                mrc mrcVar2 = (mrc) mrcVar;
                l2 = l;
                mrcVar = new mrc(l2, mrcVar2.b, mrcVar2.c, mrcVar2.d);
            } else {
                l2 = l;
            }
            if (bpb1Var.k(value, mrcVar)) {
                return;
            } else {
                l = l2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009d A[LOOP:0: B:40:0x009d->B:57:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0094, code lost:
    
        r0 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(p.onm r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof p.prc
            if (r0 == 0) goto L13
            r0 = r15
            p.prc r0 = (p.prc) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.prc r0 = new p.prc
            r0.<init>(r14, r15)
        L18:
            java.lang.Object r15 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            p.rih1 r4 = p.rih1.a
            p.bpb1 r5 = r14.b
            java.util.concurrent.atomic.AtomicLong r6 = r14.d
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2e
            long r0 = r0.a
            p.hm5.M(r15)     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Lb2
            goto L62
        L2e:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r14)
            return r2
        L34:
            p.hm5.M(r15)
            long r7 = r6.incrementAndGet()
        L3b:
            java.lang.Object r15 = r5.getValue()
            r1 = r15
            p.orc r1 = (p.orc) r1
            boolean r9 = r1 instanceof p.lrc
            if (r9 == 0) goto L48
            p.nrc r1 = p.nrc.a
        L48:
            boolean r15 = r5.k(r15, r1)
            if (r15 == 0) goto L3b
            p.jn7 r14 = r14.a     // Catch: java.lang.Exception -> L94 java.util.concurrent.CancellationException -> Lb2
            com.spotify.storage.esperanto.proto.EsStorage$GetCacheSizeLimitParams r15 = com.spotify.storage.esperanto.proto.EsStorage$GetCacheSizeLimitParams.n()     // Catch: java.lang.Exception -> L94 java.util.concurrent.CancellationException -> Lb2
            r0.a = r7     // Catch: java.lang.Exception -> L94 java.util.concurrent.CancellationException -> Lb2
            r0.d = r3     // Catch: java.lang.Exception -> L94 java.util.concurrent.CancellationException -> Lb2
            java.lang.Object r15 = r14.s(r15, r0)     // Catch: java.lang.Exception -> L94 java.util.concurrent.CancellationException -> Lb2
            p.d9n r14 = p.d9n.a
            if (r15 != r14) goto L61
            return r14
        L61:
            r0 = r7
        L62:
            com.spotify.storage.esperanto.proto.EsStorage$CacheSizeLimit r15 = (com.spotify.storage.esperanto.proto.EsStorage$CacheSizeLimit) r15     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Lb2
            long r6 = r6.get()
            int r14 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r14 == 0) goto L6d
            goto Lb1
        L6d:
            p.mrc r6 = new p.mrc
            boolean r14 = r15.r()
            if (r14 == 0) goto L80
            long r0 = r15.q()
            java.lang.Long r14 = new java.lang.Long
            r14.<init>(r0)
            r7 = r14
            goto L81
        L80:
            r7 = r2
        L81:
            long r8 = r15.n()
            long r10 = r15.p()
            long r12 = r15.o()
            r6.<init>(r7, r8, r10, r12)
            r5.m(r2, r6)
            return r4
        L94:
            r0 = r7
        L95:
            long r14 = r6.get()
            int r14 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r14 != 0) goto Lb1
        L9d:
            java.lang.Object r14 = r5.getValue()
            r15 = r14
            p.orc r15 = (p.orc) r15
            boolean r0 = r15 instanceof p.mrc
            if (r0 == 0) goto La9
            goto Lab
        La9:
            p.lrc r15 = p.lrc.a
        Lab:
            boolean r14 = r5.k(r14, r15)
            if (r14 == 0) goto L9d
        Lb1:
            return r4
        Lb2:
            r0 = move-exception
            r14 = r0
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p.rrc.b(p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r11.p0(r10, r0) == r6) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(com.spotify.storage.esperanto.proto.EsStorage$SetCacheSizeLimitParams r10, p.onm r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof p.qrc
            if (r0 == 0) goto L13
            r0 = r11
            p.qrc r0 = (p.qrc) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.qrc r0 = new p.qrc
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.b
            int r1 = r0.d
            p.rih1 r2 = p.rih1.a
            java.util.concurrent.atomic.AtomicLong r3 = r9.e
            r4 = 2
            r5 = 1
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L3b
            if (r1 == r5) goto L35
            if (r1 != r4) goto L2e
            p.hm5.M(r11)
            return r2
        L2e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            r9 = 0
            return r9
        L35:
            long r7 = r0.a
            p.hm5.M(r11)     // Catch: java.lang.Exception -> L4f java.util.concurrent.CancellationException -> L64
            goto L4f
        L3b:
            p.hm5.M(r11)
            long r7 = r3.incrementAndGet()
            p.jn7 r11 = r9.a     // Catch: java.lang.Exception -> L4f java.util.concurrent.CancellationException -> L64
            r0.a = r7     // Catch: java.lang.Exception -> L4f java.util.concurrent.CancellationException -> L64
            r0.d = r5     // Catch: java.lang.Exception -> L4f java.util.concurrent.CancellationException -> L64
            java.lang.Object r10 = r11.p0(r10, r0)     // Catch: java.lang.Exception -> L4f java.util.concurrent.CancellationException -> L64
            if (r10 != r6) goto L4f
            goto L62
        L4f:
            long r10 = r3.get()
            int r10 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r10 == 0) goto L58
            goto L63
        L58:
            r0.a = r7
            r0.d = r4
            java.lang.Object r9 = r9.b(r0)
            if (r9 != r6) goto L63
        L62:
            return r6
        L63:
            return r2
        L64:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.rrc.c(com.spotify.storage.esperanto.proto.EsStorage$SetCacheSizeLimitParams, p.onm):java.lang.Object");
    }
}
