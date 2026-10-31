package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mtj extends a8d1 implements vu30 {
    public long a;
    public frr0 b;
    public byte c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ hrd1 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ frr0 h;
    public final /* synthetic */ ven0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mtj(boolean z, ven0 ven0Var, hrd1 hrd1Var, Function0 function0, frr0 frr0Var, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.d = z;
        this.e = ven0Var;
        this.f = hrd1Var;
        this.g = function0;
        this.h = frr0Var;
        this.i = ven0Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new mtj(this.d, this.e, this.f, this.g, this.h, this.i, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x008f  */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r11 == r5) goto L20;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x006b -> B:22:0x006c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            byte r0 = r10.c
            p.ven0 r1 = r10.i
            r2 = 2
            r3 = 1
            p.frr0 r4 = r10.h
            p.d9n r5 = p.d9n.a
            if (r0 == 0) goto L23
            if (r0 == r3) goto L1f
            if (r0 != r2) goto L18
            long r6 = r10.a
            p.frr0 r0 = r10.b
            p.hm5.M(r11)
            goto L6c
        L18:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            r10 = 0
            return r10
        L1f:
            p.hm5.M(r11)
            goto L39
        L23:
            p.hm5.M(r11)
            p.cjj r11 = p.cjj.t
            r10.c = r3
            p.o8n r0 = r10.getContext()
            p.rjm0 r0 = p.s110.h(r0)
            java.lang.Object r11 = r0.D(r11, r10)
            if (r11 != r5) goto L39
            goto L6a
        L39:
            java.lang.Number r11 = (java.lang.Number) r11
            long r6 = r11.longValue()
            long r8 = r4.s()
            long r6 = r6 - r8
        L44:
            boolean r11 = r10.d
            if (r11 != 0) goto L9a
            java.lang.Object r11 = r1.getValue()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L9a
            p.cjj r11 = p.cjj.i
            r10.b = r4
            r10.a = r6
            r10.c = r2
            p.o8n r0 = r10.getContext()
            p.rjm0 r0 = p.s110.h(r0)
            java.lang.Object r11 = r0.D(r11, r10)
            if (r11 != r5) goto L6b
        L6a:
            return r5
        L6b:
            r0 = r4
        L6c:
            java.lang.Number r11 = (java.lang.Number) r11
            long r8 = r11.longValue()
            long r8 = r8 - r6
            r0.t(r8)
            long r8 = r4.s()
            p.hrd1 r11 = r10.f
            java.lang.Object r0 = r11.g(r8)
            p.ven0 r3 = r10.e
            r3.setValue(r0)
            long r8 = r4.s()
            boolean r11 = r11.d(r8)
            if (r11 == 0) goto L44
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r1.setValue(r11)
            kotlin.jvm.functions.Function0 r11 = r10.g
            r11.invoke()
            goto L44
        L9a:
            p.rih1 r10 = p.rih1.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.mtj.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
