package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class iv61 extends a8d1 implements xu30 {
    public vr20 a;
    public byte b;
    public /* synthetic */ vr20 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ kv61 e;
    public final /* synthetic */ xt61 f;
    public final /* synthetic */ zu61 g;
    public final /* synthetic */ int h;
    public List i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv61(lnm lnmVar, kv61 kv61Var, xt61 xt61Var, zu61 zu61Var, int i) {
        super(3, lnmVar);
        this.e = kv61Var;
        this.f = xt61Var;
        this.g = zu61Var;
        this.h = i;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        iv61 iv61Var = new iv61((lnm) obj3, this.e, this.f, this.g, this.h);
        iv61Var.c = (vr20) obj;
        iv61Var.d = obj2;
        return iv61Var.invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a3, code lost:
    
        if (p.l4p1.s(r1, r2, r16) == r14) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            p.vr20 r1 = r0.c
            java.lang.Object r2 = r0.d
            byte r3 = r0.b
            r4 = 10
            p.kv61 r8 = r0.e
            p.xt61 r5 = r0.f
            r12 = 2
            r6 = 1
            r13 = 0
            p.d9n r14 = p.d9n.a
            if (r3 == 0) goto L30
            if (r3 == r6) goto L24
            if (r3 != r12) goto L1e
            p.hm5.M(r17)
            goto La6
        L1e:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            return r13
        L24:
            java.util.List r1 = r0.i
            java.util.List r1 = (java.util.List) r1
            p.vr20 r2 = r0.a
            p.hm5.M(r17)
            r3 = r17
            goto L67
        L30:
            p.hm5.M(r17)
            java.util.List r2 = (java.util.List) r2
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L41
            p.huz r2 = new p.huz
            r2.<init>(r13, r4)
            goto L95
        L41:
            r0.c = r13
            r0.d = r13
            r0.a = r1
            r3 = r2
            java.util.List r3 = (java.util.List) r3
            r0.i = r3
            r0.b = r6
            int r3 = p.kv61.r
            int r3 = r0.h
            java.lang.String r6 = java.lang.String.valueOf(r3)
            p.gop0 r7 = new p.gop0
            r7.<init>(r5, r3, r8, r13)
            p.zu61 r3 = r0.g
            java.lang.Object r3 = r3.a(r6, r13, r7, r0)
            if (r3 != r14) goto L64
            goto La5
        L64:
            r15 = r2
            r2 = r1
            r1 = r15
        L67:
            p.wu61 r3 = (p.wu61) r3
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            p.c9 r1 = p.mqo1.F(r1)
            p.av61 r7 = new p.av61
            r7.<init>(r13, r3, r1)
            p.cu61 r1 = r5.d
            if (r1 == 0) goto L8d
            p.at71 r1 = r1.a()
            p.mr20 r6 = p.rqt0.u(r1)
            p.k4r0 r5 = new p.k4r0
            int r10 = r0.h
            r11 = 1
            p.zu61 r9 = r0.g
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r1 = r2
            r2 = r5
            goto L95
        L8d:
            p.huz r1 = new p.huz
            r1.<init>(r7, r4)
            r15 = r2
            r2 = r1
            r1 = r15
        L95:
            r0.c = r13
            r0.d = r13
            r0.a = r13
            r0.i = r13
            r0.b = r12
            java.lang.Object r0 = p.l4p1.s(r1, r2, r0)
            if (r0 != r14) goto La6
        La5:
            return r14
        La6:
            p.rih1 r0 = p.rih1.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.iv61.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
