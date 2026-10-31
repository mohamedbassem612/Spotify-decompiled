package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kyg0 extends a8d1 implements vu30 {
    public int a;
    public float b;
    public byte c;
    public final /* synthetic */ xtb0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ wat f;
    public final /* synthetic */ ven0 g;
    public final /* synthetic */ ven0 h;
    public final /* synthetic */ hdn0 i;
    public final /* synthetic */ ven0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kyg0(xtb0 xtb0Var, int i, wat watVar, ven0 ven0Var, ven0 ven0Var2, hdn0 hdn0Var, ven0 ven0Var3, lnm lnmVar) {
        super(2, lnmVar);
        this.d = xtb0Var;
        this.e = i;
        this.f = watVar;
        this.g = ven0Var;
        this.h = ven0Var2;
        this.i = hdn0Var;
        this.t = ven0Var3;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new kyg0(this.d, this.e, this.f, this.g, this.h, this.i, this.t, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((List) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        if (r3.k(r1, 0, r10) == r7) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            byte r0 = r10.c
            int r1 = r10.e
            r2 = 2
            p.xtb0 r3 = r10.d
            p.ven0 r4 = r10.h
            r5 = 1
            p.rih1 r6 = p.rih1.a
            p.d9n r7 = p.d9n.a
            if (r0 == 0) goto L28
            if (r0 == r5) goto L20
            if (r0 != r2) goto L19
            p.hm5.M(r11)
            goto L94
        L19:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            r10 = 0
            return r10
        L20:
            float r0 = r10.b
            int r5 = r10.a
            p.hm5.M(r11)
            goto L81
        L28:
            p.hm5.M(r11)
            p.ven0 r11 = r10.g
            java.lang.Object r11 = r11.getValue()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L3a
            goto L99
        L3a:
            java.lang.Object r11 = r4.getValue()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L47
            goto L99
        L47:
            p.i25 r11 = r3.e
            java.lang.Object r11 = r11.b
            p.err0 r11 = (p.err0) r11
            int r11 = r11.s()
            if (r11 == r1) goto L54
            goto L99
        L54:
            p.hdn0 r11 = r10.i
            int r11 = p.i1o1.D(r3, r11, r1)
            p.wat r0 = r10.f
            float r0 = r0.M0(r11)
            p.ven0 r8 = r10.t
            java.lang.Object r9 = r8.getValue()
            p.p3v r9 = (p.p3v) r9
            float r9 = r9.a
            boolean r9 = p.p3v.c(r0, r9)
            if (r9 != 0) goto L99
            p.pzm.k(r0, r8)
            r10.a = r11
            r10.b = r0
            r10.c = r5
            java.lang.Object r5 = p.xpn1.H(r10)
            if (r5 != r7) goto L80
            goto L93
        L80:
            r5 = r11
        L81:
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r4.setValue(r11)
            r10.a = r5
            r10.b = r0
            r10.c = r2
            r11 = 0
            java.lang.Object r10 = r3.k(r1, r11, r10)
            if (r10 != r7) goto L94
        L93:
            return r7
        L94:
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r4.setValue(r10)
        L99:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.kyg0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
