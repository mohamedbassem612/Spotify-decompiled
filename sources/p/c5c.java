package p;

import android.net.Uri;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c5c implements ejo {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public final Object c;

    public c5c(z0t z0tVar, l0p l0pVar, xrm1 xrm1Var) {
        this.b = z0tVar;
        this.c = l0pVar;
    }

    @Override // p.ejo
    public final Maybe a(String str) {
        switch (this.a) {
            case 0:
                rxj0 rxj0Var = (rxj0) this.c;
                if (!rxj0Var.a && !rxj0Var.Z) {
                    return MaybeEmpty.a;
                }
                if (!nhc1.Y(str, "spotify://internal/bridge-tracks-curation", false)) {
                    return MaybeEmpty.a;
                }
                Uri uri = Uri.parse(str);
                String queryParameter = uri.getQueryParameter("playlist");
                if (queryParameter == null) {
                    return MaybeEmpty.a;
                }
                String queryParameter2 = uri.getQueryParameter("trackARowId");
                return queryParameter2 == null ? MaybeEmpty.a : Maybe.e(new b5c(this, queryParameter, queryParameter2));
            default:
                if (((z0t) this.b).a.a() && xrm1.a(str)) {
                    return Maybe.e(new d0b(this, str, (byte) 2));
                }
                MaybeEmpty maybeEmpty = MaybeEmpty.a;
                maybeEmpty.getClass();
                return maybeEmpty;
        }
    }

    public c5c(m0p m0pVar, rxj0 rxj0Var) {
        this.b = m0pVar;
        this.c = rxj0Var;
    }
}
