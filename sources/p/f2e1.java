package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f2e1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ g2e1 a;

    public f2e1(g2e1 g2e1Var) {
        this.a = g2e1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r9.b(r10, r0) == r5) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r8, p.r261 r9, p.onm r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof p.e2e1
            if (r0 == 0) goto L13
            r0 = r10
            p.e2e1 r0 = (p.e2e1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.e2e1 r0 = new p.e2e1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            int r1 = r0.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r10)
            goto L5f
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r4
        L31:
            p.r261 r9 = r0.d
            p.hm5.M(r10)
            goto L54
        L37:
            p.hm5.M(r10)
            p.i2e1 r8 = (p.i2e1) r8
            p.g2e1 r7 = r7.a
            p.ol71 r10 = r7.i
            p.ciw0 r1 = new p.ciw0
            r6 = 26
            r1.<init>(r8, r7, r4, r6)
            r0.d = r9
            r0.b = r3
            java.lang.String r7 = "sharing.text_content_share_format_loading"
            java.lang.Object r10 = r10.a(r7, r4, r1, r0)
            if (r10 != r5) goto L54
            goto L5e
        L54:
            r0.d = r4
            r0.b = r2
            java.lang.Object r7 = r9.b(r10, r0)
            if (r7 != r5) goto L5f
        L5e:
            return r5
        L5f:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.f2e1.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
