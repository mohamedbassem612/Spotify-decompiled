package p;

import android.content.Intent;
import com.google.protobuf.Empty;
import com.spotify.base.java.logging.Logger;
import com.spotify.checkout.proto.model.v1.proto.GetSessionStatusResponse;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.playlist.ai.creation.v2.GetPusherMessageResponse;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import spotify.autodownload.esperanto.proto.EnabledShowsCountResponse;
import spotify.collection.esperanto.proto.CollectionAlbum;
import spotify.collection.esperanto.proto.CollectionArtist;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pzs0 implements vzs0, Function, cw0, Function3, Predicate, xkb, BiFunction, Function4 {
    public final /* synthetic */ byte a;
    public static final pzs0 b = new pzs0(0);
    public static final pzs0 c = new pzs0(1);
    public static final pzs0 d = new pzs0(2);
    public static final pzs0 e = new pzs0(3);
    public static final pzs0 f = new pzs0(4);
    public static final pzs0 g = new pzs0(5);
    public static final pzs0 h = new pzs0(6);
    public static final pzs0 i = new pzs0(7);
    public static final pzs0 t = new pzs0(8);
    public static final pzs0 X = new pzs0(9);
    public static final pzs0 Y = new pzs0(10);
    public static final pzs0 Z = new pzs0(12);
    public static final pzs0 N0 = new pzs0(13);
    public static final pzs0 O0 = new pzs0(14);
    public static final pzs0 P0 = new pzs0(15);
    public static final pzs0 Q0 = new pzs0(16);
    public static final pzs0 R0 = new pzs0(17);
    public static final pzs0 S0 = new pzs0(18);
    public static final pzs0 T0 = new pzs0(19);
    public static final pzs0 U0 = new pzs0(20);
    public static final pzs0 V0 = new pzs0(21);
    public static final pzs0 W0 = new pzs0(22);
    public static final pzs0 X0 = new pzs0(23);
    public static final pzs0 Y0 = new pzs0(24);
    public static final pzs0 Z0 = new pzs0(25);
    public static final pzs0 a1 = new pzs0(26);
    public static final pzs0 b1 = new pzs0(27);
    public static final pzs0 c1 = new pzs0(28);
    public static final pzs0 d1 = new pzs0(29);

    public /* synthetic */ pzs0(byte b2) {
        this.a = b2;
    }

    public static pta a(fbp1 fbp1Var) {
        if (fbp1Var instanceof lsa) {
            return null;
        }
        if (fbp1Var instanceof nsa) {
            return ((nsa) fbp1Var).c;
        }
        if (fbp1Var instanceof ksa) {
            return ((ksa) fbp1Var).c;
        }
        if (fbp1Var instanceof msa) {
            return ((msa) fbp1Var).c;
        }
        eg.o();
        return null;
    }

    public static boolean b(j331 j331Var) {
        return (j331Var instanceof b231) && ((b231) j331Var).b == -1;
    }

    public Object N(Object obj, Object obj2, Object obj3, Object obj4) {
        return new wee((yee) obj, (ContextTrack) obj2, (qpu) obj3, (e090) obj4);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                return new yo((Intent) obj);
            case 4:
                return GetPusherMessageResponse.parseFrom((byte[]) obj);
            case 5:
                return Integer.valueOf(((n84) obj).b);
            case 9:
                return Boolean.valueOf(((EnabledShowsCountResponse) obj).n() > 0);
            case 16:
                Throwable th = (Throwable) obj;
                Logger.e(th, "Error in getting entity info", new Object[0]);
                return new qfh(new xae0(th));
            case 18:
                return Boolean.valueOf(y7y0.A((Map) obj));
            case 19:
                return crn0.a;
            case 21:
                return (s1l) ((spq0) obj).b();
            case 22:
                List<mmr0> listA1 = o7h.a1((List) obj, new p0d((byte) 28));
                rnb1 rnb1Var = new rnb1((zdz0) null, z6x.a);
                for (mmr0 mmr0Var : listA1) {
                    zdz0 zdz0Var = (zdz0) mmr0Var.a;
                    boolean zBooleanValue = ((Boolean) mmr0Var.b).booleanValue();
                    List list = rnb1Var.b;
                    zdz0 zdz0Var2 = rnb1Var.a;
                    rnb1Var = (zdz0Var2 == null && zBooleanValue) ? new rnb1(zdz0Var, list) : new rnb1(zdz0Var2, o7h.O0(new czi0(zdz0Var, !zBooleanValue ? 1 : 2), list));
                }
                return rnb1Var;
            case 24:
                return Boolean.valueOf(!((nl8) obj).a());
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                byte[] bArr = (byte[]) obj;
                try {
                    return Empty.q(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 26:
                return new u400((GetSessionStatusResponse) obj);
            default:
                return new wdz((vn90) obj);
        }
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        return new yvg1((ji0) obj, (PlayerState) obj2, (b380) obj3);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 7:
                return !((uv00) obj).f;
            case 8:
                return !((uv00) obj).f;
            case 10:
                l0l l0lVar = (l0l) ((spq0) obj).h();
                return l0lVar != null && l0lVar.l();
            case 27:
                wv00 wv00Var = (uv00) obj;
                return wv00Var.c() || !wv00Var.f;
            default:
                return ((PlayerState) obj).track().c();
        }
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 13:
                return new mmr0((zlc) obj, (String) obj2);
            case 14:
            default:
                l0l l0lVar = (l0l) ((spq0) obj).h();
                l0l l0lVar2 = (l0l) ((spq0) obj2).h();
                if (l0lVar == null || (l0lVar2 != null && l0lVar.l())) {
                    l0lVar = l0lVar2;
                }
                return spq0.a(l0lVar);
            case 15:
                List list = (List) obj;
                CollectionArtist collectionArtist = (CollectionArtist) obj2;
                o1v o1vVarS = pdp1.s(dm5.O(collectionArtist.r().getSyncProgress(), collectionArtist.r().getOffline()));
                qz50 qz50Var = new qz50(collectionArtist.r().getSyncProgress(), collectionArtist.q().getName(), collectionArtist.q().getPortraits().getSmallLink(), collectionArtist.r().getOffline(), collectionArtist.p().getFollowed(), collectionArtist.p().getNumTracksInCollection() > 0 || collectionArtist.p().getNumAlbumsInCollection() > 0);
                h290<CollectionAlbum> h290VarO = collectionArtist.o();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarO, 10));
                for (CollectionAlbum collectionAlbum : h290VarO) {
                    collectionAlbum.getClass();
                    o1v o1vVarS2 = pdp1.s(dm5.O(collectionAlbum.p().getSyncProgress(), collectionAlbum.p().getOffline()));
                    String strQ = collectionAlbum.q();
                    arrayList.add(new nb6(collectionAlbum.o().getLink(), collectionAlbum.o().getName(), collectionAlbum.o().getCovers().getStandardLink(), collectionAlbum.o().getYear(), strQ, o1vVarS2 == o1v.a ? o1vVarS : o1vVarS2));
                }
                return new q2r0(qz50Var, new goc0(arrayList, list));
        }
    }
}
