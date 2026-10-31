package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cd21 extends a8d1 implements vu30 {
    public final /* synthetic */ ven0 X;
    public faa0 a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ rkb d;
    public final /* synthetic */ be50 e;
    public final /* synthetic */ ven0 f;
    public final /* synthetic */ float g;
    public final /* synthetic */ long h;
    public final /* synthetic */ float i;
    public final /* synthetic */ float t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd21(float f, float f2, float f3, long j, rkb rkbVar, lnm lnmVar, be50 be50Var, ven0 ven0Var, ven0 ven0Var2) {
        super(2, lnmVar);
        this.d = rkbVar;
        this.e = be50Var;
        this.f = ven0Var;
        this.g = f;
        this.h = j;
        this.i = f2;
        this.t = f3;
        this.X = ven0Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        cd21 cd21Var = new cd21(this.g, this.i, this.t, this.h, this.d, lnmVar, this.e, this.f, this.X);
        cd21Var.c = obj;
        return cd21Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    /* JADX WARN: Code duplicated, block: B:16:0x0047 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0045 -> B:17:0x0048). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x005c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = r0.c
            p.c9n r1 = (p.c9n) r1
            boolean r2 = r0.b
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L1c
            if (r2 != r4) goto L16
            p.faa0 r2 = r0.a
            p.faa0 r2 = (p.faa0) r2
            p.hm5.M(r18)
            goto L48
        L16:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            return r3
        L1c:
            p.hm5.M(r18)
            p.rkb r2 = r0.d
            if (r2 != 0) goto L25
            goto L96
        L25:
            r2 = r3
        L26:
            boolean r5 = p.smo1.u(r1)
            if (r5 == 0) goto L96
            p.ma21 r5 = p.ma21.Z
            r0.c = r1
            r6 = r2
            p.faa0 r6 = (p.faa0) r6
            r0.a = r6
            r0.b = r4
            p.o8n r6 = r0.getContext()
            p.rjm0 r6 = p.s110.h(r6)
            java.lang.Object r5 = r6.D(r5, r0)
            p.d9n r6 = p.d9n.a
            if (r5 != r6) goto L48
            return r6
        L48:
            if (r2 == 0) goto L51
            boolean r5 = r2.isActive()
            if (r5 != r4) goto L51
            goto L26
        L51:
            p.be50 r5 = r0.e
            long r5 = r5.u
            r7 = 32
            long r7 = r5 >> r7
            int r7 = (int) r7
            if (r7 <= 0) goto L26
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
            int r5 = (int) r5
            if (r5 <= 0) goto L26
            p.ven0 r5 = r0.f
            java.lang.Object r5 = r5.getValue()
            androidx.compose.ui.geometry.Size r5 = (androidx.compose.ui.geometry.Size) r5
            long r5 = r5.a
            r7 = 0
            boolean r5 = androidx.compose.ui.geometry.Size.c(r5, r7)
            if (r5 != 0) goto L26
            p.bd21 r6 = new p.bd21
            p.ven0 r2 = r0.X
            r13 = 0
            float r7 = r0.g
            float r8 = r0.i
            float r9 = r0.t
            long r10 = r0.h
            p.rkb r12 = r0.d
            p.be50 r14 = r0.e
            p.ven0 r15 = r0.f
            r16 = r2
            r6.<init>(r7, r8, r9, r10, r12, r13, r14, r15, r16)
            r2 = 3
            r5 = 0
            p.xab1 r2 = p.fn31.T(r1, r3, r5, r6, r2)
            goto L26
        L96:
            p.rih1 r0 = p.rih1.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.cd21.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
