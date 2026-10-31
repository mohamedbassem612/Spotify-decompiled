package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yrf1 extends a8d1 implements vu30 {
    public float a;
    public float b;
    public long c;
    public long d;
    public byte e;
    public final /* synthetic */ float f;
    public final /* synthetic */ ven0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yrf1(float f, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.f = f;
        this.g = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new yrf1(this.f, this.g, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0087, code lost:
    
        if (r10 == r5) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ae, code lost:
    
        if (r10 >= 1.0f) goto L23;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0087 -> B:21:0x008a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            byte r1 = r0.e
            p.ven0 r2 = r0.g
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L34
            if (r1 == r4) goto L26
            if (r1 != r3) goto L1f
            long r6 = r0.d
            long r8 = r0.c
            float r1 = r0.b
            float r4 = r0.a
            p.hm5.M(r17)
            r10 = r17
            goto L8a
        L1f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            r0 = 0
            return r0
        L26:
            long r6 = r0.c
            float r1 = r0.b
            float r4 = r0.a
            p.hm5.M(r17)
            r8 = r6
            r6 = r4
            r4 = r17
            goto L67
        L34:
            p.hm5.M(r17)
            java.lang.Object r1 = r2.getValue()
            p.p3v r1 = (p.p3v) r1
            float r1 = r1.a
            float r6 = r0.f
            boolean r7 = p.p3v.c(r1, r6)
            if (r7 == 0) goto L48
            goto Lb0
        L48:
            p.bpf1 r7 = p.bpf1.S0
            r0.a = r1
            r0.b = r6
            r8 = 250000000(0xee6b280, double:1.235164115E-315)
            r0.c = r8
            r0.e = r4
            p.o8n r4 = r0.getContext()
            p.rjm0 r4 = p.s110.h(r4)
            java.lang.Object r4 = r4.D(r7, r0)
            if (r4 != r5) goto L64
            goto L89
        L64:
            r15 = r6
            r6 = r1
            r1 = r15
        L67:
            java.lang.Number r4 = (java.lang.Number) r4
            long r10 = r4.longValue()
            r4 = r6
            r6 = r10
        L6f:
            p.bpf1 r10 = p.bpf1.R0
            r0.a = r4
            r0.b = r1
            r0.c = r8
            r0.d = r6
            r0.e = r3
            p.o8n r11 = r0.getContext()
            p.rjm0 r11 = p.s110.h(r11)
            java.lang.Object r10 = r11.D(r10, r0)
            if (r10 != r5) goto L8a
        L89:
            return r5
        L8a:
            java.lang.Number r10 = (java.lang.Number) r10
            long r10 = r10.longValue()
            long r10 = r10 - r6
            float r10 = (float) r10
            float r11 = (float) r8
            float r10 = r10 / r11
            r11 = 0
            r12 = 1065353216(0x3f800000, float:1.0)
            float r10 = p.yoi1.o(r10, r11, r12)
            float r11 = r10 * r10
            r13 = 1077936128(0x40400000, float:3.0)
            r14 = 1073741824(0x40000000, float:2.0)
            float r11 = p.fd21.g(r10, r14, r13, r11)
            float r11 = p.dm5.T(r4, r1, r11)
            p.pzm.k(r11, r2)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 < 0) goto L6f
        Lb0:
            p.rih1 r0 = p.rih1.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.yrf1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
