package p;

import io.reactivex.rxjava3.core.Single;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qs6 {
    public final uu00 a;

    public qs6(uu00 uu00Var) {
        this.a = uu00Var;
    }

    public final Single a(List list) {
        return this.a.b(new oi("artist_metadata_loader", false, new s6(list, (byte) 8))).filter(pzs0.i).map(new ps6(list, (byte) 0)).first(z6x.a);
    }
}
