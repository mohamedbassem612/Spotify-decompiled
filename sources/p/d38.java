package p;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d38 {
    public final ihb a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final mr20 c;
    public final /* synthetic */ g38 d;

    public d38(g38 g38Var, ihb ihbVar) {
        this.d = g38Var;
        this.a = ihbVar;
        this.c = ihbVar.b;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        if (r13 == r9) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        if (r13 == r9) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(p.onm r13) {
        /*
            r12 = this;
            p.g38 r0 = r12.d
            java.util.concurrent.atomic.AtomicReference r1 = r0.f
            boolean r2 = r13 instanceof p.b38
            if (r2 == 0) goto L17
            r2 = r13
            p.b38 r2 = (p.b38) r2
            int r3 = r2.c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.c = r3
            goto L1c
        L17:
            p.b38 r2 = new p.b38
            r2.<init>(r12, r13)
        L1c:
            java.lang.Object r13 = r2.a
            int r3 = r2.c
            r4 = 2
            p.rih1 r5 = p.rih1.a
            r6 = 0
            r7 = 1
            r8 = 0
            p.d9n r9 = p.d9n.a
            if (r3 == 0) goto L3c
            if (r3 == r7) goto L38
            if (r3 != r4) goto L32
            p.hm5.M(r13)     // Catch: java.lang.Throwable -> L97
            goto L89
        L32:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r12)
            return r8
        L38:
            p.hm5.M(r13)
            goto L68
        L3c:
            p.hm5.M(r13)
            java.util.concurrent.atomic.AtomicBoolean r13 = r12.b
            boolean r13 = r13.compareAndSet(r6, r7)
            if (r13 != 0) goto L48
            goto L96
        L48:
            java.lang.Object r13 = r1.get()
            if (r13 != r12) goto L71
            java.util.concurrent.atomic.AtomicReference r13 = r0.h
            java.lang.Object r13 = r13.get()
            p.zxh r13 = (p.zxh) r13
            if (r13 == 0) goto L71
            p.c38 r0 = new p.c38
            r0.<init>(r13, r8, r6)
            r2.c = r7
            r10 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r13 = p.rc2.O(r10, r0, r2)
            if (r13 != r9) goto L68
            goto L88
        L68:
            if (r13 != 0) goto L71
            java.lang.String r13 = "Timed out waiting for AudioRecord release before clearing input route"
            java.lang.Object[] r0 = new java.lang.Object[r6]
            com.spotify.base.java.logging.Logger.k(r13, r0)
        L71:
            p.ihb r13 = r12.a     // Catch: java.lang.Throwable -> L97
            r2.c = r4     // Catch: java.lang.Throwable -> L97
            p.geo0 r0 = p.geo0.b     // Catch: java.lang.Throwable -> L97
            p.a38 r3 = new p.a38     // Catch: java.lang.Throwable -> L97
            p.phb r4 = r13.e     // Catch: java.lang.Throwable -> L97
            r3.<init>(r4, r13, r8, r7)     // Catch: java.lang.Throwable -> L97
            java.lang.Object r13 = p.fn31.Y(r0, r3, r2)     // Catch: java.lang.Throwable -> L97
            if (r13 != r9) goto L85
            goto L86
        L85:
            r13 = r5
        L86:
            if (r13 != r9) goto L89
        L88:
            return r9
        L89:
            boolean r13 = r1.compareAndSet(r12, r8)
            if (r13 == 0) goto L90
            goto L96
        L90:
            java.lang.Object r13 = r1.get()
            if (r13 == r12) goto L89
        L96:
            return r5
        L97:
            r13 = move-exception
        L98:
            boolean r0 = r1.compareAndSet(r12, r8)
            if (r0 != 0) goto La5
            java.lang.Object r0 = r1.get()
            if (r0 != r12) goto La5
            goto L98
        La5:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p.d38.a(p.onm):java.lang.Object");
    }
}
