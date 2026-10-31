package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s66 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ y66 a;

    public s66(y66 y66Var) {
        this.a = y66Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
    
        if (r1.b(r0, r3) == r7) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r22, p.r261 r23, p.onm r24) throws kotlin.NoWhenBranchMatchedException {
        /*
            r21 = this;
            r0 = r21
            r1 = r24
            p.y66 r2 = r0.a
            p.a56 r2 = r2.l
            boolean r3 = r1 instanceof p.r66
            if (r3 == 0) goto L1b
            r3 = r1
            p.r66 r3 = (p.r66) r3
            int r4 = r3.b
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1b
            int r4 = r4 - r5
            r3.b = r4
            goto L20
        L1b:
            p.r66 r3 = new p.r66
            r3.<init>(r0, r1)
        L20:
            java.lang.Object r0 = r3.a
            int r1 = r3.b
            r4 = 2
            r5 = 1
            r6 = 0
            p.d9n r7 = p.d9n.a
            if (r1 == 0) goto L40
            if (r1 == r5) goto L3a
            if (r1 != r4) goto L34
            p.hm5.M(r0)
            goto La6
        L34:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            return r6
        L3a:
            p.r261 r1 = r3.d
            p.hm5.M(r0)
            goto L94
        L40:
            p.hm5.M(r0)
            r0 = r22
            p.h56 r0 = (p.h56) r0
            p.o46 r1 = r2.c()
            boolean r8 = r1 instanceof p.mmu0
            if (r8 == 0) goto L52
            p.mmu0 r1 = (p.mmu0) r1
            goto L53
        L52:
            r1 = r6
        L53:
            if (r1 != 0) goto L68
            p.z66 r0 = new p.z66
            p.l46 r1 = new p.l46
            java.lang.String r2 = "This content type does not support template generation"
            r1.<init>(r2)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r0.<init>(r1)
            r1 = r23
            goto L9b
        L68:
            p.hg40 r8 = new p.hg40
            java.lang.String r11 = r0.a
            boolean r0 = r0.b
            r19 = 0
            r20 = 1914(0x77a, float:2.682E-42)
            java.lang.String r9 = ""
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r16 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            p.fg40 r0 = r2.n(r8)
            r8 = r23
            r3.d = r8
            r3.b = r5
            java.lang.Object r0 = r1.c(r0, r3)
            if (r0 != r7) goto L93
            goto La5
        L93:
            r1 = r8
        L94:
            p.t46 r0 = (p.t46) r0
            r5 = 0
            p.m86 r0 = p.l4o1.g0(r0, r2, r5)
        L9b:
            r3.d = r6
            r3.b = r4
            java.lang.Object r0 = r1.b(r0, r3)
            if (r0 != r7) goto La6
        La5:
            return r7
        La6:
            p.rih1 r0 = p.rih1.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.s66.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
