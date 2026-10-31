package p;

import com.spotify.encoreconsumermobile.elements.badge.badgegroup.BadgeGroupView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class n5 extends tv30 implements iu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(BadgeGroupView badgeGroupView, byte b) {
        super(1, badgeGroupView, BadgeGroupView.class, "replaceFirstBadge", "replaceFirstBadge(Lcom/spotify/encoreconsumermobile/elements/badge/badgegroup/BadgeGroup$BadgeType;)V", 0);
        this.a = b;
        switch (b) {
            case 28:
                super(1, badgeGroupView, BadgeGroupView.class, "replaceSecondBadge", "replaceSecondBadge(Lcom/spotify/encoreconsumermobile/elements/badge/badgegroup/BadgeGroup$BadgeType;)V", 0);
                break;
            case 29:
                super(1, badgeGroupView, BadgeGroupView.class, "replaceThirdBadge", "replaceThirdBadge(Lcom/spotify/encoreconsumermobile/elements/badge/badgegroup/BadgeGroup$BadgeType;)V", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:204:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:277:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x033e  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v30 java.lang.Object, still in use, count: 2, list:
          (r1v30 java.lang.Object) from 0x06e8: PHI (r1 I:??) = (r1v27 java.lang.Object), (r1v30 java.lang.Object) binds: [B:201:0x06e7, B:268:0x06e8] A[DONT_GENERATE, DONT_INLINE]
          (r1v30 java.lang.Object) from 0x06e1: CHECK_CAST (byte[]) (r1v30 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 2098
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.n5.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n5(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(i6 i6Var) {
        super(1, i6Var, i6.class, "onFocusChange", "onFocusChange(Z)V", 0);
        this.a = (byte) 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(so1 so1Var) {
        super(1, so1Var, so1.class, "resolveItems", "resolveItems(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = (byte) 6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(nw4 nw4Var, byte b) {
        super(1, nw4Var, nw4.class, "paint", "paint(Landroidx/compose/ui/graphics/Canvas;)V", 0);
        this.a = b;
        switch (b) {
            case 12:
                super(1, nw4Var, nw4.class, "paint", "paint(Landroidx/compose/ui/graphics/Canvas;)V", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(vg9 vg9Var) {
        super(1, vg9Var, vg9.class, "handleCallbackEvents", "handleCallbackEvents(Lcom/spotify/bluetooth/connectionimpl/BLEConnectionCallbackEvent;)V", 0);
        this.a = (byte) 23;
    }
}
