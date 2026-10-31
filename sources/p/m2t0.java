package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class m2t0 extends a8d1 implements vu30 {
    public final /* synthetic */ mnf1 N0;
    public final /* synthetic */ ven0 X;
    public final /* synthetic */ ven0 Y;
    public final /* synthetic */ ven0 Z;
    public otf1 a;
    public byte b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ otf1 d;
    public final /* synthetic */ rdm1 e;
    public final /* synthetic */ tob1 f;
    public final /* synthetic */ tob1 g;
    public final /* synthetic */ ven0 h;
    public final /* synthetic */ ven0 i;
    public final /* synthetic */ ven0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2t0(boolean z, otf1 otf1Var, rdm1 rdm1Var, tob1 tob1Var, tob1 tob1Var2, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4, ven0 ven0Var5, ven0 ven0Var6, mnf1 mnf1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = z;
        this.d = otf1Var;
        this.e = rdm1Var;
        this.f = tob1Var;
        this.g = tob1Var2;
        this.h = ven0Var;
        this.i = ven0Var2;
        this.t = ven0Var3;
        this.X = ven0Var4;
        this.Y = ven0Var5;
        this.Z = ven0Var6;
        this.N0 = mnf1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new m2t0(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r0 == r8) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws kotlinx.coroutines.flow.internal.AbortFlowException {
        /*
            r16 = this;
            r0 = r16
            byte r1 = r0.b
            p.rih1 r2 = p.rih1.a
            p.rdm1 r3 = r0.e
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L24
            if (r1 == r5) goto L1b
            if (r1 != r4) goto L14
            p.hm5.M(r17)
            return r2
        L14:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            r0 = 0
            return r0
        L1b:
            p.otf1 r0 = r0.a
            p.hm5.M(r17)
            r7 = r0
            r0 = r17
            goto L56
        L24:
            p.hm5.M(r17)
            p.dbp0 r6 = new p.dbp0
            p.ven0 r14 = r0.Z
            r15 = 6
            p.tob1 r7 = r0.f
            p.tob1 r8 = r0.g
            p.ven0 r9 = r0.h
            p.ven0 r10 = r0.i
            p.ven0 r11 = r0.t
            p.ven0 r12 = r0.X
            p.ven0 r13 = r0.Y
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            p.m441 r1 = p.rwq.q(r6)
            boolean r6 = r0.c
            p.otf1 r7 = r0.d
            p.d9n r8 = p.d9n.a
            if (r6 == 0) goto L5c
            if (r7 == 0) goto L6c
            r0.a = r7
            r0.b = r5
            java.lang.Object r0 = p.b5p1.i(r1, r0)
            if (r0 != r8) goto L56
            goto L6b
        L56:
            p.qy20 r0 = (p.qy20) r0
            p.pwo1.A(r7, r0, r3)
            return r2
        L5c:
            p.uqs0 r6 = new p.uqs0
            p.mnf1 r9 = r0.N0
            r6.<init>(r3, r9, r7, r5)
            r0.b = r4
            java.lang.Object r0 = r1.collect(r6, r0)
            if (r0 != r8) goto L6c
        L6b:
            return r8
        L6c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.m2t0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
