package p;

import com.spotify.cosmos.util.policy.proto.ShowDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowPlayedStateDecorationPolicy;
import com.spotify.show_esperanto.proto.GetShowRequest;
import com.spotify.show_esperanto.proto.HeaderPolicy;
import com.spotify.show_esperanto.proto.a;
import com.spotify.show_esperanto.proto.b;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Supplier;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ejx0 implements Supplier {
    public final /* synthetic */ Set a;
    public final /* synthetic */ fjx0 b;

    public ejx0(Set set, fjx0 fjx0Var) {
        this.a = set;
        this.b = fjx0Var;
    }

    public final Object get() {
        Set set = this.a;
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : set) {
            if (nhc1.Y((String) obj, "spotify:show", false)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return Observable.empty();
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (String str : arrayList) {
            ga81 ga81Var = this.b.b;
            a aVarN = GetShowRequest.n();
            String str2 = new y6b1(str, false).e;
            if (str2 == null) {
                str2 = "";
            }
            aVarN.y(str2);
            t160 t160VarN = HeaderPolicy.n();
            t160VarN.t(ShowDecorationPolicy.newBuilder().setIsBook(true).setLink(true).addExtension(hz00.B1));
            t160VarN.r(ShowPlayedStateDecorationPolicy.newBuilder().setPlayedTime(true));
            aVarN.q(t160VarN);
            b bVarN = GetShowRequest.Range.n();
            bVarN.q(0);
            aVarN.v(bVarN);
            arrayList2.add(ga81Var.callStream("spotify.show_esperanto.proto.ShowService", "SubShow", (GetShowRequest) aVarN.build()).map(wdx0.X));
        }
        return Observable.combineLatest(arrayList2, djx0.b);
    }
}
