package p;

import com.spotify.kodiak.table.table.DataSourceException;
import com.spotify.kodiak.table.table.DataSourceException$UnsupportedKey;
import java.util.function.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t1k implements Function {
    public final /* synthetic */ u1k a;

    public t1k(u1k u1kVar) {
        this.a = u1kVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.kodiak.table.table.DataSourceException */
    @Override // java.util.function.Function
    public final Object apply(Object obj) throws DataSourceException {
        jh5 jh5Var = (jh5) obj;
        Integer numG = this.a.b.G(jh5Var);
        if (numG != null) {
            return numG;
        }
        throw new DataSourceException$UnsupportedKey(jh5Var);
    }
}
