package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zv8 extends hab0 implements iu30 {
    public static final zv8 N0;
    public static final zv8 O0;
    public static final zv8 P0;
    public static final zv8 Q0;
    public static final zv8 R0;
    public static final zv8 S0;
    public static final zv8 T0;
    public static final zv8 U0;
    public static final zv8 V0;
    public static final zv8 W0;
    public static final zv8 X;
    public static final zv8 X0;
    public static final zv8 Y;
    public static final zv8 Y0;
    public static final zv8 Z;
    public static final zv8 Z0;
    public static final zv8 a1;
    public static final zv8 b;
    public static final zv8 b1;
    public static final zv8 c;
    public static final zv8 c1;
    public static final zv8 d;
    public static final zv8 d1;
    public static final zv8 e;
    public static final zv8 e1;
    public static final zv8 f;
    public static final zv8 g;
    public static final zv8 h;
    public static final zv8 i;
    public static final zv8 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new zv8(i2, (byte) 0);
        c = new zv8(i2, (byte) 1);
        d = new zv8(i2, (byte) 2);
        e = new zv8(i2, (byte) 3);
        f = new zv8(i2, (byte) 4);
        g = new zv8(i2, (byte) 5);
        h = new zv8(i2, (byte) 6);
        i = new zv8(i2, (byte) 7);
        t = new zv8(i2, (byte) 8);
        X = new zv8(i2, (byte) 9);
        Y = new zv8(i2, (byte) 10);
        Z = new zv8(i2, (byte) 11);
        N0 = new zv8(i2, (byte) 12);
        O0 = new zv8(i2, (byte) 13);
        P0 = new zv8(i2, (byte) 14);
        Q0 = new zv8(i2, (byte) 15);
        R0 = new zv8(i2, (byte) 16);
        S0 = new zv8(i2, (byte) 17);
        T0 = new zv8(i2, (byte) 18);
        U0 = new zv8(i2, (byte) 19);
        V0 = new zv8(i2, (byte) 20);
        W0 = new zv8(i2, (byte) 21);
        X0 = new zv8(i2, (byte) 22);
        Y0 = new zv8(i2, (byte) 23);
        Z0 = new zv8(i2, (byte) 24);
        a1 = new zv8(i2, (byte) 25);
        b1 = new zv8(i2, (byte) 26);
        c1 = new zv8(i2, (byte) 27);
        d1 = new zv8(i2, (byte) 28);
        e1 = new zv8(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zv8(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        int i2 = 2;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                if (obj instanceof rih1) {
                    return null;
                }
                return (String) obj;
            case 1:
                return Boolean.valueOf(obj instanceof qxc0);
            case 2:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 3:
                return new dnl0(new fjl0(((i3l0) obj).b(), (byte) 12));
            case 4:
                z39 z39Var = (z39) obj;
                String str = z39Var.a;
                ArrayList arrayList = z39Var.b;
                int iC = l1d.C(z39Var.f);
                if (iC != 0) {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    i2 = 1;
                }
                return new t39(str, arrayList, i2, z39Var.g);
            case 5:
                int iOrdinal = ((s39) obj).ordinal();
                if (iOrdinal == 0) {
                    return v39.a;
                }
                if (iOrdinal == 1) {
                    return x39.a;
                }
                if (iOrdinal == 2) {
                    return w39.a;
                }
                eg.o();
                return null;
            case 6:
                return "autoplay";
            case 7:
                return new ma9(null, null, false, null);
            case 8:
                ((kd31) obj).i(1);
                return rih1Var;
            case 9:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            case 10:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            case 11:
                return new nk9(false, false);
            case 12:
                vk9 vk9Var = (vk9) obj;
                return new wk9(vk9Var.a, "", (String) null, vk9Var.b, vk9Var.c, vk9Var.d);
            case 13:
                return ((vk9) obj).a;
            case 14:
                return ((vk9) obj).a;
            case 15:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 16:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 17:
                return Boolean.valueOf(obj instanceof jo70);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new jl9();
            case 20:
                return (String) obj;
            case 21:
                return (xq9) obj;
            case 22:
                return Boolean.valueOf(obj instanceof xq9);
            case 23:
                if (obj != null) {
                    return (xq9) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.byom.segments.BYOMSegmentsProvider.ChaptersData");
                return null;
            case 24:
                return rih1Var;
            case 25:
                return rih1Var;
            case 26:
                return new jl9();
            case 27:
                return ((bm9) obj).a;
            case 28:
                return ((bm9) obj).a;
            default:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
        }
    }
}
