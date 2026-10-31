package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Update;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wgo implements nve0 {
    public final /* synthetic */ byte a = 2;
    public final a b;

    public wgo(kba kbaVar) {
        this.b = (a) kbaVar.b;
    }

    public final Connectable a() {
        byte b = this.a;
        return this.b;
    }

    public final Update b() {
        switch (this.a) {
            case 0:
                return rve0.c;
            case 1:
                return rve0.c;
            default:
                return t7p0.d;
        }
    }

    public wgo(dp5 dp5Var) {
        this.b = (a) dp5Var.b;
    }

    public wgo(a aVar) {
        this.b = aVar;
    }
}
