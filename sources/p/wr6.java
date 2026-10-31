package p;

import com.spotify.metadata.proto.Metadata;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function4;
import java.util.List;
import spotify.collection.esperanto.proto.CollectionGetArtistViewRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wr6 implements Function4, Function {
    public final /* synthetic */ yr6 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ s4b1 c;

    public wr6(yr6 yr6Var, String str, s4b1 s4b1Var) {
        this.a = yr6Var;
        this.b = str;
        this.c = s4b1Var;
    }

    public Object N(Object obj, Object obj2, Object obj3, Object obj4) {
        Metadata.Artist artist = (Metadata.Artist) obj;
        mmr0 mmr0Var = (mmr0) obj2;
        List list = (List) obj3;
        int iIntValue = ((Number) mmr0Var.a).intValue();
        int iIntValue2 = ((Number) mmr0Var.b).intValue();
        String strC = this.c.C((String) obj4);
        if (strC != null) {
            return this.a.c(artist, list, this.b, strC, iIntValue, iIntValue2);
        }
        bhn0.q();
        return null;
    }

    public Object apply(Object obj) {
        mmr0 mmr0Var = (mmr0) obj;
        Metadata.Artist artist = (Metadata.Artist) mmr0Var.a;
        List list = (List) mmr0Var.b;
        yr6 yr6Var = this.a;
        r5h r5hVar = yr6Var.c;
        b4h b4hVarN = CollectionGetArtistViewRequest.n();
        b4hVarN.q(yr6Var.f);
        String str = this.b;
        b4hVarN.r(str);
        return Observable.combineLatest(r5hVar.d(b4hVarN.build()).map(s9w.i), yr6Var.e, new ajq0(this.c, yr6Var, artist, list, str));
    }

    public wr6(s4b1 s4b1Var, yr6 yr6Var, String str) {
        this.c = s4b1Var;
        this.a = yr6Var;
        this.b = str;
    }
}
