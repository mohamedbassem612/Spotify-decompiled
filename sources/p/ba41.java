package p;

import com.google.protobuf.Empty;
import com.spotify.libraryimportservice.tmm.ReviewSelection;
import com.spotify.libraryimportservice.tmm.SubmitMatchReviewRequest;
import com.spotify.libraryimportservice.tmm.a;
import com.spotify.libraryimportservice.tmm.b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class ba41 {
    public static final SubmitMatchReviewRequest a(List list, Map map) {
        nmc1 nmc1VarP = SubmitMatchReviewRequest.p();
        nmc1VarP.n(list);
        LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            om90 om90Var = (om90) entry.getValue();
            a aVarO = ReviewSelection.o();
            if (u890.j(om90Var, mm90.a)) {
                aVarO.n(Empty.n());
            } else {
                if (!(om90Var instanceof nm90)) {
                    eg.o();
                    return null;
                }
                b bVarO = ReviewSelection.SelectedAlternatives.o();
                bVarO.n(((nm90) om90Var).a);
                aVarO.q(bVarO);
            }
            linkedHashMap.put(key, (ReviewSelection) aVarO.build());
        }
        nmc1VarP.q(linkedHashMap);
        return (SubmitMatchReviewRequest) nmc1VarP.build();
    }
}
