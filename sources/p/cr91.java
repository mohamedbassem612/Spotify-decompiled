package p;

import com.google.protobuf.Any;
import com.spotify.watchfeed.component.item.v1.SnackbarMessageComponent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cr91 implements j0i {
    public final kly0 a;

    public cr91(jly0 jly0Var) {
        this.a = jly0Var;
    }

    @Override // p.j0i
    public final z0i a(Any any) {
        SnackbarMessageComponent snackbarMessageComponentR = SnackbarMessageComponent.r(any.q());
        return new wt91(snackbarMessageComponentR.p(), snackbarMessageComponentR.o(), snackbarMessageComponentR.q() ? new vt91(snackbarMessageComponentR.n().q(), snackbarMessageComponentR.n().p(), snackbarMessageComponentR.n().n()) : null);
    }

    @Override // p.j0i
    public final Class b() {
        return wt91.class;
    }

    @Override // p.j0i
    public final o1i c() {
        return (o1i) this.a.get();
    }
}
