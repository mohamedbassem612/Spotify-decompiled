package p;

import com.spotify.scrollsita.v1.Section;
import com.spotify.scrollsita.v1.ShowDescription;
import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class axb1 extends hab0 implements iu30 {
    public static final axb1 N0;
    public static final axb1 O0;
    public static final axb1 P0;
    public static final axb1 Q0;
    public static final axb1 R0;
    public static final axb1 S0;
    public static final axb1 T0;
    public static final axb1 U0;
    public static final axb1 V0;
    public static final axb1 W0;
    public static final axb1 X;
    public static final axb1 X0;
    public static final axb1 Y;
    public static final axb1 Y0;
    public static final axb1 Z;
    public static final axb1 Z0;
    public static final axb1 a1;
    public static final axb1 b;
    public static final axb1 b1;
    public static final axb1 c;
    public static final axb1 c1;
    public static final axb1 d;
    public static final axb1 d1;
    public static final axb1 e;
    public static final axb1 e1;
    public static final axb1 f;
    public static final axb1 g;
    public static final axb1 h;
    public static final axb1 i;
    public static final axb1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new axb1(i2, (byte) 0);
        c = new axb1(i2, (byte) 1);
        d = new axb1(i2, (byte) 2);
        e = new axb1(i2, (byte) 3);
        f = new axb1(i2, (byte) 4);
        g = new axb1(i2, (byte) 5);
        h = new axb1(i2, (byte) 6);
        i = new axb1(i2, (byte) 7);
        t = new axb1(i2, (byte) 8);
        X = new axb1(i2, (byte) 9);
        Y = new axb1(i2, (byte) 10);
        Z = new axb1(i2, (byte) 11);
        N0 = new axb1(i2, (byte) 12);
        O0 = new axb1(i2, (byte) 13);
        P0 = new axb1(i2, (byte) 14);
        Q0 = new axb1(i2, (byte) 15);
        R0 = new axb1(i2, (byte) 16);
        S0 = new axb1(i2, (byte) 17);
        T0 = new axb1(i2, (byte) 18);
        U0 = new axb1(i2, (byte) 19);
        V0 = new axb1(i2, (byte) 20);
        W0 = new axb1(i2, (byte) 21);
        X0 = new axb1(i2, (byte) 22);
        Y0 = new axb1(i2, (byte) 23);
        Z0 = new axb1(i2, (byte) 24);
        a1 = new axb1(i2, (byte) 25);
        b1 = new axb1(i2, (byte) 26);
        c1 = new axb1(i2, (byte) 27);
        d1 = new axb1(i2, (byte) 28);
        e1 = new axb1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ axb1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        boolean z = true;
        z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return new xwb1();
            case 1:
                return new myb1("MESSAGING_LYRICS");
            case 2:
                return "country_code";
            case 3:
                if (!(obj instanceof String) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                if (obj instanceof rih1) {
                    return null;
                }
                return (String) obj;
            case 5:
                return Boolean.valueOf(obj instanceof nyb1);
            case 6:
                if (obj != null) {
                    return (nyb1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.stickers.datasource.StickersPackTable.Item");
                return null;
            case 7:
                return new mxb1(z6x.a);
            case 8:
                return new myb1("ENHANCED_LYRICS_CARD");
            case 9:
                List list = ((nyb1) obj).a;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    r7h.W(((mwb1) it.next()).c, arrayList);
                }
                return new oxb1(o7h.j0(arrayList));
            case 10:
                return Boolean.valueOf(obj instanceof nyb1);
            case 11:
                if (obj != null) {
                    return (nyb1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.stickers.datasource.StickersPackTable.Item");
                return null;
            case 12:
                ((Number) obj).intValue();
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-connect-menu";
                x6h1VarI.f = "6.6.0";
                x6h1VarI.g = "22.0.0";
                y6h1 y6h1VarA = x6h1VarI.a();
                Collections.singletonList("connect/devicepicker");
                r6h1 r6h1Var = r6h1.c;
                return new r6h1(kk0.l(y6h1VarA), (u8h1) null);
            case 13:
                return new jpt0(hpt0.a, 2);
            case 14:
                return new azb1(false, new ub10(-7829368, -7829368), false);
            case 15:
                ((qtr) obj).b(new eri0(5, (lnm) null, (byte) 16));
                return rih1Var;
            case 16:
                return new n0c1((uqo) obj, null);
            case 17:
                ((qtr) obj).d(new qd81(true ? 1 : 0, (byte) 17), new t491((byte) 19, 2, false));
                return rih1Var;
            case 18:
                return rih1Var;
            case 19:
                return new j1c1((uqo) obj, Collections.singletonList(new k1c1("/storage/emulated/0", 248, true)), null, new gax(2131961690, (String) null), null);
            case 20:
                return rih1Var;
            case 21:
                return rih1Var;
            case 22:
                return rih1Var;
            case 23:
                return rih1Var;
            case 24:
                return StoryCard.x((byte[]) obj);
            case 25:
                return ((StoryCard) obj).toByteArray();
            case 26:
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                String str = (String) obj;
                if (str.length() <= 0) {
                    return str;
                }
                return ((Object) String.valueOf(str.charAt(0)).toUpperCase(Locale.ROOT)) + str.substring(1);
            case 28:
                Section section = (Section) obj;
                if (!section.W() || section.t().getEntityUri().length() <= 0) {
                    return null;
                }
                return new wwo0(section.t().getEntityUri());
            default:
                Section section2 = (Section) obj;
                if (!section2.o0()) {
                    return null;
                }
                ShowDescription showDescriptionL = section2.L();
                return new yxo0(showDescriptionL.getEntityUri(), Collections.singletonList(showDescriptionL.getEntityUri()), showDescriptionL.o().getTitle());
        }
    }
}
