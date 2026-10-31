package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n7l1 implements f4r {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tyq b;

    public /* synthetic */ n7l1(tyq tyqVar, byte b) {
        this.a = b;
        this.b = tyqVar;
    }

    public final f1r a(Object obj) {
        byte b = this.a;
        tyq tyqVar = this.b;
        switch (b) {
            case 0:
                return ((o3r) ((n0o) tyqVar).t).a((j7l1) obj);
            default:
                mak0 mak0Var = (mak0) obj;
                o3r o3rVar = (o3r) ((nm1) tyqVar).c;
                return g6p1.s(o3rVar.a(mak0Var.a), o3rVar.a(mak0Var.b));
        }
    }
}
