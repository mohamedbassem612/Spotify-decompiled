package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m4e1 extends a8d1 implements vu30 {
    public float a;
    public byte b;
    public final /* synthetic */ float c;
    public final /* synthetic */ n4e1 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ long f;
    public final /* synthetic */ n511 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4e1(float f, n4e1 n4e1Var, boolean z, long j, n511 n511Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = f;
        this.d = n4e1Var;
        this.e = z;
        this.f = j;
        this.g = n511Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new m4e1(this.c, this.d, this.e, this.f, this.g, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008e, code lost:
    
        if (r9.a(r6, r8) == r5) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.b
            p.n4e1 r1 = r8.d
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r0 == 0) goto L21
            if (r0 == r4) goto L1b
            if (r0 != r3) goto L14
            p.hm5.M(r9)
            goto L91
        L14:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            r8 = 0
            return r8
        L1b:
            float r0 = r8.a
            p.hm5.M(r9)
            goto L52
        L21:
            p.hm5.M(r9)
            float r9 = r8.c
            boolean r0 = java.lang.Float.isNaN(r9)
            if (r0 != 0) goto L3d
            boolean r0 = java.lang.Float.isInfinite(r9)
            if (r0 == 0) goto L33
            goto L3d
        L33:
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 <= 0) goto L3f
            double r6 = (double) r9
            double r6 = java.lang.Math.ceil(r6)
        L3c:
            float r9 = (float) r6
        L3d:
            r0 = r9
            goto L45
        L3f:
            double r6 = (double) r9
            double r6 = java.lang.Math.floor(r6)
            goto L3c
        L45:
            p.es41 r9 = r1.X0
            r8.a = r0
            r8.b = r4
            java.lang.Object r9 = p.kqn1.v(r9, r0, r8)
            if (r9 != r5) goto L52
            goto L90
        L52:
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            boolean r4 = r8.e
            if (r4 == 0) goto L91
            long r6 = r8.f
            boolean r4 = p.nbe1.d(r6)
            p.n511 r6 = r8.g
            if (r4 == 0) goto L84
            float r4 = r6.c
            float r7 = r6.a
            float r4 = r4 - r7
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 > 0) goto L84
            float r0 = r0 - r9
            float r9 = java.lang.Math.abs(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 >= 0) goto L7b
            goto L84
        L7b:
            float r9 = r6.c
            float r9 = r9 + r0
            r0 = 11
            p.n511 r6 = p.n511.b(r6, r2, r2, r9, r0)
        L84:
            p.aae1 r9 = r1.S0
            p.j5c r9 = r9.h
            r8.b = r3
            java.lang.Object r8 = r9.a(r6, r8)
            if (r8 != r5) goto L91
        L90:
            return r5
        L91:
            p.rih1 r8 = p.rih1.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.m4e1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
