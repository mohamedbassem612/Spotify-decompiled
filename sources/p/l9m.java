package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l9m extends a8d1 implements vu30 {
    public int a;
    public long b;
    public boolean c;
    public final /* synthetic */ List d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ ven0 f;
    public final /* synthetic */ hdn0 g;
    public final /* synthetic */ frr0 h;
    public final /* synthetic */ ven0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9m(List list, iu30 iu30Var, ven0 ven0Var, hdn0 hdn0Var, frr0 frr0Var, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.d = list;
        this.e = iu30Var;
        this.f = ven0Var;
        this.g = hdn0Var;
        this.h = frr0Var;
        this.i = ven0Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new l9m(this.d, this.e, this.f, this.g, this.h, this.i, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0067  */
    /* JADX WARN: Code duplicated, block: B:20:0x0077 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0091  */
    /* JADX WARN: Code duplicated, block: B:26:0x009e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0075 -> B:21:0x0078). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            boolean r1 = r0.c
            p.ven0 r2 = r0.i
            p.frr0 r3 = r0.h
            r4 = 0
            p.iu30 r5 = r0.e
            p.hdn0 r6 = r0.g
            p.rih1 r7 = p.rih1.a
            p.ven0 r8 = r0.f
            r9 = 1
            if (r1 == 0) goto L25
            if (r1 != r9) goto L1e
            long r10 = r0.b
            int r1 = r0.a
            p.hm5.M(r23)
            goto L78
        L1e:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            r0 = 0
            return r0
        L25:
            p.hm5.M(r23)
            java.lang.Object r1 = r8.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L36
            goto Lc7
        L36:
            java.util.List r1 = r0.d
            int r1 = r1.size()
            if (r1 != 0) goto L4c
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r8.setValue(r0)
            p.b9m r0 = new p.b9m
            r0.<init>(r4)
            r5.invoke(r0)
            return r7
        L4c:
            r10 = r6
            p.err0 r10 = (p.err0) r10
            r10.t(r9)
            r10 = 0
            r3.t(r10)
            long r10 = java.lang.System.nanoTime()
        L5b:
            java.lang.Object r12 = r2.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto Lae
            r0.a = r1
            r0.b = r10
            r0.c = r9
            r12 = 16
            java.lang.Object r12 = p.hap1.i(r12, r0)
            p.d9n r13 = p.d9n.a
            if (r12 != r13) goto L78
            return r13
        L78:
            long r12 = java.lang.System.nanoTime()
            long r12 = r12 - r10
            r14 = 1000000(0xf4240, double:4.940656E-318)
            long r12 = r12 / r14
            r3.t(r12)
            r14 = 40
            long r16 = r12 / r14
            r18 = 1
            r20 = r10
            long r9 = r16 + r18
            int r9 = (int) r9
            if (r9 <= r1) goto L92
            r9 = r1
        L92:
            r10 = r6
            p.err0 r10 = (p.err0) r10
            r10.t(r9)
            int r9 = r10.s()
            if (r9 < r1) goto Laa
            int r9 = r1 + (-1)
            long r9 = (long) r9
            long r9 = r9 * r14
            r14 = 250(0xfa, double:1.235E-321)
            long r9 = r9 + r14
            int r9 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r9 < 0) goto Laa
            goto Lae
        Laa:
            r10 = r20
            r9 = 1
            goto L5b
        Lae:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r8.setValue(r0)
            java.lang.Object r0 = r2.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lc7
            p.b9m r0 = new p.b9m
            r0.<init>(r4)
            r5.invoke(r0)
        Lc7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.l9m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
