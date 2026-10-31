package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xe2 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public int b;
    public byte c;
    public Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe2(int i, xtb0 xtb0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 6;
        this.b = i;
        this.e = xtb0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new xe2(obj2, lnmVar, (byte) 0);
            case 1:
                xe2 xe2Var = new xe2(obj2, lnmVar, (byte) 1);
                xe2Var.d = obj;
                return xe2Var;
            case 2:
                xe2 xe2Var2 = new xe2(obj2, lnmVar, (byte) 2);
                xe2Var2.d = obj;
                return xe2Var2;
            case 3:
                return new xe2((u790) this.d, (b890) obj2, lnmVar);
            case 4:
                xe2 xe2Var3 = new xe2((o95) obj2, this.b, lnmVar);
                xe2Var3.d = obj;
                return xe2Var3;
            case 5:
                return new xe2(obj2, lnmVar, (byte) 5);
            default:
                xe2 xe2Var4 = new xe2(this.b, (xtb0) obj2, lnmVar);
                xe2Var4.d = obj;
                return xe2Var4;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((yvg1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:141:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:144:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:217:0x0426  */
    /* JADX WARN: Code duplicated, block: B:218:0x0428  */
    /* JADX WARN: Code duplicated, block: B:221:0x0437  */
    /* JADX WARN: Code duplicated, block: B:227:0x0456  */
    /* JADX WARN: Code duplicated, block: B:228:0x0458 A[PHI: r4
      0x0458: PHI (r4v16 int) = (r4v11 int), (r4v18 int) binds: [B:220:0x0435, B:225:0x0453] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:230:0x045b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:233:0x0467  */
    /* JADX WARN: Code duplicated, block: B:236:0x0478  */
    /* JADX WARN: Code duplicated, block: B:238:0x047b  */
    /* JADX WARN: Code duplicated, block: B:239:0x0495  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    /* JADX WARN: Code duplicated, block: B:241:0x0498  */
    /* JADX WARN: Code duplicated, block: B:244:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:257:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:273:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0078  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [int] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v15, types: [int] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v23 java.lang.Object, still in use, count: 2, list:
          (r2v23 java.lang.Object) from 0x0054: PHI (r2 I:??) = (r2v20 java.lang.Object), (r2v23 java.lang.Object) binds: [B:20:0x0053, B:254:0x0054] A[DONT_GENERATE, DONT_INLINE]
          (r2v23 java.lang.Object) from 0x004c: CHECK_CAST (p.qtb0) (r2v23 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 1294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xe2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xe2(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe2(o95 o95Var, int i, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 4;
        this.e = o95Var;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe2(u790 u790Var, b890 b890Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 3;
        this.d = u790Var;
        this.e = b890Var;
    }
}
