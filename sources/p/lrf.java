package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lrf extends a8d1 implements xu30 {
    public final /* synthetic */ tob1 N0;
    public final /* synthetic */ tob1 O0;
    public final /* synthetic */ tob1 X;
    public final /* synthetic */ tob1 Y;
    public final /* synthetic */ ven0 Z;
    public idn0 a;
    public r9w0 b;
    public idn0 c;
    public byte d;
    public /* synthetic */ p9w0 e;
    public /* synthetic */ long f;
    public final /* synthetic */ idn0 g;
    public final /* synthetic */ idn0 h;
    public final /* synthetic */ tob1 i;
    public final /* synthetic */ ven0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lrf(idn0 idn0Var, idn0 idn0Var2, tob1 tob1Var, ven0 ven0Var, tob1 tob1Var2, tob1 tob1Var3, ven0 ven0Var2, tob1 tob1Var4, tob1 tob1Var5, lnm lnmVar) {
        super(3, lnmVar);
        this.g = idn0Var;
        this.h = idn0Var2;
        this.i = tob1Var;
        this.t = ven0Var;
        this.X = tob1Var2;
        this.Y = tob1Var3;
        this.Z = ven0Var2;
        this.N0 = tob1Var4;
        this.O0 = tob1Var5;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((Offset) obj2).a;
        tob1 tob1Var = this.N0;
        tob1 tob1Var2 = this.O0;
        lrf lrfVar = new lrf(this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, tob1Var, tob1Var2, (lnm) obj3);
        lrfVar.e = (p9w0) obj;
        lrfVar.f = j;
        return lrfVar.invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0087  */
    /* JADX WARN: Code duplicated, block: B:25:0x008d  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a2, code lost:
    
        if (r2.b(r1, r17) == r15) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            p.p9w0 r1 = r0.e
            long r9 = r0.f
            byte r2 = r0.d
            r11 = 3
            r12 = 2
            r13 = 1
            r14 = 0
            p.d9n r15 = p.d9n.a
            if (r2 == 0) goto L3a
            if (r2 == r13) goto L2d
            if (r2 == r12) goto L21
            if (r2 != r11) goto L1b
            p.hm5.M(r18)
            goto La5
        L1b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            return r14
        L21:
            p.idn0 r1 = r0.c
            p.r9w0 r2 = r0.b
            p.hm5.M(r18)
            r3 = r2
            r2 = r1
            r1 = r18
            goto L7f
        L2d:
            p.r9w0 r2 = r0.b
            p.idn0 r3 = r0.a
            p.hm5.M(r18)
            r16 = r3
            r3 = r2
            r2 = r16
            goto L6c
        L3a:
            p.hm5.M(r18)
            p.tob1 r7 = r0.N0
            p.tob1 r8 = r0.O0
            p.tob1 r2 = r0.i
            p.ven0 r3 = r0.t
            p.tob1 r4 = r0.X
            p.tob1 r5 = r0.Y
            p.ven0 r6 = r0.Z
            boolean r2 = p.mrf.a(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r2 == 0) goto L54
            p.idn0 r2 = r0.g
            goto L56
        L54:
            p.idn0 r2 = r0.h
        L56:
            p.r9w0 r3 = new p.r9w0
            r3.<init>(r9)
            r0.e = r1
            r0.a = r2
            r0.b = r3
            r0.f = r9
            r0.d = r13
            java.lang.Object r4 = r2.b(r3, r0)
            if (r4 != r15) goto L6c
            goto La4
        L6c:
            r0.e = r14
            r0.a = r14
            r0.b = r3
            r0.c = r2
            r0.f = r9
            r0.d = r12
            java.lang.Object r1 = r1.d(r0)
            if (r1 != r15) goto L7f
            goto La4
        L7f:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L8d
            p.s9w0 r1 = new p.s9w0
            r1.<init>(r3)
            goto L92
        L8d:
            p.q9w0 r1 = new p.q9w0
            r1.<init>(r3)
        L92:
            r0.e = r14
            r0.a = r14
            r0.b = r14
            r0.c = r14
            r0.f = r9
            r0.d = r11
            java.lang.Object r0 = r2.b(r1, r0)
            if (r0 != r15) goto La5
        La4:
            return r15
        La5:
            p.rih1 r0 = p.rih1.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.lrf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
