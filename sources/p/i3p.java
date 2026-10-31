package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i3p implements jox0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ i3p(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    @Override // p.jox0
    public final kox0 a(d0r d0rVar, o3r o3rVar) {
        byte b = this.a;
        jly0 jly0Var = this.b;
        switch (b) {
            case 0:
                s3p s3pVar = (s3p) ((b2p) jly0Var).c;
                return new kox0((b2p) s3pVar.c1, (fox0) ((jly0) s3pVar.N0).get(), d0rVar, o3rVar);
            default:
                d4p d4pVar = (d4p) ((b2p) jly0Var).c;
                return new kox0(d4pVar.f, (fox0) d4pVar.r.get(), d0rVar, o3rVar);
        }
    }
}
