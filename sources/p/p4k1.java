package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p4k1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ dxy a;

    public p4k1(dxy dxyVar) {
        this.a = dxyVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (r8.b(r9, r0) == r5) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r7, p.r261 r8, p.onm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.o4k1
            if (r0 == 0) goto L13
            r0 = r9
            p.o4k1 r0 = (p.o4k1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.o4k1 r0 = new p.o4k1
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
            goto L60
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            p.r261 r8 = r0.d
            p.hm5.M(r9)
            goto L55
        L37:
            p.hm5.M(r9)
            p.w4k1 r7 = (p.w4k1) r7
            r0.d = r8
            r0.b = r3
            p.dxy r6 = r6.a
            java.lang.Object r9 = r6.g
            p.ol71 r9 = (p.ol71) r9
            p.k1e0 r1 = new p.k1e0
            r3 = 3
            r1.<init>(r7, r6, r4, r3)
            java.lang.String r6 = "sharing.video_timestamp_share_format_loading"
            java.lang.Object r9 = r9.a(r6, r4, r1, r0)
            if (r9 != r5) goto L55
            goto L5f
        L55:
            r0.d = r4
            r0.b = r2
            java.lang.Object r6 = r8.b(r9, r0)
            if (r6 != r5) goto L60
        L5f:
            return r5
        L60:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.p4k1.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
