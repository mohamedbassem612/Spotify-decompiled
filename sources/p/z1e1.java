package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z1e1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ g2e1 a;

    public z1e1(g2e1 g2e1Var) {
        this.a = g2e1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r4.a(r0, r6) == r3) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r5, p.r261 r6, p.onm r7) {
        /*
            r4 = this;
            boolean r6 = r7 instanceof p.y1e1
            if (r6 == 0) goto L13
            r6 = r7
            p.y1e1 r6 = (p.y1e1) r6
            int r0 = r6.b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.b = r0
            goto L18
        L13:
            p.y1e1 r6 = new p.y1e1
            r6.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r6.a
            int r0 = r6.b
            p.g2e1 r4 = r4.a
            r1 = 2
            r2 = 1
            p.d9n r3 = p.d9n.a
            if (r0 == 0) goto L39
            if (r0 == r2) goto L33
            if (r0 != r1) goto L2c
            p.hm5.M(r7)
            goto L66
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r4)
            r4 = 0
            return r4
        L33:
            int r5 = r6.d
            p.hm5.M(r7)
            goto L4d
        L39:
            p.hm5.M(r7)
            p.j2e1 r5 = (p.j2e1) r5
            p.esa1 r7 = r4.a
            r0 = 0
            r6.d = r0
            r6.b = r2
            java.lang.Object r7 = r7.q(r5, r6)
            if (r7 != r3) goto L4c
            goto L65
        L4c:
            r5 = r0
        L4d:
            p.umt r7 = (p.umt) r7
            p.wh71 r4 = r4.b
            p.clw0 r0 = new p.clw0
            p.zmt r2 = new p.zmt
            r2.<init>(r7)
            r0.<init>(r2)
            r6.d = r5
            r6.b = r1
            java.lang.Object r4 = r4.a(r0, r6)
            if (r4 != r3) goto L66
        L65:
            return r3
        L66:
            p.rih1 r4 = p.rih1.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.z1e1.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
