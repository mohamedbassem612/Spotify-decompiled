package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m66 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ y66 a;

    public m66(y66 y66Var) {
        this.a = y66Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        if (r1.b(r0, r3) == r7) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r22, p.r261 r23, p.onm r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r24
            p.y66 r2 = r0.a
            p.a56 r2 = r2.l
            boolean r3 = r1 instanceof p.l66
            if (r3 == 0) goto L1b
            r3 = r1
            p.l66 r3 = (p.l66) r3
            int r4 = r3.b
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1b
            int r4 = r4 - r5
            r3.b = r4
            goto L20
        L1b:
            p.l66 r3 = new p.l66
            r3.<init>(r0, r1)
        L20:
            java.lang.Object r0 = r3.a
            int r1 = r3.b
            r4 = 2
            r5 = 1
            r6 = 0
            p.d9n r7 = p.d9n.a
            if (r1 == 0) goto L3f
            if (r1 == r5) goto L39
            if (r1 != r4) goto L33
            p.hm5.M(r0)
            goto L94
        L33:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            return r6
        L39:
            p.r261 r1 = r3.d
            p.hm5.M(r0)
            goto L82
        L3f:
            p.hm5.M(r0)
            r0 = r22
            p.g56 r0 = (p.g56) r0
            p.hg40 r8 = new p.hg40
            java.lang.String r9 = r0.a
            java.lang.String r10 = r0.b
            java.lang.String r12 = r0.c
            p.xw51 r1 = r0.d
            if (r1 == 0) goto L56
            java.lang.String r1 = r1.a
            r13 = r1
            goto L57
        L56:
            r13 = r6
        L57:
            java.lang.String r14 = r0.e
            java.lang.String r1 = r0.f
            p.nmu0 r0 = r0.g
            r20 = 448(0x1c0, float:6.28E-43)
            r11 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = r0
            r18 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            p.fg40 r0 = r2.n(r8)
            p.o46 r1 = r2.c()
            r8 = r23
            r3.d = r8
            r3.b = r5
            java.lang.Object r0 = r1.a(r0, r3)
            if (r0 != r7) goto L81
            goto L93
        L81:
            r1 = r8
        L82:
            p.t46 r0 = (p.t46) r0
            r5 = 0
            p.m86 r0 = p.l4o1.g0(r0, r2, r5)
            r3.d = r6
            r3.b = r4
            java.lang.Object r0 = r1.b(r0, r3)
            if (r0 != r7) goto L94
        L93:
            return r7
        L94:
            p.rih1 r0 = p.rih1.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.m66.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
