package p;

import android.content.Context;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a0k1 extends hab0 implements iu30 {
    public static final a0k1 N0;
    public static final a0k1 O0;
    public static final a0k1 P0;
    public static final a0k1 Q0;
    public static final a0k1 R0;
    public static final a0k1 S0;
    public static final a0k1 T0;
    public static final a0k1 U0;
    public static final a0k1 V0;
    public static final a0k1 W0;
    public static final a0k1 X;
    public static final a0k1 X0;
    public static final a0k1 Y;
    public static final a0k1 Y0;
    public static final a0k1 Z;
    public static final a0k1 Z0;
    public static final a0k1 a1;
    public static final a0k1 b;
    public static final a0k1 b1;
    public static final a0k1 c;
    public static final a0k1 c1;
    public static final a0k1 d;
    public static final a0k1 d1;
    public static final a0k1 e;
    public static final a0k1 e1;
    public static final a0k1 f;
    public static final a0k1 g;
    public static final a0k1 h;
    public static final a0k1 i;
    public static final a0k1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new a0k1(i2, (byte) 0);
        c = new a0k1(i2, (byte) 1);
        d = new a0k1(i2, (byte) 2);
        e = new a0k1(i2, (byte) 3);
        f = new a0k1(i2, (byte) 4);
        g = new a0k1(i2, (byte) 5);
        h = new a0k1(i2, (byte) 6);
        i = new a0k1(i2, (byte) 7);
        t = new a0k1(i2, (byte) 8);
        X = new a0k1(i2, (byte) 9);
        Y = new a0k1(i2, (byte) 10);
        Z = new a0k1(i2, (byte) 11);
        N0 = new a0k1(i2, (byte) 12);
        O0 = new a0k1(i2, (byte) 13);
        P0 = new a0k1(i2, (byte) 14);
        Q0 = new a0k1(i2, (byte) 15);
        R0 = new a0k1(i2, (byte) 16);
        S0 = new a0k1(i2, (byte) 17);
        T0 = new a0k1(i2, (byte) 18);
        U0 = new a0k1(i2, (byte) 19);
        V0 = new a0k1(i2, (byte) 20);
        W0 = new a0k1(i2, (byte) 21);
        X0 = new a0k1(i2, (byte) 22);
        Y0 = new a0k1(i2, (byte) 23);
        Z0 = new a0k1(i2, (byte) 24);
        a1 = new a0k1(i2, (byte) 25);
        b1 = new a0k1(i2, (byte) 26);
        c1 = new a0k1(i2, (byte) 27);
        d1 = new a0k1(i2, (byte) 28);
        e1 = new a0k1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0k1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        mq70 mq70Var;
        up70 up70VarA;
        switch (this.a) {
            case 0:
                if (obj instanceof rih1) {
                    return null;
                }
                return (h2v) obj;
            case 1:
                return Boolean.valueOf((obj instanceof vxp0) || (obj instanceof rih1));
            case 2:
                if (obj instanceof rih1) {
                    return null;
                }
                return (vxp0) obj;
            case 3:
                return new a2v(((lzu) obj).a, 1);
            case 4:
                return ((lzu) obj).a;
            case 5:
                VideoSurfaceView videoSurfaceView = new VideoSurfaceView((Context) obj);
                videoSurfaceView.setScaleType(b3k1.d);
                return videoSurfaceView;
            case 6:
                return p2k1.a;
            case 7:
                i3k1 i3k1Var = (i3k1) obj;
                return new h3k1(null, i3k1Var.c, i3k1Var.b);
            case 8:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 9:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 10:
                return (String) obj;
            case 11:
                xkk1 xkk1Var = (xkk1) obj;
                if (xkk1Var == null || (mq70Var = xkk1Var.b) == null || (up70VarA = mq70Var.a(vp70.c)) == null) {
                    return null;
                }
                return up70VarA.a.a;
            case 12:
                return ((k3k1) obj).a;
            case 13:
                return ((k3k1) obj).a;
            case 14:
                return ((k3k1) obj).a;
            case 15:
                return ((k3k1) obj).a;
            case 16:
                return (xkk1) obj;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return Boolean.valueOf((obj instanceof ddz) || (obj instanceof rih1));
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (ddz) obj;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 22:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 23:
                return Boolean.valueOf(obj instanceof jo70);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 25:
                r5k1 r5k1Var = (r5k1) obj;
                return new s5k1(r5k1Var.a, r5k1Var.b, r5k1Var.c, r5k1Var.d, r5k1Var.e, r5k1Var.f, r5k1Var.g, r5k1Var.h, r5k1Var.i, r5k1Var.j, r5k1Var.l, r5k1Var.m, r5k1Var.k, (q5k1) null, r5k1Var.n, r5k1Var.o, 24576);
            case 26:
                u771 u771Var = ((g271) obj).a;
                c871 c871Var = u771Var.b.b;
                if (c871Var instanceof u5k1) {
                    u5k1 u5k1Var = (u5k1) c871Var;
                    return new r5k1(u771Var.a.a.a, u5k1Var.a, u5k1Var.b, u5k1Var.c, u5k1Var.d, u5k1Var.e, u5k1Var.f, u5k1Var.g, u771Var, u5k1Var.h, u5k1Var.i, u5k1Var.t, u5k1Var.X, u5k1Var.Y, u5k1Var.Z);
                }
                eg.m("Check failed.");
                return null;
            case 27:
                return new n6k1((m6k1) obj, false);
            case 28:
                return new b7k1(((y6k1) obj).a);
            default:
                if (z6k1.a[((a7k1) obj).ordinal()] == 1) {
                    return x6k1.a;
                }
                eg.o();
                return null;
        }
    }
}
