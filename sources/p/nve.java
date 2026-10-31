package p;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nve extends hab0 implements iu30 {
    public static final nve N0;
    public static final nve O0;
    public static final nve P0;
    public static final nve Q0;
    public static final nve R0;
    public static final nve S0;
    public static final nve T0;
    public static final nve U0;
    public static final nve V0;
    public static final nve W0;
    public static final nve X;
    public static final nve X0;
    public static final nve Y;
    public static final nve Y0;
    public static final nve Z;
    public static final nve Z0;
    public static final nve a1;
    public static final nve b;
    public static final nve b1;
    public static final nve c;
    public static final nve c1;
    public static final nve d;
    public static final nve d1;
    public static final nve e;
    public static final nve e1;
    public static final nve f;
    public static final nve g;
    public static final nve h;
    public static final nve i;
    public static final nve t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new nve(i2, (byte) 0);
        c = new nve(i2, (byte) 1);
        d = new nve(i2, (byte) 2);
        e = new nve(i2, (byte) 3);
        f = new nve(i2, (byte) 4);
        g = new nve(i2, (byte) 5);
        h = new nve(i2, (byte) 6);
        i = new nve(i2, (byte) 7);
        t = new nve(i2, (byte) 8);
        X = new nve(i2, (byte) 9);
        Y = new nve(i2, (byte) 10);
        Z = new nve(i2, (byte) 11);
        N0 = new nve(i2, (byte) 12);
        O0 = new nve(i2, (byte) 13);
        P0 = new nve(i2, (byte) 14);
        Q0 = new nve(i2, (byte) 15);
        R0 = new nve(i2, (byte) 16);
        S0 = new nve(i2, (byte) 17);
        T0 = new nve(i2, (byte) 18);
        U0 = new nve(i2, (byte) 19);
        V0 = new nve(i2, (byte) 20);
        W0 = new nve(i2, (byte) 21);
        X0 = new nve(i2, (byte) 22);
        Y0 = new nve(i2, (byte) 23);
        Z0 = new nve(i2, (byte) 24);
        a1 = new nve(i2, (byte) 25);
        b1 = new nve(i2, (byte) 26);
        c1 = new nve(i2, (byte) 27);
        d1 = new nve(i2, (byte) 28);
        e1 = new nve(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nve(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                String str = ((hve) obj).a;
                Set set = pcf.a;
                return "spotify:chat-details:".concat(str);
            case 1:
                ((kd31) obj).i(1);
                return rih1Var;
            case 2:
                lsl lslVar = (lsl) obj;
                DrawScope.b0(lslVar, u7h.b, (Size.e(lslVar.j()) * 0.5f) + (Size.e(lslVar.j()) * 0.07f), 0L, 0.0f, (DrawStyle) null, 60);
                lslVar.s1();
                return rih1Var;
            case 3:
                return ((eqc) obj).b(d);
            case 4:
                return "spotify:chat-disclaimer";
            case 5:
                return "campfire";
            case 6:
                return new huz(Boolean.valueOf(((String) obj).equals("ENABLED")), (byte) 10);
            case 7:
                return ((jwm) obj).a.b;
            case 8:
                return new caf(rba0.a);
            case 9:
                return tom.a((tom) obj, (w4i1) null, (upl) null, new oom(false, false), (List) null, (List) null, (nom) null, false, 4031);
            case 10:
                return tom.a((tom) obj, (w4i1) null, (upl) null, new oom(false, false), (List) null, (List) null, (nom) null, false, 4031);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Boolean) obj).getClass();
                return rih1Var;
            case grn1.d /* 12 */:
                ncf ncfVar = (ncf) obj;
                lcf lcfVar = ncfVar.i >= 100 ? lcf.a : ncfVar.g;
                goe goeVar = ncfVar.a;
                return mno1.h(new mmr0[]{new mmr0("chat_conversation_model", ncf.a(ncfVar, goe.a(goeVar, (String) null, (btf) null, (gxz0) null, (ArrayList) null, o7h.d1(goeVar.f, 100), 0, 4063), null, null, lcfVar, false, 0, false, false, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, -66, 7))});
            case 13:
                e261 e261Var = (e261) obj;
                b261.F(e261Var, true);
                b261.G(e261Var, -100000.0f);
                return rih1Var;
            case 14:
                b261.c((e261) obj);
                return rih1Var;
            case 15:
                return rih1Var;
            case 16:
                long j = ((Offset) obj).a;
                return rih1Var;
            case 17:
                long j2 = ((Offset) obj).a;
                return rih1Var;
            case 18:
                b261.d((e261) obj);
                return rih1Var;
            case 19:
                b261.d((e261) obj);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return gio1.b((ahf) obj);
            case 21:
                return rih1Var;
            case 22:
                ekf ekfVar = (ekf) obj;
                return new fkf(ekfVar.a, ekfVar.b, ekfVar.c, false, false, ekfVar.d);
            case 23:
                b261.d((e261) obj);
                return rih1Var;
            case 24:
                return rih1Var;
            case 25:
                b261.x((e261) obj, 0);
                return rih1Var;
            case 26:
                b261.a((e261) obj);
                return rih1Var;
            case 27:
                b261.x((e261) obj, 0);
                return rih1Var;
            case 28:
                dmf dmfVar = (dmf) obj;
                return new emf(dmfVar.b, dmfVar.c, dmfVar.d, dmfVar.e, dmfVar.g, false, false, true, true, true, true, false, false, false, true, false, false);
            default:
                return ((jwm) obj).a.b;
        }
    }
}
