package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l6z implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ l6z(byte b, Object obj, vr20 vr20Var) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object b(Object obj, lnm lnmVar) {
        uy00 uy00Var;
        if (lnmVar instanceof uy00) {
            uy00Var = (uy00) lnmVar;
            int i = uy00Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                uy00Var.b = i - Integer.MIN_VALUE;
            } else {
                uy00Var = new uy00(this, lnmVar);
            }
        } else {
            uy00Var = new uy00(this, lnmVar);
        }
        Object obj2 = uy00Var.a;
        int i2 = uy00Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            k1r k1rVar = (k1r) obj;
            i1r i1rVar = k1rVar instanceof i1r ? (i1r) k1rVar : null;
            Boolean boolValueOf = Boolean.valueOf(i1rVar != null ? ((Boolean) i1rVar.a).booleanValue() : false);
            uy00Var.b = 1;
            Object objEmit = this.b.emit(boolValueOf, uy00Var);
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

    /* JADX WARN: Code duplicated, block: B:103:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:120:0x01df  */
    /* JADX WARN: Code duplicated, block: B:137:0x0217  */
    /* JADX WARN: Code duplicated, block: B:152:0x0253  */
    /* JADX WARN: Code duplicated, block: B:169:0x0290  */
    /* JADX WARN: Code duplicated, block: B:191:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:206:0x031c  */
    /* JADX WARN: Code duplicated, block: B:226:0x036c  */
    /* JADX WARN: Code duplicated, block: B:241:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:264:0x0422  */
    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:304:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:323:0x053a  */
    /* JADX WARN: Code duplicated, block: B:360:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:383:0x065b  */
    /* JADX WARN: Code duplicated, block: B:409:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:41:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:431:0x075a  */
    /* JADX WARN: Code duplicated, block: B:447:0x07ab  */
    /* JADX WARN: Code duplicated, block: B:463:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:479:0x0834  */
    /* JADX WARN: Code duplicated, block: B:495:0x0883  */
    /* JADX WARN: Code duplicated, block: B:535:0x0961  */
    /* JADX WARN: Code duplicated, block: B:548:0x098a  */
    /* JADX WARN: Code duplicated, block: B:564:0x09cc  */
    /* JADX WARN: Code duplicated, block: B:584:0x0a2f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:600:0x0a70  */
    /* JADX WARN: Code duplicated, block: B:645:0x0965 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:648:0x08ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0124  */
    /* JADX WARN: Code duplicated, block: B:88:0x0164  */
    /* JADX WARN: Code duplicated, block: B:9:0x0031  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v19 java.lang.Object, still in use, count: 2, list:
          (r5v19 java.lang.Object) from 0x08e8: PHI (r5 I:??) = (r5v8 java.lang.Object), (r5v19 java.lang.Object) binds: [B:510:0x08e7, B:651:0x08e8] A[DONT_GENERATE, DONT_INLINE]
          (r5v19 java.lang.Object) from 0x08d6: CHECK_CAST (java.util.Map$Entry) (r5v19 java.lang.Object)
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
    public final java.lang.Object emit(java.lang.Object r33, p.lnm r34) {
        /*
            Method dump skipped, instruction units count: 2826
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.l6z.emit(java.lang.Object, p.lnm):java.lang.Object");
    }

    public /* synthetic */ l6z(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
