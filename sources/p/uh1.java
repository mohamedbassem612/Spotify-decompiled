package p;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uh1 extends hab0 implements iu30 {
    public static final uh1 N0;
    public static final uh1 O0;
    public static final uh1 P0;
    public static final uh1 Q0;
    public static final uh1 R0;
    public static final uh1 S0;
    public static final uh1 T0;
    public static final uh1 U0;
    public static final uh1 V0;
    public static final uh1 W0;
    public static final uh1 X;
    public static final uh1 X0;
    public static final uh1 Y;
    public static final uh1 Y0;
    public static final uh1 Z;
    public static final uh1 Z0;
    public static final uh1 a1;
    public static final uh1 b;
    public static final uh1 b1;
    public static final uh1 c;
    public static final uh1 c1;
    public static final uh1 d;
    public static final uh1 d1;
    public static final uh1 e;
    public static final uh1 e1;
    public static final uh1 f;
    public static final uh1 g;
    public static final uh1 h;
    public static final uh1 i;
    public static final uh1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new uh1(i2, (byte) 0);
        c = new uh1(i2, (byte) 1);
        d = new uh1(i2, (byte) 2);
        e = new uh1(i2, (byte) 3);
        f = new uh1(i2, (byte) 4);
        g = new uh1(i2, (byte) 5);
        h = new uh1(i2, (byte) 6);
        i = new uh1(i2, (byte) 7);
        t = new uh1(i2, (byte) 8);
        X = new uh1(i2, (byte) 9);
        Y = new uh1(i2, (byte) 10);
        Z = new uh1(i2, (byte) 11);
        N0 = new uh1(i2, (byte) 12);
        O0 = new uh1(i2, (byte) 13);
        P0 = new uh1(i2, (byte) 14);
        Q0 = new uh1(i2, (byte) 15);
        R0 = new uh1(i2, (byte) 16);
        S0 = new uh1(i2, (byte) 17);
        T0 = new uh1(i2, (byte) 18);
        U0 = new uh1(i2, (byte) 19);
        V0 = new uh1(i2, (byte) 20);
        W0 = new uh1(i2, (byte) 21);
        X0 = new uh1(i2, (byte) 22);
        Y0 = new uh1(i2, (byte) 23);
        Z0 = new uh1(i2, (byte) 24);
        a1 = new uh1(i2, (byte) 25);
        b1 = new uh1(i2, (byte) 26);
        c1 = new uh1(i2, (byte) 27);
        d1 = new uh1(i2, (byte) 28);
        e1 = new uh1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uh1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        HashMap map = b7x.a;
        switch (b2) {
            case 0:
                return Boolean.valueOf(obj instanceof vnb1);
            case 1:
                if (obj != null) {
                    return (vnb1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.curation.state.State");
                return null;
            case 2:
                return new w27(l1d.m("spotify:show:", ((fi1) obj).a));
            case 3:
                return new hle(l1d.m("spotify:episode:", ((fi1) obj).b), true);
            case 4:
                b261.d((e261) obj);
                return rih1.a;
            case 5:
                gj1 gj1Var = (ij1) obj;
                Bundle bundle = new Bundle();
                if (gj1Var instanceof gj1) {
                    gj1 gj1Var2 = gj1Var;
                    bundle.putParcelableArrayList("add_to_group_page_destinations", new ArrayList<>(gj1Var2.i));
                    bundle.putParcelable("add_to_group_page_current_user", gj1Var2.d);
                }
                bundle.putSerializable("add_to_group_page_selected_users", (HashMap) gj1Var.a());
                bundle.putInt("add_to_group_page_group_size_limit", gj1Var.b());
                bundle.putInt("add_to_group_page_number_of_contributors", gj1Var.c());
                return bundle;
            case 6:
                Bundle bundle2 = (Bundle) obj;
                ArrayList arrayListU = jhc1.u(bundle2, "add_to_group_page_destinations", j6q0.class);
                HashMap map2 = (HashMap) jhc1.v(bundle2, "add_to_group_page_selected_users", new HashMap().getClass());
                int i2 = bundle2.getInt("add_to_group_page_group_size_limit", 0);
                int i3 = bundle2.getInt("add_to_group_page_number_of_contributors", 0);
                w4i1 w4i1Var = (w4i1) jhc1.t(bundle2, "add_to_group_page_current_user", w4i1.class);
                HashMap map3 = map2 != null ? map2 : map;
                if (w4i1Var == null) {
                    w4i1Var = w4i1.f;
                }
                return new hj1(i2, i3, map3, arrayListU, w4i1Var);
            case 7:
                return nik1.X0.a;
            case 8:
                return new r1l0((i3l0) obj);
            case 9:
                return new wyk0((i3l0) obj);
            case 10:
                return new w7h1("", "", new z7h1("hit", 1, map), new x7h1("ui_reveal", 1, map), ((wyk0) obj).a, r6h1.c, System.currentTimeMillis());
            case 11:
                return ((o3m0) obj).l();
            case 12:
                return Boolean.valueOf(obj instanceof vnb1);
            case 13:
                if (obj != null) {
                    return (vnb1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.curation.state.State");
                return null;
            case 14:
                return (String) obj;
            case 15:
                return (vnb1) obj;
            case 16:
                return Boolean.valueOf(obj instanceof qp31);
            case 17:
                if (obj != null) {
                    return (qp31) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.rootlistability.Rootlistability");
                return null;
            case 18:
                return (String) obj;
            case 19:
                return (qp31) obj;
            case 20:
                return Boolean.valueOf((obj instanceof qp31) || (obj instanceof rih1));
            case 21:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qp31) obj;
            case 22:
                return Boolean.valueOf(obj instanceof vnb1);
            case 23:
                if (obj != null) {
                    return (vnb1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.curation.state.State");
                return null;
            case 24:
                return (String) obj;
            case 25:
                return (String) obj;
            case 26:
                return new q1l0((i3l0) obj);
            case 27:
                return new zl1(true, false, null, null, false, false, 124);
            case 28:
                return (zl1) obj;
            default:
                return (wl1) obj;
        }
    }
}
