package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bgd1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ myq0 a;
    public final /* synthetic */ qzn0 b;

    public bgd1(myq0 myq0Var, qzn0 qzn0Var) {
        this.a = myq0Var;
        this.b = qzn0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        if (r9.b(r8, r0) == r5) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r8, p.r261 r9, p.onm r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof p.agd1
            if (r0 == 0) goto L13
            r0 = r10
            p.agd1 r0 = (p.agd1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.agd1 r0 = new p.agd1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            int r1 = r0.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r10)
            goto L76
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r4
        L31:
            p.rfd1 r7 = r0.e
            p.r261 r9 = r0.d
            p.hm5.M(r10)
            goto L62
        L39:
            p.hm5.M(r10)
            p.rfd1 r8 = (p.rfd1) r8
            p.wqn0 r10 = r8.b
            java.lang.String r10 = r10.getUri()
            p.myq0 r1 = r7.a
            r1.n(r10)
            p.wqn0 r10 = r8.b
            p.ezn0 r1 = new p.ezn0
            p.ou80 r6 = r8.a
            r1.<init>(r6)
            r0.d = r9
            r0.e = r8
            r0.b = r3
            p.qzn0 r7 = r7.b
            java.lang.Object r7 = r7.f(r10, r1, r0)
            if (r7 != r5) goto L61
            goto L75
        L61:
            r7 = r8
        L62:
            p.ogd1 r8 = new p.ogd1
            p.wqn0 r7 = r7.b
            r8.<init>(r7)
            r0.d = r4
            r0.e = r4
            r0.b = r2
            java.lang.Object r7 = r9.b(r8, r0)
            if (r7 != r5) goto L76
        L75:
            return r5
        L76:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.bgd1.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
