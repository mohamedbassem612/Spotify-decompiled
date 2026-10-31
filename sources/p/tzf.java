package p;

import android.os.Parcelable;
import com.spotify.wrapped.v1.proto.ClassicContent;
import com.spotify.wrapped.v1.proto.StoryCard;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tzf extends hab0 implements iu30 {
    public static final tzf N0;
    public static final tzf O0;
    public static final tzf P0;
    public static final tzf Q0;
    public static final tzf R0;
    public static final tzf S0;
    public static final tzf T0;
    public static final tzf U0;
    public static final tzf V0;
    public static final tzf W0;
    public static final tzf X;
    public static final tzf X0;
    public static final tzf Y;
    public static final tzf Y0;
    public static final tzf Z;
    public static final tzf Z0;
    public static final tzf a1;
    public static final tzf b;
    public static final tzf b1;
    public static final tzf c;
    public static final tzf c1;
    public static final tzf d;
    public static final tzf d1;
    public static final tzf e;
    public static final tzf e1;
    public static final tzf f;
    public static final tzf g;
    public static final tzf h;
    public static final tzf i;
    public static final tzf t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new tzf(i2, (byte) 0);
        c = new tzf(i2, (byte) 1);
        d = new tzf(i2, (byte) 2);
        e = new tzf(i2, (byte) 3);
        f = new tzf(i2, (byte) 4);
        g = new tzf(i2, (byte) 5);
        h = new tzf(i2, (byte) 6);
        i = new tzf(i2, (byte) 7);
        t = new tzf(i2, (byte) 8);
        X = new tzf(i2, (byte) 9);
        Y = new tzf(i2, (byte) 10);
        Z = new tzf(i2, (byte) 11);
        N0 = new tzf(i2, (byte) 12);
        O0 = new tzf(i2, (byte) 13);
        P0 = new tzf(i2, (byte) 14);
        Q0 = new tzf(i2, (byte) 15);
        R0 = new tzf(i2, (byte) 16);
        S0 = new tzf(i2, (byte) 17);
        T0 = new tzf(i2, (byte) 18);
        U0 = new tzf(i2, (byte) 19);
        V0 = new tzf(i2, (byte) 20);
        W0 = new tzf(i2, (byte) 21);
        X0 = new tzf(i2, (byte) 22);
        Y0 = new tzf(i2, (byte) 23);
        Z0 = new tzf(i2, (byte) 24);
        a1 = new tzf(i2, (byte) 25);
        b1 = new tzf(i2, (byte) 26);
        c1 = new tzf(i2, (byte) 27);
        d1 = new tzf(i2, (byte) 28);
        e1 = new tzf(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tzf(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        ClassicContent classicContentR;
        ClassicContent classicContentR2;
        byte b2 = this.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                b261.c((e261) obj);
                return rih1Var;
            case 1:
                b261.c((e261) obj);
                return rih1Var;
            case 2:
                b261.c((e261) obj);
                return rih1Var;
            case 3:
                return mno1.h(new mmr0[]{new mmr0("child_login_model", (v1g) obj)});
            case 4:
                b261.c((e261) obj);
                return rih1Var;
            case 5:
                b261.c((e261) obj);
                return rih1Var;
            case 6:
                b261.t((e261) obj, 0);
                return rih1Var;
            case 7:
                return ((xa5) obj).a(hm5.P(xay.e(2, irn1.l0(0.0f, 400.0f, (Object) null, 5)), xay.f(2, irn1.l0(0.0f, 400.0f, (Object) null, 5))), hm5.h(1, eqe.N0));
            case 8:
                return f4i1.f("'", (String) obj, "'");
            case 9:
                StoryCard storyCard = (StoryCard) obj;
                return Boolean.valueOf((storyCard == null || (classicContentR = storyCard.r()) == null || !classicContentR.H()) ? false : true);
            case 10:
                StoryCard storyCard2 = (StoryCard) obj;
                return Boolean.valueOf((storyCard2 == null || (classicContentR2 = storyCard2.r()) == null || !classicContentR2.I()) ? false : true);
            case 11:
                bfo bfoVar = (bfo) obj;
                return z561.f0(new syf(bfoVar, (byte) 11), new i46(bfoVar.a, (byte) 1));
            case 12:
                return mno1.h(new mmr0[]{new mmr0("parcelable", (Parcelable) obj)});
            case 13:
                return rih1Var;
            case 14:
                return new nng(31, false);
            case 15:
                return (String) obj;
            case 16:
                return (String) obj;
            case 17:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 18:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 19:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 20:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 21:
                return (String) obj;
            case 22:
                return (String) obj;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 24:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return Boolean.valueOf(obj instanceof jo70);
            case 26:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 27:
                return rih1Var;
            case 28:
                return new mpg(((cxc0) obj).f.a);
            default:
                return new g4d0((String) obj);
        }
    }
}
