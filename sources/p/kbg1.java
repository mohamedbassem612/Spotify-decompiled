package p;

import android.os.Parcelable;
import com.spotify.scrollsita.v1.Section;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kbg1 extends hab0 implements iu30 {
    public static final kbg1 N0;
    public static final kbg1 O0;
    public static final kbg1 P0;
    public static final kbg1 Q0;
    public static final kbg1 R0;
    public static final kbg1 S0;
    public static final kbg1 T0;
    public static final kbg1 U0;
    public static final kbg1 V0;
    public static final kbg1 W0;
    public static final kbg1 X;
    public static final kbg1 X0;
    public static final kbg1 Y;
    public static final kbg1 Y0;
    public static final kbg1 Z;
    public static final kbg1 Z0;
    public static final kbg1 a1;
    public static final kbg1 b;
    public static final kbg1 b1;
    public static final kbg1 c;
    public static final kbg1 c1;
    public static final kbg1 d;
    public static final kbg1 d1;
    public static final kbg1 e;
    public static final kbg1 e1;
    public static final kbg1 f;
    public static final kbg1 g;
    public static final kbg1 h;
    public static final kbg1 i;
    public static final kbg1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new kbg1(i2, (byte) 0);
        c = new kbg1(i2, (byte) 1);
        d = new kbg1(i2, (byte) 2);
        e = new kbg1(i2, (byte) 3);
        f = new kbg1(i2, (byte) 4);
        g = new kbg1(i2, (byte) 5);
        h = new kbg1(i2, (byte) 6);
        i = new kbg1(i2, (byte) 7);
        t = new kbg1(i2, (byte) 8);
        X = new kbg1(i2, (byte) 9);
        Y = new kbg1(i2, (byte) 10);
        Z = new kbg1(i2, (byte) 11);
        N0 = new kbg1(i2, (byte) 12);
        O0 = new kbg1(i2, (byte) 13);
        P0 = new kbg1(i2, (byte) 14);
        Q0 = new kbg1(i2, (byte) 15);
        R0 = new kbg1(i2, (byte) 16);
        S0 = new kbg1(i2, (byte) 17);
        T0 = new kbg1(i2, (byte) 18);
        U0 = new kbg1(i2, (byte) 19);
        V0 = new kbg1(i2, (byte) 20);
        W0 = new kbg1(i2, (byte) 21);
        X0 = new kbg1(i2, (byte) 22);
        Y0 = new kbg1(i2, (byte) 23);
        Z0 = new kbg1(i2, (byte) 24);
        a1 = new kbg1(i2, (byte) 25);
        b1 = new kbg1(i2, (byte) 26);
        c1 = new kbg1(i2, (byte) 27);
        d1 = new kbg1(i2, (byte) 28);
        e1 = new kbg1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kbg1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return Integer.valueOf(obj != null ? obj.hashCode() : 0);
            case 1:
                ((Number) obj).intValue();
                return null;
            case 2:
                return Integer.valueOf(obj != null ? obj.hashCode() : 0);
            case 3:
                ((Number) obj).intValue();
                return null;
            case 4:
                ((Number) obj).intValue();
                return null;
            case 5:
                return Integer.valueOf(obj != null ? obj.hashCode() : 0);
            case 6:
                ((Number) obj).intValue();
                return null;
            case 7:
                return Integer.valueOf(obj != null ? obj.hashCode() : 0);
            case 8:
                ((Number) obj).intValue();
                return null;
            case 9:
                return Integer.valueOf(obj != null ? obj.hashCode() : 0);
            case 10:
                ((Number) obj).intValue();
                return null;
            case 11:
                return ((l561) obj).a;
            case 12:
                return mno1.h(new mmr0[]{new mmr0("parcelable", (Parcelable) obj)});
            case 13:
                ((xas) obj).a(N0, lbg1.c);
                return rih1Var;
            case 14:
                return new ga01(10, ((vcg1) obj).a, (String) null, false);
            case 15:
                return new ycg1((k8g1) obj);
            case 16:
                return (ga01) obj;
            case 17:
                return new ycg1((k8g1) obj);
            case 18:
                return Boolean.valueOf(obj instanceof k8g1);
            case 19:
                if (obj != null) {
                    return (k8g1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.transcript.model.Transcript");
                return null;
            case 20:
                return Boolean.valueOf(obj instanceof k8g1);
            case 21:
                if (obj != null) {
                    return (k8g1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.transcript.model.Transcript");
                return null;
            case 22:
                z6x z6xVar = z6x.a;
                return new xdg1(z6xVar, new g061(z6xVar), g5e0.a);
            case 23:
                return mno1.h(new mmr0[]{new mmr0("parcelable", (Parcelable) obj)});
            case 24:
                ((xas) obj).a(Y0, lbg1.d);
                return rih1Var;
            case 25:
                return new ga01(10, ((wdg1) obj).a, (String) null, false);
            case 26:
                return new ydg1((k8g1) obj);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return (ga01) obj;
            case 28:
                return new ydg1((k8g1) obj);
            default:
                return Boolean.valueOf(obj instanceof k8g1);
        }
    }
}
