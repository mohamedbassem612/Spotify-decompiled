package p;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.coremediarenderer.bridge.CmrVideoQualityCallback;
import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gke extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gke(o3s o3sVar, tv80 tv80Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 24;
        this.d = o3sVar;
        this.c = tv80Var;
        this.b = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return new gke((hke) this.d, (unb1) obj3, (tv80) obj2, lnmVar, (byte) 0);
            case 1:
                return new gke((ole) this.d, (unb1) obj3, (tv80) obj2, lnmVar, (byte) 1);
            case 2:
                return new gke((jre) this.d, (ven0) obj3, (ven0) obj2, lnmVar, (byte) 2);
            case 3:
                gke gkeVar = new gke(obj3, lnmVar, (r630) obj2);
                gkeVar.d = obj;
                return gkeVar;
            case 4:
                return new gke((String) this.d, (y7e1) obj3, (iu30) obj2, lnmVar, (byte) 4);
            case 5:
                return new gke((CmrVideoQualityCallback) this.d, (String) obj3, (rtg) obj2, lnmVar, (byte) 5);
            case 6:
                gke gkeVar2 = new gke(obj3, obj2, lnmVar, (byte) 6);
                gkeVar2.d = obj;
                return gkeVar2;
            case 7:
                return new gke((cce) this.d, (w0i) obj3, (ven0) obj2, lnmVar, (byte) 7);
            case 8:
                return new gke((zen0) this.d, (mq51) obj3, (ven0) obj2, lnmVar, (byte) 8);
            case 9:
                return new gke((cnk) this.d, (String) obj3, (gmk) obj2, lnmVar, (byte) 9);
            case 10:
                gke gkeVar3 = new gke(obj3, obj2, lnmVar, (byte) 10);
                gkeVar3.d = obj;
                return gkeVar3;
            case 11:
                gke gkeVar4 = new gke(obj3, obj2, lnmVar, (byte) 11);
                gkeVar4.d = obj;
                return gkeVar4;
            case 12:
                gke gkeVar5 = new gke(obj3, obj2, lnmVar, (byte) 12);
                gkeVar5.d = obj;
                return gkeVar5;
            case 13:
                return new gke((yxa0) this.d, (lag) obj3, (tv80) obj2, lnmVar, (byte) 13);
            case 14:
                return new gke((k9k) this.d, (String) obj3, (String) obj2, lnmVar, (byte) 14);
            case 15:
                return new gke((lz20) this.d, (y7e1) obj3, (ven0) obj2, lnmVar, (byte) 15);
            case 16:
                gke gkeVar6 = new gke(obj3, obj2, lnmVar, (byte) 16);
                gkeVar6.d = obj;
                return gkeVar6;
            case 17:
                return new gke((tdo) this.d, (dn90) obj3, (tv80) obj2, lnmVar, (byte) 17);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new gke((wzn) this.d, (ou80) obj3, (String) obj2, lnmVar, (byte) 18);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new gke((wzn) this.d, (fso) obj3, (fw20) obj2, lnmVar, (byte) 19);
            case 20:
                return new gke((gvo) this.d, (String) obj3, (Bundle) obj2, lnmVar, (byte) 20);
            case 21:
                return new gke((wen0) this.d, (jd6) obj3, (vwq) obj2, lnmVar, (byte) 21);
            case 22:
                gke gkeVar7 = new gke(obj3, obj2, lnmVar, (byte) 22);
                gkeVar7.d = obj;
                return gkeVar7;
            case 23:
                return new gke((lls0) this.d, (ViewGroup) obj3, (ComposeView) obj2, lnmVar, (byte) 23);
            case 24:
                return new gke((o3s) this.d, (tv80) obj2, (String) obj3, lnmVar);
            case 25:
                return new gke((p7s) this.d, (ewh0) obj3, (w2z) obj2, lnmVar, (byte) 25);
            case 26:
                return new gke((t6t) this.d, (String) obj3, (s6t) obj2, lnmVar, (byte) 26);
            case 27:
                return new gke((ezt) this.d, (String) obj3, (oxt) obj2, lnmVar, (byte) 27);
            case 28:
                gke gkeVar8 = new gke(obj3, obj2, lnmVar, (byte) 28);
                gkeVar8.d = obj;
                return gkeVar8;
            default:
                return new gke((ven0) this.d, (e3u) obj3, (bw91) obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                create((tv80) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 7:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                return create((PlayerState) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 12:
                create((pjm) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 13:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 14:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 15:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 17:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 20:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 21:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 22:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 23:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 24:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 25:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 26:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 27:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 28:
                create((nzt) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0393  */
    /* JADX WARN: Code duplicated, block: B:188:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:282:0x0327 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0321 A[LOOP:6: B:88:0x02f3->B:98:0x0321, LOOP_END] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v18 java.lang.Object, still in use, count: 2, list:
          (r9v18 java.lang.Object) from 0x031f: PHI (r9 I:??) = (r9v15 java.lang.Object), (r9v18 java.lang.Object) binds: [B:96:0x031e, B:285:0x031f] A[DONT_GENERATE, DONT_INLINE]
          (r9v18 java.lang.Object) from 0x0313: CHECK_CAST (p.evb1) (r9v18 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 2098
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.gke.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gke(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gke(Object obj, lnm lnmVar, r630 r630Var) {
        super(2, lnmVar);
        this.a = (byte) 3;
        this.b = obj;
        this.c = r630Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gke(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }
}
