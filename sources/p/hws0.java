package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hws0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hws0(iu30 iu30Var, yiv0 yiv0Var) {
        super(2);
        this.a = (byte) 19;
        this.c = iu30Var;
        this.b = yiv0Var;
    }

    private final Object a(Object obj, Object obj2) {
        zkw0 zkw0Var = (zkw0) this.b;
        epb1 epb1Var = new epb1((zob1) obj);
        ajq0 ajq0Var = (ajq0) this.c;
        return new jpg0(new aso(f6o1.A(mii0.b((mii0) zkw0Var.c, (qa2) zkw0Var.f, epb1Var, (kko) ajq0Var.a, new ohi0(new har0(((uk00) zkw0Var.d).b), false, false, 472), (qa2) zkw0Var.e, (hs00) null, (zox0) null, (apx0) null, (y6w0) null, (p731) ajq0Var.c, 976), null, null, 3), new ewq0(zkw0Var, (byte) 15)), p7w0.O0);
    }

    /* JADX WARN: Code duplicated, block: B:175:0x0664  */
    /* JADX WARN: Code duplicated, block: B:181:0x0679  */
    /* JADX WARN: Code duplicated, block: B:184:0x0683  */
    /* JADX WARN: Code duplicated, block: B:189:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:197:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:203:0x0718 A[LOOP:3: B:201:0x0712->B:203:0x0718, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:206:0x0773  */
    /* JADX WARN: Code duplicated, block: B:208:0x077e  */
    /* JADX WARN: Code duplicated, block: B:210:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:279:0x0962  */
    /* JADX WARN: Code duplicated, block: B:396:0x0703 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:0x06ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:0x06e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:402:0x0676 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:403:0x0693 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:404:? A[LOOP:4: B:182:0x067d->B:404:?, LOOP_END, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v29 java.lang.Object, still in use, count: 2, list:
          (r8v29 java.lang.Object) from 0x0658: PHI (r8 I:??) = (r8v18 java.lang.Object), (r8v29 java.lang.Object) binds: [B:168:0x0657, B:394:0x0658] A[DONT_GENERATE, DONT_INLINE]
          (r8v29 java.lang.Object) from 0x0643: CHECK_CAST (p.fji0) (r8v29 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r37, java.lang.Object r38) {
        /*
            Method dump skipped, instruction units count: 3324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hws0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hws0(Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hws0(iu30 iu30Var, p7t0 p7t0Var) {
        super(2);
        this.a = (byte) 5;
        this.c = iu30Var;
        this.b = p7t0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hws0(Object obj, Object obj2, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
