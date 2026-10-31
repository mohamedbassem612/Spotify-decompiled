package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mc5 extends a8d1 implements vu30 {
    public final /* synthetic */ ven0 X;
    public int a;
    public int b;
    public List c;
    public hdn0 d;
    public tob1 e;
    public byte f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ List h;
    public final /* synthetic */ int i;
    public final /* synthetic */ hdn0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc5(boolean z, List list, int i, hdn0 hdn0Var, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.g = z;
        this.h = list;
        this.i = i;
        this.t = hdn0Var;
        this.X = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new mc5(this.g, this.h, this.i, this.t, this.X, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006e  */
    /* JADX WARN: Code duplicated, block: B:24:0x009c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0060 -> B:18:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x009c -> B:25:0x009f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            byte r0 = r11.f
            java.util.List r1 = r11.h
            r2 = 2
            r3 = 0
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r0 == 0) goto L30
            if (r0 == r4) goto L28
            if (r0 != r2) goto L21
            int r0 = r11.b
            int r1 = r11.a
            p.tob1 r3 = r11.e
            p.hdn0 r6 = r11.d
            java.util.List r7 = r11.c
            java.util.List r7 = (java.util.List) r7
            p.hm5.M(r12)
            r12 = r7
            goto L9f
        L21:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            r11 = 0
            return r11
        L28:
            int r0 = r11.b
            int r6 = r11.a
            p.hm5.M(r12)
            goto L63
        L30:
            p.hm5.M(r12)
            boolean r12 = r11.g
            if (r12 == 0) goto La4
            r12 = r1
            java.util.Collection r12 = (java.util.Collection) r12
            int r12 = r12.size()
            r0 = r12
            r6 = r3
        L40:
            p.ven0 r12 = r11.X
            p.hdn0 r7 = r11.t
            if (r6 >= r0) goto L65
            p.err0 r7 = (p.err0) r7
            r7.t(r6)
            java.lang.Object r12 = r12.getValue()
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            long r7 = (long) r12
            r11.a = r6
            r11.b = r0
            r11.f = r4
            java.lang.Object r12 = p.hap1.i(r7, r11)
            if (r12 != r5) goto L63
            goto L9b
        L63:
            int r6 = r6 + r4
            goto L40
        L65:
            int r0 = r11.i
            r6 = r0
            r0 = r12
            r12 = r1
            r1 = r6
            r6 = r7
        L6c:
            if (r3 >= r1) goto La4
            int r7 = p.p7h.L(r12)
            int r8 = r3 + 1
            int r8 = r8 + r7
            r7 = r6
            p.err0 r7 = (p.err0) r7
            r7.t(r8)
            java.lang.Object r7 = r0.getValue()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            long r7 = (long) r7
            r9 = r12
            java.util.List r9 = (java.util.List) r9
            r11.c = r9
            r11.d = r6
            r11.e = r0
            r11.a = r1
            r11.b = r3
            r11.f = r2
            java.lang.Object r7 = p.hap1.i(r7, r11)
            if (r7 != r5) goto L9c
        L9b:
            return r5
        L9c:
            r10 = r3
            r3 = r0
            r0 = r10
        L9f:
            int r0 = r0 + r4
            r10 = r3
            r3 = r0
            r0 = r10
            goto L6c
        La4:
            p.rih1 r11 = p.rih1.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p.mc5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
