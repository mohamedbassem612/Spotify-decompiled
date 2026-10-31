package p;

import com.spotify.concertpageview.v1.Row;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dbm0 extends hab0 implements vu30 {
    public static final dbm0 N0;
    public static final dbm0 O0;
    public static final dbm0 P0;
    public static final dbm0 Q0;
    public static final dbm0 R0;
    public static final dbm0 S0;
    public static final dbm0 T0;
    public static final dbm0 U0;
    public static final dbm0 V0;
    public static final dbm0 W0;
    public static final dbm0 X;
    public static final dbm0 X0;
    public static final dbm0 Y;
    public static final dbm0 Y0;
    public static final dbm0 Z;
    public static final dbm0 Z0;
    public static final dbm0 a1;
    public static final dbm0 b;
    public static final dbm0 b1;
    public static final dbm0 c;
    public static final dbm0 c1;
    public static final dbm0 d;
    public static final dbm0 d1;
    public static final dbm0 e;
    public static final dbm0 e1;
    public static final dbm0 f;
    public static final dbm0 g;
    public static final dbm0 h;
    public static final dbm0 i;
    public static final dbm0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new dbm0(i2, (byte) 0);
        c = new dbm0(i2, (byte) 1);
        d = new dbm0(i2, (byte) 2);
        e = new dbm0(i2, (byte) 3);
        f = new dbm0(i2, (byte) 4);
        g = new dbm0(i2, (byte) 5);
        h = new dbm0(i2, (byte) 6);
        i = new dbm0(i2, (byte) 7);
        t = new dbm0(i2, (byte) 8);
        X = new dbm0(i2, (byte) 9);
        Y = new dbm0(i2, (byte) 10);
        Z = new dbm0(i2, (byte) 11);
        N0 = new dbm0(i2, (byte) 12);
        O0 = new dbm0(i2, (byte) 13);
        P0 = new dbm0(i2, (byte) 14);
        Q0 = new dbm0(i2, (byte) 15);
        R0 = new dbm0(i2, (byte) 16);
        S0 = new dbm0(i2, (byte) 17);
        T0 = new dbm0(i2, (byte) 18);
        U0 = new dbm0(i2, (byte) 19);
        V0 = new dbm0(i2, (byte) 20);
        W0 = new dbm0(i2, (byte) 21);
        X0 = new dbm0(i2, (byte) 22);
        Y0 = new dbm0(i2, (byte) 23);
        Z0 = new dbm0(i2, (byte) 24);
        a1 = new dbm0(i2, (byte) 25);
        b1 = new dbm0(i2, (byte) 26);
        c1 = new dbm0(i2, (byte) 27);
        d1 = new dbm0(i2, (byte) 28);
        e1 = new dbm0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dbm0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        io70 io70Var;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        String str = null;
        switch (b2) {
            case 0:
                ubm0 ubm0Var = ubm0.a;
                ook0 ook0Var = ook0.W0;
                ebm0 ebm0Var = ebm0.b;
                return new jbm0((g3b1) ((RetrofitMaker) obj).createWebgateService(g3b1.class, "android-system-checkout"), 100L, ook0Var);
            case 1:
                return ubm0.c(ubm0.a, new sbm0((RetrofitMaker) obj, (dma1) obj2));
            case 2:
                return ubm0.c(ubm0.a, ook0.X0);
            case 3:
                return ubm0.c(ubm0.a, new tbm0((RetrofitMaker) obj, (dma1) obj2));
            case 4:
                k370 k370Var = new k370();
                k370Var.f((l370) null, "https://wgint.spotify.net");
                return (g3b1) ((RetrofitMaker) obj).createCustomHostService(g3b1.class, k370Var.b());
            case 5:
                return ubm0.c(ubm0.a, kbm0.a);
            case 6:
                return ubm0.c(ubm0.a, pbm0.a);
            case 7:
                return ubm0.c(ubm0.a, rbm0.a);
            case 8:
                return ubm0.c(ubm0.a, qbm0.a);
            case 9:
                return ubm0.c(ubm0.a, new mbm0((RetrofitMaker) obj, (dma1) obj2));
            case 10:
                return ubm0.c(ubm0.a, hbm0.a);
            case 11:
                return ubm0.c(ubm0.a, ook0.Q0);
            case 12:
                return new qkm0((srt0) obj2, (pkm0) obj);
            case 13:
                return Next.j();
            case 14:
                return new u7h(u7h.f);
            case 15:
                return Next.j();
            case 16:
                cxm0 cxm0Var = (cxm0) obj;
                return new gxm0(cxm0Var.a, cxm0Var.b, cxm0Var.c, ((gxm0) obj2).d);
            case 17:
                uwr uwrVar = cbx.a;
                return new u7h(((vex) zex.a.e).i);
            case 18:
                return (rym0) obj2;
            case 19:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), ((c2m0) obj).a, r6h1.c, System.currentTimeMillis());
            case 20:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", (String) obj2)), ((e2m0) obj).a, r6h1.c, System.currentTimeMillis());
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                return ((f2m0) obj).a((String) obj2);
            case 22:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", (String) obj2)), ((g2m0) obj).a, r6h1.c, System.currentTimeMillis());
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                m2n0 m2n0Var = (m2n0) obj2;
                return new l2n0(m2n0Var.a, m2n0Var.b);
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                w2n0 w2n0Var = (w2n0) obj2;
                return new v2n0(w2n0Var.a, w2n0Var.b);
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                k3n0 k3n0Var = (k3n0) obj;
                return new l3n0(k3n0Var.a, k3n0Var.b, k3n0Var.c, ((l3n0) obj2).d, k3n0Var.d);
            case 26:
                j4n0 j4n0Var = (j4n0) obj2;
                return new i4n0(j4n0Var.a, j4n0Var.b);
            case 27:
                jo70 jo70Var = (jo70) obj;
                jo70 jo70Var2 = (jo70) obj2;
                if (jo70Var2 != null && (io70Var = jo70Var2.e) != null) {
                    Set set = s4b1.f;
                    if (uic.x(io70Var.b).c != blc0.fh) {
                        io70Var = null;
                    }
                    if (io70Var != null) {
                        str = io70Var.a;
                    }
                }
                if (str == null) {
                    str = "";
                }
                List list = jo70Var.d;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ho70) it.next()).a);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (((String) obj3).length() > 0) {
                        arrayList2.add(obj3);
                    }
                }
                return new j4n0(str, arrayList2);
            case 28:
                q4n0 q4n0Var = (q4n0) obj2;
                return new p4n0(q4n0Var.c, q4n0Var.a, q4n0Var.b);
            default:
                hoj0 hoj0VarC = ((ioj0) obj2).c(yo60.class, ((dei0) obj).b().c);
                if (hoj0VarC == null) {
                    return null;
                }
                goj0 goj0VarA = hoj0VarC.a();
                yo60 yo60Var = goj0VarA != null ? (yo60) goj0VarA.a : null;
                if (yo60Var == null) {
                    return null;
                }
                String str2 = yo60Var.a;
                if (str2.length() == 0) {
                    return null;
                }
                return new yrw(Collections.singletonList(new zrw(str2)));
        }
    }
}
