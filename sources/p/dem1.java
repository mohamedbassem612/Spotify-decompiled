package p;

import android.R;
import android.graphics.Color;
import android.net.Uri;
import android.os.Looper;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.automix.proto.TransitionOuterClass$AutomationCurve;
import com.spotify.automix.proto.TransitionOuterClass$AutomationCurves;
import com.spotify.automix.proto.TransitionOuterClass$BlockSequence;
import com.spotify.automix.proto.TransitionOuterClass$EqCurveOverrides;
import com.spotify.automix.proto.TransitionOuterClass$EqStyle;
import com.spotify.automix.proto.TransitionOuterClass$FilterCurveOverrides;
import com.spotify.automix.proto.TransitionOuterClass$FilterFxStyle;
import com.spotify.automix.proto.TransitionOuterClass$FxCurveOverrides;
import com.spotify.automix.proto.TransitionOuterClass$FxStyle;
import com.spotify.automix.proto.TransitionOuterClass$JogwheelStyle;
import com.spotify.automix.proto.TransitionOuterClass$LoopingStyle;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.automix.proto.TransitionOuterClass$Point;
import com.spotify.automix.proto.TransitionOuterClass$Preset;
import com.spotify.automix.proto.TransitionOuterClass$StyleBlock;
import com.spotify.automix.proto.TransitionOuterClass$Transition;
import com.spotify.automix.proto.TransitionOuterClass$VolumeStyle;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class dem1 {
    public static b180 a;

    public static final e9r A(wat watVar) {
        return new e9r(new c681(watVar));
    }

    public static final s69 B(TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves) {
        h290<TransitionOuterClass$AutomationCurve> h290VarO = transitionOuterClass$AutomationCurves.o();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarO, 10));
        for (TransitionOuterClass$AutomationCurve transitionOuterClass$AutomationCurve : h290VarO) {
            transitionOuterClass$AutomationCurve.getClass();
            h290<TransitionOuterClass$Point> h290VarP = transitionOuterClass$AutomationCurve.p();
            ArrayList arrayList2 = new ArrayList(q7h.U(h290VarP, 10));
            for (TransitionOuterClass$Point transitionOuterClass$Point : h290VarP) {
                transitionOuterClass$Point.getClass();
                arrayList2.add(new y9v0(transitionOuterClass$Point.n(), transitionOuterClass$Point.o()));
            }
            arrayList.add(new p69(arrayList2, transitionOuterClass$AutomationCurve.q(), transitionOuterClass$AutomationCurve.o()));
        }
        return new s69(arrayList, transitionOuterClass$AutomationCurves.r(), transitionOuterClass$AutomationCurves.q());
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0040 A[PHI: r5
      0x0040: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:9:0x0032, B:11:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    public static final x6b C(TransitionOuterClass$BlockSequence transitionOuterClass$BlockSequence) {
        h290<TransitionOuterClass$StyleBlock> h290VarO = transitionOuterClass$BlockSequence.o();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarO, 10));
        for (TransitionOuterClass$StyleBlock transitionOuterClass$StyleBlock : h290VarO) {
            transitionOuterClass$StyleBlock.getClass();
            int iOrdinal = transitionOuterClass$StyleBlock.q().ordinal();
            int i = 1;
            if (iOrdinal != 0 && iOrdinal != 1) {
                int i2 = 2;
                if (iOrdinal != 2) {
                    i2 = 3;
                    if (iOrdinal == 3) {
                        i = i2;
                    } else if (iOrdinal != 4) {
                        eg.o();
                        return null;
                    }
                } else {
                    i = i2;
                }
            }
            arrayList.add(new ekc1(transitionOuterClass$StyleBlock.n(), transitionOuterClass$StyleBlock.p(), transitionOuterClass$StyleBlock.o(), i));
        }
        return new x6b(arrayList);
    }

    public static final gez D(TransitionOuterClass$EqCurveOverrides transitionOuterClass$EqCurveOverrides) {
        return new gez(transitionOuterClass$EqCurveOverrides.s() ? B(transitionOuterClass$EqCurveOverrides.p()) : null, transitionOuterClass$EqCurveOverrides.t() ? B(transitionOuterClass$EqCurveOverrides.q()) : null, transitionOuterClass$EqCurveOverrides.r() ? B(transitionOuterClass$EqCurveOverrides.o()) : null);
    }

    public static final hez E(TransitionOuterClass$EqStyle transitionOuterClass$EqStyle) {
        Object next;
        int iO = transitionOuterClass$EqStyle.o();
        d7 d7Var = new d7(jez.Z, (byte) 0);
        do {
            if (!d7Var.hasNext()) {
                next = null;
                break;
            }
            next = d7Var.next();
        } while (((jez) next).a != iO);
        jez jezVar = (jez) next;
        if (jezVar == null) {
            jezVar = jez.b;
        }
        return new hez(jezVar);
    }

    public static final r920 F(TransitionOuterClass$FilterCurveOverrides transitionOuterClass$FilterCurveOverrides) {
        return new r920(transitionOuterClass$FilterCurveOverrides.r() ? B(transitionOuterClass$FilterCurveOverrides.n()) : null, transitionOuterClass$FilterCurveOverrides.t() ? B(transitionOuterClass$FilterCurveOverrides.q()) : null, transitionOuterClass$FilterCurveOverrides.s() ? B(transitionOuterClass$FilterCurveOverrides.p()) : null);
    }

    public static final fa20 G(TransitionOuterClass$FilterFxStyle transitionOuterClass$FilterFxStyle) {
        Object next;
        int iO = transitionOuterClass$FilterFxStyle.o();
        d7 d7Var = new d7(ha20.O0, (byte) 0);
        do {
            if (!d7Var.hasNext()) {
                next = null;
                break;
            }
            next = d7Var.next();
        } while (((ha20) next).a != iO);
        ha20 ha20Var = (ha20) next;
        if (ha20Var == null) {
            ha20Var = ha20.b;
        }
        return new fa20(ha20Var);
    }

    public static final ox30 H(TransitionOuterClass$FxCurveOverrides transitionOuterClass$FxCurveOverrides) {
        return new ox30(transitionOuterClass$FxCurveOverrides.s() ? B(transitionOuterClass$FxCurveOverrides.p()) : null, transitionOuterClass$FxCurveOverrides.t() ? B(transitionOuterClass$FxCurveOverrides.q()) : null, transitionOuterClass$FxCurveOverrides.r() ? B(transitionOuterClass$FxCurveOverrides.o()) : null);
    }

    public static final px30 I(TransitionOuterClass$FxStyle transitionOuterClass$FxStyle) {
        Object next;
        int iO = transitionOuterClass$FxStyle.o();
        d7 d7Var = new d7(rx30.P0, (byte) 0);
        do {
            if (!d7Var.hasNext()) {
                next = null;
                break;
            }
            next = d7Var.next();
        } while (((rx30) next).a != iO);
        rx30 rx30Var = (rx30) next;
        if (rx30Var == null) {
            rx30Var = rx30.b;
        }
        return new px30(rx30Var);
    }

    public static final taa0 J(TransitionOuterClass$JogwheelStyle transitionOuterClass$JogwheelStyle) {
        Object next;
        int iO = transitionOuterClass$JogwheelStyle.o();
        d7 d7Var = new d7(vaa0.Y, (byte) 0);
        do {
            if (!d7Var.hasNext()) {
                next = null;
                break;
            }
            next = d7Var.next();
        } while (((vaa0) next).a != iO);
        vaa0 vaa0Var = (vaa0) next;
        if (vaa0Var == null) {
            vaa0Var = vaa0.b;
        }
        return new taa0(vaa0Var);
    }

    public static final k7f0 K(TransitionOuterClass$LoopingStyle transitionOuterClass$LoopingStyle) {
        Object next;
        int iO = transitionOuterClass$LoopingStyle.o();
        d7 d7Var = new d7(m7f0.X, (byte) 0);
        do {
            if (!d7Var.hasNext()) {
                next = null;
                break;
            }
            next = d7Var.next();
        } while (((m7f0) next).a != iO);
        m7f0 m7f0Var = (m7f0) next;
        if (m7f0Var == null) {
            m7f0Var = m7f0.b;
        }
        return new k7f0(m7f0Var);
    }

    public static final ruq0 L(TransitionOuterClass$Overlap transitionOuterClass$Overlap) {
        return new ruq0(transitionOuterClass$Overlap.C(), transitionOuterClass$Overlap.G(), transitionOuterClass$Overlap.A(), transitionOuterClass$Overlap.E(), transitionOuterClass$Overlap.z(), transitionOuterClass$Overlap.D(), transitionOuterClass$Overlap.B(), transitionOuterClass$Overlap.F(), transitionOuterClass$Overlap.x(), transitionOuterClass$Overlap.y(), transitionOuterClass$Overlap.r(), transitionOuterClass$Overlap.I() ? Float.valueOf(transitionOuterClass$Overlap.v()) : null, transitionOuterClass$Overlap.J() ? Float.valueOf(transitionOuterClass$Overlap.w()) : null, transitionOuterClass$Overlap.H() ? Integer.valueOf(transitionOuterClass$Overlap.q()) : null, transitionOuterClass$Overlap.s(), transitionOuterClass$Overlap.n(), transitionOuterClass$Overlap.o(), transitionOuterClass$Overlap.t(), transitionOuterClass$Overlap.u());
    }

    public static final q6w0 M(TransitionOuterClass$Preset transitionOuterClass$Preset) {
        Object next;
        x6b x6bVar;
        x6b x6bVarC;
        TransitionOuterClass$FilterFxStyle transitionOuterClass$FilterFxStyleR;
        int iX = transitionOuterClass$Preset.x();
        Iterator it = b8w0.N0.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((b8w0) next).a != iX);
        b8w0 b8w0Var = (b8w0) next;
        if (b8w0Var == null) {
            b8w0Var = b8w0.b;
        }
        b8w0 b8w0Var2 = b8w0Var;
        buk1 buk1VarT = transitionOuterClass$Preset.S() ? T(transitionOuterClass$Preset.D()) : null;
        hez hezVarE = transitionOuterClass$Preset.G() ? E(transitionOuterClass$Preset.q()) : null;
        fa20 fa20VarG = (!transitionOuterClass$Preset.H() || (transitionOuterClass$FilterFxStyleR = transitionOuterClass$Preset.r()) == null) ? null : G(transitionOuterClass$FilterFxStyleR);
        px30 px30VarI = transitionOuterClass$Preset.M() ? I(transitionOuterClass$Preset.w()) : null;
        taa0 taa0VarJ = transitionOuterClass$Preset.N() ? J(transitionOuterClass$Preset.y()) : null;
        k7f0 k7f0VarK = transitionOuterClass$Preset.P() ? K(transitionOuterClass$Preset.A()) : null;
        if (transitionOuterClass$Preset.O()) {
            TransitionOuterClass$BlockSequence transitionOuterClass$BlockSequenceZ = transitionOuterClass$Preset.z();
            if (transitionOuterClass$BlockSequenceZ.o().isEmpty()) {
                Logger.k("Ignoring malformed saved looping block override: %s", new Object[]{transitionOuterClass$BlockSequenceZ});
                x6bVarC = null;
            } else {
                h290 h290VarO = transitionOuterClass$BlockSequenceZ.o();
                if (!h290VarO.isEmpty()) {
                    Iterator it2 = h290VarO.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            TransitionOuterClass$StyleBlock transitionOuterClass$StyleBlock = (TransitionOuterClass$StyleBlock) it2.next();
                            if (transitionOuterClass$StyleBlock.q() != gkg1.STYLE_BLOCK_TYPE_LOOP || Math.abs(transitionOuterClass$StyleBlock.n()) > Float.MAX_VALUE || transitionOuterClass$StyleBlock.n() <= 0.0f || Math.abs(transitionOuterClass$StyleBlock.p()) > Float.MAX_VALUE || transitionOuterClass$StyleBlock.p() < 0.0f || transitionOuterClass$StyleBlock.p() >= 1.0f || Math.abs(transitionOuterClass$StyleBlock.o()) > Float.MAX_VALUE || transitionOuterClass$StyleBlock.o() <= transitionOuterClass$StyleBlock.p() || transitionOuterClass$StyleBlock.o() > 1.0f) {
                                Logger.k("Ignoring malformed saved looping block override: %s", new Object[]{transitionOuterClass$BlockSequenceZ});
                                x6bVarC = null;
                            }
                        }
                    }
                }
                x6bVarC = C(transitionOuterClass$BlockSequenceZ);
            }
            x6bVar = x6bVarC;
        } else {
            x6bVar = null;
        }
        return new q6w0(b8w0Var2, buk1VarT, hezVarE, fa20VarG, px30VarI, taa0VarJ, k7f0VarK, transitionOuterClass$Preset.R() ? B(transitionOuterClass$Preset.C()) : null, transitionOuterClass$Preset.Q() ? B(transitionOuterClass$Preset.B()) : null, transitionOuterClass$Preset.F() ? D(transitionOuterClass$Preset.p()) : null, transitionOuterClass$Preset.E() ? D(transitionOuterClass$Preset.o()) : null, transitionOuterClass$Preset.J() ? F(transitionOuterClass$Preset.t()) : null, transitionOuterClass$Preset.I() ? F(transitionOuterClass$Preset.s()) : null, transitionOuterClass$Preset.L() ? H(transitionOuterClass$Preset.v()) : null, transitionOuterClass$Preset.K() ? H(transitionOuterClass$Preset.u()) : null, x6bVar);
    }

    public static final TransitionOuterClass$AutomationCurves N(s69 s69Var) {
        sjg1 sjg1VarS = TransitionOuterClass$AutomationCurves.s();
        ArrayList<p69> arrayList = s69Var.a;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (p69 p69Var : arrayList) {
            rjg1 rjg1VarR = TransitionOuterClass$AutomationCurve.r();
            List<y9v0> list = p69Var.a;
            ArrayList arrayList3 = new ArrayList(q7h.U(list, 10));
            for (y9v0 y9v0Var : list) {
                dkg1 dkg1VarP = TransitionOuterClass$Point.p();
                dkg1VarP.n(y9v0Var.a);
                dkg1VarP.q(y9v0Var.b);
                arrayList3.add((TransitionOuterClass$Point) dkg1VarP.build());
            }
            rjg1VarR.n(arrayList3);
            rjg1VarR.r(p69Var.b);
            rjg1VarR.q(p69Var.c);
            arrayList2.add((TransitionOuterClass$AutomationCurve) rjg1VarR.build());
        }
        sjg1VarS.n(arrayList2);
        sjg1VarS.r(s69Var.b);
        sjg1VarS.q(s69Var.c);
        return (TransitionOuterClass$AutomationCurves) sjg1VarS.build();
    }

    public static final TransitionOuterClass$EqCurveOverrides O(gez gezVar) {
        ujg1 ujg1VarU = TransitionOuterClass$EqCurveOverrides.u();
        s69 s69Var = gezVar.a;
        if (s69Var != null) {
            ujg1VarU.q(N(s69Var));
        }
        s69 s69Var2 = gezVar.b;
        if (s69Var2 != null) {
            ujg1VarU.r(N(s69Var2));
        }
        s69 s69Var3 = gezVar.c;
        if (s69Var3 != null) {
            ujg1VarU.n(N(s69Var3));
        }
        return (TransitionOuterClass$EqCurveOverrides) ujg1VarU.build();
    }

    public static final TransitionOuterClass$FilterCurveOverrides P(r920 r920Var) {
        wjg1 wjg1VarU = TransitionOuterClass$FilterCurveOverrides.u();
        s69 s69Var = r920Var.a;
        if (s69Var != null) {
            wjg1VarU.n(N(s69Var));
        }
        s69 s69Var2 = r920Var.b;
        if (s69Var2 != null) {
            wjg1VarU.r(N(s69Var2));
        }
        s69 s69Var3 = r920Var.c;
        if (s69Var3 != null) {
            wjg1VarU.q(N(s69Var3));
        }
        return (TransitionOuterClass$FilterCurveOverrides) wjg1VarU.build();
    }

    public static final TransitionOuterClass$FxCurveOverrides Q(ox30 ox30Var) {
        yjg1 yjg1VarU = TransitionOuterClass$FxCurveOverrides.u();
        s69 s69Var = ox30Var.a;
        if (s69Var != null) {
            yjg1VarU.q(N(s69Var));
        }
        s69 s69Var2 = ox30Var.b;
        if (s69Var2 != null) {
            yjg1VarU.r(N(s69Var2));
        }
        s69 s69Var3 = ox30Var.c;
        if (s69Var3 != null) {
            yjg1VarU.n(N(s69Var3));
        }
        return (TransitionOuterClass$FxCurveOverrides) yjg1VarU.build();
    }

    public static final TransitionOuterClass$Transition R(lhg1 lhg1Var) {
        hkg1 hkg1VarR = TransitionOuterClass$Transition.r();
        ruq0 ruq0Var = lhg1Var.b;
        ckg1 ckg1VarK = TransitionOuterClass$Overlap.K();
        ckg1VarK.D(ruq0Var.a);
        ckg1VarK.H(ruq0Var.b);
        ckg1VarK.B(ruq0Var.c);
        ckg1VarK.F(ruq0Var.d);
        ckg1VarK.A(ruq0Var.e);
        ckg1VarK.E(ruq0Var.f);
        ckg1VarK.C(ruq0Var.g);
        ckg1VarK.G(ruq0Var.h);
        ckg1VarK.y(ruq0Var.i);
        ckg1VarK.z(ruq0Var.t);
        ckg1VarK.s(ruq0Var.X);
        Float f = ruq0Var.Y;
        if (f != null) {
            ckg1VarK.w(f.floatValue());
        }
        Float f2 = ruq0Var.Z;
        if (f2 != null) {
            ckg1VarK.x(f2.floatValue());
        }
        Integer num = ruq0Var.N0;
        if (num != null) {
            ckg1VarK.r(num.intValue());
        }
        ckg1VarK.t(ruq0Var.O0);
        ckg1VarK.n(ruq0Var.P0);
        ckg1VarK.q(ruq0Var.Q0);
        ckg1VarK.u(ruq0Var.R0);
        ckg1VarK.v(ruq0Var.S0);
        hkg1VarR.r((TransitionOuterClass$Overlap) ckg1VarK.build());
        q6w0 q6w0Var = lhg1Var.a;
        ekg1 ekg1VarT = TransitionOuterClass$Preset.T();
        ekg1VarT.y(q6w0Var.a.a);
        buk1 buk1Var = q6w0Var.b;
        if (buk1Var != null) {
            ikg1 ikg1VarP = TransitionOuterClass$VolumeStyle.p();
            ikg1VarP.n(buk1Var.a.a);
            ekg1VarT.E((TransitionOuterClass$VolumeStyle) ikg1VarP.build());
        }
        hez hezVar = q6w0Var.c;
        if (hezVar != null) {
            vjg1 vjg1VarP = TransitionOuterClass$EqStyle.p();
            vjg1VarP.n(hezVar.a.a);
            ekg1VarT.r((TransitionOuterClass$EqStyle) vjg1VarP.build());
        }
        fa20 fa20Var = q6w0Var.d;
        if (fa20Var != null) {
            xjg1 xjg1VarP = TransitionOuterClass$FilterFxStyle.p();
            xjg1VarP.n(fa20Var.a.a);
            ekg1VarT.s((TransitionOuterClass$FilterFxStyle) xjg1VarP.build());
        }
        px30 px30Var = q6w0Var.e;
        if (px30Var != null) {
            zjg1 zjg1VarP = TransitionOuterClass$FxStyle.p();
            zjg1VarP.n(px30Var.a.a);
            ekg1VarT.x((TransitionOuterClass$FxStyle) zjg1VarP.build());
        }
        taa0 taa0Var = q6w0Var.f;
        if (taa0Var != null) {
            akg1 akg1VarP = TransitionOuterClass$JogwheelStyle.p();
            akg1VarP.n(taa0Var.a.a);
            ekg1VarT.z((TransitionOuterClass$JogwheelStyle) akg1VarP.build());
        }
        k7f0 k7f0Var = q6w0Var.g;
        if (k7f0Var != null) {
            bkg1 bkg1VarP = TransitionOuterClass$LoopingStyle.p();
            bkg1VarP.n(k7f0Var.a.a);
            ekg1VarT.B((TransitionOuterClass$LoopingStyle) bkg1VarP.build());
        }
        x6b x6bVar = q6w0Var.P0;
        lbg1 lbg1Var = lbg1.f;
        Object objInvoke = ekg1VarT;
        if (x6bVar != null) {
            objInvoke = lbg1Var.invoke(ekg1VarT, x6bVar);
        }
        s69 s69Var = q6w0Var.h;
        Object obj = objInvoke;
        if (s69Var != null) {
            ekg1 ekg1Var = (ekg1) objInvoke;
            ekg1Var.D(N(s69Var));
            obj = ekg1Var;
        }
        s69 s69Var2 = q6w0Var.i;
        Object obj2 = obj;
        if (s69Var2 != null) {
            ekg1 ekg1Var2 = (ekg1) obj;
            ekg1Var2.C(N(s69Var2));
            obj2 = ekg1Var2;
        }
        gez gezVar = q6w0Var.t;
        Object obj3 = obj2;
        if (gezVar != null) {
            ekg1 ekg1Var3 = (ekg1) obj2;
            ekg1Var3.q(O(gezVar));
            obj3 = ekg1Var3;
        }
        gez gezVar2 = q6w0Var.X;
        Object obj4 = obj3;
        if (gezVar2 != null) {
            ekg1 ekg1Var4 = (ekg1) obj3;
            ekg1Var4.n(O(gezVar2));
            obj4 = ekg1Var4;
        }
        r920 r920Var = q6w0Var.Y;
        Object obj5 = obj4;
        if (r920Var != null) {
            ekg1 ekg1Var5 = (ekg1) obj4;
            ekg1Var5.u(P(r920Var));
            obj5 = ekg1Var5;
        }
        r920 r920Var2 = q6w0Var.Z;
        Object obj6 = obj5;
        if (r920Var2 != null) {
            ekg1 ekg1Var6 = (ekg1) obj5;
            ekg1Var6.t(P(r920Var2));
            obj6 = ekg1Var6;
        }
        ox30 ox30Var = q6w0Var.N0;
        Object obj7 = obj6;
        if (ox30Var != null) {
            ekg1 ekg1Var7 = (ekg1) obj6;
            ekg1Var7.w(Q(ox30Var));
            obj7 = ekg1Var7;
        }
        ox30 ox30Var2 = q6w0Var.O0;
        Object obj8 = obj7;
        if (ox30Var2 != null) {
            ekg1 ekg1Var8 = (ekg1) obj7;
            ekg1Var8.v(Q(ox30Var2));
            obj8 = ekg1Var8;
        }
        hkg1VarR.s((TransitionOuterClass$Preset) ((ekg1) obj8).build());
        hkg1VarR.n(lhg1Var.c);
        hkg1VarR.q(lhg1Var.d);
        return (TransitionOuterClass$Transition) hkg1VarR.build();
    }

    public static final lhg1 S(TransitionOuterClass$Transition transitionOuterClass$Transition) {
        return new lhg1(M(transitionOuterClass$Transition.q()), L(transitionOuterClass$Transition.p()), transitionOuterClass$Transition.n(), transitionOuterClass$Transition.o());
    }

    public static final buk1 T(TransitionOuterClass$VolumeStyle transitionOuterClass$VolumeStyle) {
        Object next;
        int iO = transitionOuterClass$VolumeStyle.o();
        d7 d7Var = new d7(duk1.O0, (byte) 0);
        do {
            if (!d7Var.hasNext()) {
                next = null;
                break;
            }
            next = d7Var.next();
        } while (((duk1) next).a != iO);
        duk1 duk1Var = (duk1) next;
        if (duk1Var == null) {
            duk1Var = duk1.b;
        }
        return new buk1(duk1Var);
    }

    public static final lvc1 U(boolean z, boolean z2, boolean z3, boolean z4, long j, boolean z5, boolean z6, vu30 vu30Var) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (z) {
            linkedHashSet.add(new zp21(jo70.class));
            linkedHashSet.add(new zp21(hll.class));
        } else {
            linkedHashSet.add(new yp21(jo70.class));
            linkedHashSet.add(new yp21(hll.class));
        }
        linkedHashSet.add(new yp21(xkk1.class));
        yp21 yp21Var = new yp21(a7q0.class);
        if (!z4) {
            yp21Var = null;
        }
        yp21 yp21Var2 = new yp21(z1g1.class);
        if (!z5) {
            yp21Var2 = null;
        }
        return new lvc1(dm61.y0(linkedHashSet, dm61.B0(new yp21[]{yp21Var, yp21Var2, z6 ? new yp21(bql.class) : null})), w7x.a, new qql(vu30Var, z3, z2, z4, j), (byte) 26);
    }

    public static final void a(mmr0 mmr0Var, int i, j2i j2iVar, j2i j2iVar2, b0k b0kVar, int i2) {
        int i3;
        j2i j2iVar3 = j2iVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1862620115);
        j06 j06Var = x340Var.a;
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(mmr0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.i(j2iVar3) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new vq00(i, mmr0Var, (byte) 1);
                x340Var.s0(objT);
            }
            gfh0 gfh0Var = (gfh0) objT;
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0Var, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            dv20.l((i3 >> 6) & 14, j2iVar, x340Var, true);
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarF2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            j2iVar3 = j2iVar2;
            k4s0.i((i3 >> 9) & 14, j2iVar3, x340Var, true, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk0(mmr0Var, i, j2iVar, j2iVar3, i2, (byte) 24);
        }
    }

    public static final void b(long j, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(730459576);
        int i2 = i | (x340Var.f(j) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            scx scxVarM = pno1.m(x340Var);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            List list = krc.a;
            String strS = t4n1.s(j / 1.0E9d, false, x340Var);
            String strO0 = cwl1.o0(x340Var, 2131961747);
            if (j <= 1000000000) {
                x340Var.i0(-1477591773);
                strO0 = cwl1.o0(x340Var, 2131961756) + "\n\n" + strO0;
                x340Var.r(false);
            } else {
                x340Var.i0(-1477485939);
                x340Var.r(false);
            }
            String strN0 = cwl1.n0(2131961748, new Object[]{strS}, x340Var);
            String strO1 = cwl1.o0(x340Var, 2131961746);
            boolean zI = x340Var.i(ven0Var) | x340Var.i(scxVarM);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new qqc(scxVarM, ven0Var, (byte) 0);
                x340Var.s0(objT2);
            }
            z50 z50Var = z50.c;
            lcx lcxVar = new lcx(strO1, new gbx(z50Var, (Function0) objT2));
            String strO2 = cwl1.o0(x340Var, R.string.cancel);
            boolean zI2 = x340Var.i(scxVarM);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new rqc(scxVarM, (byte) 0);
                x340Var.s0(objT3);
            }
            lcx lcxVar2 = new lcx(strO2, new gbx(z50Var, (Function0) objT3));
            boolean zI3 = ((i2 & 896) == 256) | x340Var.i(ven0Var) | ((i2 & 112) == 32);
            Object objT4 = x340Var.T();
            if (zI3 || objT4 == m4cVar) {
                objT4 = new sqc(function0, function1, ven0Var, (byte) 0);
                x340Var.s0(objT4);
            }
            ila0.b((Function0) objT4, scxVarM, strN0, strO0, lcxVar, lcxVar2, x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qi6(j, function0, function1, i, (byte) 2);
        }
    }

    public static final void c(hux huxVar, String str, String str2, String str3, String str4, Function0 function0, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1181679513);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(huxVar) : b0kVar3.i(huxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.g(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.g(str4) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.i(function0) ? 131072 : 65536;
        }
        if (b0kVar3.Y(i2 & 1, (74899 & i2) != 74898)) {
            qim0 qim0VarN = anm1.N(str4, u291.f(nim0.a, 1.0f));
            boolean z = (i2 & 896) == 256;
            Object objT = b0kVar3.T();
            if (z || objT == m4cVar) {
                objT = new z9b0(str2, (byte) 25);
                b0kVar3.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarN, false, (iu30) objT);
            int i3 = i2;
            ldx ldxVar = ldx.c;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            zzq0 zzq0VarH = uyn1.h(2, 16.0f, 0.0f);
            boolean z2 = (i3 & 458752) == 131072;
            Object objT2 = b0kVar3.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new tze0(function0, (byte) 10);
                b0kVar3.s0(objT2);
            }
            b0kVar2 = b0kVar3;
            foo1.c(new gbx(new y50(str3), (Function0) objT2), ldxVar, qim0VarB, (max) null, (gdx) null, zzq0VarH, (idn0) null, (ga80) null, apo.r(-972272855, new f90(huxVar, (byte) 15), b0kVar3), (vu30) null, apo.r(-677212166, new y5d0(str, (byte) 15), b0kVar3), b0kVar2, 805306416, 48, 1464);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kqf0(huxVar, str, str2, str3, str4, function0, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0129  */
    /* JADX WARN: Code duplicated, block: B:102:0x0130  */
    /* JADX WARN: Code duplicated, block: B:106:0x014f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0151  */
    /* JADX WARN: Code duplicated, block: B:108:0x0154  */
    /* JADX WARN: Code duplicated, block: B:111:0x0158  */
    /* JADX WARN: Code duplicated, block: B:114:0x015d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0163  */
    /* JADX WARN: Code duplicated, block: B:119:0x0167  */
    /* JADX WARN: Code duplicated, block: B:120:0x016a  */
    /* JADX WARN: Code duplicated, block: B:122:0x016e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0172  */
    /* JADX WARN: Code duplicated, block: B:128:0x017c  */
    /* JADX WARN: Code duplicated, block: B:132:0x0198  */
    /* JADX WARN: Code duplicated, block: B:133:0x019a  */
    /* JADX WARN: Code duplicated, block: B:135:0x01be  */
    /* JADX WARN: Code duplicated, block: B:138:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00db  */
    /* JADX WARN: Code duplicated, block: B:77:0x00de  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:93:0x0115  */
    /* JADX WARN: Code duplicated, block: B:97:0x011f  */
    public static final void d(Function0 function0, qim0 qim0Var, String str, int i, int i2, long j, float f, boolean z, boolean z2, int i3, vu30 vu30Var, vu30 vu30Var2, idn0 idn0Var, j2i j2iVar, b0k b0kVar, int i4, int i5, int i6) {
        int i7;
        qim0 qim0Var2;
        int i8;
        String str2;
        int i9;
        int i10;
        long j2;
        int i11;
        boolean z3;
        int i12;
        int i13;
        int i14;
        int iC;
        int i15;
        int i16;
        vu30 vu30Var3;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z4;
        int i21;
        boolean z5;
        int i22;
        idn0 idn0Var2;
        vu30 vu30Var4;
        qim0 qim0Var3;
        String str3;
        float f2;
        vu30 vu30Var5;
        boolean z6;
        int i23;
        h311 h311VarV;
        qim0 qim0Var4;
        int i24;
        Object objT;
        idn0 idn0Var3;
        vu30 vu30Var6;
        String str4;
        boolean z7;
        int i25;
        boolean z8;
        vu30 vu30Var7;
        int i26;
        float f3;
        int i27;
        int i28;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1489575836);
        if ((i4 & 6) == 0) {
            i7 = (x340Var.i(function0) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i29 = i6 & 2;
        if (i29 == 0) {
            if ((i4 & 48) == 0) {
                qim0Var2 = qim0Var;
                i7 |= x340Var.i(qim0Var2) ? 32 : 16;
            }
            i8 = i6 & 4;
            if (i8 != 0) {
                if ((i4 & 384) == 0) {
                    str2 = str;
                    if (x340Var.g(str2)) {
                        i9 = 256;
                    } else {
                        i9 = 128;
                    }
                    i7 |= i9;
                }
                i10 = i7 | 27648;
                if ((196608 & i4) == 0) {
                    if ((i6 & 32) == 0) {
                        j2 = j;
                        int i30 = x340Var.f(j2) ? 131072 : 65536;
                        i10 |= i30;
                    } else {
                        j2 = j;
                    }
                    i10 |= i30;
                } else {
                    j2 = j;
                }
                if ((i4 & 1572864) == 0) {
                    i10 |= 524288;
                }
                i11 = i6 & 128;
                if (i11 != 0) {
                    i10 |= 12582912;
                    z3 = z;
                } else {
                    z3 = z;
                    if ((i4 & 12582912) == 0) {
                        if (x340Var.h(z3)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i10 |= i12;
                    }
                }
                i13 = i10 | 100663296;
                i14 = i6 & 512;
                if (i14 != 0) {
                    i13 = i10 | 905969664;
                } else if ((805306368 & i4) == 0) {
                    if (i3 == 0) {
                        iC = -1;
                    } else {
                        iC = l1d.C(i3);
                    }
                    if (x340Var.e(iC)) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i13 |= i15;
                }
                i16 = i6 & 1024;
                if (i16 != 0) {
                    vu30Var3 = vu30Var;
                    i17 = i5 | 6;
                } else {
                    vu30Var3 = vu30Var;
                    if ((i5 & 6) == 0) {
                        if (x340Var.i(vu30Var3)) {
                            i18 = 4;
                        } else {
                            i18 = 2;
                        }
                        i17 = i5 | i18;
                    } else {
                        i17 = i5;
                    }
                }
                i19 = i6 & 2048;
                if (i19 != 0) {
                    i17 |= 48;
                } else if ((i5 & 48) == 0) {
                    if (x340Var.i(vu30Var2)) {
                        i20 = 32;
                    } else {
                        i20 = 16;
                    }
                    i17 |= i20;
                }
                int i31 = i17 | 128;
                if ((i13 & 306783379) == 306783378 || (i31 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (x340Var.Y(i13 & 1, z4)) {
                    x340Var.d0();
                    if ((i4 & 1) != 0 || x340Var.E()) {
                        if (i29 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i8 != 0) {
                            str2 = null;
                        }
                        if ((i6 & 32) != 0) {
                            j2 = u7h.j;
                        }
                        boolean z9 = i11 == 0 ? z3 : false;
                        if (i14 != 0) {
                            i24 = 1;
                        } else {
                            i24 = i3;
                        }
                        if (i16 != 0) {
                            vu30Var3 = null;
                        }
                        vu30 vu30Var8 = i19 == 0 ? vu30Var2 : null;
                        objT = x340Var.T();
                        if (objT == fkj0.X) {
                            objT = ktd.n(x340Var);
                        }
                        qim0Var3 = qim0Var4;
                        idn0Var3 = (idn0) objT;
                        vu30Var6 = vu30Var3;
                        str4 = str2;
                        z7 = z9;
                        i25 = 1;
                        z8 = true;
                        vu30Var7 = vu30Var8;
                        i26 = i24;
                        f3 = 1.0f;
                        i27 = 4;
                    } else {
                        x340Var.b0();
                        i25 = i;
                        i27 = i2;
                        vu30Var7 = vu30Var2;
                        idn0Var3 = idn0Var;
                        z7 = z3;
                        vu30Var6 = vu30Var3;
                        qim0Var3 = qim0Var2;
                        str4 = str2;
                        f3 = f;
                        z8 = z2;
                        i26 = i3;
                    }
                    x340Var.s();
                    if (z7) {
                        i28 = i27;
                    } else {
                        i28 = i25;
                    }
                    gfx.g(i28, apo.r(-687844201, new ghv(qim0Var3, i26, z8, str4, function0, idn0Var3, f3, j2, z7, vu30Var6, j2iVar, vu30Var7, (byte) 1), x340Var), x340Var, 48);
                    i21 = i25;
                    i23 = i27;
                    i22 = i26;
                    str3 = str4;
                    idn0Var2 = idn0Var3;
                    f2 = f3;
                    vu30Var4 = vu30Var6;
                    vu30Var5 = vu30Var7;
                    z5 = z8;
                    z6 = z7;
                } else {
                    x340Var.b0();
                    i21 = i;
                    z5 = z2;
                    i22 = i3;
                    idn0Var2 = idn0Var;
                    vu30Var4 = vu30Var3;
                    qim0Var3 = qim0Var2;
                    str3 = str2;
                    f2 = f;
                    vu30Var5 = vu30Var2;
                    z6 = z3;
                    i23 = i2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new hhv(function0, qim0Var3, str3, i21, i23, j2, f2, z6, z5, i22, vu30Var4, vu30Var5, idn0Var2, j2iVar, i4, i5, i6);
                }
            }
            i7 |= 384;
            str2 = str;
            i10 = i7 | 27648;
            if ((196608 & i4) == 0) {
                if ((i6 & 32) == 0) {
                    j2 = j;
                    if (x340Var.f(j2)) {
                    }
                    i10 |= i30;
                } else {
                    j2 = j;
                }
                i10 |= i30;
            } else {
                j2 = j;
            }
            if ((i4 & 1572864) == 0) {
                i10 |= 524288;
            }
            i11 = i6 & 128;
            if (i11 != 0) {
                i10 |= 12582912;
                z3 = z;
            } else {
                z3 = z;
                if ((i4 & 12582912) == 0) {
                    if (x340Var.h(z3)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i10 |= i12;
                }
            }
            i13 = i10 | 100663296;
            i14 = i6 & 512;
            if (i14 != 0) {
                i13 = i10 | 905969664;
            } else if ((805306368 & i4) == 0) {
                if (i3 == 0) {
                    iC = -1;
                } else {
                    iC = l1d.C(i3);
                }
                if (x340Var.e(iC)) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i13 |= i15;
            }
            i16 = i6 & 1024;
            if (i16 != 0) {
                vu30Var3 = vu30Var;
                i17 = i5 | 6;
            } else {
                vu30Var3 = vu30Var;
                if ((i5 & 6) == 0) {
                    if (x340Var.i(vu30Var3)) {
                        i18 = 4;
                    } else {
                        i18 = 2;
                    }
                    i17 = i5 | i18;
                } else {
                    i17 = i5;
                }
            }
            i19 = i6 & 2048;
            if (i19 != 0) {
                i17 |= 48;
            } else if ((i5 & 48) == 0) {
                if (x340Var.i(vu30Var2)) {
                    i20 = 32;
                } else {
                    i20 = 16;
                }
                i17 |= i20;
            }
            int i32 = i17 | 128;
            if ((i13 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (x340Var.Y(i13 & 1, z4)) {
                x340Var.d0();
                if ((i4 & 1) != 0) {
                    if (i29 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i8 != 0) {
                        str2 = null;
                    }
                    if ((i6 & 32) != 0) {
                        j2 = u7h.j;
                    }
                    if (i11 == 0) {
                    }
                    if (i14 != 0) {
                        i24 = 1;
                    } else {
                        i24 = i3;
                    }
                    if (i16 != 0) {
                        vu30Var3 = null;
                    }
                    if (i19 == 0) {
                    }
                    objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = ktd.n(x340Var);
                    }
                    qim0Var3 = qim0Var4;
                    idn0Var3 = (idn0) objT;
                    vu30Var6 = vu30Var3;
                    str4 = str2;
                    z7 = z9;
                    i25 = 1;
                    z8 = true;
                    vu30Var7 = vu30Var8;
                    i26 = i24;
                    f3 = 1.0f;
                    i27 = 4;
                } else {
                    if (i29 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i8 != 0) {
                        str2 = null;
                    }
                    if ((i6 & 32) != 0) {
                        j2 = u7h.j;
                    }
                    if (i11 == 0) {
                    }
                    if (i14 != 0) {
                        i24 = 1;
                    } else {
                        i24 = i3;
                    }
                    if (i16 != 0) {
                        vu30Var3 = null;
                    }
                    if (i19 == 0) {
                    }
                    objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = ktd.n(x340Var);
                    }
                    qim0Var3 = qim0Var4;
                    idn0Var3 = (idn0) objT;
                    vu30Var6 = vu30Var3;
                    str4 = str2;
                    z7 = z9;
                    i25 = 1;
                    z8 = true;
                    vu30Var7 = vu30Var8;
                    i26 = i24;
                    f3 = 1.0f;
                    i27 = 4;
                }
                x340Var.s();
                if (z7) {
                    i28 = i27;
                } else {
                    i28 = i25;
                }
                gfx.g(i28, apo.r(-687844201, new ghv(qim0Var3, i26, z8, str4, function0, idn0Var3, f3, j2, z7, vu30Var6, j2iVar, vu30Var7, (byte) 1), x340Var), x340Var, 48);
                i21 = i25;
                i23 = i27;
                i22 = i26;
                str3 = str4;
                idn0Var2 = idn0Var3;
                f2 = f3;
                vu30Var4 = vu30Var6;
                vu30Var5 = vu30Var7;
                z5 = z8;
                z6 = z7;
            } else {
                x340Var.b0();
                i21 = i;
                z5 = z2;
                i22 = i3;
                idn0Var2 = idn0Var;
                vu30Var4 = vu30Var3;
                qim0Var3 = qim0Var2;
                str3 = str2;
                f2 = f;
                vu30Var5 = vu30Var2;
                z6 = z3;
                i23 = i2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new hhv(function0, qim0Var3, str3, i21, i23, j2, f2, z6, z5, i22, vu30Var4, vu30Var5, idn0Var2, j2iVar, i4, i5, i6);
            }
        }
        i7 |= 48;
        qim0Var2 = qim0Var;
        i8 = i6 & 4;
        if (i8 != 0) {
            if ((i4 & 384) == 0) {
                str2 = str;
                if (x340Var.g(str2)) {
                    i9 = 256;
                } else {
                    i9 = 128;
                }
                i7 |= i9;
            }
            i10 = i7 | 27648;
            if ((196608 & i4) == 0) {
                if ((i6 & 32) == 0) {
                    j2 = j;
                    if (x340Var.f(j2)) {
                    }
                    i10 |= i30;
                } else {
                    j2 = j;
                }
                i10 |= i30;
            } else {
                j2 = j;
            }
            if ((i4 & 1572864) == 0) {
                i10 |= 524288;
            }
            i11 = i6 & 128;
            if (i11 != 0) {
                i10 |= 12582912;
                z3 = z;
            } else {
                z3 = z;
                if ((i4 & 12582912) == 0) {
                    if (x340Var.h(z3)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i10 |= i12;
                }
            }
            i13 = i10 | 100663296;
            i14 = i6 & 512;
            if (i14 != 0) {
                i13 = i10 | 905969664;
            } else if ((805306368 & i4) == 0) {
                if (i3 == 0) {
                    iC = -1;
                } else {
                    iC = l1d.C(i3);
                }
                if (x340Var.e(iC)) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i13 |= i15;
            }
            i16 = i6 & 1024;
            if (i16 != 0) {
                vu30Var3 = vu30Var;
                i17 = i5 | 6;
            } else {
                vu30Var3 = vu30Var;
                if ((i5 & 6) == 0) {
                    if (x340Var.i(vu30Var3)) {
                        i18 = 4;
                    } else {
                        i18 = 2;
                    }
                    i17 = i5 | i18;
                } else {
                    i17 = i5;
                }
            }
            i19 = i6 & 2048;
            if (i19 != 0) {
                i17 |= 48;
            } else if ((i5 & 48) == 0) {
                if (x340Var.i(vu30Var2)) {
                    i20 = 32;
                } else {
                    i20 = 16;
                }
                i17 |= i20;
            }
            int i33 = i17 | 128;
            if ((i13 & 306783379) == 306783378) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (x340Var.Y(i13 & 1, z4)) {
                x340Var.d0();
                if ((i4 & 1) != 0) {
                    if (i29 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i8 != 0) {
                        str2 = null;
                    }
                    if ((i6 & 32) != 0) {
                        j2 = u7h.j;
                    }
                    if (i11 == 0) {
                    }
                    if (i14 != 0) {
                        i24 = 1;
                    } else {
                        i24 = i3;
                    }
                    if (i16 != 0) {
                        vu30Var3 = null;
                    }
                    if (i19 == 0) {
                    }
                    objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = ktd.n(x340Var);
                    }
                    qim0Var3 = qim0Var4;
                    idn0Var3 = (idn0) objT;
                    vu30Var6 = vu30Var3;
                    str4 = str2;
                    z7 = z9;
                    i25 = 1;
                    z8 = true;
                    vu30Var7 = vu30Var8;
                    i26 = i24;
                    f3 = 1.0f;
                    i27 = 4;
                } else {
                    if (i29 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i8 != 0) {
                        str2 = null;
                    }
                    if ((i6 & 32) != 0) {
                        j2 = u7h.j;
                    }
                    if (i11 == 0) {
                    }
                    if (i14 != 0) {
                        i24 = 1;
                    } else {
                        i24 = i3;
                    }
                    if (i16 != 0) {
                        vu30Var3 = null;
                    }
                    if (i19 == 0) {
                    }
                    objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = ktd.n(x340Var);
                    }
                    qim0Var3 = qim0Var4;
                    idn0Var3 = (idn0) objT;
                    vu30Var6 = vu30Var3;
                    str4 = str2;
                    z7 = z9;
                    i25 = 1;
                    z8 = true;
                    vu30Var7 = vu30Var8;
                    i26 = i24;
                    f3 = 1.0f;
                    i27 = 4;
                }
                x340Var.s();
                if (z7) {
                    i28 = i27;
                } else {
                    i28 = i25;
                }
                gfx.g(i28, apo.r(-687844201, new ghv(qim0Var3, i26, z8, str4, function0, idn0Var3, f3, j2, z7, vu30Var6, j2iVar, vu30Var7, (byte) 1), x340Var), x340Var, 48);
                i21 = i25;
                i23 = i27;
                i22 = i26;
                str3 = str4;
                idn0Var2 = idn0Var3;
                f2 = f3;
                vu30Var4 = vu30Var6;
                vu30Var5 = vu30Var7;
                z5 = z8;
                z6 = z7;
            } else {
                x340Var.b0();
                i21 = i;
                z5 = z2;
                i22 = i3;
                idn0Var2 = idn0Var;
                vu30Var4 = vu30Var3;
                qim0Var3 = qim0Var2;
                str3 = str2;
                f2 = f;
                vu30Var5 = vu30Var2;
                z6 = z3;
                i23 = i2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new hhv(function0, qim0Var3, str3, i21, i23, j2, f2, z6, z5, i22, vu30Var4, vu30Var5, idn0Var2, j2iVar, i4, i5, i6);
            }
        }
        i7 |= 384;
        str2 = str;
        i10 = i7 | 27648;
        if ((196608 & i4) == 0) {
            if ((i6 & 32) == 0) {
                j2 = j;
                if (x340Var.f(j2)) {
                }
                i10 |= i30;
            } else {
                j2 = j;
            }
            i10 |= i30;
        } else {
            j2 = j;
        }
        if ((i4 & 1572864) == 0) {
            i10 |= 524288;
        }
        i11 = i6 & 128;
        if (i11 != 0) {
            i10 |= 12582912;
            z3 = z;
        } else {
            z3 = z;
            if ((i4 & 12582912) == 0) {
                if (x340Var.h(z3)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i10 |= i12;
            }
        }
        i13 = i10 | 100663296;
        i14 = i6 & 512;
        if (i14 != 0) {
            i13 = i10 | 905969664;
        } else if ((805306368 & i4) == 0) {
            if (i3 == 0) {
                iC = -1;
            } else {
                iC = l1d.C(i3);
            }
            if (x340Var.e(iC)) {
                i15 = 536870912;
            } else {
                i15 = 268435456;
            }
            i13 |= i15;
        }
        i16 = i6 & 1024;
        if (i16 != 0) {
            vu30Var3 = vu30Var;
            i17 = i5 | 6;
        } else {
            vu30Var3 = vu30Var;
            if ((i5 & 6) == 0) {
                if (x340Var.i(vu30Var3)) {
                    i18 = 4;
                } else {
                    i18 = 2;
                }
                i17 = i5 | i18;
            } else {
                i17 = i5;
            }
        }
        i19 = i6 & 2048;
        if (i19 != 0) {
            i17 |= 48;
        } else if ((i5 & 48) == 0) {
            if (x340Var.i(vu30Var2)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i17 |= i20;
        }
        int i34 = i17 | 128;
        if ((i13 & 306783379) == 306783378) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (x340Var.Y(i13 & 1, z4)) {
            x340Var.d0();
            if ((i4 & 1) != 0) {
                if (i29 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i8 != 0) {
                    str2 = null;
                }
                if ((i6 & 32) != 0) {
                    j2 = u7h.j;
                }
                if (i11 == 0) {
                }
                if (i14 != 0) {
                    i24 = 1;
                } else {
                    i24 = i3;
                }
                if (i16 != 0) {
                    vu30Var3 = null;
                }
                if (i19 == 0) {
                }
                objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = ktd.n(x340Var);
                }
                qim0Var3 = qim0Var4;
                idn0Var3 = (idn0) objT;
                vu30Var6 = vu30Var3;
                str4 = str2;
                z7 = z9;
                i25 = 1;
                z8 = true;
                vu30Var7 = vu30Var8;
                i26 = i24;
                f3 = 1.0f;
                i27 = 4;
            } else {
                if (i29 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i8 != 0) {
                    str2 = null;
                }
                if ((i6 & 32) != 0) {
                    j2 = u7h.j;
                }
                if (i11 == 0) {
                }
                if (i14 != 0) {
                    i24 = 1;
                } else {
                    i24 = i3;
                }
                if (i16 != 0) {
                    vu30Var3 = null;
                }
                if (i19 == 0) {
                }
                objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = ktd.n(x340Var);
                }
                qim0Var3 = qim0Var4;
                idn0Var3 = (idn0) objT;
                vu30Var6 = vu30Var3;
                str4 = str2;
                z7 = z9;
                i25 = 1;
                z8 = true;
                vu30Var7 = vu30Var8;
                i26 = i24;
                f3 = 1.0f;
                i27 = 4;
            }
            x340Var.s();
            if (z7) {
                i28 = i27;
            } else {
                i28 = i25;
            }
            gfx.g(i28, apo.r(-687844201, new ghv(qim0Var3, i26, z8, str4, function0, idn0Var3, f3, j2, z7, vu30Var6, j2iVar, vu30Var7, (byte) 1), x340Var), x340Var, 48);
            i21 = i25;
            i23 = i27;
            i22 = i26;
            str3 = str4;
            idn0Var2 = idn0Var3;
            f2 = f3;
            vu30Var4 = vu30Var6;
            vu30Var5 = vu30Var7;
            z5 = z8;
            z6 = z7;
        } else {
            x340Var.b0();
            i21 = i;
            z5 = z2;
            i22 = i3;
            idn0Var2 = idn0Var;
            vu30Var4 = vu30Var3;
            qim0Var3 = qim0Var2;
            str3 = str2;
            f2 = f;
            vu30Var5 = vu30Var2;
            z6 = z3;
            i23 = i2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hhv(function0, qim0Var3, str3, i21, i23, j2, f2, z6, z5, i22, vu30Var4, vu30Var5, idn0Var2, j2iVar, i4, i5, i6);
        }
    }

    public static final void e(Function0 function0, b0k b0kVar, int i) {
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1590025036);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            function1 = function0;
            mqo1.d(function1, (i3u) null, (hux) null, cwl1.o0(x340Var, 2131956389), cwl1.o0(x340Var, 2131956388), new zgx(cwl1.o0(x340Var, 2131956387), new gbx(z50.c, function0)), (zgx) null, x340Var, (i2 & 14) | 262144, 70);
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vgz(function1, i, (byte) 18);
        }
    }

    public static final void f(c950 c950Var, sp00 sp00Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(622551132);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(c950Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(sp00Var) : x340Var.i(sp00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new g850(iu30Var, (byte) 1);
                x340Var.s0(objT);
            }
            q3p1.b(6, 0, (Function0) objT, x340Var, true);
            nyx.a(2, (wux) null, apo.r(1031973097, new xx00(iu30Var, c950Var, sp00Var), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ze10(c950Var, sp00Var, iu30Var, i, (byte) 16);
        }
    }

    public static final void g(String str, String str2, String str3, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-553548099);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(str2) ? 32 : 16) | (b0kVar3.g(str3) ? 256 : 128) | 3072;
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = b0kVar3.T();
            if (objT == fkj0.X) {
                objT = j2g0.c;
                b0kVar3.s0(objT);
            }
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            jto1.b(s161.b(qim0Var3, true, (iu30) objT), (uvx) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, apo.r(72767398, new z3y(str3, (byte) 25), b0kVar3), (xu30) null, apo.r(353526917, new z3y(str2, (byte) 26), b0kVar3), (xu30) null, (xu30) null, (xu30) null, apo.r(1174747649, new z3y(str, (byte) 27), b0kVar3), b0kVar2, 805306368, 196656, 30206);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new tb9(str, str2, str3, qim0Var2, i, (byte) 1);
        }
    }

    public static final void h(c7m1 c7m1Var, Function0 function0, vu30 vu30Var, b0k b0kVar, int i) {
        int i2;
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1777291781);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(c7m1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function1 = function0;
            i2 |= x340Var.i(function1) ? 32 : 16;
        } else {
            function1 = function0;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(vu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            long jE = z4p1.e(c7m1Var.j);
            long jE2 = z4p1.e(c7m1Var.n);
            long jE3 = z4p1.e(c7m1Var.m);
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, 12.0f, 16.0f);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            m(c7m1Var.a, c7m1Var.b, jE, vu30Var, x340Var, (i2 << 3) & 7168);
            p(c7m1Var.l, jE2, jE3, function1, null, x340Var, (i2 << 6) & 7168);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ixi1((byte) 19, i, c7m1Var, vu30Var, function0);
        }
    }

    public static final void i(int i, String str, String str2, String str3, b0k b0kVar, iu30 iu30Var, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-962679150);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.g(str2) ? 32 : 16) | (x340Var.g(str3) ? 256 : 128) | (x340Var.h(z) ? 2048 : 1024) | (x340Var.g(qim0Var) ? 16384 : 8192) | (x340Var.i(iu30Var) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            qim0Var2 = qim0Var;
            q0o1.a(qim0Var2, xbp1.Y, apo.r(1688501515, new go7(str, str2, str3, (byte) 3), x340Var), apo.r(-1385438447, new nr3(z, iu30Var, (byte) 2), x340Var), x340Var, ((i2 >> 12) & 14) | 3504);
        } else {
            qim0Var2 = qim0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d920(str, str2, str3, z, qim0Var2, iu30Var, i);
        }
    }

    public static final void j(int i, String str, b0k b0kVar, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1873921403);
        int i2 = (x340Var.g(str) ? 32 : 16) | i | (x340Var.h(z) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            uwo1.e(str, u291.B(k1u.u(eqr0.C(h2c.a.a(nim0.a, z ? een.t : een.Y), z ? -25.0f : 25.0f, 25.0f), z ? -10.0f : 10.0f), (gra) null, 3), cbx.d(x340Var).a, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, (i2 >> 3) & 14, 0, 2040);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mv8((byte) 7, i, str, z);
        }
    }

    public static final void k(rlx0 rlx0Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(200857099);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? b0kVar2.g(rlx0Var) : b0kVar2.i(rlx0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar2.i(function0) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (b0kVar2.Y(i3 & 1, (i3 & 147) != 146)) {
            vnr0 vnr0VarG = rlx0Var.c.g(null, b0kVar2, 1);
            vnr0 vnr0VarG2 = rlx0Var.d.g(null, b0kVar2, 1);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar2).f;
            cr31 cr31VarB = er31.b(8.0f);
            String str = rlx0Var.g;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = dug.f(i1p1.q(d7e.r(0.5625f, hqn1.s("HighlightPromoCard", str, function0, qim0Var3), false), cr31VarB), z4p1.e(rlx0Var.f), d4o1.a);
            Object objT = b0kVar2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ilx0.c;
                b0kVar2.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarF, true, (iu30) objT);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarB);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            Uri uri = Uri.parse(rlx0Var.e);
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            Object objT2 = b0kVar2.T();
            if (objT2 == m4cVar) {
                objT2 = ilx0.d;
                b0kVar2.s0(objT2);
            }
            qim0 qim0VarA = s161.a(qim0VarD, (iu30) objT2);
            cbx.a.getClass();
            eso1.e(uri, isl.a, qim0VarA, (p3v) null, (zvx) null, uwr.c(), (j6m) null, (tl3) null, (ColorFilter) null, oux.a, false, false, b0kVar2, 3120, 0, 3536);
            cvx cvxVar = cbx.b(b0kVar2).b;
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            j2i j2iVarR = apo.r(-1921427039, new kpw0(rlx0Var, function0, (byte) 4), b0kVar2);
            qim0 qim0VarF2 = u291.f(h2c.a.a(qim0Var3, een.h), 1.0f);
            float f = cbx.b(b0kVar2).b.b;
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            pxd0.k(vnr0VarG, vnr0VarG2, j2iVarR, uyn1.y(qim0VarF2, f, 16.0f), b0kVar2, 29184);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new j5w0(rlx0Var, function0, qim0Var2, i, (byte) 5);
        }
    }

    public static final void l(iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-306431550);
        int i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            fnx fnxVar = fnx.c;
            String strO0 = cwl1.o0(x340Var, 2131957827);
            String strO1 = cwl1.o0(x340Var, 2131957833);
            String strO2 = cwl1.o0(x340Var, 2131957834);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new uef0(iu30Var, (byte) 21);
                x340Var.s0(objT);
            }
            c(fnxVar, strO0, strO1, strO2, "#LyricsFullscreenContextMenuReportProblemButtonTag", (Function0) objT, x340Var, fnx.d | 24576);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d720(iu30Var, i, (byte) 29);
        }
    }

    public static final void m(String str, String str2, long j, vu30 vu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1928600612);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.f(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(vu30Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            w2g0.c(u291.f(nim0.a, 1.0f), (tl3) null, apo.r(948644914, new nhg(vu30Var, str, j, str2), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q18(str, str2, j, vu30Var, i, (byte) 7);
        }
    }

    public static final void n(iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2095534837);
        int i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            mtx mtxVar = mtx.c;
            String strO0 = cwl1.o0(x340Var, 2131957828);
            String strO1 = cwl1.o0(x340Var, 2131957835);
            String strO2 = cwl1.o0(x340Var, 2131957836);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new uef0(iu30Var, (byte) 22);
                x340Var.s0(objT);
            }
            c(mtxVar, strO0, strO1, strO2, "#LyricsFullscreenContextMenuTranslateLyricsButtonTag", (Function0) objT, x340Var, mtx.d | 24576);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new k2g0(iu30Var, i, (byte) 0);
        }
    }

    public static final void o(c7m1 c7m1Var, j2i j2iVar, j2i j2iVar2, j2i j2iVar3, j2i j2iVar4, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        j2i j2iVar5;
        b0k b0kVar2;
        qim0 qim0VarC;
        boolean z;
        j2i j2iVar6 = j2iVar4;
        int i3 = c7m1Var.i;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(784992255);
        j06 j06Var = ((x340) b0kVar3).a;
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(c7m1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(j2iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(j2iVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(j2iVar3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.i(j2iVar6) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.i(function0) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= b0kVar3.g(qim0Var) ? 1048576 : 524288;
        }
        int i4 = i2;
        if (b0kVar3.Y(i4 & 1, (i4 & 599187) != 599186)) {
            boolean z2 = c7m1Var.e instanceof bj31;
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(new mmr0(0, 0));
                b0kVar3.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(0);
                b0kVar3.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) objT2;
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar3).f;
            int iI0 = ((wat) b0kVar3.k(t4k.h)).i0(3.0f);
            Object objT3 = b0kVar3.T();
            if (objT3 == m4cVar) {
                objT3 = new e7m1(ven0Var2, (byte) 1);
                b0kVar3.s0(objT3);
            }
            qim0 qim0VarG0 = irn1.g0(qim0Var, (iu30) objT3);
            cj31 cj31Var = c7m1Var.f;
            qim0 qim0Var2 = nim0.a;
            if (cj31Var != null) {
                b0kVar3.i0(-391668741);
                Object objT4 = b0kVar3.T();
                if (objT4 == m4cVar) {
                    objT4 = m5m1.O0;
                    b0kVar3.s0(objT4);
                }
                qim0VarC = i541.C(qim0Var2, (iu30) objT4);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-391561791);
                b0kVar3.r(false);
                qim0VarC = qim0Var2;
            }
            qim0 qim0VarQ = i1p1.q(qim0VarG0.then(qim0VarC), er31.b(16.0f));
            long jE = z4p1.e(i3);
            u5j1 u5j1Var = d4o1.a;
            qim0 qim0VarX = bin.x(dug.f(qim0VarQ, jE, u5j1Var), false, (String) null, new pm31(0), (idn0) null, function0, 11);
            boolean zH = b0kVar3.h(z2);
            Object objT5 = b0kVar3.T();
            if (zH || objT5 == m4cVar) {
                objT5 = new kcx((byte) 3, z2);
                b0kVar3.s0(objT5);
            }
            gfh0 gfh0Var = (gfh0) objT5;
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z3 = ((x340) b0kVar3).S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0Var, b0kVar3, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar3, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar3, lljVar3);
            nko1.F(b0kVar3);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, lljVar4);
            Object objT6 = b0kVar3.T();
            if (objT6 == m4cVar) {
                objT6 = new p6k(ven0Var2, ven0Var, (byte) 2);
                b0kVar3.s0(objT6);
            }
            int i5 = i4 >> 12;
            h(c7m1Var, function0, (vu30) objT6, b0kVar3, (i4 & 14) | 384 | (i5 & 112));
            qim0 qim0VarThen = u291.d(qim0Var2, 1.0f).then(z2 ? dug.f(i1p1.q(uyn1.x(qim0Var2, 3.0f), er31.b(13.0f)), z4p1.e(i3), u5j1Var) : qim0Var2);
            Object objT7 = b0kVar3.T();
            if (objT7 == m4cVar) {
                objT7 = m5m1.P0;
                b0kVar3.s0(objT7);
            }
            qim0 qim0VarA = s161.a(qim0VarThen, (iu30) objT7);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM2 = b0kVar3.m();
            qim0 qim0VarE2 = zr7.E(b0kVar3, qim0VarA);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            nko1.H(gfh0VarC, b0kVar3, lljVar);
            nko1.H(xos0VarM2, b0kVar3, lljVar2);
            x0d.q(iHashCode2, b0kVar3, lljVar3, b0kVar3);
            nko1.H(qim0VarE2, b0kVar3, lljVar4);
            b0kVar2 = b0kVar3;
            a(z2 ? new mmr0(Integer.valueOf(((Number) ((mmr0) ven0Var.getValue()).a).intValue() - iI0), Integer.valueOf(((Number) ((mmr0) ven0Var.getValue()).b).intValue() - iI0)) : (mmr0) ven0Var.getValue(), z2 ? iI0 : 0, j2iVar, j2iVar2, b0kVar2, (i4 << 3) & 8064);
            b0kVar2.r(true);
            if (z2) {
                b0kVar2.i0(-2080797961);
                qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
                Object objT8 = b0kVar2.T();
                if (objT8 == m4cVar) {
                    objT8 = m5m1.Q0;
                    b0kVar2.s0(objT8);
                }
                qim0 qim0VarA2 = s161.a(qim0VarD, (iu30) objT8);
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM3 = b0kVar2.m();
                qim0 qim0VarE3 = zr7.E(b0kVar2, qim0VarA2);
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(n4kVar);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(gfh0VarC2, b0kVar2, lljVar);
                nko1.H(xos0VarM3, b0kVar2, lljVar2);
                x0d.q(iHashCode3, b0kVar2, lljVar3, b0kVar2);
                nko1.H(qim0VarE3, b0kVar2, lljVar4);
                j2iVar5 = j2iVar3;
                z = false;
                k4s0.i((i4 >> 9) & 14, j2iVar5, b0kVar2, true, false);
            } else {
                j2iVar5 = j2iVar3;
                z = false;
                b0kVar2.i0(-2080654772);
                b0kVar2.r(false);
            }
            qim0 qim0VarD2 = u291.d(qim0Var2, 1.0f);
            Object objT9 = b0kVar2.T();
            if (objT9 == m4cVar) {
                objT9 = m5m1.R0;
                b0kVar2.s0(objT9);
            }
            qim0 qim0VarA3 = s161.a(qim0VarD2, (iu30) objT9);
            gfh0 gfh0VarC3 = t1c.c(graVar, z);
            int iHashCode4 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM4 = b0kVar2.m();
            qim0 qim0VarE4 = zr7.E(b0kVar2, qim0VarA3);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC3, b0kVar2, lljVar);
            nko1.H(xos0VarM4, b0kVar2, lljVar2);
            x0d.q(iHashCode4, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE4, b0kVar2, lljVar4);
            j2iVar6 = j2iVar4;
            k4s0.i(i5 & 14, j2iVar6, b0kVar2, true, true);
        } else {
            j2iVar5 = j2iVar3;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kt3(c7m1Var, j2iVar, j2iVar2, j2iVar5, j2iVar6, function0, qim0Var, i, (byte) 26);
        }
    }

    public static final void p(String str, long j, long j2, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        long j3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1968629426);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.f(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function0) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            j3 = j;
            gfx.a(j3, 0L, apo.r(355406790, new qi6(str, function0, j2), x340Var), x340Var, ((i3 >> 3) & 14) | 384);
            qim0Var = nim0.a;
        } else {
            j3 = j;
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f7m1(str, j3, j2, function0, qim0Var2, i);
        }
    }

    public static final iga0 q(Function0 function0) {
        return new iga0(function0);
    }

    public static final void r() {
        throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
    }

    public static final void s(uax uaxVar) {
        u(uaxVar);
    }

    public static final bga0 t(dar darVar) {
        bga0 bga0Var = darVar instanceof bga0 ? (bga0) darVar : null;
        if (bga0Var != null) {
            return bga0Var;
        }
        eg.m(us71.f(rc11.a, darVar.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ")));
        return null;
    }

    public static final void u(uax uaxVar) {
        if ((uaxVar instanceof jga0 ? (jga0) uaxVar : null) != null) {
            return;
        }
        eg.m(us71.f(rc11.a, uaxVar.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ")));
    }

    public static void v() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        eg.m("Not called on main looper");
    }

    public static void w(byte[] bArr, int[] iArr, int i, int i2) {
        int i3 = i * i2;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = 0;
            while (i7 < i) {
                int iRed = Color.red(iArr[i5]);
                int iGreen = Color.green(iArr[i5]);
                int iBlue = Color.blue(iArr[i5]);
                int i8 = ((((iBlue * 25) + ((iGreen * 129) + (iRed * 66))) + 128) >> 8) + 16;
                int i9 = ((((iBlue * 112) + ((iRed * (-38)) - (iGreen * 74))) + 128) >> 8) + 128;
                int i10 = (((((iRed * 112) - (iGreen * 94)) - (iBlue * 18)) + 128) >> 8) + 128;
                int i11 = i4 + 1;
                bArr[i4] = (byte) (i8 < 0 ? 0 : Math.min(i8, 255));
                if (i6 % 2 == 0 && i5 % 2 == 0) {
                    int i12 = i3 + 1;
                    bArr[i3] = (byte) (i10 < 0 ? 0 : Math.min(i10, 255));
                    i3 += 2;
                    bArr[i12] = (byte) (i9 < 0 ? 0 : Math.min(i9, 255));
                }
                i5++;
                i7++;
                i4 = i11;
            }
        }
    }

    public static final heg x(zjn0 zjn0Var, int i) {
        return mka.f(zjn0Var.b(i), zjn0Var.a(i));
    }

    public static final ajn0 y(zjn0 zjn0Var, int i) {
        return ajn0.d(zjn0Var.getString(i));
    }

    public static final qim0 z(srb0 srb0Var, laz lazVar, boolean z, qqq0 qqq0Var) {
        return new orb0(srb0Var, lazVar, z, qqq0Var);
    }
}
