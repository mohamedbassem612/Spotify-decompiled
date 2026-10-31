package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class idr extends a8d1 implements vu30 {
    public int a;
    public byte b;
    public final /* synthetic */ cwx c;
    public final /* synthetic */ o95 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ Function0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public idr(cwx cwxVar, o95 o95Var, long j, long j2, Function0 function0, lnm lnmVar) {
        super(2, lnmVar);
        this.c = cwxVar;
        this.d = o95Var;
        this.e = j;
        this.f = j2;
        this.g = function0;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new idr(this.c, this.d, this.e, this.f, this.g, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0075, code lost:
    
        if (p.o95.b(r11.d, r7, r8, (java.lang.Float) null, (p.iu30) null, r11, 12) == r5) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            byte r0 = r13.b
            r1 = 0
            r2 = 1
            p.cwx r3 = r13.c
            r4 = 2
            p.d9n r5 = p.d9n.a
            if (r0 == 0) goto L22
            if (r0 == r2) goto L1b
            if (r0 != r4) goto L14
            p.hm5.M(r14)
            r11 = r13
            goto L78
        L14:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r13)
            r13 = 0
            return r13
        L1b:
            int r0 = r13.a
            p.hm5.M(r14)
            r11 = r13
            goto L54
        L22:
            p.hm5.M(r14)
            p.bwx r14 = r3.b
            long r6 = r14.d
            p.ngv r14 = p.ngv.d
            int r0 = p.jfv.t(r6, r14)
            p.u7h r7 = new p.u7h
            long r8 = r13.e
            r7.<init>(r8)
            p.uo5 r14 = r3.a
            java.lang.Object r14 = r14.b
            p.jhx r14 = (p.jhx) r14
            p.ceo r14 = r14.a
            p.pxg1 r8 = p.irn1.o0(r0, r1, r14, r4)
            r13.a = r0
            r13.b = r2
            p.o95 r6 = r13.d
            r9 = 0
            r10 = 0
            r12 = 12
            r11 = r13
            java.lang.Object r13 = p.o95.b(r6, r7, r8, r9, r10, r11, r12)
            if (r13 != r5) goto L54
            goto L77
        L54:
            p.u7h r7 = new p.u7h
            long r13 = r11.f
            r7.<init>(r13)
            p.uo5 r13 = r3.a
            java.lang.Object r13 = r13.c
            p.jhx r13 = (p.jhx) r13
            p.ceo r13 = r13.a
            p.pxg1 r8 = p.irn1.o0(r0, r1, r13, r4)
            r11.a = r0
            r11.b = r4
            p.o95 r6 = r11.d
            r9 = 0
            r10 = 0
            r12 = 12
            java.lang.Object r13 = p.o95.b(r6, r7, r8, r9, r10, r11, r12)
            if (r13 != r5) goto L78
        L77:
            return r5
        L78:
            kotlin.jvm.functions.Function0 r13 = r11.g
            r13.invoke()
            p.rih1 r13 = p.rih1.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p.idr.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
