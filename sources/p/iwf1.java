package p;

import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class iwf1 extends hab0 implements iu30 {
    public static final iwf1 N0;
    public static final iwf1 O0;
    public static final iwf1 P0;
    public static final iwf1 Q0;
    public static final iwf1 R0;
    public static final iwf1 S0;
    public static final iwf1 T0;
    public static final iwf1 U0;
    public static final iwf1 V0;
    public static final iwf1 W0;
    public static final iwf1 X;
    public static final iwf1 X0;
    public static final iwf1 Y;
    public static final iwf1 Y0;
    public static final iwf1 Z;
    public static final iwf1 Z0;
    public static final iwf1 a1;
    public static final iwf1 b;
    public static final iwf1 b1;
    public static final iwf1 c;
    public static final iwf1 c1;
    public static final iwf1 d;
    public static final iwf1 d1;
    public static final iwf1 e;
    public static final iwf1 e1;
    public static final iwf1 f;
    public static final iwf1 g;
    public static final iwf1 h;
    public static final iwf1 i;
    public static final iwf1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new iwf1(i2, (byte) 0);
        c = new iwf1(i2, (byte) 1);
        d = new iwf1(i2, (byte) 2);
        e = new iwf1(i2, (byte) 3);
        f = new iwf1(i2, (byte) 4);
        g = new iwf1(i2, (byte) 5);
        h = new iwf1(i2, (byte) 6);
        i = new iwf1(i2, (byte) 7);
        t = new iwf1(i2, (byte) 8);
        X = new iwf1(i2, (byte) 9);
        Y = new iwf1(i2, (byte) 10);
        Z = new iwf1(i2, (byte) 11);
        N0 = new iwf1(i2, (byte) 12);
        O0 = new iwf1(i2, (byte) 13);
        P0 = new iwf1(i2, (byte) 14);
        Q0 = new iwf1(i2, (byte) 15);
        R0 = new iwf1(i2, (byte) 16);
        S0 = new iwf1(i2, (byte) 17);
        T0 = new iwf1(i2, (byte) 18);
        U0 = new iwf1(i2, (byte) 19);
        V0 = new iwf1(i2, (byte) 20);
        W0 = new iwf1(i2, (byte) 21);
        X0 = new iwf1(i2, (byte) 22);
        Y0 = new iwf1(i2, (byte) 23);
        Z0 = new iwf1(i2, (byte) 24);
        a1 = new iwf1(i2, (byte) 25);
        b1 = new iwf1(i2, (byte) 26);
        c1 = new iwf1(i2, (byte) 27);
        d1 = new iwf1(i2, (byte) 28);
        e1 = new iwf1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iwf1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 0:
                return (k1r) obj;
            case 1:
                return Boolean.valueOf(obj instanceof String);
            case 2:
                return (k1r) obj;
            case 3:
                return Boolean.valueOf(obj instanceof vnb1);
            case 4:
                return (k1r) obj;
            case 5:
                return Boolean.valueOf(obj instanceof vnb1);
            case 6:
                return ((uv11) obj).a;
            case 7:
                return ((uv11) obj).a;
            case 8:
                return ((uv11) obj).a;
            case 9:
                return ((ho70) obj).a;
            case 10:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 12:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 14:
                if (!(obj instanceof hll) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 15:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hll) obj;
            case 16:
                mfr0 mfr0Var = (mfr0) obj;
                return new gy6(mfr0Var.a, mfr0Var.b, mfr0Var.c, mfr0Var.d);
            case 17:
                return Collections.singleton(((mfr0) obj).a);
            case 18:
                return Collections.singleton(((mfr0) obj).a);
            case 19:
                return Collections.singleton(((mfr0) obj).a);
            case 20:
                return Collections.singleton(((mfr0) obj).a);
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                return Collections.singleton(((mfr0) obj).a);
            case 22:
                return ((hyf1) obj).a;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                return ((hyf1) obj).a;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                return ((hyf1) obj).a;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return (String) obj;
            case 26:
                return (qtt0) obj;
            case 27:
                return ((hyf1) obj).a;
            case 28:
                return (zoy0) obj;
            default:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qtt0) obj;
        }
    }
}
