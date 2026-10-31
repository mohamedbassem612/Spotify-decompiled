package p;

import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
public final class rv implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vv b;

    public /* synthetic */ rv(vv vvVar, byte b) {
        this.a = b;
        this.b = vvVar;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        vv vvVar = this.b;
        switch (b) {
            case 0:
                return new qtt((String) obj, xoi1.b(vvVar.c) ? 2 : 1);
            default:
                return vvVar.b.j();
        }
    }
}
