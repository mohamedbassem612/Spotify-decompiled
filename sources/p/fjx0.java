package p;

import com.spotify.cosmos.util.proto.Extension;
import com.spotify.cosmos.util.proto.ShowMetadata;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fjx0 implements zix0 {
    public static final t3v0 d;
    public final x3v0 a;
    public final ga81 b;
    public final lv00 c;

    static {
        Boolean bool = Boolean.TRUE;
        d = new t3v0(sqg0.J(new mmr0[]{new mmr0("length", bool), new mmr0("timeLeft", bool), new mmr0("isPlayed", bool)}), (Map) null, (Map) null, (List) null, (List) null, 247);
    }

    public fjx0(x3v0 x3v0Var, ga81 ga81Var, lv00 lv00Var) {
        this.a = x3v0Var;
        this.b = ga81Var;
        this.c = lv00Var;
    }

    public final Observable a(Set set) {
        return set.isEmpty() ? Observable.just(b7x.a) : Observable.merge(Observable.defer(new xf0(set, this, (byte) 12)).map(bjx0.b), Observable.defer(new ejx0(set, this)).map(new l1p0(this, (byte) 28))).onErrorReturn(new cjx0(set));
    }

    public final jv00 b(ShowMetadata showMetadata) {
        List<Extension> extensionList = showMetadata.getExtensionList();
        ArrayList arrayList = new ArrayList(q7h.U(extensionList, 10));
        for (Extension extension : extensionList) {
            arrayList.add(new jz00(extension.getData().t(), extension.getExtensionKind().getNumber()));
        }
        return this.c.a(arrayList);
    }
}
