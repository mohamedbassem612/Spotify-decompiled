package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class eq31 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ fq31 a;

    public eq31(fq31 fq31Var) {
        this.a = fq31Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        if (r12.b(r10, r0) == r5) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r11, p.r261 r12, p.onm r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof p.dq31
            if (r0 == 0) goto L13
            r0 = r13
            p.dq31 r0 = (p.dq31) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.dq31 r0 = new p.dq31
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.a
            int r1 = r0.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r13)
            goto L72
        L2b:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r4
        L31:
            p.aq31 r10 = r0.e
            p.r261 r12 = r0.d
            p.hm5.M(r13)
            goto L5d
        L39:
            p.hm5.M(r13)
            p.aq31 r11 = (p.aq31) r11
            long r6 = r11.b
            p.fq31 r10 = r10.a
            p.yqg r10 = r10.a
            long r8 = r10.b()
            long r6 = r6 - r8
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L5e
            r0.d = r12
            r0.e = r11
            r0.b = r3
            java.lang.Object r10 = p.hap1.i(r6, r0)
            if (r10 != r5) goto L5c
            goto L71
        L5c:
            r10 = r11
        L5d:
            r11 = r10
        L5e:
            p.pq31 r10 = new p.pq31
            java.lang.String r11 = r11.a
            r10.<init>(r11)
            r0.d = r4
            r0.e = r4
            r0.b = r2
            java.lang.Object r10 = r12.b(r10, r0)
            if (r10 != r5) goto L72
        L71:
            return r5
        L72:
            p.rih1 r10 = p.rih1.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.eq31.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
