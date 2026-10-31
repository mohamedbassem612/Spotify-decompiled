package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w2z0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ x2z0 a;

    public w2z0(x2z0 x2z0Var) {
        this.a = x2z0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r8.b(r6, r0) == r5) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r7, p.r261 r8, p.onm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.v2z0
            if (r0 == 0) goto L13
            r0 = r9
            p.v2z0 r0 = (p.v2z0) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.v2z0 r0 = new p.v2z0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r9)
            goto L69
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            p.r261 r8 = r0.d
            p.hm5.M(r9)
            p.e331 r9 = (p.e331) r9
            java.lang.Object r6 = r9.a
            goto L51
        L3b:
            p.hm5.M(r9)
            p.n2z0 r7 = (p.n2z0) r7
            p.x2z0 r6 = r6.a
            p.i6n0 r6 = r6.a
            p.oho1 r7 = r7.a
            r0.d = r8
            r0.b = r3
            java.io.Serializable r6 = r6.d(r7, r0)
            if (r6 != r5) goto L51
            goto L68
        L51:
            java.lang.Throwable r7 = p.e331.a(r6)
            if (r7 != 0) goto L5c
            java.lang.String r6 = (java.lang.String) r6
            p.l3z0 r6 = p.l3z0.a
            goto L5e
        L5c:
            p.k3z0 r6 = p.k3z0.a
        L5e:
            r0.d = r4
            r0.b = r2
            java.lang.Object r6 = r8.b(r6, r0)
            if (r6 != r5) goto L69
        L68:
            return r5
        L69:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.w2z0.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
