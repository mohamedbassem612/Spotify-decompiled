package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i6i0 extends hab0 implements iu30 {
    public static final i6i0 N0;
    public static final i6i0 O0;
    public static final i6i0 P0;
    public static final i6i0 Q0;
    public static final i6i0 R0;
    public static final i6i0 S0;
    public static final i6i0 T0;
    public static final i6i0 U0;
    public static final i6i0 V0;
    public static final i6i0 W0;
    public static final i6i0 X;
    public static final i6i0 X0;
    public static final i6i0 Y;
    public static final i6i0 Y0;
    public static final i6i0 Z;
    public static final i6i0 Z0;
    public static final i6i0 a1;
    public static final i6i0 b;
    public static final i6i0 b1;
    public static final i6i0 c;
    public static final i6i0 c1;
    public static final i6i0 d;
    public static final i6i0 d1;
    public static final i6i0 e;
    public static final i6i0 e1;
    public static final i6i0 f;
    public static final i6i0 g;
    public static final i6i0 h;
    public static final i6i0 i;
    public static final i6i0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new i6i0(i2, (byte) 0);
        c = new i6i0(i2, (byte) 1);
        d = new i6i0(i2, (byte) 2);
        e = new i6i0(i2, (byte) 3);
        f = new i6i0(i2, (byte) 4);
        g = new i6i0(i2, (byte) 5);
        h = new i6i0(i2, (byte) 6);
        i = new i6i0(i2, (byte) 7);
        t = new i6i0(i2, (byte) 8);
        X = new i6i0(i2, (byte) 9);
        Y = new i6i0(i2, (byte) 10);
        Z = new i6i0(i2, (byte) 11);
        N0 = new i6i0(i2, (byte) 12);
        O0 = new i6i0(i2, (byte) 13);
        P0 = new i6i0(i2, (byte) 14);
        Q0 = new i6i0(i2, (byte) 15);
        R0 = new i6i0(i2, (byte) 16);
        S0 = new i6i0(i2, (byte) 17);
        T0 = new i6i0(i2, (byte) 18);
        U0 = new i6i0(i2, (byte) 19);
        V0 = new i6i0(i2, (byte) 20);
        W0 = new i6i0(i2, (byte) 21);
        X0 = new i6i0(i2, (byte) 22);
        Y0 = new i6i0(i2, (byte) 23);
        Z0 = new i6i0(i2, (byte) 24);
        a1 = new i6i0(i2, (byte) 25);
        b1 = new i6i0(i2, (byte) 26);
        c1 = new i6i0(i2, (byte) 27);
        d1 = new i6i0(i2, (byte) 28);
        e1 = new i6i0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i6i0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        r1f1 q1f1Var;
        boolean z = true;
        switch (this.a) {
            case 0:
                return (List) obj;
            case 1:
                if (!(obj instanceof d7u0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                if (obj instanceof rih1) {
                    return null;
                }
                return (d7u0) obj;
            case 3:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 5:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.listplatform.endpoints.kodiak.ListItemsTable.Item>");
                return null;
            case 6:
                return Boolean.valueOf(obj instanceof jo70);
            case 7:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 8:
                return Boolean.valueOf(obj instanceof zge1);
            case 9:
                if (obj != null) {
                    return (zge1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.threebandwaveforms.ThreeBandWaveforms");
                return null;
            case 10:
                return Boolean.valueOf(obj instanceof d7u0);
            case 11:
                if (obj != null) {
                    return (d7u0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.playbacktrait.PlaybackTrait");
                return null;
            case 12:
                return Boolean.valueOf(obj instanceof prl);
            case 13:
                if (obj != null) {
                    return (prl) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.contentcapabilitytrait.ContentCapabilityTrait");
                return null;
            case 14:
                return Boolean.valueOf(obj instanceof hll);
            case 15:
                if (obj != null) {
                    return (hll) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.consumptionexperiencetrait.ConsumptionExperienceTrait");
                return null;
            case 16:
                return Boolean.valueOf(obj instanceof be60);
            case 17:
                if (obj != null) {
                    return (be60) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.highlightability.Highlightability");
                return null;
            case 18:
                return Boolean.valueOf(obj instanceof List);
            case 19:
                return (String) obj;
            case 20:
                return (zge1) obj;
            case 21:
                return (String) obj;
            case 22:
                return (hll) obj;
            case 23:
                return Boolean.valueOf(obj instanceof k8g1);
            case 24:
                if (obj != null) {
                    return (k8g1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.transcript.model.Transcript");
                return null;
            case 25:
                return Boolean.valueOf(obj instanceof hll);
            case 26:
                if (obj != null) {
                    return (hll) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.consumptionexperiencetrait.ConsumptionExperienceTrait");
                return null;
            case 27:
                return (ga01) obj;
            case 28:
                return (k8g1) obj;
            default:
                n271 n271Var = (n271) obj;
                z771 z771Var = n271Var.a;
                int i2 = n271Var.b;
                q1f1 q1f1Var2 = n271Var.c;
                q1f1Var2.getClass();
                if (q1f1Var2 instanceof r1f1) {
                    q1f1Var = r1f1.a;
                } else if (q1f1Var2 instanceof p1f1) {
                    q1f1Var = p1f1.a;
                } else {
                    if (!(q1f1Var2 instanceof q1f1)) {
                        eg.o();
                        return null;
                    }
                    q1f1Var = new q1f1(q1f1Var2.a);
                }
                return new w7i0(z771Var, i2, q1f1Var);
        }
    }
}
