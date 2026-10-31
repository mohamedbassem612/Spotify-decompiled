package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dt20 extends a8d1 implements xu30 {
    public jfe a;
    public long b;
    public int c;
    public boolean d;
    public /* synthetic */ c9n e;
    public /* synthetic */ vr20 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ mr20 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt20(long j, mr20 mr20Var, lnm lnmVar) {
        super(3, lnmVar);
        this.g = j;
        this.h = mr20Var;
    }

    @Override // p.xu30
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        dt20 dt20Var = new dt20(this.g, this.h, (lnm) obj3);
        dt20Var.e = (c9n) obj;
        dt20Var.f = (vr20) obj2;
        return dt20Var.invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0069 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0072  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0067 -> B:14:0x006a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p.faa
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            p.c9n r0 = r9.e
            p.vr20 r1 = r9.f
            boolean r2 = r9.d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L1c
            if (r2 != r3) goto L16
            int r0 = r9.c
            long r5 = r9.b
            p.jfe r2 = r9.a
            p.hm5.M(r10)
            goto L6a
        L16:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r4
        L1c:
            p.hm5.M(r10)
            r5 = 0
            long r7 = r9.g
            int r10 = p.jfv.c(r7, r5)
            if (r10 <= 0) goto L75
            p.mr20 r10 = r9.h
            r2 = 2
            r5 = 0
            p.mr20 r10 = p.o4p1.k(r10, r5, r2)
            p.jfe r10 = p.k4p1.A(r0, r10)
            r2 = r10
            r0 = r5
            r5 = r7
        L38:
            p.ou51 r10 = new p.ou51
            p.o8n r7 = r9.getContext()
            r10.<init>(r7)
            p.zsc r7 = r2.t()
            p.zfe r8 = new p.zfe
            r8.<init>(r1, r4)
            r10.g(r7, r8)
            p.ct20 r7 = new p.ct20
            r7.<init>(r5, r4)
            p.x760.C(r10, r5, r7)
            r9.e = r4
            r9.f = r1
            r9.a = r2
            r9.b = r5
            r9.c = r0
            r9.d = r3
            java.lang.Object r10 = p.ou51.d(r10, r9)
            p.d9n r7 = p.d9n.a
            if (r10 != r7) goto L6a
            return r7
        L6a:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L38
            p.rih1 r9 = p.rih1.a
            return r9
        L75:
            kotlinx.coroutines.TimeoutCancellationException r9 = new kotlinx.coroutines.TimeoutCancellationException
            java.lang.String r10 = "Timed out immediately"
            r9.<init>(r10, r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.dt20.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
