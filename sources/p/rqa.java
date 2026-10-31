package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rqa extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqa(j3e j3eVar, String str, i3e i3eVar) {
        super(0);
        this.a = (byte) 24;
        this.b = str;
        this.c = i3eVar;
    }

    /* JADX WARN: Code duplicated, block: B:159:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:31:0x0103  */
    /* JADX WARN: Code duplicated, block: B:34:0x0116  */
    /* JADX WARN: Code duplicated, block: B:40:0x012f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0147  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v16 java.lang.Object, still in use, count: 2, list:
          (r4v16 java.lang.Object) from 0x00f0: PHI (r4 I:??) = (r4v7 java.lang.Object), (r4v16 java.lang.Object) binds: [B:24:0x00ef, B:156:0x00f0] A[DONT_GENERATE, DONT_INLINE]
          (r4v16 java.lang.Object) from 0x00e2: CHECK_CAST (p.gvh0) (r4v16 java.lang.Object)
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
            Method dump skipped, instruction units count: 1104
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.rqa.invoke():java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rqa(Object obj, Object obj2, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
