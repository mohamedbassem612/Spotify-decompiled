package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o3k1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ d0r a;
    public final /* synthetic */ dc31 b;
    public final /* synthetic */ ewn0 c;
    public final /* synthetic */ vi11 d;
    public final /* synthetic */ ptf1 e;

    public o3k1(d0r d0rVar, dc31 dc31Var, ewn0 ewn0Var, vi11 vi11Var, ptf1 ptf1Var) {
        this.a = d0rVar;
        this.b = dc31Var;
        this.c = ewn0Var;
        this.d = vi11Var;
        this.e = ptf1Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r13.b(r14, r7) == r10) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r12, p.r261 r13, p.onm r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof p.n3k1
            if (r0 == 0) goto L14
            r0 = r14
            p.n3k1 r0 = (p.n3k1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.b = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            p.n3k1 r0 = new p.n3k1
            r0.<init>(r11, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r7.a
            int r0 = r7.b
            r8 = 2
            r1 = 1
            r9 = 0
            p.d9n r10 = p.d9n.a
            if (r0 == 0) goto L39
            if (r0 == r1) goto L33
            if (r0 != r8) goto L2d
            p.hm5.M(r14)
            goto L5f
        L2d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            return r9
        L33:
            p.r261 r13 = r7.d
            p.hm5.M(r14)
            goto L54
        L39:
            p.hm5.M(r14)
            r6 = r12
            p.u3k1 r6 = (p.u3k1) r6
            r7.d = r13
            r7.b = r1
            p.d0r r1 = r11.a
            p.dc31 r2 = r11.b
            p.ewn0 r3 = r11.c
            p.vi11 r4 = r11.d
            p.ptf1 r5 = r11.e
            java.lang.Object r14 = p.t3k1.B(r1, r2, r3, r4, r5, r6, r7)
            if (r14 != r10) goto L54
            goto L5e
        L54:
            r7.d = r9
            r7.b = r8
            java.lang.Object r11 = r13.b(r14, r7)
            if (r11 != r10) goto L5f
        L5e:
            return r10
        L5f:
            p.rih1 r11 = p.rih1.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p.o3k1.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
