package p;

import androidx.car.app.navigation.model.Maneuver;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b980 extends hab0 implements iu30 {
    public static final b980 N0;
    public static final b980 O0;
    public static final b980 P0;
    public static final b980 Q0;
    public static final b980 R0;
    public static final b980 S0;
    public static final b980 T0;
    public static final b980 U0;
    public static final b980 V0;
    public static final b980 W0;
    public static final b980 X;
    public static final b980 X0;
    public static final b980 Y;
    public static final b980 Y0;
    public static final b980 Z;
    public static final b980 Z0;
    public static final b980 a1;
    public static final b980 b;
    public static final b980 b1;
    public static final b980 c;
    public static final b980 c1;
    public static final b980 d;
    public static final b980 d1;
    public static final b980 e;
    public static final b980 e1;
    public static final b980 f;
    public static final b980 g;
    public static final b980 h;
    public static final b980 i;
    public static final b980 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new b980(i2, (byte) 0);
        c = new b980(i2, (byte) 1);
        d = new b980(i2, (byte) 2);
        e = new b980(i2, (byte) 3);
        f = new b980(i2, (byte) 4);
        g = new b980(i2, (byte) 5);
        h = new b980(i2, (byte) 6);
        i = new b980(i2, (byte) 7);
        t = new b980(i2, (byte) 8);
        X = new b980(i2, (byte) 9);
        Y = new b980(i2, (byte) 10);
        Z = new b980(i2, (byte) 11);
        N0 = new b980(i2, (byte) 12);
        O0 = new b980(i2, (byte) 13);
        P0 = new b980(i2, (byte) 14);
        Q0 = new b980(i2, (byte) 15);
        R0 = new b980(i2, (byte) 16);
        S0 = new b980(i2, (byte) 17);
        T0 = new b980(i2, (byte) 18);
        U0 = new b980(i2, (byte) 19);
        V0 = new b980(i2, (byte) 20);
        W0 = new b980(i2, (byte) 21);
        X0 = new b980(i2, (byte) 22);
        Y0 = new b980(i2, (byte) 23);
        Z0 = new b980(i2, (byte) 24);
        a1 = new b980(i2, (byte) 25);
        b1 = new b980(i2, (byte) 26);
        c1 = new b980(i2, (byte) 27);
        d1 = new b980(i2, (byte) 28);
        e1 = new b980(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b980(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                return r6x.a;
            case 1:
                return (a980) obj;
            case 2:
                f980 f980Var = (f980) obj;
                z = f980Var.f == 1;
                return new bjs0(f980Var.b, f980Var.c, f980Var.d, f980Var.e, false, z ? qis0.b : null, z ? sis0.b : null);
            case 3:
                return new e980((zis0) obj);
            case 4:
                return new yb80(2);
            case 5:
                if (((ub80) obj).equals(ub80.a)) {
                    return xb80.a;
                }
                eg.o();
                return null;
            case 6:
                return (hy31) obj;
            case 7:
                return (nig1) obj;
            case 8:
                return (String) obj;
            case 9:
                return (hll) obj;
            case 10:
                pvc0 pvc0Var = (pvc0) o7h.s0((List) obj);
                Map map = pvc0Var != null ? pvc0Var.f : null;
                return map == null ? b7x.a : map;
            case 11:
                List list = (List) obj;
                if (list != null) {
                    return (pvc0) o7h.s0(list);
                }
                return null;
            case 12:
                return new rxc0((String) obj);
            case 13:
                return (qxc0) obj;
            case 14:
                return (String) obj;
            case 15:
                return (mig1) obj;
            case 16:
                if (!(obj instanceof List) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 17:
                if (obj instanceof rih1) {
                    return null;
                }
                return (List) obj;
            case 18:
                if (!(obj instanceof qxc0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 19:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qxc0) obj;
            case 20:
                return Boolean.valueOf(obj instanceof mig1);
            case 21:
                if (obj != null) {
                    return (mig1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.transitiondata.TransitionData");
                return null;
            case 22:
                return Boolean.valueOf(obj instanceof nig1);
            case 23:
                if (obj != null) {
                    return (nig1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.playlistmixing.kodiaktables.TransitionData");
                return null;
            case 24:
                return Boolean.valueOf(obj instanceof hll);
            case 25:
                if (obj != null) {
                    return (hll) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.consumptionexperiencetrait.ConsumptionExperienceTrait");
                return null;
            case 26:
                return Boolean.valueOf(obj instanceof List);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.listplatform.endpoints.kodiak.ListItemsTable.Item>");
                return null;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return rih1Var;
            default:
                return rih1Var;
        }
    }
}
