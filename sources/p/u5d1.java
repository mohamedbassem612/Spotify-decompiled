package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class u5d1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ il0 a;
    public final /* synthetic */ c6d1 b;
    public final /* synthetic */ esa1 c;
    public final /* synthetic */ cof0 d;

    public u5d1(il0 il0Var, c6d1 c6d1Var, esa1 esa1Var, cof0 cof0Var) {
        this.a = il0Var;
        this.b = c6d1Var;
        this.c = esa1Var;
        this.d = cof0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r0.b(r1, r2) == r7) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r17, p.r261 r18, p.onm r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r19
            boolean r2 = r1 instanceof p.t5d1
            if (r2 == 0) goto L17
            r2 = r1
            p.t5d1 r2 = (p.t5d1) r2
            int r3 = r2.b
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.b = r3
            goto L1c
        L17:
            p.t5d1 r2 = new p.t5d1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.a
            int r3 = r2.b
            r4 = 2
            r5 = 1
            r6 = 0
            p.d9n r7 = p.d9n.a
            if (r3 == 0) goto L3b
            if (r3 == r5) goto L35
            if (r3 != r4) goto L2f
            p.hm5.M(r1)
            goto L6b
        L2f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            return r6
        L35:
            p.r261 r0 = r2.d
            p.hm5.M(r1)
            goto L60
        L3b:
            p.hm5.M(r1)
            r10 = r17
            p.b5d1 r10 = (p.b5d1) r10
            p.geo0 r1 = p.geo0.b
            p.qt61 r8 = new p.qt61
            r15 = 0
            r9 = 5
            p.il0 r11 = r0.a
            p.c6d1 r12 = r0.b
            p.esa1 r13 = r0.c
            p.cof0 r14 = r0.d
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r0 = r18
            r2.d = r0
            r2.b = r5
            java.lang.Object r1 = p.fn31.Y(r1, r8, r2)
            if (r1 != r7) goto L60
            goto L6a
        L60:
            r2.d = r6
            r2.b = r4
            java.lang.Object r0 = r0.b(r1, r2)
            if (r0 != r7) goto L6b
        L6a:
            return r7
        L6b:
            p.rih1 r0 = p.rih1.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.u5d1.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
