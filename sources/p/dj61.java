package p;

import androidx.glance.session.SessionWorker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dj61 extends a8d1 implements iu30 {
    public Object a;
    public byte b;
    public final /* synthetic */ SessionWorker c;
    public final /* synthetic */ ove1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj61(SessionWorker sessionWorker, ove1 ove1Var, lnm lnmVar) {
        super(1, lnmVar);
        this.c = sessionWorker;
        this.d = ove1Var;
    }

    public final lnm create(lnm lnmVar) {
        return new dj61(this.c, this.d, lnmVar);
    }

    public final Object invoke(Object obj) {
        return create((lnm) obj).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
    
        if (p.c921.H(r0, r2, r14) == r11) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            r14 = this;
            byte r0 = r14.b
            r6 = 28
            r7 = 4
            r8 = 3
            r1 = 2
            r2 = 1
            r9 = 0
            androidx.glance.session.SessionWorker r10 = r14.c
            p.d9n r11 = p.d9n.a
            if (r0 == 0) goto L3c
            if (r0 == r2) goto L37
            if (r0 == r1) goto L2b
            if (r0 == r8) goto L26
            if (r0 == r7) goto L1d
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            return r9
        L1d:
            java.lang.Object r0 = r14.a
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            p.hm5.M(r15)
            goto Lb1
        L26:
            p.hm5.M(r15)
            goto L98
        L2b:
            java.lang.Object r0 = r14.a
            r1 = r0
            p.cy5 r1 = (p.cy5) r1
            p.hm5.M(r15)     // Catch: java.lang.Throwable -> L34
            goto L86
        L34:
            r0 = move-exception
            goto L9f
        L37:
            p.hm5.M(r15)
            r0 = r15
            goto L51
        L3c:
            p.hm5.M(r15)
            p.xf61 r0 = r10.h
            p.wp41 r3 = new p.wp41
            r3.<init>(r10, r9, r7)
            r14.b = r2
            p.cg61 r0 = (p.cg61) r0
            java.lang.Object r0 = r0.b(r3, r14)
            if (r0 != r11) goto L51
            goto Lb0
        L51:
            r2 = r0
            p.cy5 r2 = (p.cy5) r2
            if (r2 != 0) goto L69
            androidx.work.WorkerParameters r0 = r10.g
            int r0 = r0.c
            java.lang.String r1 = r10.k
            if (r0 == 0) goto L63
            p.x8d0 r0 = p.y8d0.a()
            return r0
        L63:
            java.lang.String r0 = "No session available for key "
            p.hhg1.o(r1, r0)
            return r9
        L69:
            p.ove1 r0 = r14.d     // Catch: java.lang.Throwable -> L9d
            android.content.Context r3 = r10.a     // Catch: java.lang.Throwable -> L9d
            r4 = r3
            p.jve1 r3 = r10.i     // Catch: java.lang.Throwable -> L9d
            r12 = r4
            p.opg r4 = new p.opg     // Catch: java.lang.Throwable -> L9d
            r13 = 18
            r4.<init>(r10, r13)     // Catch: java.lang.Throwable -> L9d
            r14.a = r2     // Catch: java.lang.Throwable -> L9d
            r14.b = r1     // Catch: java.lang.Throwable -> L9d
            r5 = r14
            r1 = r12
            java.lang.Object r0 = p.mqo1.m(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L9d
            if (r0 != r11) goto L85
            goto Lb0
        L85:
            r1 = r2
        L86:
            p.geo0 r0 = p.geo0.b
            p.lc41 r2 = new p.lc41
            r2.<init>(r10, r1, r9, r6)
            r14.a = r9
            r14.b = r8
            java.lang.Object r0 = p.c921.H(r0, r2, r14)
            if (r0 != r11) goto L98
            goto Lb0
        L98:
            p.x8d0 r0 = p.y8d0.a()
            return r0
        L9d:
            r0 = move-exception
            r1 = r2
        L9f:
            p.geo0 r2 = p.geo0.b
            p.lc41 r3 = new p.lc41
            r3.<init>(r10, r1, r9, r6)
            r14.a = r0
            r14.b = r7
            java.lang.Object r1 = p.c921.H(r2, r3, r14)
            if (r1 != r11) goto Lb1
        Lb0:
            return r11
        Lb1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.dj61.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
