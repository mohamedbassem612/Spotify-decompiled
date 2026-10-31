package p;

import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class db8 extends hab0 implements iu30 {
    public static final db8 N0;
    public static final db8 O0;
    public static final db8 P0;
    public static final db8 Q0;
    public static final db8 R0;
    public static final db8 S0;
    public static final db8 T0;
    public static final db8 U0;
    public static final db8 V0;
    public static final db8 W0;
    public static final db8 X;
    public static final db8 X0;
    public static final db8 Y;
    public static final db8 Y0;
    public static final db8 Z;
    public static final db8 Z0;
    public static final db8 a1;
    public static final db8 b;
    public static final db8 b1;
    public static final db8 c;
    public static final db8 c1;
    public static final db8 d;
    public static final db8 d1;
    public static final db8 e;
    public static final db8 e1;
    public static final db8 f;
    public static final db8 g;
    public static final db8 h;
    public static final db8 i;
    public static final db8 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new db8(i2, (byte) 0);
        c = new db8(i2, (byte) 1);
        d = new db8(i2, (byte) 2);
        e = new db8(i2, (byte) 3);
        f = new db8(i2, (byte) 4);
        g = new db8(i2, (byte) 5);
        h = new db8(i2, (byte) 6);
        i = new db8(i2, (byte) 7);
        t = new db8(i2, (byte) 8);
        X = new db8(i2, (byte) 9);
        Y = new db8(i2, (byte) 10);
        Z = new db8(i2, (byte) 11);
        N0 = new db8(i2, (byte) 12);
        O0 = new db8(i2, (byte) 13);
        P0 = new db8(i2, (byte) 14);
        Q0 = new db8(i2, (byte) 15);
        R0 = new db8(i2, (byte) 16);
        S0 = new db8(i2, (byte) 17);
        T0 = new db8(i2, (byte) 18);
        U0 = new db8(i2, (byte) 19);
        V0 = new db8(i2, (byte) 20);
        W0 = new db8(i2, (byte) 21);
        X0 = new db8(i2, (byte) 22);
        Y0 = new db8(i2, (byte) 23);
        Z0 = new db8(i2, (byte) 24);
        a1 = new db8(i2, (byte) 25);
        b1 = new db8(i2, (byte) 26);
        c1 = new db8(i2, (byte) 27);
        d1 = new db8(i2, (byte) 28);
        e1 = new db8(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ db8(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hll) obj;
            case 1:
                if (!(obj instanceof pnt) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                if (obj instanceof rih1) {
                    return null;
                }
                return (pnt) obj;
            case 3:
                if (!(obj instanceof a7q0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                if (!(obj instanceof List) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                if (obj instanceof rih1) {
                    return null;
                }
                return (List) obj;
            case 6:
                if (!(obj instanceof Boolean) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Boolean) obj;
            case 8:
                uv11 uv11Var = (uv11) obj;
                return new bio0(uv11Var.b, uv11Var.a, uv11Var.d);
            case 9:
                return ((uv11) obj).b;
            case 10:
                return new sa8(((ux11) obj).b);
            case 11:
                return rih1Var;
            case 12:
                return rih1Var;
            case 13:
                return w7x.a;
            case 14:
                b261.c((e261) obj);
                return rih1Var;
            case 15:
                return Collections.singleton(((jer0) obj).a);
            case 16:
                return Collections.singleton(((jer0) obj).a);
            case 17:
                return Collections.singleton(((jer0) obj).a);
            case 18:
                return Collections.singleton(((jer0) obj).a);
            case 19:
                return Collections.singleton(((jer0) obj).a);
            case 20:
                return Collections.singleton(((jer0) obj).a);
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                return Collections.singleton(((jer0) obj).a);
            case 22:
                return Collections.singleton(((jer0) obj).a);
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                xb8 xb8Var = (xb8) obj;
                vb8 vb8Var = xb8Var.a;
                return new jc8(vb8Var.b, vb8Var.c, vb8Var.d, oqn1.p(vb8Var.e), vb8Var.f, vb8Var.j, xb8Var.b, vb8Var.i);
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                return new xb8((vb8) obj, false);
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return ((wb8) obj).a;
            case 26:
                return (xkk1) obj;
            case 27:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            default:
                ker0 ker0Var = (ker0) obj;
                return new mc8(ker0Var.a, ker0Var.b);
        }
    }
}
