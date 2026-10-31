package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class we3 extends hab0 implements iu30 {
    public static final we3 N0;
    public static final we3 O0;
    public static final we3 P0;
    public static final we3 Q0;
    public static final we3 R0;
    public static final we3 S0;
    public static final we3 T0;
    public static final we3 U0;
    public static final we3 V0;
    public static final we3 W0;
    public static final we3 X;
    public static final we3 X0;
    public static final we3 Y;
    public static final we3 Y0;
    public static final we3 Z;
    public static final we3 Z0;
    public static final we3 a1;
    public static final we3 b;
    public static final we3 b1;
    public static final we3 c;
    public static final we3 c1;
    public static final we3 d;
    public static final we3 d1;
    public static final we3 e;
    public static final we3 e1;
    public static final we3 f;
    public static final we3 g;
    public static final we3 h;
    public static final we3 i;
    public static final we3 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new we3(i2, (byte) 0);
        c = new we3(i2, (byte) 1);
        d = new we3(i2, (byte) 2);
        e = new we3(i2, (byte) 3);
        f = new we3(i2, (byte) 4);
        g = new we3(i2, (byte) 5);
        h = new we3(i2, (byte) 6);
        i = new we3(i2, (byte) 7);
        t = new we3(i2, (byte) 8);
        X = new we3(i2, (byte) 9);
        Y = new we3(i2, (byte) 10);
        Z = new we3(i2, (byte) 11);
        N0 = new we3(i2, (byte) 12);
        O0 = new we3(i2, (byte) 13);
        P0 = new we3(i2, (byte) 14);
        Q0 = new we3(i2, (byte) 15);
        R0 = new we3(i2, (byte) 16);
        S0 = new we3(i2, (byte) 17);
        T0 = new we3(i2, (byte) 18);
        U0 = new we3(i2, (byte) 19);
        V0 = new we3(i2, (byte) 20);
        W0 = new we3(i2, (byte) 21);
        X0 = new we3(i2, (byte) 22);
        Y0 = new we3(i2, (byte) 23);
        Z0 = new we3(i2, (byte) 24);
        a1 = new we3(i2, (byte) 25);
        b1 = new we3(i2, (byte) 26);
        c1 = new we3(i2, (byte) 27);
        d1 = new we3(i2, (byte) 28);
        e1 = new we3(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ we3(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Collections.singleton(((eer0) obj).a);
            case 1:
                return (List) ((rfr0) obj).a.getValue();
            case 2:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
            case 3:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 4:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 5:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 6:
                return Boolean.valueOf((obj instanceof zoy0) || (obj instanceof rih1));
            case 7:
                if (obj instanceof rih1) {
                    return null;
                }
                return (zoy0) obj;
            case 8:
                return Boolean.valueOf((obj instanceof bql) || (obj instanceof rih1));
            case 9:
                if (obj instanceof rih1) {
                    return null;
                }
                return (bql) obj;
            case 10:
                return ((uv11) obj).a;
            case 11:
                return ((uv11) obj).a;
            case 12:
                return ((uv11) obj).a;
            case 13:
                uf3 uf3Var = (uf3) obj;
                return new ag3(uf3Var.a, uf3Var.b, uf3Var.c, uf3Var.e, uf3Var.d, uf3Var.f, oqn1.p(uf3Var.h), uf3Var.g, uf3Var.i, uf3Var.j);
            case 14:
                tf3 tf3Var = (tf3) obj;
                return new uf3(tf3Var.b, tf3Var.c, tf3Var.d, tf3Var.e, false, false, false, tf3Var.k, tf3Var.l, tf3Var.m);
            case 15:
                Set set = s4b1.f;
                return Boolean.valueOf(uic.x(((vhc1) obj).getUri()).c == blc0.ti);
            case 16:
                fg3 fg3Var = (fg3) obj;
                eg3 eg3Var = fg3Var.a;
                return new uwf1(eg3Var.a, eg3Var.b, eg3Var.c, eg3Var.d, eg3Var.e, eg3Var.f, eg3Var.g, eg3Var.h, eg3Var.j, eg3Var.m, eg3Var.n, fg3Var.b, eg3Var.f11p);
            case 17:
                twf1 twf1Var = (twf1) obj;
                if (twf1Var.equals(twf1.d)) {
                    return cg3.d;
                }
                if (twf1Var.equals(twf1.c)) {
                    return cg3.c;
                }
                if (twf1Var.equals(twf1.e)) {
                    return cg3.e;
                }
                if (twf1Var.equals(twf1.a)) {
                    return cg3.a;
                }
                if (twf1Var.equals(twf1.b)) {
                    return cg3.b;
                }
                eg.o();
                return null;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return pg3.a;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                if (tg3.a[((q740) obj).ordinal()] == 1) {
                    return mg3.a;
                }
                eg.o();
                return null;
            case 20:
                return new r740(((ng3) obj).a, false);
            case 21:
                if (vg3.a[((q740) obj).ordinal()] == 1) {
                    return lg3.a;
                }
                eg.o();
                return null;
            case 22:
                return new g4d0((String) obj);
            case 23:
                return (g3d0) obj;
            case 24:
                return Boolean.valueOf(obj instanceof g3d0);
            case 25:
                if (obj != null) {
                    return (g3d0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.ListSortOrder");
                return null;
            case 26:
                return new zyk0((i3l0) obj);
            case 27:
                return ((zyk0) obj).e();
            case 28:
                dk3 dk3Var = (dk3) obj;
                if (dk3Var instanceof ck3) {
                    return ((ck3) dk3Var).a;
                }
                if (dk3Var instanceof bk3) {
                    return "spotify:collection";
                }
                eg.o();
                return null;
            default:
                return rih1.a;
        }
    }
}
