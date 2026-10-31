package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class itl extends hab0 implements xu30 {
    public static final itl b;
    public static final itl c;
    public static final itl d;
    public static final itl e;
    public static final itl f;
    public final /* synthetic */ byte a;

    static {
        int i = 3;
        b = new itl(i, (byte) 0);
        c = new itl(i, (byte) 1);
        d = new itl(i, (byte) 2);
        e = new itl(i, (byte) 3);
        f = new itl(i, (byte) 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public itl(sbk sbkVar) {
        super(3);
        this.a = (byte) 5;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0091  */
    /* JADX WARN: Code duplicated, block: B:28:0x009f  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v7 java.lang.Object, still in use, count: 2, list:
          (r0v7 java.lang.Object) from 0x0088: PHI (r0 I:??) = (r0v4 java.lang.Object), (r0v7 java.lang.Object) binds: [B:19:0x0087, B:48:0x0088] A[DONT_GENERATE, DONT_INLINE]
          (r0v7 java.lang.Object) from 0x0075: CHECK_CAST (p.c3f1) (r0v7 java.lang.Object)
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
    @Override // p.xu30
    public final java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.itl.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ itl(int i, byte b2) {
        super(i);
        this.a = b2;
    }
}
