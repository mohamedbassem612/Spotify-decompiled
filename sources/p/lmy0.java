package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lmy0 {
    public final h2y0 a;
    public final bpb1 b = gio1.b((Object) null);

    public lmy0(h2y0 h2y0Var) {
        this.a = h2y0Var;
    }

    public final jge a(String str, iu30 iu30Var) {
        return hu20.e(this.b, new an6((lnm) null, new ozu0(str, this, iu30Var, (byte) 13), (byte) 1));
    }

    public final Observable b(String str, iu30 iu30Var) {
        return yoi1.i(a(str, iu30Var), o6x.a);
    }
}
