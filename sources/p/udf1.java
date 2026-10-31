package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class udf1 extends hab0 implements iu30 {
    public static final udf1 N0;
    public static final udf1 O0;
    public static final udf1 P0;
    public static final udf1 Q0;
    public static final udf1 R0;
    public static final udf1 S0;
    public static final udf1 T0;
    public static final udf1 U0;
    public static final udf1 V0;
    public static final udf1 W0;
    public static final udf1 X;
    public static final udf1 X0;
    public static final udf1 Y;
    public static final udf1 Y0;
    public static final udf1 Z;
    public static final udf1 Z0;
    public static final udf1 a1;
    public static final udf1 b;
    public static final udf1 b1;
    public static final udf1 c;
    public static final udf1 c1;
    public static final udf1 d;
    public static final udf1 d1;
    public static final udf1 e;
    public static final udf1 e1;
    public static final udf1 f;
    public static final udf1 g;
    public static final udf1 h;
    public static final udf1 i;
    public static final udf1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new udf1(i2, (byte) 0);
        c = new udf1(i2, (byte) 1);
        d = new udf1(i2, (byte) 2);
        e = new udf1(i2, (byte) 3);
        f = new udf1(i2, (byte) 4);
        g = new udf1(i2, (byte) 5);
        h = new udf1(i2, (byte) 6);
        i = new udf1(i2, (byte) 7);
        t = new udf1(i2, (byte) 8);
        X = new udf1(i2, (byte) 9);
        Y = new udf1(i2, (byte) 10);
        Z = new udf1(i2, (byte) 11);
        N0 = new udf1(i2, (byte) 12);
        O0 = new udf1(i2, (byte) 13);
        P0 = new udf1(i2, (byte) 14);
        Q0 = new udf1(i2, (byte) 15);
        R0 = new udf1(i2, (byte) 16);
        S0 = new udf1(i2, (byte) 17);
        T0 = new udf1(i2, (byte) 18);
        U0 = new udf1(i2, (byte) 19);
        V0 = new udf1(i2, (byte) 20);
        W0 = new udf1(i2, (byte) 21);
        X0 = new udf1(i2, (byte) 22);
        Y0 = new udf1(i2, (byte) 23);
        Z0 = new udf1(i2, (byte) 24);
        a1 = new udf1(i2, (byte) 25);
        b1 = new udf1(i2, (byte) 26);
        c1 = new udf1(i2, (byte) 27);
        d1 = new udf1(i2, (byte) 28);
        e1 = new udf1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ udf1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return ((gef1) obj).a;
            case 1:
                return ((gef1) obj).a;
            case 2:
                return rih1Var;
            case 3:
                List listD1 = o7h.d1(((oef1) obj).d, 3);
                ArrayList arrayList = new ArrayList(q7h.U(listD1, 10));
                Iterator it = listD1.iterator();
                while (it.hasNext()) {
                    arrayList.add(new gef1((String) it.next()));
                }
                return arrayList;
            case 4:
                kfr0 kfr0Var = (kfr0) obj;
                return new egf1(kfr0Var.a, new gy6(kfr0Var.c, kfr0Var.b, kfr0Var.d, kfr0Var.e));
            case 5:
                return Collections.singleton(((kfr0) obj).c);
            case 6:
                return Collections.singleton(((kfr0) obj).c);
            case 7:
                return Collections.singleton(((kfr0) obj).c);
            case 8:
                return Collections.singleton(((kfr0) obj).c);
            case 9:
                return Collections.singleton(((kfr0) obj).c);
            case 10:
                int iOrdinal = ((gif1) obj).ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    return iif1.a;
                }
                eg.o();
                return null;
            case 11:
                return ((rjf1) obj).a;
            case 12:
                return new gkf1(new ikf1((ContextTrack) null, (ContextTrack) null, (ContextTrack) null), new hkf1(false, false, false, false, false, false, false), true, false, false);
            case 13:
                return (gkf1) obj;
            case 14:
                return (ckf1) obj;
            case 15:
                return rih1Var;
            case 16:
                return new blf1(((lfr0) obj).a);
            case 17:
                return o7h.p1(((lfr0) obj).a);
            case 18:
                return clf1.a;
            case 19:
                return ((o3m0) obj).l();
            case 20:
                return rih1Var;
            case 21:
                return rih1Var;
            case 22:
                return ((nmf1) obj).a;
            case 23:
                return (f7a1) obj;
            case 24:
                return ((b7a1) obj).d;
            case 25:
                return Boolean.valueOf(((e7a1) obj).b);
            case 26:
                return ((e7a1) obj).a;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return Boolean.valueOf((obj instanceof f7a1) || (obj instanceof rih1));
            case 28:
                if (obj instanceof rih1) {
                    return null;
                }
                return (f7a1) obj;
            default:
                return Boolean.valueOf((obj instanceof eid) || (obj instanceof rih1));
        }
    }
}
