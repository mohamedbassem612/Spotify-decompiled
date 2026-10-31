package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xu70 extends a8d1 implements vu30 {
    public List a;
    public xtb0 b;
    public int c;
    public int d;
    public byte e;
    public final /* synthetic */ Set f;
    public final /* synthetic */ List g;
    public final /* synthetic */ ven0 h;
    public final /* synthetic */ xtb0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu70(Set set, List list, ven0 ven0Var, xtb0 xtb0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.f = set;
        this.g = list;
        this.h = ven0Var;
        this.i = xtb0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new xu70(this.f, this.g, this.h, this.i, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0090 A[LOOP:0: B:17:0x008a->B:19:0x0090, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x00af  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bf, code lost:
    
        if (r6.f(r3, 0, r11) == r5) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            byte r0 = r11.e
            r1 = 0
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r0 == 0) goto L2b
            if (r0 == r3) goto L1d
            if (r0 != r2) goto L17
            java.util.List r11 = r11.a
            p.ptb0 r11 = (p.ptb0) r11
            p.hm5.M(r12)
            goto Lc2
        L17:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            return r4
        L1d:
            int r0 = r11.d
            int r3 = r11.c
            p.xtb0 r6 = r11.b
            java.util.List r7 = r11.a
            java.util.List r7 = (java.util.List) r7
            p.hm5.M(r12)
            goto L71
        L2b:
            p.hm5.M(r12)
            p.ven0 r12 = r11.h
            java.lang.Object r0 = r12.getValue()
            java.util.Set r0 = (java.util.Set) r0
            java.util.Set r6 = r11.f
            java.util.List r7 = r11.g
            java.lang.Integer r0 = p.p1p1.F(r0, r6, r7)
            r12.setValue(r6)
            if (r0 == 0) goto Lc2
            int r12 = r0.intValue()
            p.ih1 r0 = new p.ih1
            r6 = 27
            p.xtb0 r8 = r11.i
            r0.<init>(r8, r6)
            p.m441 r0 = p.rwq.q(r0)
            p.vuo r6 = new p.vuo
            r6.<init>(r7, r4, r3)
            r9 = r7
            java.util.List r9 = (java.util.List) r9
            r11.a = r9
            r11.b = r8
            r11.c = r12
            r11.d = r1
            r11.e = r3
            java.lang.Object r0 = p.b5p1.j(r0, r6, r11)
            if (r0 != r5) goto L6d
            goto Lc1
        L6d:
            r3 = r12
            r12 = r0
            r0 = r1
            r6 = r8
        L71:
            p.ptb0 r12 = (p.ptb0) r12
            int r7 = p.p7h.L(r7)
            java.util.List r12 = r12.l
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = p.q7h.U(r12, r9)
            r8.<init>(r9)
            java.util.Iterator r12 = r12.iterator()
        L8a:
            boolean r9 = r12.hasNext()
            if (r9 == 0) goto La1
            java.lang.Object r9 = r12.next()
            p.qtb0 r9 = (p.qtb0) r9
            int r9 = r9.a
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r9)
            r8.add(r10)
            goto L8a
        La1:
            if (r3 == 0) goto Laf
            if (r3 == r7) goto Laf
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            boolean r12 = r8.contains(r12)
            if (r12 != 0) goto Lc2
        Laf:
            r11.a = r4
            r11.b = r4
            r11.c = r3
            r11.d = r0
            r11.e = r2
            p.df41 r12 = p.xtb0.y
            java.lang.Object r11 = r6.f(r3, r1, r11)
            if (r11 != r5) goto Lc2
        Lc1:
            return r5
        Lc2:
            p.rih1 r11 = p.rih1.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xu70.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
