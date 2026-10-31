package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ysj1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (r7.b(r5, r0) == r4) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r6, p.r261 r7, p.onm r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof p.xsj1
            if (r0 == 0) goto L13
            r0 = r8
            p.xsj1 r0 = (p.xsj1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.xsj1 r0 = new p.xsj1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r5 = r0.a
            int r8 = r0.b
            r1 = 2
            r2 = 1
            r3 = 0
            p.d9n r4 = p.d9n.a
            if (r8 == 0) goto L37
            if (r8 == r2) goto L31
            if (r8 != r1) goto L2b
            p.hm5.M(r5)
            goto L52
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            return r3
        L31:
            p.r261 r7 = r0.d
            p.hm5.M(r5)
            goto L47
        L37:
            p.hm5.M(r5)
            p.psj1 r6 = (p.psj1) r6
            r0.d = r7
            r0.b = r2
            java.lang.Object r5 = p.zsj1.c(r6, r0)
            if (r5 != r4) goto L47
            goto L51
        L47:
            r0.d = r3
            r0.b = r1
            java.lang.Object r5 = r7.b(r5, r0)
            if (r5 != r4) goto L52
        L51:
            return r4
        L52:
            p.rih1 r5 = p.rih1.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ysj1.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
