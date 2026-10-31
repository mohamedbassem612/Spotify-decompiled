package p;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yn50 implements ejo {
    public final /* synthetic */ byte a;
    public final Object b;

    public yn50(agc0 agc0Var, lcc0 lcc0Var) {
        this.a = (byte) 1;
        this.b = lcc0Var;
    }

    @Override // p.ejo
    public final Maybe a(String str) {
        byte b = 1;
        byte b2 = 0;
        switch (this.a) {
            case 0:
                if (str.equals("spotify:now-playing:queue") || str.equals("spotify:now-playing:jam")) {
                    return Maybe.e(new xn50(this, b2));
                }
                MaybeEmpty maybeEmpty = MaybeEmpty.a;
                maybeEmpty.getClass();
                return maybeEmpty;
            case 1:
                if (str.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || str.equals("spotify:collection:tracks") || str.equals("spotify:internal:collection:tracks") || (nhc1.Y(str, "spotify:user:", false) && nhc1.R(str, ":collection", false))) {
                    return Maybe.e(new xn50(this, b));
                }
                MaybeEmpty maybeEmpty2 = MaybeEmpty.a;
                maybeEmpty2.getClass();
                return maybeEmpty2;
            default:
                Set set = s4b1.f;
                if (uic.k(str, new b3i1[]{nyu0.e, wyu0.f})) {
                    return Maybe.e(new d0b(this, str, b));
                }
                MaybeEmpty maybeEmpty3 = MaybeEmpty.a;
                maybeEmpty3.getClass();
                return maybeEmpty3;
        }
    }

    public /* synthetic */ yn50(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
