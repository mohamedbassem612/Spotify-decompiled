package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ih1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xtb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ih1(xtb0 xtb0Var, byte b) {
        super(0);
        this.a = b;
        this.b = xtb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0219  */
    /* JADX WARN: Code duplicated, block: B:156:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:197:0x035a  */
    /* JADX WARN: Code duplicated, block: B:199:0x035e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0360  */
    /* JADX WARN: Code duplicated, block: B:234:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e9  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v35 java.lang.Object, still in use, count: 2, list:
          (r0v35 java.lang.Object) from 0x029c: PHI (r0 I:??) = (r0v32 java.lang.Object), (r0v35 java.lang.Object) binds: [B:153:0x029b, B:225:0x029c] A[DONT_GENERATE, DONT_INLINE]
          (r0v35 java.lang.Object) from 0x0294: CHECK_CAST (p.qtb0) (r0v35 java.lang.Object)
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
    public final java.lang.Object invoke() {
        /*
            Method dump skipped, instruction units count: 1002
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ih1.invoke():java.lang.Object");
    }
}
