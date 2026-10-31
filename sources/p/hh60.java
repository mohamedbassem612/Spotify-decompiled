package p;

import android.os.Parcelable;
import android.webkit.WebStorage;
import android.webkit.WebView;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.outcome.outcomeapi.exceptions.UnableToParseMessageException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hh60 extends hab0 implements iu30 {
    public static final hh60 N0;
    public static final hh60 O0;
    public static final hh60 P0;
    public static final hh60 Q0;
    public static final hh60 R0;
    public static final hh60 S0;
    public static final hh60 T0;
    public static final hh60 U0;
    public static final hh60 V0;
    public static final hh60 W0;
    public static final hh60 X;
    public static final hh60 X0;
    public static final hh60 Y;
    public static final hh60 Y0;
    public static final hh60 Z;
    public static final hh60 Z0;
    public static final hh60 a1;
    public static final hh60 b;
    public static final hh60 b1;
    public static final hh60 c;
    public static final hh60 c1;
    public static final hh60 d;
    public static final hh60 d1;
    public static final hh60 e;
    public static final hh60 e1;
    public static final hh60 f;
    public static final hh60 g;
    public static final hh60 h;
    public static final hh60 i;
    public static final hh60 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new hh60(i2, (byte) 0);
        c = new hh60(i2, (byte) 1);
        d = new hh60(i2, (byte) 2);
        e = new hh60(i2, (byte) 3);
        f = new hh60(i2, (byte) 4);
        g = new hh60(i2, (byte) 5);
        h = new hh60(i2, (byte) 6);
        i = new hh60(i2, (byte) 7);
        t = new hh60(i2, (byte) 8);
        X = new hh60(i2, (byte) 9);
        Y = new hh60(i2, (byte) 10);
        Z = new hh60(i2, (byte) 11);
        N0 = new hh60(i2, (byte) 12);
        O0 = new hh60(i2, (byte) 13);
        P0 = new hh60(i2, (byte) 14);
        Q0 = new hh60(i2, (byte) 15);
        R0 = new hh60(i2, (byte) 16);
        S0 = new hh60(i2, (byte) 17);
        T0 = new hh60(i2, (byte) 18);
        U0 = new hh60(i2, (byte) 19);
        V0 = new hh60(i2, (byte) 20);
        W0 = new hh60(i2, (byte) 21);
        X0 = new hh60(i2, (byte) 22);
        Y0 = new hh60(i2, (byte) 23);
        Z0 = new hh60(i2, (byte) 24);
        a1 = new hh60(i2, (byte) 25);
        b1 = new hh60(i2, (byte) 26);
        c1 = new hh60(i2, (byte) 27);
        d1 = new hh60(i2, (byte) 28);
        e1 = new hh60(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hh60(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        int i2 = 0;
        z = false;
        boolean z = false;
        switch (b2) {
            case 0:
                return Boolean.valueOf(obj instanceof qxc0);
            case 1:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 2:
                ((a7m0) obj).a = oq50.U0;
                return rih1Var;
            case 3:
                return rih1Var;
            case 4:
                if (cj60.a[((dj60) obj).ordinal()] == 1) {
                    return aj60.a;
                }
                eg.o();
                return null;
            case 5:
                return rih1Var;
            case 6:
                aw60 aw60Var = (aw60) obj;
                return new cw60(aw60Var.a, aw60Var.b, aw60Var.c, aw60Var.d, aw60Var.e);
            case 7:
                return ((q8r0) obj).c;
            case 8:
                return new fx60((jo70) obj);
            case 9:
                return Boolean.valueOf(obj instanceof jo70);
            case 10:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 11:
                String strH0 = ihc1.H0((String) obj, "spotify:show:");
                Set set = s4b1.f;
                String strZ = uic.v("host-recommendations", "show_".concat(strH0)).z();
                if (strZ == null) {
                    strZ = "";
                }
                return new qvc0(strZ, null, null, null, 14);
            case 12:
                i1r i1rVar = (k1r) obj;
                if (i1rVar instanceof h1r) {
                    return mx60.a;
                }
                if (!(i1rVar instanceof i1r)) {
                    if (i1rVar.equals(j1r.a)) {
                        return ox60.a;
                    }
                    eg.o();
                    return null;
                }
                Iterable iterable = (Iterable) i1rVar.a;
                ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
                for (Object obj2 : iterable) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        p7h.T();
                        throw null;
                    }
                    arrayList.add(new kx60(((pvc0) obj2).c, i2));
                    i2 = i3;
                }
                return new nx60(arrayList);
            case 13:
                return Boolean.valueOf(obj instanceof List);
            case 14:
                return (k1r) obj;
            case 15:
                return new c2l0((i3l0) obj);
            case 16:
                return new r070((f070) obj);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                WebView webView = (WebView) obj;
                webView.stopLoading();
                WebStorage.getInstance().deleteOrigin("https://open.spotifycdn.com");
                webView.destroy();
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                Object obj3 = ((sy21) obj).b;
                obj3.getClass();
                return new zsq0(obj3);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                Throwable th = (Throwable) obj;
                jd11 jd11Var = rc11.a;
                List listM = p7h.M(new tka0[]{jd11Var.b(UnableToParseMessageException.class), jd11Var.b(IOException.class), jd11Var.b(HttpException.class)});
                if (!(listM instanceof Collection) || !listM.isEmpty()) {
                    Iterator it = listM.iterator();
                    while (it.hasNext()) {
                        if (((tka0) it.next()).m(th)) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new bg50(blo1.c(qpb0.b));
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                j570 j570Var = (j570) obj;
                if (j570Var == null) {
                    return null;
                }
                sc70 sc70Var = sc70.d;
                if (j570Var instanceof sc70) {
                    return (sc70) j570Var;
                }
                rc70 rc70Var = ((sc70) j570Var).b;
                return wxo1.p(rc70Var.c, rc70Var.b);
            case 22:
                pc70 pc70Var = (pc70) obj;
                dd70 dd70Var = dd70.c;
                if (pc70Var == null) {
                    return null;
                }
                Parcelable.Creator<ld70> creator = ld70.CREATOR;
                return eyo1.m(pc70Var);
            case 23:
                return ((xf70) obj).a;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return rih1Var;
            case 25:
                return Boolean.valueOf(((l2r0) obj) != l2r0.c);
            case 26:
                return Boolean.valueOf(((l2r0) obj) == l2r0.a);
            case 27:
                return ((ho70) obj).a;
            case 28:
                io70 io70Var = ((jo70) obj).e;
                if (io70Var != null) {
                    return io70Var.b;
                }
                return null;
            default:
                return new u2l0((i3l0) obj);
        }
    }
}
