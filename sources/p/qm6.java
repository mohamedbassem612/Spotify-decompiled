package p;

import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qm6 extends hab0 implements iu30 {
    public static final qm6 N0;
    public static final qm6 O0;
    public static final qm6 P0;
    public static final qm6 Q0;
    public static final qm6 R0;
    public static final qm6 S0;
    public static final qm6 T0;
    public static final qm6 U0;
    public static final qm6 V0;
    public static final qm6 W0;
    public static final qm6 X;
    public static final qm6 X0;
    public static final qm6 Y;
    public static final qm6 Y0;
    public static final qm6 Z;
    public static final qm6 Z0;
    public static final qm6 a1;
    public static final qm6 b;
    public static final qm6 b1;
    public static final qm6 c;
    public static final qm6 c1;
    public static final qm6 d;
    public static final qm6 d1;
    public static final qm6 e;
    public static final qm6 e1;
    public static final qm6 f;
    public static final qm6 g;
    public static final qm6 h;
    public static final qm6 i;
    public static final qm6 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new qm6(i2, (byte) 0);
        c = new qm6(i2, (byte) 1);
        d = new qm6(i2, (byte) 2);
        e = new qm6(i2, (byte) 3);
        f = new qm6(i2, (byte) 4);
        g = new qm6(i2, (byte) 5);
        h = new qm6(i2, (byte) 6);
        i = new qm6(i2, (byte) 7);
        t = new qm6(i2, (byte) 8);
        X = new qm6(i2, (byte) 9);
        Y = new qm6(i2, (byte) 10);
        Z = new qm6(i2, (byte) 11);
        N0 = new qm6(i2, (byte) 12);
        O0 = new qm6(i2, (byte) 13);
        P0 = new qm6(i2, (byte) 14);
        Q0 = new qm6(i2, (byte) 15);
        R0 = new qm6(i2, (byte) 16);
        S0 = new qm6(i2, (byte) 17);
        T0 = new qm6(i2, (byte) 18);
        U0 = new qm6(i2, (byte) 19);
        V0 = new qm6(i2, (byte) 20);
        W0 = new qm6(i2, (byte) 21);
        X0 = new qm6(i2, (byte) 22);
        Y0 = new qm6(i2, (byte) 23);
        Z0 = new qm6(i2, (byte) 24);
        a1 = new qm6(i2, (byte) 25);
        b1 = new qm6(i2, (byte) 26);
        c1 = new qm6(i2, (byte) 27);
        d1 = new qm6(i2, (byte) 28);
        e1 = new qm6(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qm6(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        yqc0 yqc0Var = yqc0.a;
        boolean z = true;
        switch (b2) {
            case 0:
                i1r i1rVar = (k1r) obj;
                if (i1rVar instanceof h1r) {
                    return km6.a;
                }
                if (!(i1rVar instanceof i1r)) {
                    if (i1rVar.equals(j1r.a)) {
                        return mm6.a;
                    }
                    eg.o();
                    return null;
                }
                Iterable iterable = (Iterable) i1rVar.a;
                ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((pvc0) it.next()).c);
                }
                return new lm6((String) null, mqo1.F(arrayList));
            case 1:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qxc0) obj;
            case 2:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 4:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 6:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 8:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 10:
                if (!(obj instanceof qxc0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                return Boolean.valueOf(obj instanceof List);
            case 12:
                return (k1r) obj;
            case 13:
                return Boolean.valueOf(obj instanceof List);
            case 14:
                return (k1r) obj;
            case 15:
                return Boolean.valueOf(obj instanceof List);
            case 16:
                return (k1r) obj;
            case 17:
                return ((in6) obj).b;
            case 18:
                return ((in6) obj).a;
            case 19:
                in6 in6Var = (in6) obj;
                return new qvc0(gvg.h("spotify:list:artists-popular-collaborations:", blo1.l(in6Var.a), "_", blo1.l(in6Var.b)), (c3d0) null, Collections.singleton(yqc0Var), (mqz0) null, 10);
            case 20:
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (obj2 instanceof jo70) {
                        arrayList2.add(obj2);
                    }
                }
                return arrayList2;
            case 21:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 22:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 23:
                return ((jn6) obj).a;
            case 24:
                return new qvc0(l1d.m("spotify:list:popular-release-segments:artist_", blo1.l(((jn6) obj).a)), (c3d0) null, Collections.singleton(yqc0Var), (mqz0) null, 10);
            case 25:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.listplatform.endpoints.kodiak.ListItemsTable.Item>");
                return null;
            case 26:
                return Boolean.valueOf(obj instanceof z6a1);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                if (obj != null) {
                    return (z6a1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.songdnaartistfacts.SongDNAArtistFacts");
                return null;
            case 28:
                return Boolean.valueOf(obj instanceof List);
            default:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.listplatform.endpoints.kodiak.ListItemsTable.Item>");
                return null;
        }
    }
}
