package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j2d0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2d0(View view, iu30 iu30Var) {
        super(1);
        this.a = (byte) 13;
        this.c = iu30Var;
        this.b = view;
    }

    /* JADX WARN: Code duplicated, block: B:151:0x0470  */
    /* JADX WARN: Code duplicated, block: B:152:0x0473  */
    /* JADX WARN: Code duplicated, block: B:155:0x0480  */
    /* JADX WARN: Code duplicated, block: B:156:0x0483  */
    /* JADX WARN: Code duplicated, block: B:159:0x04a3 A[Catch: all -> 0x04f1, TryCatch #0 {all -> 0x04f1, blocks: (B:128:0x03a7, B:130:0x03e8, B:134:0x0416, B:140:0x042d, B:149:0x044d, B:153:0x0475, B:157:0x0485, B:159:0x04a3, B:160:0x04a8, B:162:0x04e2, B:163:0x04e7, B:166:0x04f3, B:167:0x04fe, B:143:0x0438, B:146:0x0443), top: B:269:0x03a7 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x04e2 A[Catch: all -> 0x04f1, TryCatch #0 {all -> 0x04f1, blocks: (B:128:0x03a7, B:130:0x03e8, B:134:0x0416, B:140:0x042d, B:149:0x044d, B:153:0x0475, B:157:0x0485, B:159:0x04a3, B:160:0x04a8, B:162:0x04e2, B:163:0x04e7, B:166:0x04f3, B:167:0x04fe, B:143:0x0438, B:146:0x0443), top: B:269:0x03a7 }] */
    /* JADX WARN: Code duplicated, block: B:232:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:233:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:236:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:237:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:239:0x06da  */
    /* JADX WARN: Code duplicated, block: B:255:0x074a A[Catch: Exception -> 0x0761, TryCatch #1 {Exception -> 0x0761, blocks: (B:253:0x0726, B:255:0x074a, B:257:0x074e, B:261:0x0764), top: B:270:0x0726 }] */
    /* JADX WARN: Code duplicated, block: B:257:0x074e A[Catch: Exception -> 0x0761, TryCatch #1 {Exception -> 0x0761, blocks: (B:253:0x0726, B:255:0x074a, B:257:0x074e, B:261:0x0764), top: B:270:0x0726 }] */
    /* JADX WARN: Code duplicated, block: B:260:0x0763  */
    /* JADX WARN: Code duplicated, block: B:270:0x0726 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:? A[RETURN, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v6 java.lang.Object, still in use, count: 2, list:
          (r3v6 java.lang.Object) from 0x0721: PHI (r3 I:??) = (r3v2 java.lang.Object), (r3v6 java.lang.Object) binds: [B:249:0x0720, B:314:0x0721] A[DONT_GENERATE, DONT_INLINE]
          (r3v6 java.lang.Object) from 0x071a: CHECK_CAST (byte[]) (r3v6 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r38) {
        /*
            Method dump skipped, instruction units count: 2006
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.j2d0.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j2d0(Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
