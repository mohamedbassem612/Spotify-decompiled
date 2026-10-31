package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class z2x implements gfh0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z2x(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:110:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:119:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:123:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:126:0x0209  */
    /* JADX WARN: Code duplicated, block: B:128:0x020c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x020e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0210  */
    /* JADX WARN: Code duplicated, block: B:132:0x0213  */
    /* JADX WARN: Code duplicated, block: B:133:0x0215  */
    /* JADX WARN: Code duplicated, block: B:136:0x0219  */
    /* JADX WARN: Code duplicated, block: B:139:0x0239 A[LOOP:1: B:24:0x0094->B:139:0x0239, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:150:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x009a  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00de  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:45:0x0100  */
    /* JADX WARN: Code duplicated, block: B:47:0x0103  */
    /* JADX WARN: Code duplicated, block: B:49:0x010b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0114  */
    /* JADX WARN: Code duplicated, block: B:53:0x0118  */
    /* JADX WARN: Code duplicated, block: B:54:0x011e  */
    /* JADX WARN: Code duplicated, block: B:56:0x012c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0134  */
    /* JADX WARN: Code duplicated, block: B:59:0x0137  */
    /* JADX WARN: Code duplicated, block: B:62:0x013c  */
    /* JADX WARN: Code duplicated, block: B:63:0x013f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0143  */
    /* JADX WARN: Code duplicated, block: B:66:0x0145  */
    /* JADX WARN: Code duplicated, block: B:68:0x0148  */
    /* JADX WARN: Code duplicated, block: B:70:0x014e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0151  */
    /* JADX WARN: Code duplicated, block: B:75:0x015b  */
    /* JADX WARN: Code duplicated, block: B:79:0x016a  */
    /* JADX WARN: Code duplicated, block: B:81:0x016f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0172  */
    /* JADX WARN: Code duplicated, block: B:84:0x0175  */
    /* JADX WARN: Code duplicated, block: B:85:0x017d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0188  */
    /* JADX WARN: Code duplicated, block: B:89:0x018b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0191  */
    /* JADX WARN: Code duplicated, block: B:93:0x0194  */
    /* JADX WARN: Code duplicated, block: B:96:0x019a  */
    /* JADX WARN: Code duplicated, block: B:97:0x019d  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a0  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r15v5 java.lang.Object, still in use, count: 2, list:
          (r15v5 java.lang.Object) from 0x008e: PHI (r15 I:??) = (r15v1 java.lang.Object), (r15v5 java.lang.Object) binds: [B:22:0x008c, B:147:0x008e] A[DONT_GENERATE, DONT_INLINE]
          (r15v5 java.lang.Object) from 0x0081: CHECK_CAST (p.afh0) (r15v5 java.lang.Object)
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
    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public final p.hfh0 m730measure3p2s80s(p.ifh0 r25, java.util.List r26, long r27) {
        /*
            Method dump skipped, instruction units count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.z2x.m730measure3p2s80s(p.ifh0, java.util.List, long):p.hfh0");
    }
}
