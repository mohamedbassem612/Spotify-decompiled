package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class td4 implements gfh0 {
    public static final td4 b = new td4(0);
    public static final td4 c = new td4(1);
    public static final td4 d = new td4(2);
    public static final td4 e = new td4(3);
    public static final td4 f = new td4(4);
    public static final td4 g = new td4(5);
    public static final td4 h = new td4(6);
    public static final td4 i = new td4(7);
    public static final td4 j = new td4(8);
    public static final td4 k = new td4(9);
    public static final td4 l = new td4(10);
    public static final td4 m = new td4(11);
    public static final td4 n = new td4(12);
    public static final td4 o = new td4(13);
    public final /* synthetic */ byte a;

    public /* synthetic */ td4(byte b2) {
        this.a = b2;
    }

    public static final void a(ArrayList arrayList, n811 n811Var, ifh0 ifh0Var, ArrayList arrayList2, ArrayList arrayList3, n811 n811Var2, ArrayList arrayList4, n811 n811Var3, n811 n811Var4) {
        if (!arrayList.isEmpty()) {
            n811Var.a = ifh0Var.i0(12.0f) + n811Var.a;
        }
        arrayList.add(0, o7h.l1(arrayList2));
        arrayList3.add(Integer.valueOf(n811Var2.a));
        arrayList4.add(Integer.valueOf(n811Var.a));
        n811Var.a += n811Var2.a;
        n811Var3.a = Math.max(n811Var3.a, n811Var4.a);
        arrayList2.clear();
        n811Var4.a = 0;
        n811Var2.a = 0;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0264 A[PHI: r6 r7
      0x0264: PHI (r6v67 int) = (r6v66 int), (r6v71 int), (r6v71 int) binds: [B:116:0x027f, B:109:0x0256, B:111:0x025e] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r7v55 int) = (r7v54 int), (r7v60 int), (r7v60 int) binds: [B:116:0x027f, B:109:0x0256, B:111:0x025e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:227:0x05bf  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v47 java.lang.Object, still in use, count: 2, list:
          (r3v47 java.lang.Object) from 0x05ba: PHI (r3 I:??) = (r3v43 java.lang.Object), (r3v47 java.lang.Object) binds: [B:224:0x05b8, B:390:0x05ba] A[DONT_GENERATE, DONT_INLINE]
          (r3v47 java.lang.Object) from 0x05a9: CHECK_CAST (p.afh0) (r3v47 java.lang.Object)
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
    public final p.hfh0 m699measure3p2s80s(p.ifh0 r35, java.util.List r36, long r37) {
        /*
            Method dump skipped, instruction units count: 2554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.td4.m699measure3p2s80s(p.ifh0, java.util.List, long):p.hfh0");
    }
}
