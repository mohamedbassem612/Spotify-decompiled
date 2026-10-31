package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.wrapped.v1.proto.Paragraph;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class q4r0 extends hab0 implements iu30 {
    public static final q4r0 N0;
    public static final q4r0 O0;
    public static final q4r0 P0;
    public static final q4r0 Q0;
    public static final q4r0 R0;
    public static final q4r0 S0;
    public static final q4r0 T0;
    public static final q4r0 U0;
    public static final q4r0 V0;
    public static final q4r0 W0;
    public static final q4r0 X;
    public static final q4r0 X0;
    public static final q4r0 Y;
    public static final q4r0 Y0;
    public static final q4r0 Z;
    public static final q4r0 Z0;
    public static final q4r0 a1;
    public static final q4r0 b;
    public static final q4r0 b1;
    public static final q4r0 c;
    public static final q4r0 c1;
    public static final q4r0 d;
    public static final q4r0 d1;
    public static final q4r0 e;
    public static final q4r0 e1;
    public static final q4r0 f;
    public static final q4r0 g;
    public static final q4r0 h;
    public static final q4r0 i;
    public static final q4r0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new q4r0(i2, (byte) 0);
        c = new q4r0(i2, (byte) 1);
        d = new q4r0(i2, (byte) 2);
        e = new q4r0(i2, (byte) 3);
        f = new q4r0(i2, (byte) 4);
        g = new q4r0(i2, (byte) 5);
        h = new q4r0(i2, (byte) 6);
        i = new q4r0(i2, (byte) 7);
        t = new q4r0(i2, (byte) 8);
        X = new q4r0(i2, (byte) 9);
        Y = new q4r0(i2, (byte) 10);
        Z = new q4r0(i2, (byte) 11);
        N0 = new q4r0(i2, (byte) 12);
        O0 = new q4r0(i2, (byte) 13);
        P0 = new q4r0(i2, (byte) 14);
        Q0 = new q4r0(i2, (byte) 15);
        R0 = new q4r0(i2, (byte) 16);
        S0 = new q4r0(i2, (byte) 17);
        T0 = new q4r0(i2, (byte) 18);
        U0 = new q4r0(i2, (byte) 19);
        V0 = new q4r0(i2, (byte) 20);
        W0 = new q4r0(i2, (byte) 21);
        X0 = new q4r0(i2, (byte) 22);
        Y0 = new q4r0(i2, (byte) 23);
        Z0 = new q4r0(i2, (byte) 24);
        a1 = new q4r0(i2, (byte) 25);
        b1 = new q4r0(i2, (byte) 26);
        c1 = new q4r0(i2, (byte) 27);
        d1 = new q4r0(i2, (byte) 28);
        e1 = new q4r0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q4r0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                z6x z6xVar = (List) obj;
                if (z6xVar == null) {
                    z6xVar = z6x.a;
                }
                List list = (Iterable) z6xVar;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((pvc0) it.next()).c);
                }
                return arrayList;
            case 1:
                return Boolean.valueOf((obj instanceof List) || (obj instanceof rih1));
            case 2:
                if (obj instanceof rih1) {
                    return null;
                }
                return (List) obj;
            case 3:
                return Boolean.valueOf((obj instanceof qxc0) || (obj instanceof rih1));
            case 4:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qxc0) obj;
            case 5:
                return Boolean.valueOf((obj instanceof List) || (obj instanceof rih1));
            case 6:
                if (obj instanceof rih1) {
                    return null;
                }
                return (List) obj;
            case 7:
                z6x z6xVar2 = z6x.a;
                return new g5r0(z6xVar2, (gd80) null, z6xVar2, (gd80) null, z6xVar2, "", z6xVar2, z6xVar2, z6xVar2);
            case 8:
                return new k8r0(false, true, false, false);
            case 9:
                return Boolean.valueOf((obj instanceof dd8) || (obj instanceof rih1));
            case 10:
                if (obj instanceof rih1) {
                    return null;
                }
                return (dd8) obj;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return (dd8) obj;
            case grn1.d /* 12 */:
                e261 e261Var = (e261) obj;
                b261.F(e261Var, true);
                b261.G(e261Var, -100000.0f);
                return rih1Var;
            case 13:
                b261.c((e261) obj);
                return rih1Var;
            case 14:
                return xlr0.a;
            case 15:
                return rih1Var;
            case 16:
                return rih1Var;
            case 17:
                return Paragraph.w((byte[]) obj);
            case 18:
                return ((Paragraph) obj).toByteArray();
            case 19:
                return mno1.h(new mmr0[]{new mmr0("parent_accept_invite_date_of_birth", ((rhm0) obj).d)});
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                b261.c((e261) obj);
                return rih1Var;
            case 21:
                Collection collectionValues = ((Map) obj).values();
                if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                    Iterator it2 = collectionValues.iterator();
                    while (it2.hasNext()) {
                        if (!((btr0) it2.next()).a.isEmpty()) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 22:
                b261.c((e261) obj);
                return rih1Var;
            case 23:
                b261.c((e261) obj);
                return rih1Var;
            case 24:
                return fsr0.a;
            case 25:
                b261.c((e261) obj);
                return rih1Var;
            case 26:
                b261.c((e261) obj);
                return rih1Var;
            case 27:
                b261.c((e261) obj);
                return rih1Var;
            case 28:
                b261.c((e261) obj);
                return rih1Var;
            default:
                b261.c((e261) obj);
                return rih1Var;
        }
    }
}
