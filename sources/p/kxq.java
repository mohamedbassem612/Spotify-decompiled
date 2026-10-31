package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kxq implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ nxq a;

    public kxq(nxq nxqVar) {
        this.a = nxqVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r8.b(r9, r0) == r5) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r7, p.r261 r8, p.onm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.jxq
            if (r0 == 0) goto L13
            r0 = r9
            p.jxq r0 = (p.jxq) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.jxq r0 = new p.jxq
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r9)
            goto L58
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            p.r261 r8 = r0.d
            p.hm5.M(r9)
            goto L4d
        L37:
            p.hm5.M(r9)
            p.dxq r7 = (p.dxq) r7
            p.nxq r6 = r6.a
            p.cp31 r6 = r6.a
            java.util.ArrayList r7 = r7.c
            r0.d = r8
            r0.b = r3
            java.lang.Object r9 = r6.L(r7, r0)
            if (r9 != r5) goto L4d
            goto L57
        L4d:
            r0.d = r4
            r0.b = r2
            java.lang.Object r6 = r8.b(r9, r0)
            if (r6 != r5) goto L58
        L57:
            return r5
        L58:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.kxq.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
