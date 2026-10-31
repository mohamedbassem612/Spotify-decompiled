package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hqt implements a4l {
    public wtr a;

    @Override // p.a4l
    public final void a() {
        wtr wtrVar = this.a;
        if (wtrVar != null) {
            smo1.q(wtrVar.d);
        } else {
            u890.C("deviceDiscoverySnapshotLogger");
            throw null;
        }
    }

    @Override // p.a4l
    public final void b() {
        wtr wtrVar = this.a;
        if (wtrVar != null) {
            wtrVar.b();
        } else {
            u890.C("deviceDiscoverySnapshotLogger");
            throw null;
        }
    }
}
