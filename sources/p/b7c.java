package p;

import android.content.Intent;
import androidx.compose.ui.geometry.Offset;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.proto.YourLibraryConfig;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b7c extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b7c(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004a  */
    private final Object e(Object obj) {
        Long lValueOf;
        vr20 vr20Var = (vr20) this.c;
        Object obj2 = this.d;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            vwm1 vwm1Var = (vwm1) ((uwl) this.e).Z;
            gvm1 gvm1VarO = YourLibraryRequest.o();
            gvm1VarO.t(500);
            hvm1 hvm1VarQ = YourLibraryRequestHeader.q();
            hvm1VarQ.C(Integer.MAX_VALUE);
            h130 h130Var = (g130) o7h.C0(((f130) obj2).a);
            if (h130Var == null) {
                h130Var = h130.a;
            }
            if (h130Var instanceof g130) {
                Set set = s4b1.f;
                String strF = uic.x(((g130) h130Var).a).f();
                if (strF == null) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(exd0.t(strF));
                }
            } else {
                lValueOf = null;
            }
            if (lValueOf != null) {
                hvm1VarQ.v(lValueOf.longValue());
            }
            jsm1 jsm1VarR = YourLibraryConfig.YourLibraryFilters.r();
            jsm1VarR.n(p7h.M(new ksm1[]{ksm1.d, ksm1.T0}));
            hvm1VarQ.u(jsm1VarR.build());
            gvm1VarO.n(hvm1VarQ);
            uji1 uji1VarD = vwm1Var.d(gvm1VarO.build());
            this.c = null;
            this.d = null;
            this.b = true;
            Object objS = l4p1.s(vr20Var, uji1VarD, this);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    private final Object g(Object obj) {
        huz wa3Var;
        tks tksVar = (tks) this.e;
        vr20 vr20Var = (vr20) this.c;
        Object obj2 = this.d;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            List list = (List) obj2;
            if (list.isEmpty()) {
                wa3Var = new huz(z6x.a, (byte) 10);
            } else {
                List<ki90> list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                for (ki90 ki90Var : list2) {
                    arrayList.add(new qer(((aqr) tksVar.c.get()).a(new gpt(ki90Var.a.a, 2)), ki90Var, (byte) 25));
                }
                wa3Var = new wa3((mr20[]) o7h.l1(arrayList).toArray(new mr20[0]), (byte) 10);
            }
            this.c = null;
            this.d = null;
            this.b = true;
            Object objS = l4p1.s(vr20Var, wa3Var, this);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                b7c b7cVar = new b7c((lnm) obj3, obj4, (byte) 0);
                b7cVar.c = (vr20) obj;
                b7cVar.d = obj2;
                return b7cVar.invokeSuspend(rih1Var);
            case 1:
                b7c b7cVar2 = new b7c((lnm) obj3, obj4, (byte) 1);
                b7cVar2.c = (vr20) obj;
                b7cVar2.d = obj2;
                return b7cVar2.invokeSuspend(rih1Var);
            case 2:
                b7c b7cVar3 = new b7c((lnm) obj3, obj4, (byte) 2);
                b7cVar3.c = (vr20) obj;
                b7cVar3.d = obj2;
                return b7cVar3.invokeSuspend(rih1Var);
            case 3:
                b7c b7cVar4 = new b7c((lnm) obj3, obj4, (byte) 3);
                b7cVar4.c = (vr20) obj;
                b7cVar4.d = obj2;
                return b7cVar4.invokeSuspend(rih1Var);
            case 4:
                b7c b7cVar5 = new b7c((lnm) obj3, obj4, (byte) 4);
                b7cVar5.c = (vr20) obj;
                b7cVar5.d = obj2;
                return b7cVar5.invokeSuspend(rih1Var);
            case 5:
                b7c b7cVar6 = new b7c(obj4, (lnm) obj3, (byte) 5);
                b7cVar6.c = (Intent) obj;
                b7cVar6.d = (th61) obj2;
                return b7cVar6.invokeSuspend(rih1Var);
            case 6:
                b7c b7cVar7 = new b7c((lnm) obj3, obj4, (byte) 6);
                b7cVar7.c = (vr20) obj;
                b7cVar7.d = obj2;
                return b7cVar7.invokeSuspend(rih1Var);
            case 7:
                b7c b7cVar8 = new b7c((lnm) obj3, obj4, (byte) 7);
                b7cVar8.c = (vr20) obj;
                b7cVar8.d = obj2;
                return b7cVar8.invokeSuspend(rih1Var);
            case 8:
                b7c b7cVar9 = new b7c((lnm) obj3, obj4, (byte) 8);
                b7cVar9.c = (vr20) obj;
                b7cVar9.d = obj2;
                return b7cVar9.invokeSuspend(rih1Var);
            case 9:
                b7c b7cVar10 = new b7c((lnm) obj3, obj4, (byte) 9);
                b7cVar10.c = (vr20) obj;
                b7cVar10.d = obj2;
                return b7cVar10.invokeSuspend(rih1Var);
            case 10:
                b7c b7cVar11 = new b7c((rp5) this.d, (z2h) obj4, (lnm) obj3, (byte) 10);
                b7cVar11.c = (q6h) obj2;
                return b7cVar11.invokeSuspend(rih1Var);
            case 11:
                long j = ((Offset) obj2).a;
                b7c b7cVar12 = new b7c((l811) this.d, (Function0) obj4, (lnm) obj3, (byte) 11);
                b7cVar12.c = (p9w0) obj;
                return b7cVar12.invokeSuspend(rih1Var);
            case 12:
                b7c b7cVar13 = new b7c((lnm) obj3, obj4, (byte) 12);
                b7cVar13.c = (vr20) obj;
                b7cVar13.d = obj2;
                return b7cVar13.invokeSuspend(rih1Var);
            case 13:
                b7c b7cVar14 = new b7c((lnm) obj3, obj4, (byte) 13);
                b7cVar14.c = (vr20) obj;
                b7cVar14.d = obj2;
                return b7cVar14.invokeSuspend(rih1Var);
            case 14:
                b7c b7cVar15 = new b7c((lnm) obj3, obj4, (byte) 14);
                b7cVar15.c = (vr20) obj;
                b7cVar15.d = obj2;
                return b7cVar15.invokeSuspend(rih1Var);
            case 15:
                b7c b7cVar16 = new b7c((lnm) obj3, obj4, (byte) 15);
                b7cVar16.c = (vr20) obj;
                b7cVar16.d = obj2;
                return b7cVar16.invokeSuspend(rih1Var);
            case 16:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                b7c b7cVar17 = new b7c((z6v0) this.d, (k9k) obj4, (lnm) obj3, (byte) 16);
                b7cVar17.c = (zkm) obj;
                b7cVar17.b = zBooleanValue;
                return b7cVar17.invokeSuspend(rih1Var);
            case 17:
                b7c b7cVar18 = new b7c((lnm) obj3, obj4, (byte) 17);
                b7cVar18.c = (vr20) obj;
                b7cVar18.d = obj2;
                return b7cVar18.invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                b7c b7cVar19 = new b7c((o93) this.d, (hti0) obj4, (lnm) obj3, (byte) 18);
                b7cVar19.c = (qt50) obj;
                b7cVar19.b = zBooleanValue2;
                return b7cVar19.invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                b7c b7cVar20 = new b7c(obj4, (lnm) obj3, (byte) 19);
                b7cVar20.c = (vr20) obj;
                b7cVar20.d = obj2;
                return b7cVar20.invokeSuspend(rih1Var);
            case 20:
                b7c b7cVar21 = new b7c((lnm) obj3, obj4, (byte) 20);
                b7cVar21.c = (vr20) obj;
                b7cVar21.d = obj2;
                return b7cVar21.invokeSuspend(rih1Var);
            case 21:
                b7c b7cVar22 = new b7c((lnm) obj3, obj4, (byte) 21);
                b7cVar22.c = (vr20) obj;
                b7cVar22.d = obj2;
                return b7cVar22.invokeSuspend(rih1Var);
            case 22:
                b7c b7cVar23 = new b7c((lnm) obj3, obj4, (byte) 22);
                b7cVar23.c = (vr20) obj;
                b7cVar23.d = obj2;
                return b7cVar23.invokeSuspend(rih1Var);
            case 23:
                b7c b7cVar24 = new b7c((lnm) obj3, obj4, (byte) 23);
                b7cVar24.c = (vr20) obj;
                b7cVar24.d = obj2;
                return b7cVar24.invokeSuspend(rih1Var);
            case 24:
                b7c b7cVar25 = new b7c((lnm) obj3, obj4, (byte) 24);
                b7cVar25.c = (vr20) obj;
                b7cVar25.d = obj2;
                return b7cVar25.invokeSuspend(rih1Var);
            case 25:
                b7c b7cVar26 = new b7c((lnm) obj3, obj4, (byte) 25);
                b7cVar26.c = (vr20) obj;
                b7cVar26.d = obj2;
                return b7cVar26.invokeSuspend(rih1Var);
            case 26:
                b7c b7cVar27 = new b7c((lnm) obj3, obj4, (byte) 26);
                b7cVar27.c = (vr20) obj;
                b7cVar27.d = obj2;
                return b7cVar27.invokeSuspend(rih1Var);
            case 27:
                b7c b7cVar28 = new b7c((lnm) obj3, obj4, (byte) 27);
                b7cVar28.c = (vr20) obj;
                b7cVar28.d = obj2;
                return b7cVar28.invokeSuspend(rih1Var);
            case 28:
                b7c b7cVar29 = new b7c((lnm) obj3, obj4, (byte) 28);
                b7cVar29.c = (vr20) obj;
                b7cVar29.d = obj2;
                return b7cVar29.invokeSuspend(rih1Var);
            default:
                b7c b7cVar30 = new b7c((lnm) obj3, obj4, (byte) 29);
                b7cVar30.c = (vr20) obj;
                b7cVar30.d = obj2;
                return b7cVar30.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0361  */
    /* JADX WARN: Code duplicated, block: B:128:0x0367  */
    /* JADX WARN: Code duplicated, block: B:130:0x0380  */
    /* JADX WARN: Code duplicated, block: B:131:0x0386  */
    /* JADX WARN: Code duplicated, block: B:210:0x0562  */
    /* JADX WARN: Code duplicated, block: B:211:0x0568  */
    /* JADX WARN: Code duplicated, block: B:213:0x056c  */
    /* JADX WARN: Code duplicated, block: B:215:0x0595  */
    /* JADX WARN: Code duplicated, block: B:267:0x068d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v131, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v132 */
    /* JADX WARN: Type inference failed for: r3v139, types: [java.util.ArrayList] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v91 java.lang.Object, still in use, count: 2, list:
          (r6v91 java.lang.Object) from 0x055d: PHI (r6 I:??) = (r6v84 java.lang.Object), (r6v91 java.lang.Object) binds: [B:207:0x055c, B:470:0x055d] A[DONT_GENERATE, DONT_INLINE]
          (r6v91 java.lang.Object) from 0x054d: CHECK_CAST (p.som) (r6v91 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 2890
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.b7c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b7c(Object obj, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b7c(lnm lnmVar, Object obj, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = obj;
    }
}
