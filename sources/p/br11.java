package p;

import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class br11 extends hab0 implements iu30 {
    public static final br11 N0;
    public static final br11 O0;
    public static final br11 P0;
    public static final br11 Q0;
    public static final br11 R0;
    public static final br11 S0;
    public static final br11 T0;
    public static final br11 U0;
    public static final br11 V0;
    public static final br11 W0;
    public static final br11 X;
    public static final br11 X0;
    public static final br11 Y;
    public static final br11 Y0;
    public static final br11 Z;
    public static final br11 Z0;
    public static final br11 a1;
    public static final br11 b;
    public static final br11 b1;
    public static final br11 c;
    public static final br11 c1;
    public static final br11 d;
    public static final br11 d1;
    public static final br11 e;
    public static final br11 e1;
    public static final br11 f;
    public static final br11 g;
    public static final br11 h;
    public static final br11 i;
    public static final br11 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new br11(i2, (byte) 0);
        c = new br11(i2, (byte) 1);
        d = new br11(i2, (byte) 2);
        e = new br11(i2, (byte) 3);
        f = new br11(i2, (byte) 4);
        g = new br11(i2, (byte) 5);
        h = new br11(i2, (byte) 6);
        i = new br11(i2, (byte) 7);
        t = new br11(i2, (byte) 8);
        X = new br11(i2, (byte) 9);
        Y = new br11(i2, (byte) 10);
        Z = new br11(i2, (byte) 11);
        N0 = new br11(i2, (byte) 12);
        O0 = new br11(i2, (byte) 13);
        P0 = new br11(i2, (byte) 14);
        Q0 = new br11(i2, (byte) 15);
        R0 = new br11(i2, (byte) 16);
        S0 = new br11(i2, (byte) 17);
        T0 = new br11(i2, (byte) 18);
        U0 = new br11(i2, (byte) 19);
        V0 = new br11(i2, (byte) 20);
        W0 = new br11(i2, (byte) 21);
        X0 = new br11(i2, (byte) 22);
        Y0 = new br11(i2, (byte) 23);
        Z0 = new br11(i2, (byte) 24);
        a1 = new br11(i2, (byte) 25);
        b1 = new br11(i2, (byte) 26);
        c1 = new br11(i2, (byte) 27);
        d1 = new br11(i2, (byte) 28);
        e1 = new br11(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ br11(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        boolean z = true;
        w7x w7xVar = w7x.a;
        switch (b2) {
            case 0:
                return (List) obj;
            case 1:
                return Boolean.valueOf(obj instanceof qxc0);
            case 2:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 3:
                return new rxc0((String) obj);
            case 4:
                return (qxc0) obj;
            case 5:
                return Boolean.valueOf(obj instanceof qxc0);
            case 6:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 7:
                return new rr11((String) null);
            case 8:
                uv11 uv11Var = (uv11) obj;
                String str = uv11Var.a;
                String str2 = uv11Var.b;
                return new yjo(str2, str2, str);
            case 9:
                gy6 gy6Var = (gy6) obj;
                return new uv11(gy6Var.a, gy6Var.b, Integer.valueOf(gy6Var.c), gy6Var.d, (cqs0) null, (tv11) null, 0, 240);
            case 10:
                return ((uv11) obj).a;
            case 11:
                return (iix0) obj;
            case 12:
                if (!(obj instanceof Boolean) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Boolean) obj;
            case 14:
                uv11 uv11Var2 = (uv11) obj;
                String str3 = uv11Var2.d;
                if (str3 == null) {
                    return null;
                }
                String str4 = str3.length() > 0 ? str3 : null;
                if (str4 != null) {
                    return new eo01(uv11Var2.b, uv11Var2.a, str4, uv11Var2.g, uv11Var2.e);
                }
                return null;
            case 15:
                Boolean bool = (Boolean) obj;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case 16:
                if (!(obj instanceof iix0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 17:
                if (obj instanceof rih1) {
                    return null;
                }
                return (iix0) obj;
            case 18:
                return ((Boolean) obj).booleanValue() ? l6u.a : j6u.a;
            case 19:
                return new kdn0(Boolean.TRUE);
            case 20:
                return new kdn0(Boolean.TRUE);
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                return Collections.singleton(((uv11) obj).a);
            case 22:
                return Collections.singleton(((uv11) obj).a);
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                apc apcVar = (apc) obj;
                return new uv11(apcVar.a, apcVar.b, (Integer) null, apcVar.c, (cqs0) null, (tv11) null, 0, 244);
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                apc apcVar2 = (apc) obj;
                return new uv11(apcVar2.a, apcVar2.b, (Integer) null, apcVar2.c, (cqs0) null, (tv11) null, 0, 244);
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                apc apcVar3 = (apc) obj;
                return sqg0.J(new mmr0[]{new mmr0(sv11.a, Collections.singleton(apcVar3.a)), new mmr0(sv11.b, Collections.singleton(apcVar3.b))});
            case 26:
                return xa30.a;
            case 27:
                return w7xVar;
            case 28:
                return new s460(2, 1006, ((cpc) obj).a, (String) null, (String) null, (String) null, false);
            default:
                return w7xVar;
        }
    }
}
