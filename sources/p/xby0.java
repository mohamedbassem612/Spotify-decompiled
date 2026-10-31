package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xby0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ List c;
    public final /* synthetic */ hdn0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xby0(List list, hdn0 hdn0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = list;
        this.d = hdn0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        hdn0 hdn0Var = this.d;
        List list = this.c;
        switch (b) {
            case 0:
                return new xby0(list, hdn0Var, lnmVar, (byte) 0);
            default:
                return new xby0(list, hdn0Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return d9n.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0028 -> B:14:0x002c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005d -> B:27:0x0061). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:15:0x003d
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            byte r0 = r9.a
            java.util.List r1 = r9.c
            p.hdn0 r2 = r9.d
            r3 = 3000(0xbb8, double:1.482E-320)
            r5 = 0
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.d9n r7 = p.d9n.a
            r8 = 1
            switch(r0) {
                case 0: goto L3d;
                default: goto L11;
            }
        L11:
            boolean r0 = r9.b
            if (r0 == 0) goto L1f
            if (r0 != r8) goto L1b
            p.hm5.M(r10)
            goto L2c
        L1b:
            p.eg.m(r6)
            goto L2b
        L1f:
            p.hm5.M(r10)
        L22:
            r9.b = r8
            java.lang.Object r10 = p.hap1.i(r3, r9)
            if (r10 != r7) goto L2c
            r5 = r7
        L2b:
            return r5
        L2c:
            r10 = r2
            p.err0 r10 = (p.err0) r10
            int r0 = r10.s()
            int r0 = r0 + r8
            int r5 = r1.size()
            int r0 = r0 % r5
            r10.t(r0)
            goto L22
        L3d:
            boolean r0 = r9.b
            if (r0 == 0) goto L4b
            if (r0 != r8) goto L47
            p.hm5.M(r10)
            goto L61
        L47:
            p.eg.m(r6)
            goto L60
        L4b:
            p.hm5.M(r10)
            int r10 = r1.size()
            if (r10 > r8) goto L57
            p.rih1 r5 = p.rih1.a
            goto L60
        L57:
            r9.b = r8
            java.lang.Object r10 = p.hap1.i(r3, r9)
            if (r10 != r7) goto L61
            r5 = r7
        L60:
            return r5
        L61:
            r10 = r2
            p.err0 r10 = (p.err0) r10
            int r0 = r10.s()
            int r0 = r0 + r8
            int r5 = r1.size()
            int r0 = r0 % r5
            r10.t(r0)
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xby0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
