package p;

import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.p000servicebasedrouter.AndroidServicebasedrouterProperties$TestHelper;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kmd1 extends hab0 implements iu30 {
    public static final kmd1 N0;
    public static final kmd1 O0;
    public static final kmd1 P0;
    public static final kmd1 Q0;
    public static final kmd1 R0;
    public static final kmd1 S0;
    public static final kmd1 T0;
    public static final kmd1 U0;
    public static final kmd1 V0;
    public static final kmd1 W0;
    public static final kmd1 X;
    public static final kmd1 X0;
    public static final kmd1 Y;
    public static final kmd1 Y0;
    public static final kmd1 Z;
    public static final kmd1 Z0;
    public static final kmd1 a1;
    public static final kmd1 b;
    public static final kmd1 b1;
    public static final kmd1 c;
    public static final kmd1 c1;
    public static final kmd1 d;
    public static final kmd1 d1;
    public static final kmd1 e;
    public static final kmd1 e1;
    public static final kmd1 f;
    public static final kmd1 g;
    public static final kmd1 h;
    public static final kmd1 i;
    public static final kmd1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new kmd1(i2, (byte) 0);
        c = new kmd1(i2, (byte) 1);
        d = new kmd1(i2, (byte) 2);
        e = new kmd1(i2, (byte) 3);
        f = new kmd1(i2, (byte) 4);
        g = new kmd1(i2, (byte) 5);
        h = new kmd1(i2, (byte) 6);
        i = new kmd1(i2, (byte) 7);
        t = new kmd1(i2, (byte) 8);
        X = new kmd1(i2, (byte) 9);
        Y = new kmd1(i2, (byte) 10);
        Z = new kmd1(i2, (byte) 11);
        N0 = new kmd1(i2, (byte) 12);
        O0 = new kmd1(i2, (byte) 13);
        P0 = new kmd1(i2, (byte) 14);
        Q0 = new kmd1(i2, (byte) 15);
        R0 = new kmd1(i2, (byte) 16);
        S0 = new kmd1(i2, (byte) 17);
        T0 = new kmd1(i2, (byte) 18);
        U0 = new kmd1(i2, (byte) 19);
        V0 = new kmd1(i2, (byte) 20);
        W0 = new kmd1(i2, (byte) 21);
        X0 = new kmd1(i2, (byte) 22);
        Y0 = new kmd1(i2, (byte) 23);
        Z0 = new kmd1(i2, (byte) 24);
        a1 = new kmd1(i2, (byte) 25);
        b1 = new kmd1(i2, (byte) 26);
        c1 = new kmd1(i2, (byte) 27);
        d1 = new kmd1(i2, (byte) 28);
        e1 = new kmd1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kmd1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        w7x w7xVar = w7x.a;
        switch (b2) {
            case 0:
                hld1 hld1Var = (hld1) obj;
                return new lk11(hld1Var.a, hld1Var.b, false);
            case 1:
                return Collections.singleton(((hld1) obj).a);
            case 2:
                return b7x.a;
            case 3:
                lld1 lld1Var = (lld1) obj;
                return new lk11(lld1Var.a, lld1Var.b, false);
            case 4:
                return Collections.singleton(((lld1) obj).a);
            case 5:
                return fhz.a;
            case 6:
                return w7xVar;
            case 7:
                return k8x.a;
            case 8:
                return w7xVar;
            case 9:
                return rih1.a;
            case 10:
                return new rxc0((String) obj);
            case 11:
                i1r i1rVar = (k1r) obj;
                if (i1rVar instanceof h1r) {
                    return Boolean.FALSE;
                }
                if (i1rVar instanceof i1r) {
                    return Boolean.valueOf(u890.j(((qxc0) i1rVar.a).X.get("is_genpods"), AndroidServicebasedrouterProperties$TestHelper.TRUE));
                }
                if (i1rVar.equals(j1r.a)) {
                    return null;
                }
                eg.o();
                return null;
            case 12:
                return Boolean.valueOf(obj instanceof qxc0);
            case 13:
                return (k1r) obj;
            case 14:
                Map map = ((ad2) obj).a;
                LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), (id2) entry.getValue());
                }
                return linkedHashMap;
            case 15:
                return w7xVar;
            case 16:
                return o7h.p1(((a1k) obj).b);
            case 17:
                return o7h.p1(((g1k) obj).c);
            case 18:
                return w7xVar;
            case 19:
                return w7xVar;
            case 20:
                return w7xVar;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                return w7xVar;
            case 22:
                return w7xVar;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                return w7xVar;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                return w7xVar;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return Collections.singleton(((b1k) obj).a.a);
            case 26:
                return w7xVar;
            case 27:
                return new zx6((r6h1) obj, (byte) 2);
            case 28:
                ((Number) obj).intValue();
                return null;
            default:
                return ((ito) obj).b;
        }
    }
}
