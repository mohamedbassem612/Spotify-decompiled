package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oc8 extends hab0 implements iu30 {
    public static final oc8 N0;
    public static final oc8 O0;
    public static final oc8 P0;
    public static final oc8 Q0;
    public static final oc8 R0;
    public static final oc8 S0;
    public static final oc8 T0;
    public static final oc8 U0;
    public static final oc8 V0;
    public static final oc8 W0;
    public static final oc8 X;
    public static final oc8 X0;
    public static final oc8 Y;
    public static final oc8 Y0;
    public static final oc8 Z;
    public static final oc8 Z0;
    public static final oc8 a1;
    public static final oc8 b;
    public static final oc8 b1;
    public static final oc8 c;
    public static final oc8 c1;
    public static final oc8 d;
    public static final oc8 d1;
    public static final oc8 e;
    public static final oc8 e1;
    public static final oc8 f;
    public static final oc8 g;
    public static final oc8 h;
    public static final oc8 i;
    public static final oc8 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new oc8(i2, (byte) 0);
        c = new oc8(i2, (byte) 1);
        d = new oc8(i2, (byte) 2);
        e = new oc8(i2, (byte) 3);
        f = new oc8(i2, (byte) 4);
        g = new oc8(i2, (byte) 5);
        h = new oc8(i2, (byte) 6);
        i = new oc8(i2, (byte) 7);
        t = new oc8(i2, (byte) 8);
        X = new oc8(i2, (byte) 9);
        Y = new oc8(i2, (byte) 10);
        Z = new oc8(i2, (byte) 11);
        N0 = new oc8(i2, (byte) 12);
        O0 = new oc8(i2, (byte) 13);
        P0 = new oc8(i2, (byte) 14);
        Q0 = new oc8(i2, (byte) 15);
        R0 = new oc8(i2, (byte) 16);
        S0 = new oc8(i2, (byte) 17);
        T0 = new oc8(i2, (byte) 18);
        U0 = new oc8(i2, (byte) 19);
        V0 = new oc8(i2, (byte) 20);
        W0 = new oc8(i2, (byte) 21);
        X0 = new oc8(i2, (byte) 22);
        Y0 = new oc8(i2, (byte) 23);
        Z0 = new oc8(i2, (byte) 24);
        a1 = new oc8(i2, (byte) 25);
        b1 = new oc8(i2, (byte) 26);
        c1 = new oc8(i2, (byte) 27);
        d1 = new oc8(i2, (byte) 28);
        e1 = new oc8(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oc8(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                return w7x.a;
            case 1:
                return new j861(((ler0) obj).a);
            case 2:
                return new j861(((u761) obj).a);
            case 3:
                s761 s761Var = (s761) obj;
                return new mc8(s761Var.a, s761Var.b);
            case 4:
                return new qvc0((String) obj, (c3d0) null, (Set) null, (mqz0) null, 14);
            case 5:
                List list = (List) obj;
                return list == null ? z6x.a : list;
            case 6:
                if (!(obj instanceof List) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                if (obj instanceof rih1) {
                    return null;
                }
                return (List) obj;
            case 8:
                w281 w281VarA = ((c481) ((zsq0) obj).a).a.y.a(w281.class);
                return u890.j(w281VarA != null ? Boolean.valueOf(w281VarA.c) : null, Boolean.TRUE) ? sd8.a : td8.a;
            case 9:
                return rih1Var;
            case 10:
                return rih1Var;
            case 11:
                return rih1Var;
            case 12:
                return new c1(((mer0) obj).a, new z0(), new z0());
            case 13:
                return new pyn(((mer0) obj).a, new iyn(), new iyn());
            case 14:
                return Collections.singleton(((mer0) obj).a);
            case 15:
                return Collections.singleton(((mer0) obj).a);
            case 16:
                pn8 pn8Var = (pn8) obj;
                return new qn8(pn8Var.a, pn8Var.b, pn8Var.c, pn8Var.d, false, false, false, pn8Var.f, pn8Var.g);
            case 17:
                return new sz50(((dqw) obj).a);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new ep8((dp8) obj, false, false, false);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new mu8(2131952683, false);
            case 20:
                return new rxc0((String) obj);
            case 21:
                return (qxc0) obj;
            case 22:
                return Boolean.valueOf(obj instanceof qxc0);
            case 23:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 24:
                return "mixing-tools";
            case 25:
                return "type";
            case 26:
                kby kbyVar = ((cxc0) obj).f;
                List list2 = kbyVar.z;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    z = false;
                } else {
                    Iterator it = list2.iterator();
                    do {
                        if (!it.hasNext()) {
                            z = false;
                        }
                    } while (!u890.j(((ll81) it.next()).a, "mix-auto-toggle-off"));
                }
                boolean z2 = kbyVar.j;
                x4i1 x4i1Var = kbyVar.e;
                return new lv8(z, j0p1.u(x4i1Var != null ? x4i1Var.a : null, z2));
            case 27:
                if (!(obj instanceof String) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
                if (obj instanceof rih1) {
                    return null;
                }
                return (String) obj;
            default:
                if (!(obj instanceof String) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
