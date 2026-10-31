package p;

import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ss11 extends hab0 implements iu30 {
    public static final ss11 N0;
    public static final ss11 O0;
    public static final ss11 P0;
    public static final ss11 Q0;
    public static final ss11 R0;
    public static final ss11 S0;
    public static final ss11 T0;
    public static final ss11 U0;
    public static final ss11 V0;
    public static final ss11 W0;
    public static final ss11 X;
    public static final ss11 X0;
    public static final ss11 Y;
    public static final ss11 Y0;
    public static final ss11 Z;
    public static final ss11 Z0;
    public static final ss11 a1;
    public static final ss11 b;
    public static final ss11 b1;
    public static final ss11 c;
    public static final ss11 c1;
    public static final ss11 d;
    public static final ss11 d1;
    public static final ss11 e;
    public static final ss11 e1;
    public static final ss11 f;
    public static final ss11 g;
    public static final ss11 h;
    public static final ss11 i;
    public static final ss11 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new ss11(i2, (byte) 0);
        c = new ss11(i2, (byte) 1);
        d = new ss11(i2, (byte) 2);
        e = new ss11(i2, (byte) 3);
        f = new ss11(i2, (byte) 4);
        g = new ss11(i2, (byte) 5);
        h = new ss11(i2, (byte) 6);
        i = new ss11(i2, (byte) 7);
        t = new ss11(i2, (byte) 8);
        X = new ss11(i2, (byte) 9);
        Y = new ss11(i2, (byte) 10);
        Z = new ss11(i2, (byte) 11);
        N0 = new ss11(i2, (byte) 12);
        O0 = new ss11(i2, (byte) 13);
        P0 = new ss11(i2, (byte) 14);
        Q0 = new ss11(i2, (byte) 15);
        R0 = new ss11(i2, (byte) 16);
        S0 = new ss11(i2, (byte) 17);
        T0 = new ss11(i2, (byte) 18);
        U0 = new ss11(i2, (byte) 19);
        V0 = new ss11(i2, (byte) 20);
        W0 = new ss11(i2, (byte) 21);
        X0 = new ss11(i2, (byte) 22);
        Y0 = new ss11(i2, (byte) 23);
        Z0 = new ss11(i2, (byte) 24);
        a1 = new ss11(i2, (byte) 25);
        b1 = new ss11(i2, (byte) 26);
        c1 = new ss11(i2, (byte) 27);
        d1 = new ss11(i2, (byte) 28);
        e1 = new ss11(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ss11(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        w7x w7xVar = w7x.a;
        switch (b2) {
            case 0:
                return xa30.a;
            case 1:
                return w7xVar;
            case 2:
                return new s460(2, 1006, ((cpc) obj).a, (String) null, (String) null, (String) null, false);
            case 3:
                return w7xVar;
            case 4:
                ((Number) obj).intValue();
                return r6h1.c;
            case 5:
                return ((uv11) obj).a;
            case 6:
                qfd qfdVar = (qfd) obj;
                if ((qfdVar != null ? qfdVar.c : 0) != 3) {
                    return le2.a;
                }
                rh7 rh7Var = qfdVar.d;
                return new ke2(rh7Var != null ? rh7Var.a : 0, true);
            case 7:
                return new a2v(((uv11) obj).a, 1);
            case 8:
                h2v h2vVar = (h2v) obj;
                if (h2vVar == null) {
                    return null;
                }
                if (u890.j(h2vVar, c2v.a)) {
                    return q1v.e;
                }
                if (u890.j(h2vVar, d2v.a)) {
                    return q1v.b;
                }
                if (h2vVar instanceof e2v) {
                    return q1v.d;
                }
                if (u890.j(h2vVar, f2v.a)) {
                    return q1v.a;
                }
                if (u890.j(h2vVar, g2v.a)) {
                    return q1v.c;
                }
                eg.o();
                return null;
            case 9:
                return ((uv11) obj).a;
            case 10:
                return (iix0) obj;
            case 11:
                return Boolean.valueOf((obj instanceof qfd) || (obj instanceof rih1));
            case 12:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qfd) obj;
            case 13:
                return Boolean.valueOf((obj instanceof iix0) || (obj instanceof rih1));
            case 14:
                if (obj instanceof rih1) {
                    return null;
                }
                return (iix0) obj;
            case 15:
                return Boolean.valueOf((obj instanceof h2v) || (obj instanceof rih1));
            case 16:
                if (obj instanceof rih1) {
                    return null;
                }
                return (h2v) obj;
            case 17:
                ht11 ht11Var = (ht11) obj;
                return new cs11(88, ht11Var.b, ht11Var.c, ht11Var.d, (String) null, ht11Var.e, false);
            case 18:
                if (((bs11) obj).equals(bs11.a)) {
                    return et11.a;
                }
                eg.o();
                return null;
            case 19:
                uv11 uv11Var = (uv11) obj;
                String str = uv11Var.a;
                String str2 = uv11Var.b;
                return new yjo(str2, str2, str);
            case 20:
                ((Number) obj).intValue();
                return r6h1.c;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                return Boolean.valueOf((obj instanceof List) || (obj instanceof rih1));
            case 22:
                if (obj instanceof rih1) {
                    return null;
                }
                return (List) obj;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                return Boolean.valueOf((obj instanceof Boolean) || (obj instanceof rih1));
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Boolean) obj;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                uv11 uv11Var2 = (uv11) obj;
                return new bio0(uv11Var2.b, uv11Var2.a, uv11Var2.d);
            case 26:
                return ((uv11) obj).b;
            case 27:
                uv11 uv11Var3 = (uv11) obj;
                return new a511(uv11Var3.a, uv11Var3.b, uv11Var3.e);
            case 28:
                uv11 uv11Var4 = (uv11) obj;
                return new a511(uv11Var4.a, uv11Var4.b, uv11Var4.e);
            default:
                uv11 uv11Var5 = (uv11) obj;
                return new a511(uv11Var5.a, uv11Var5.b, uv11Var5.e);
        }
    }
}
