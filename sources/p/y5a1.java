package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y5a1 extends hab0 implements iu30 {
    public static final y5a1 N0;
    public static final y5a1 O0;
    public static final y5a1 P0;
    public static final y5a1 Q0;
    public static final y5a1 R0;
    public static final y5a1 S0;
    public static final y5a1 T0;
    public static final y5a1 U0;
    public static final y5a1 V0;
    public static final y5a1 W0;
    public static final y5a1 X;
    public static final y5a1 X0;
    public static final y5a1 Y;
    public static final y5a1 Y0;
    public static final y5a1 Z;
    public static final y5a1 Z0;
    public static final y5a1 a1;
    public static final y5a1 b;
    public static final y5a1 b1;
    public static final y5a1 c;
    public static final y5a1 c1;
    public static final y5a1 d;
    public static final y5a1 d1;
    public static final y5a1 e;
    public static final y5a1 e1;
    public static final y5a1 f;
    public static final y5a1 g;
    public static final y5a1 h;
    public static final y5a1 i;
    public static final y5a1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new y5a1(i2, (byte) 0);
        c = new y5a1(i2, (byte) 1);
        d = new y5a1(i2, (byte) 2);
        e = new y5a1(i2, (byte) 3);
        f = new y5a1(i2, (byte) 4);
        g = new y5a1(i2, (byte) 5);
        h = new y5a1(i2, (byte) 6);
        i = new y5a1(i2, (byte) 7);
        t = new y5a1(i2, (byte) 8);
        X = new y5a1(i2, (byte) 9);
        Y = new y5a1(i2, (byte) 10);
        Z = new y5a1(i2, (byte) 11);
        N0 = new y5a1(i2, (byte) 12);
        O0 = new y5a1(i2, (byte) 13);
        P0 = new y5a1(i2, (byte) 14);
        Q0 = new y5a1(i2, (byte) 15);
        R0 = new y5a1(i2, (byte) 16);
        S0 = new y5a1(i2, (byte) 17);
        T0 = new y5a1(i2, (byte) 18);
        U0 = new y5a1(i2, (byte) 19);
        V0 = new y5a1(i2, (byte) 20);
        W0 = new y5a1(i2, (byte) 21);
        X0 = new y5a1(i2, (byte) 22);
        Y0 = new y5a1(i2, (byte) 23);
        Z0 = new y5a1(i2, (byte) 24);
        a1 = new y5a1(i2, (byte) 25);
        b1 = new y5a1(i2, (byte) 26);
        c1 = new y5a1(i2, (byte) 27);
        d1 = new y5a1(i2, (byte) 28);
        e1 = new y5a1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y5a1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                b261.d((e261) obj);
                return rih1Var;
            case 1:
                return Integer.valueOf(((q5t0) obj).X());
            case 2:
                return ((u6a1) obj).a;
            case 3:
                return ((u6a1) obj).a;
            case 4:
                return Boolean.valueOf(obj instanceof jo70);
            case 5:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 6:
                return Boolean.valueOf(obj instanceof f7a1);
            case 7:
                if (obj != null) {
                    return (f7a1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.songdnacredits.SongDNACredits");
                return null;
            case 8:
                return new syk0((i3l0) obj);
            case 9:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:internal:songdna:about")), ((syk0) obj).a, r6h1.c, System.currentTimeMillis());
            case 10:
                return new i7a1(((h7a1) obj).a, b7xVar);
            case 11:
                return ((bc81) obj).c;
            case 12:
                return rih1Var;
            case 13:
                return rih1Var;
            case 14:
                return rih1Var;
            case 15:
                return new a8a1(((l7a1) obj).a, "", fg91.b, (u7h) null, 0, 0);
            case 16:
                return ((l7a1) obj).b;
            case 17:
                return ((l7a1) obj).b;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return (String) obj;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return (jo70) obj;
            case 20:
                return (String) obj;
            case 21:
                return (xkk1) obj;
            case 22:
                return new qvc0(l1d.m("spotify:list:track-samples:", blo1.v(((l7a1) obj).a)), (c3d0) null, (Set) null, (mqz0) null, 14);
            case 23:
                List list = (List) obj;
                return list == null ? z6x.a : list;
            case 24:
                return Boolean.valueOf((obj instanceof List) || (obj instanceof rih1));
            case 25:
                if (obj instanceof rih1) {
                    return null;
                }
                return (List) obj;
            case 26:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
            case 27:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 28:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            default:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
        }
    }
}
