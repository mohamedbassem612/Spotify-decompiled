package p;

import com.spotify.assistedcuration.v1.RecommendationsProto$CurationRecommendationsRequest;
import com.spotify.assistedcuration.v1.RecommendationsProto$ItemSpecificRecommendationsRequest;
import com.spotify.assistedcuration.v1.RecommendationsProto$SuggestedAudiobooks;
import com.spotify.assistedcuration.v1.RecommendationsProto$SuggestedEpisodes;
import io.reactivex.rxjava3.core.Single;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vz01 {
    public final zle1 a;
    public final sjj0 b;
    public final fc7 c;

    public vz01(zle1 zle1Var, sjj0 sjj0Var, fc7 fc7Var) {
        this.a = zle1Var;
        this.b = sjj0Var;
        this.c = fc7Var;
    }

    public static /* synthetic */ Single c(vz01 vz01Var, String str, int i, gzy gzyVar, String str2, Set set, int i2) {
        int i3 = i2 & 32;
        Set set2 = w7x.a;
        return vz01Var.b(str, i, gzyVar, str2, set2, i3 != 0 ? set2 : set);
    }

    public final Single a(String str, int i, gzy gzyVar, Set set, Set set2) {
        t45 t45VarA = this.a.a("assisted-curation-recommendations");
        h111 h111VarP = RecommendationsProto$CurationRecommendationsRequest.p();
        h111VarP.r(str);
        h111VarP.s(i);
        h111VarP.n(set);
        h111VarP.q(set2);
        int iOrdinal = gzyVar.ordinal();
        if (iOrdinal == 4) {
            h111VarP.u(RecommendationsProto$SuggestedEpisodes.n());
        } else {
            if (iOrdinal != 5) {
                k220.g(gzyVar, " is not supported");
                return null;
            }
            h111VarP.t(RecommendationsProto$SuggestedAudiobooks.n());
        }
        return this.c.a((RecommendationsProto$CurationRecommendationsRequest) h111VarP.build()).doOnSubscribe(new uz01(t45VarA, 5, (byte) 0)).doOnSuccess(new uz01(t45VarA, 5, (byte) 1)).flatMap(new pux0(this, t45VarA, (byte) 18)).map(new xaz0(t45VarA, (byte) 6)).onErrorReturn(gex0.e);
    }

    public final Single b(String str, int i, gzy gzyVar, String str2, Set set, Set set2) {
        i111 i111VarP = RecommendationsProto$ItemSpecificRecommendationsRequest.p();
        i111VarP.s(str2);
        i111VarP.r(str);
        i111VarP.t(i);
        i111VarP.n(set);
        i111VarP.q(set2);
        int iOrdinal = gzyVar.ordinal();
        if (iOrdinal == 4) {
            i111VarP.v(RecommendationsProto$SuggestedEpisodes.n());
        } else {
            if (iOrdinal != 5) {
                k220.g(gzyVar, " is not supported");
                return null;
            }
            i111VarP.u(RecommendationsProto$SuggestedAudiobooks.n());
        }
        return this.c.b((RecommendationsProto$ItemSpecificRecommendationsRequest) i111VarP.build()).flatMap(new tz01(this, (byte) 0)).onErrorReturn(hgx0.e);
    }
}
