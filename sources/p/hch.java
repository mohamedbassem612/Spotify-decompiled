package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hch extends a8d1 implements vu30 {
    public long a;
    public long b;
    public byte c;
    public final /* synthetic */ ich d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hch(ich ichVar, long j, lnm lnmVar) {
        super(2, lnmVar);
        this.d = ichVar;
        this.e = j;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new hch(this.d, this.e, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (p.hap1.i(r5 - r7, r11) == r4) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            byte r0 = r11.c
            r1 = 2
            p.ich r2 = r11.d
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r0 == 0) goto L21
            if (r0 == r3) goto L19
            if (r0 != r1) goto L12
            p.hm5.M(r12)
            goto L5a
        L12:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            r11 = 0
            return r11
        L19:
            long r5 = r11.b
            long r7 = r11.a
            p.hm5.M(r12)
            goto L42
        L21:
            p.hm5.M(r12)
            p.kiv r12 = p.t4k.t
            java.lang.Object r12 = p.lcc.z(r2, r12)
            p.e8k1 r12 = (p.e8k1) r12
            r12.getClass()
            long r5 = r12.a()
            r7 = 40
            r11.a = r7
            r11.b = r5
            r11.c = r3
            java.lang.Object r12 = p.hap1.i(r7, r11)
            if (r12 != r4) goto L42
            goto L59
        L42:
            p.mdn0 r12 = r2.p1
            long r9 = r11.e
            java.lang.Object r12 = r12.d(r9)
            p.fch r12 = (p.fch) r12
            if (r12 == 0) goto L50
            r12.b = r3
        L50:
            long r5 = r5 - r7
            r11.c = r1
            java.lang.Object r11 = p.hap1.i(r5, r11)
            if (r11 != r4) goto L5a
        L59:
            return r4
        L5a:
            kotlin.jvm.functions.Function0 r11 = r2.W0
            r11.invoke()
            p.rih1 r11 = p.rih1.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hch.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
