package p;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wra implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public wra(gsa gsaVar, zb10 zb10Var, String str) {
        this.a = (byte) 14;
        this.b = zb10Var;
        this.c = str;
        Objects.requireNonNull(gsaVar);
        this.d = gsaVar;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0247 */
    /* JADX WARN: Code duplicated, block: B:103:0x0264  */
    /* JADX WARN: Code duplicated, block: B:104:0x0268  */
    /* JADX WARN: Code duplicated, block: B:356:0x096b  */
    /* JADX WARN: Code duplicated, block: B:358:0x0973 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:359:0x0975  */
    /* JADX WARN: Code duplicated, block: B:362:0x097f  */
    /* JADX WARN: Code duplicated, block: B:370:0x09aa  */
    /* JADX WARN: Code duplicated, block: B:373:0x09b6  */
    /* JADX WARN: Code duplicated, block: B:376:0x09c8  */
    /* JADX WARN: Code duplicated, block: B:378:0x09d7  */
    /* JADX WARN: Code duplicated, block: B:381:0x09dd  */
    /* JADX WARN: Code duplicated, block: B:383:0x09f0  */
    /* JADX WARN: Code duplicated, block: B:385:0x09f8  */
    /* JADX WARN: Code duplicated, block: B:387:0x0a02  */
    /* JADX WARN: Code duplicated, block: B:389:0x0a08 A[LOOP:14: B:344:0x0937->B:389:0x0a08, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:420:0x0a9a  */
    /* JADX WARN: Code duplicated, block: B:421:0x0aa2  */
    /* JADX WARN: Code duplicated, block: B:455:0x018c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:0x022a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:486:0x09fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:487:0x0a15 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:489:0x0967 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:490:0x09af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:494:0x09a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0192  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:84:0x020a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0233 A[LOOP:0: B:19:0x00b6->B:88:0x0233, LOOP_END] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v9 java.lang.Object, still in use, count: 2, list:
          (r13v9 java.lang.Object) from 0x0963: PHI (r13 I:??) = (r13v1 java.lang.Object), (r13v9 java.lang.Object) binds: [B:352:0x0962, B:492:0x0963] A[DONT_GENERATE, DONT_INLINE]
          (r13v9 java.lang.Object) from 0x0955: CHECK_CAST (p.afm1) (r13v9 java.lang.Object)
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
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object call() {
        /*
            Method dump skipped, instruction units count: 2774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.wra.call():java.lang.Object");
    }

    public /* synthetic */ wra(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
