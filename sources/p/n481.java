package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class n481 {
    public final ga81 a;
    public final hur b;
    public final qos c;
    public final dgb d;

    public n481(ga81 ga81Var, hur hurVar, qos qosVar, dgb dgbVar) {
        this.a = ga81Var;
        this.b = hurVar;
        this.c = qosVar;
        this.d = dgbVar;
    }

    public final Single a(b481 b481Var) {
        return this.a.callSingle("spotify.show_esperanto.proto.ShowService", "GetShow", this.c.a(b481Var)).map(pdx0.Y).map(new n801(this, (byte) 23)).compose(dgb.c(this.d, b481Var.f()));
    }

    public final Observable b(b481 b481Var) {
        return this.a.callStream("spotify.show_esperanto.proto.ShowService", "SubShow", this.c.a(b481Var)).map(wdx0.X).map(new y281(this, (byte) 1)).compose(this.d.a(b481Var.f(), b481Var.a()));
    }
}
