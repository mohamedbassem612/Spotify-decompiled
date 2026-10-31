package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q66 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ y66 a;

    public q66(y66 y66Var) {
        this.a = y66Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r6 == r5) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a8, code lost:
    
        if (r8.b(r6, r1) == r5) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r7, p.r261 r8, p.onm r9) {
        /*
            r6 = this;
            p.y66 r0 = r6.a
            p.a56 r0 = r0.l
            boolean r1 = r9 instanceof p.p66
            if (r1 == 0) goto L17
            r1 = r9
            p.p66 r1 = (p.p66) r1
            int r2 = r1.b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.b = r2
            goto L1c
        L17:
            p.p66 r1 = new p.p66
            r1.<init>(r6, r9)
        L1c:
            java.lang.Object r6 = r1.a
            int r9 = r1.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r9 == 0) goto L3c
            if (r9 == r3) goto L36
            if (r9 != r2) goto L30
            p.hm5.M(r6)
            goto Lab
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L36:
            p.r261 r8 = r1.d
            p.hm5.M(r6)
            goto L72
        L3c:
            p.hm5.M(r6)
            p.s56 r7 = (p.s56) r7
            p.o46 r6 = r0.c()
            boolean r9 = r6 instanceof p.aab
            if (r9 == 0) goto L4c
            p.aab r6 = (p.aab) r6
            goto L4d
        L4c:
            r6 = r4
        L4d:
            if (r6 != 0) goto L60
            p.e86 r6 = new p.e86
            p.l46 r7 = new p.l46
            java.lang.String r9 = "This content type does not support triggering generation"
            r7.<init>(r9)
            java.util.List r7 = java.util.Collections.singletonList(r7)
            r6.<init>(r7)
            goto La0
        L60:
            p.hvg1 r9 = new p.hvg1
            java.lang.String r7 = r7.a
            r9.<init>(r7)
            r1.d = r8
            r1.b = r3
            java.lang.Object r6 = r6.c(r9, r1)
            if (r6 != r5) goto L72
            goto Laa
        L72:
            p.gvg1 r6 = (p.gvg1) r6
            boolean r7 = r6 instanceof p.fvg1
            if (r7 == 0) goto L83
            p.f86 r7 = new p.f86
            p.fvg1 r6 = (p.fvg1) r6
            p.dxn0 r6 = r6.a
            r7.<init>(r6)
        L81:
            r6 = r7
            goto La0
        L83:
            p.dvg1 r7 = p.dvg1.a
            boolean r7 = p.u890.j(r6, r7)
            if (r7 == 0) goto L8e
            p.d86 r6 = p.d86.a
            goto La0
        L8e:
            boolean r7 = r6 instanceof p.evg1
            if (r7 == 0) goto Lae
            p.e86 r7 = new p.e86
            p.evg1 r6 = (p.evg1) r6
            java.lang.Exception r6 = r6.a
            java.util.List r6 = r0.f(r6)
            r7.<init>(r6)
            goto L81
        La0:
            r1.d = r4
            r1.b = r2
            java.lang.Object r6 = r8.b(r6, r1)
            if (r6 != r5) goto Lab
        Laa:
            return r5
        Lab:
            p.rih1 r6 = p.rih1.a
            return r6
        Lae:
            p.eg.o()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.q66.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
