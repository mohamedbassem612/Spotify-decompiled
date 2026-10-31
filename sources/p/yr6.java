package p;

import android.content.Context;
import android.net.Uri;
import com.spotify.cosmos.util.policy.proto.ArtistCollectionDecorationPolicy;
import com.spotify.metadata.cosmos.proto.MetadataCosmos;
import com.spotify.metadata.esperanto.proto.GetEntityRequest;
import com.spotify.metadata.proto.Metadata;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import spotify.collection.esperanto.proto.CollectionArtistDecorationPolicy;
import spotify.collection.esperanto.proto.CollectionGetArtistViewRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yr6 implements rhh0 {
    public final Context a;
    public final ueg b;
    public final r5h c;
    public final o3e0 d;
    public final Observable e;
    public final CollectionArtistDecorationPolicy f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    public yr6(Context context, ueg uegVar, r5h r5hVar, o3e0 o3e0Var, Observable observable) {
        this.a = context;
        this.b = uegVar;
        this.c = r5hVar;
        this.d = o3e0Var;
        this.e = observable;
        l0h l0hVarO = CollectionArtistDecorationPolicy.o();
        l0hVarO.q(ArtistCollectionDecorationPolicy.newBuilder().setNumExplicitlyLikedTracks(true).setNumAlbumsInCollection(true).build());
        this.f = (CollectionArtistDecorationPolicy) l0hVarO.build();
        this.g = context.getString(2131952466);
        this.h = context.getString(2131952467);
        this.i = context.getString(2131952470);
        this.j = context.getString(2131952468);
        this.k = context.getString(2131952469);
    }

    @Override // p.w310
    public final Observable a(r9c r9cVar) {
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(r9cVar.e());
        String strF = s4b1VarX.F();
        s4b1VarX.z();
        if (strF == null) {
            return Observable.error(new IllegalArgumentException());
        }
        dn40 dn40VarN = GetEntityRequest.n();
        dn40VarN.n(strF);
        Single singleCache = this.b.a(dn40VarN.build()).map(p9w.i).cache();
        return Single.zip(singleCache, singleCache.flatMap(new km3(this, strF, (byte) 14)), m9h.i).flatMapObservable(new wr6(this, strF, s4b1VarX));
    }

    @Override // p.w310
    public final Single b(r9c r9cVar) {
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(r9cVar.e());
        String strF = s4b1VarX.F();
        if (strF == null) {
            return Single.error(new IllegalArgumentException());
        }
        s4b1VarX.z();
        dn40 dn40VarN = GetEntityRequest.n();
        dn40VarN.n(strF);
        Single singleCache = this.b.a(dn40VarN.build()).map(uwg.i).cache();
        Single singleFlatMap = singleCache.flatMap(new em3(this, strF, (byte) 15));
        b4h b4hVarN = CollectionGetArtistViewRequest.n();
        b4hVarN.q(this.f);
        b4hVarN.r(strF);
        return Single.zip(singleCache, this.c.d(b4hVarN.build()).map(s9w.i).firstOrError(), singleFlatMap, this.e.firstOrError(), new wr6(s4b1VarX, this, strF));
    }

    public final z310 c(Metadata.Artist artist, List list, String str, String str2, int i, int i2) {
        ArrayList arrayList = new ArrayList(25);
        Context context = this.a;
        if (i > 0 || i2 > 0) {
            String quantityString = i > 0 ? context.getResources().getQuantityString(2131820580, i, Integer.valueOf(i)) : null;
            String quantityString2 = i2 > 0 ? context.getResources().getQuantityString(2131820579, i2, Integer.valueOf(i2)) : null;
            v310 v310Var = new v310(str2);
            v310Var.b(1);
            v310Var.f(context.getString(2131957638));
            v310Var.c(Uri.parse("https://misc.scdn.co/liked-songs/liked-songs-300.png"));
            v310Var.e(o7h.y0(f46.i0(new String[]{quantityString, quantityString2}), " • ", null, null, null, 62));
            arrayList.add(v310Var.a());
        }
        arrayList.addAll(list);
        return new z310(arrayList, new f410(6, artist.getName(), (String) null, p7h.M(p8p1.s(context, str), p8p1.t(context, str))));
    }

    public final Single d(Metadata.Artist artist, String str) {
        Single singleOnErrorReturn;
        if (artist.v().isEmpty()) {
            singleOnErrorReturn = Single.just(z6x.a);
        } else {
            List listD1 = o7h.d1(artist.u().n(), 5);
            ArrayList arrayList = new ArrayList(q7h.U(listD1, 10));
            Iterator it = listD1.iterator();
            while (it.hasNext()) {
                arrayList.add(y6b1.m(g9a.a(((Metadata.Track) it.next()).r().t())).toString());
            }
            kjj0 kjj0VarO = MetadataCosmos.MultiRequest.o();
            kjj0VarO.n(arrayList);
            MetadataCosmos.MultiRequest multiRequestBuild = kjj0VarO.build();
            multiRequestBuild.getClass();
            singleOnErrorReturn = this.b.callSingle("spotify.metadata_esperanto.proto.ClassicMetadataService", "MultigetEntity", multiRequestBuild).map(p9w.Q0).map(new ow3(this, str, (byte) 13)).onErrorReturn(new ljp1(str, (byte) 2));
        }
        return Single.zip(singleOnErrorReturn, e(this.h, artist.n()), e(this.i, artist.t()), e(this.j, artist.o()), e(this.k, artist.p()), q9w.i);
    }

    public final Single e(String str, h290 h290Var) {
        if (h290Var.isEmpty()) {
            return Single.just(z6x.a);
        }
        ArrayList arrayList = new ArrayList(q7h.U(h290Var, 10));
        Iterator it = h290Var.iterator();
        while (it.hasNext()) {
            arrayList.add((Metadata.Album) ((Metadata.AlbumGroup) it.next()).n().get(0));
        }
        List listD1 = o7h.d1(arrayList, 4);
        ArrayList arrayList2 = new ArrayList(q7h.U(listD1, 10));
        Iterator it2 = listD1.iterator();
        while (it2.hasNext()) {
            arrayList2.add(y6b1.a(g9a.a(((Metadata.Album) it2.next()).q().t())).toString());
        }
        kjj0 kjj0VarO = MetadataCosmos.MultiRequest.o();
        kjj0VarO.n(arrayList2);
        MetadataCosmos.MultiRequest multiRequestBuild = kjj0VarO.build();
        multiRequestBuild.getClass();
        return this.b.callSingle("spotify.metadata_esperanto.proto.ClassicMetadataService", "MultigetEntity", multiRequestBuild).map(p9w.Q0).map(new xr6(this, str)).onErrorReturn(new clv(str, (byte) 4));
    }
}
