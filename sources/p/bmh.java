package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bmh extends hab0 implements iu30 {
    public static final bmh N0;
    public static final bmh O0;
    public static final bmh P0;
    public static final bmh Q0;
    public static final bmh R0;
    public static final bmh S0;
    public static final bmh T0;
    public static final bmh U0;
    public static final bmh V0;
    public static final bmh W0;
    public static final bmh X;
    public static final bmh X0;
    public static final bmh Y;
    public static final bmh Y0;
    public static final bmh Z;
    public static final bmh Z0;
    public static final bmh a1;
    public static final bmh b;
    public static final bmh b1;
    public static final bmh c;
    public static final bmh c1;
    public static final bmh d;
    public static final bmh d1;
    public static final bmh e;
    public static final bmh e1;
    public static final bmh f;
    public static final bmh g;
    public static final bmh h;
    public static final bmh i;
    public static final bmh t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new bmh(i2, (byte) 0);
        c = new bmh(i2, (byte) 1);
        d = new bmh(i2, (byte) 2);
        e = new bmh(i2, (byte) 3);
        f = new bmh(i2, (byte) 4);
        g = new bmh(i2, (byte) 5);
        h = new bmh(i2, (byte) 6);
        i = new bmh(i2, (byte) 7);
        t = new bmh(i2, (byte) 8);
        X = new bmh(i2, (byte) 9);
        Y = new bmh(i2, (byte) 10);
        Z = new bmh(i2, (byte) 11);
        N0 = new bmh(i2, (byte) 12);
        O0 = new bmh(i2, (byte) 13);
        P0 = new bmh(i2, (byte) 14);
        Q0 = new bmh(i2, (byte) 15);
        R0 = new bmh(i2, (byte) 16);
        S0 = new bmh(i2, (byte) 17);
        T0 = new bmh(i2, (byte) 18);
        U0 = new bmh(i2, (byte) 19);
        V0 = new bmh(i2, (byte) 20);
        W0 = new bmh(i2, (byte) 21);
        X0 = new bmh(i2, (byte) 22);
        Y0 = new bmh(i2, (byte) 23);
        Z0 = new bmh(i2, (byte) 24);
        a1 = new bmh(i2, (byte) 25);
        b1 = new bmh(i2, (byte) 26);
        c1 = new bmh(i2, (byte) 27);
        d1 = new bmh(i2, (byte) 28);
        e1 = new bmh(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bmh(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        boolean z = true;
        t2b t2bVar = lgo1.b;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return new mld((String) obj);
            case 1:
                return (nqm) obj;
            case 2:
                return Boolean.valueOf(obj instanceof nqm);
            case 3:
                if (obj != null) {
                    return (nqm) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.contribution.model.ContributionKindCapabilities");
                return null;
            case 4:
                return new qeh(((qwo0) obj).a);
            case 5:
                return w7x.a;
            case 6:
                return rih1Var;
            case 7:
                b261.d((e261) obj);
                return rih1Var;
            case 8:
                b261.d((e261) obj);
                return rih1Var;
            case 9:
                b261.c((e261) obj);
                return rih1Var;
            case 10:
                c261.a((e261) obj);
                return rih1Var;
            case 11:
                b261.c((e261) obj);
                return rih1Var;
            case 12:
                return fuh.a;
            case 13:
                return ((zth) obj).a;
            case 14:
                return ((zth) obj).a;
            case 15:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 16:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 17:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 18:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 19:
                b261.c((e261) obj);
                return rih1Var;
            case 20:
                ((n161) obj).b(t2bVar, "TEST_TAG_COMPACT_METADATA_PLAY_INACTIVE_ARTWORK");
                return rih1Var;
            case 21:
                ((n161) obj).b(t2bVar, "TEST_TAG_PLAY_PAUSE_BUTTON");
                return rih1Var;
            case 22:
                ((n161) obj).b(t2bVar, "TEST_TAG_COMPACT_METADATA_PLAY_ARTWORK");
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((n161) obj).b(t2bVar, "TEST_TAG_ARTWORK");
                return rih1Var;
            case 24:
                return new lvh(((jvh) obj).a);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return (String) obj;
            case 26:
                return (String) obj;
            case 27:
                return (String) obj;
            case 28:
                return ((ho70) obj).a;
            default:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
