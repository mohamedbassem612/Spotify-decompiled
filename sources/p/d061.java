package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class d061 extends tv30 implements iu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d061(Object obj, byte b) {
        super(1, obj, vo30.class, "create", "create(Lcom/spotify/mobile/android/spotlets/show/proto/ShowShowRequest$ProtoShowResponse;)Lcom/spotify/podcast/models/model/ShowEntity;", 0);
        this.a = b;
        switch (b) {
            case 16:
                super(1, obj, View.class, "findViewById", "findViewById(I)Landroid/view/View;", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0084  */
    /* JADX WARN: Code duplicated, block: B:219:0x06fe A[Catch: all -> 0x06f7, TRY_LEAVE, TryCatch #0 {all -> 0x06f7, blocks: (B:208:0x06e0, B:209:0x06e6, B:211:0x06ec, B:217:0x06fa, B:219:0x06fe), top: B:257:0x06e0 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0090  */
    /* JADX WARN: Code duplicated, block: B:221:0x0716  */
    /* JADX WARN: Code duplicated, block: B:225:0x0724  */
    /* JADX WARN: Code duplicated, block: B:229:0x072e  */
    /* JADX WARN: Code duplicated, block: B:241:0x0777  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:273:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x030b  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v26 java.lang.Object, still in use, count: 2, list:
          (r2v26 java.lang.Object) from 0x06fa: PHI (r2 I:??) = (r2v23 java.lang.Object), (r2v26 java.lang.Object) binds: [B:216:0x06f9, B:266:0x06fa] A[DONT_GENERATE, DONT_INLINE]
          (r2v26 java.lang.Object) from 0x06f1: CHECK_CAST (byte[]) (r2v26 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 2198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.d061.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d061(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d061(g0i g0iVar) {
        super(1, g0iVar, g0i.class, "findViewById", "findViewById(I)Landroid/view/View;", 0);
        this.a = (byte) 15;
    }
}
