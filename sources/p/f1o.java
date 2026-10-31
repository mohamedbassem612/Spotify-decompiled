package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f1o {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f1o(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final jb3 a(oqg oqgVar, epb1 epb1Var, kko kkoVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((f1o) ((jly0) ((f9p) obj).h).get()).a(oqgVar, epb1Var, kkoVar);
            default:
                f9p f9pVar = (f9p) ((d7p) obj).c;
                return new jb3(oqgVar, epb1Var, kkoVar, (fgi0) ((jly0) f9pVar.g).get(), (ojv0) ((e1o) f9pVar.t).q);
        }
    }
}
