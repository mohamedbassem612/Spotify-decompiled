package p;

import android.view.View;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.connect.castbasic.CastBasicException;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class l2 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(View view, z22 z22Var, lnm lnmVar) {
        super(3, lnmVar);
        this.a = (byte) 18;
        this.b = view;
        this.c = z22Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.connect.castbasic.CastBasicException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException, CastBasicException {
        byte b = this.a;
        byte b2 = 3;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                l2 l2Var = new l2(this.c, (lnm) obj3, (byte) 0);
                l2Var.b = (Throwable) obj2;
                l2Var.invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                l2 l2Var2 = new l2((int) b2, (lnm) obj3, (byte) 1);
                l2Var2.b = (md0) obj;
                l2Var2.c = (PlayerState) obj2;
                return l2Var2.invokeSuspend(rih1Var);
            case 2:
                l2 l2Var3 = new l2(this.c, (lnm) obj3, (byte) 2);
                l2Var3.b = (Throwable) obj2;
                l2Var3.invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                l2 l2Var4 = new l2(b2, (lnm) obj3, b2);
                l2Var4.b = (Map) obj;
                l2Var4.c = (bbz0) obj2;
                return l2Var4.invokeSuspend(rih1Var);
            case 4:
                l2 l2Var5 = new l2((int) b2, (lnm) obj3, (byte) 4);
                l2Var5.b = (k1r) obj;
                l2Var5.c = (Map) obj2;
                return l2Var5.invokeSuspend(rih1Var);
            case 5:
                l2 l2Var6 = new l2(this.c, (lnm) obj3, (byte) 5);
                l2Var6.b = (tv80) obj2;
                l2Var6.invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                l2 l2Var7 = new l2((int) b2, (lnm) obj3, (byte) 6);
                l2Var7.b = (ed3) obj;
                l2Var7.c = (hpe0) obj2;
                return l2Var7.invokeSuspend(rih1Var);
            case 7:
                l2 l2Var8 = new l2((int) b2, (lnm) obj3, (byte) 7);
                l2Var8.b = (qie) obj;
                l2Var8.c = (d64) obj2;
                return l2Var8.invokeSuspend(rih1Var);
            case 8:
                l2 l2Var9 = new l2((int) b2, (lnm) obj3, (byte) 8);
                l2Var9.b = (mmr0) obj;
                l2Var9.c = (h06) obj2;
                return l2Var9.invokeSuspend(rih1Var);
            case 9:
                l2 l2Var10 = new l2((int) b2, (lnm) obj3, (byte) 9);
                l2Var10.b = (p0d0) obj;
                l2Var10.c = (p0d0) obj2;
                return l2Var10.invokeSuspend(rih1Var);
            case 10:
                l2 l2Var11 = new l2((int) b2, (lnm) obj3, (byte) 10);
                l2Var11.b = (Optional) obj;
                l2Var11.c = (Locale) obj2;
                return l2Var11.invokeSuspend(rih1Var);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                l2 l2Var12 = new l2((int) b2, (lnm) obj3, (byte) 11);
                l2Var12.b = (k1r) obj;
                l2Var12.c = (i091) obj2;
                return l2Var12.invokeSuspend(rih1Var);
            case grn1.d /* 12 */:
                l2 l2Var13 = new l2((int) b2, (lnm) obj3, (byte) 12);
                l2Var13.b = (z79) obj;
                l2Var13.c = (Boolean) obj2;
                return l2Var13.invokeSuspend(rih1Var);
            case 13:
                l2 l2Var14 = new l2((int) b2, (lnm) obj3, (byte) 13);
                l2Var14.b = (Boolean) obj;
                l2Var14.c = (Optional) obj2;
                return l2Var14.invokeSuspend(rih1Var);
            case 14:
                l2 l2Var15 = new l2((int) b2, (lnm) obj3, (byte) 14);
                l2Var15.b = (lp9) obj;
                l2Var15.c = (PlayerState) obj2;
                return l2Var15.invokeSuspend(rih1Var);
            case 15:
                l2 l2Var16 = new l2((int) b2, (lnm) obj3, (byte) 15);
                l2Var16.b = (String) obj;
                l2Var16.c = (ub10) obj2;
                return l2Var16.invokeSuspend(rih1Var);
            case 16:
                l2 l2Var17 = new l2((int) b2, (lnm) obj3, (byte) 16);
                l2Var17.b = (List) obj;
                l2Var17.c = (mmr0) obj2;
                return l2Var17.invokeSuspend(rih1Var);
            case 17:
                l2 l2Var18 = new l2(this.c, (lnm) obj3, (byte) 17);
                l2Var18.b = (i0a) obj;
                l2Var18.invokeSuspend(rih1Var);
                return rih1Var;
            case 18:
                new l2((View) this.b, (z22) this.c, (lnm) obj3).invokeSuspend(rih1Var);
                return rih1Var;
            case 19:
                l2 l2Var19 = new l2(this.c, (lnm) obj3, (byte) 19);
                l2Var19.b = (loc) obj;
                l2Var19.invokeSuspend(rih1Var);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                l2 l2Var20 = new l2((int) b2, (lnm) obj3, (byte) 20);
                l2Var20.b = (ioj0) obj;
                l2Var20.c = (hwt) obj2;
                return l2Var20.invokeSuspend(rih1Var);
            case 21:
                l2 l2Var21 = new l2(this.c, (lnm) obj3, (byte) 21);
                l2Var21.b = (Throwable) obj2;
                l2Var21.invokeSuspend(rih1Var);
                throw null;
            case 22:
                l2 l2Var22 = new l2(this.c, (lnm) obj3, (byte) 22);
                l2Var22.b = (ContextTrack) obj2;
                return l2Var22.invokeSuspend(rih1Var);
            case 23:
                l2 l2Var23 = new l2((int) b2, (lnm) obj3, (byte) 23);
                l2Var23.b = (Map) obj;
                l2Var23.c = (y2g) obj2;
                return l2Var23.invokeSuspend(rih1Var);
            case 24:
                l2 l2Var24 = new l2(this.c, (lnm) obj3, (byte) 24);
                l2Var24.b = (Throwable) obj2;
                l2Var24.invokeSuspend(rih1Var);
                return rih1Var;
            case 25:
                l2 l2Var25 = new l2((int) b2, (lnm) obj3, (byte) 25);
                l2Var25.b = (nek) obj;
                l2Var25.c = (Boolean) obj2;
                return l2Var25.invokeSuspend(rih1Var);
            case 26:
                l2 l2Var26 = new l2((int) b2, (lnm) obj3, (byte) 26);
                l2Var26.b = (ztc) obj;
                l2Var26.c = (List) obj2;
                return l2Var26.invokeSuspend(rih1Var);
            case 27:
                l2 l2Var27 = new l2((int) b2, (lnm) obj3, (byte) 27);
                l2Var27.b = (bxt) obj;
                l2Var27.c = (c7l) obj2;
                return l2Var27.invokeSuspend(rih1Var);
            case 28:
                l2 l2Var28 = new l2((int) b2, (lnm) obj3, (byte) 28);
                l2Var28.b = (List) obj;
                l2Var28.c = (nnr) obj2;
                return l2Var28.invokeSuspend(rih1Var);
            default:
                l2 l2Var29 = new l2((int) b2, (lnm) obj3, (byte) 29);
                l2Var29.b = (ux50) obj;
                l2Var29.c = (snb) obj2;
                return l2Var29.invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.connect.castbasic.CastBasicException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:127:0x0247  */
    /* JADX WARN: Code duplicated, block: B:20:0x0068  */
    /* JADX WARN: Code duplicated, block: B:235:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:236:0x04ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:237:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:242:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:245:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:248:0x04d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:249:0x04db  */
    /* JADX WARN: Code duplicated, block: B:252:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:254:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:260:0x0503  */
    /* JADX WARN: Code duplicated, block: B:261:0x050c  */
    /* JADX WARN: Code duplicated, block: B:263:0x0515  */
    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    /* JADX WARN: Code duplicated, block: B:328:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Code duplicated, block: B:332:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:? A[LOOP:2: B:25:0x007d->B:333:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x0099 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:353:0x04d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:354:0x04d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:? A[LOOP:7: B:243:0x04c3->B:355:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:0x0500 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:358:0x04fd A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a9  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v34 java.lang.Object, still in use, count: 2, list:
          (r3v34 java.lang.Object) from 0x005c: PHI (r3 I:??) = (r3v31 java.lang.Object), (r3v34 java.lang.Object) binds: [B:16:0x005b, B:326:0x005c] A[DONT_GENERATE, DONT_INLINE]
          (r3v34 java.lang.Object) from 0x0052: CHECK_CAST (p.l0l) (r3v34 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws kotlin.NoWhenBranchMatchedException, com.spotify.connect.castbasic.CastBasicException {
        /*
            Method dump skipped, instruction units count: 1696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.l2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2(Object obj, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.c = obj;
    }
}
