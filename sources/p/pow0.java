package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pow0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ qow0 a;

    public pow0(qow0 qow0Var) {
        this.a = qow0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        if (r8.b(r7, r0) == r5) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r7, p.r261 r8, p.onm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.oow0
            if (r0 == 0) goto L13
            r0 = r9
            p.oow0 r0 = (p.oow0) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.oow0 r0 = new p.oow0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r9)
            goto L80
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            p.uow0 r6 = r0.e
            p.r261 r8 = r0.d
            p.hm5.M(r9)
            goto L5f
        L39:
            p.hm5.M(r9)
            p.uow0 r7 = (p.uow0) r7
            boolean r9 = r7.b
            if (r9 == 0) goto L45
            p.wls0 r9 = p.wls0.d
            goto L47
        L45:
            p.wls0 r9 = p.wls0.c
        L47:
            p.qow0 r6 = r6.a
            p.iyc0 r6 = r6.c
            java.lang.String r1 = r7.a
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r0.d = r8
            r0.e = r7
            r0.b = r3
            java.lang.Object r9 = p.iyc0.b(r6, r1, r9, r0)
            if (r9 != r5) goto L5e
            goto L7f
        L5e:
            r6 = r7
        L5f:
            p.py21 r9 = (p.py21) r9
            boolean r7 = r9 instanceof p.oy21
            if (r7 == 0) goto L6d
            p.xow0 r7 = new p.xow0
            boolean r6 = r6.b
            r7.<init>(r6)
            goto L73
        L6d:
            boolean r6 = r9 instanceof p.ly21
            if (r6 == 0) goto L83
            p.yow0 r7 = p.yow0.a
        L73:
            r0.d = r4
            r0.e = r4
            r0.b = r2
            java.lang.Object r6 = r8.b(r7, r0)
            if (r6 != r5) goto L80
        L7f:
            return r5
        L80:
            p.rih1 r6 = p.rih1.a
            return r6
        L83:
            p.eg.o()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.pow0.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
