package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gy41 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ dh30 a;

    public gy41(dh30 dh30Var) {
        this.a = dh30Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        if (r14.b(r13, r0) == r5) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r13, p.r261 r14, p.onm r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof p.fy41
            if (r0 == 0) goto L13
            r0 = r15
            p.fy41 r0 = (p.fy41) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.fy41 r0 = new p.fy41
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.a
            int r1 = r0.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r15)
            goto L78
        L2b:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r12)
            return r4
        L31:
            p.tx41 r12 = r0.e
            p.r261 r14 = r0.d
            p.hm5.M(r15)
            goto L64
        L39:
            p.hm5.M(r15)
            p.tx41 r13 = (p.tx41) r13
            p.ldh r6 = new p.ldh
            p.j80 r15 = r13.a
            java.lang.String r7 = r15.a
            java.lang.String r8 = r15.b
            java.util.concurrent.atomic.AtomicReferenceArray r15 = p.p6r0.e
            p.p6r0 r15 = p.yon1.U4()
            java.lang.String r9 = r15.c
            p.tv80 r10 = r13.b
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            r0.d = r14
            r0.e = r13
            r0.b = r3
            p.dh30 r12 = r12.a
            java.lang.Object r12 = r12.I(r6, r0)
            if (r12 != r5) goto L63
            goto L77
        L63:
            r12 = r13
        L64:
            p.g051 r13 = new p.g051
            p.tv80 r12 = r12.b
            r13.<init>(r12)
            r0.d = r4
            r0.e = r4
            r0.b = r2
            java.lang.Object r12 = r14.b(r13, r0)
            if (r12 != r5) goto L78
        L77:
            return r5
        L78:
            p.rih1 r12 = p.rih1.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p.gy41.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
