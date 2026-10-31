package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class st implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ String c;

    public /* synthetic */ st(vr20 vr20Var, Object obj, String str, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object b(Object obj, lnm lnmVar) {
        rls rlsVar;
        if (lnmVar instanceof rls) {
            rlsVar = (rls) lnmVar;
            int i = rlsVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                rlsVar.b = i - Integer.MIN_VALUE;
            } else {
                rlsVar = new rls(this, lnmVar);
            }
        } else {
            rlsVar = new rls(this, lnmVar);
        }
        Object obj2 = rlsVar.a;
        int i2 = rlsVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            f7h f7hVar = (f7h) ((Map) obj).get(this.c);
            Boolean boolValueOf = Boolean.valueOf(f7hVar != null ? f7hVar.c : false);
            rlsVar.b = 1;
            Object objEmit = this.b.emit(boolValueOf, rlsVar);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:126:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:151:0x024b  */
    /* JADX WARN: Code duplicated, block: B:170:0x0296  */
    /* JADX WARN: Code duplicated, block: B:201:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:222:0x0352  */
    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    /* JADX WARN: Code duplicated, block: B:248:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:266:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:284:0x0441  */
    /* JADX WARN: Code duplicated, block: B:305:0x048a  */
    /* JADX WARN: Code duplicated, block: B:322:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:32:0x0088  */
    /* JADX WARN: Code duplicated, block: B:340:0x050b  */
    /* JADX WARN: Code duplicated, block: B:377:0x059c  */
    /* JADX WARN: Code duplicated, block: B:392:0x05da  */
    /* JADX WARN: Code duplicated, block: B:407:0x0615  */
    /* JADX WARN: Code duplicated, block: B:426:0x0662  */
    /* JADX WARN: Code duplicated, block: B:428:0x0665  */
    /* JADX WARN: Code duplicated, block: B:431:0x067b  */
    /* JADX WARN: Code duplicated, block: B:438:0x068e  */
    /* JADX WARN: Code duplicated, block: B:453:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:468:0x0706  */
    /* JADX WARN: Code duplicated, block: B:483:0x0741  */
    /* JADX WARN: Code duplicated, block: B:502:0x0789  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:517:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:537:0x0816  */
    /* JADX WARN: Code duplicated, block: B:554:0x0858  */
    /* JADX WARN: Code duplicated, block: B:569:0x0894  */
    /* JADX WARN: Code duplicated, block: B:571:0x089a  */
    /* JADX WARN: Code duplicated, block: B:572:0x08a0  */
    /* JADX WARN: Code duplicated, block: B:575:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:582:0x08bd  */
    /* JADX WARN: Code duplicated, block: B:599:0x08fe  */
    /* JADX WARN: Code duplicated, block: B:637:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:700:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:725:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0153  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v14 java.lang.Object, still in use, count: 2, list:
          (r14v14 java.lang.Object) from 0x0890: PHI (r14 I:??) = (r14v11 java.lang.Object), (r14v14 java.lang.Object) binds: [B:566:0x088f, B:630:0x0890] A[DONT_GENERATE, DONT_INLINE]
          (r14v14 java.lang.Object) from 0x0884: CHECK_CAST (p.qfd) (r14v14 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final java.lang.Object emit(java.lang.Object r14, p.lnm r15) {
        /*
            Method dump skipped, instruction units count: 2446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.st.emit(java.lang.Object, p.lnm):java.lang.Object");
    }

    public /* synthetic */ st(vr20 vr20Var, String str, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = str;
    }
}
