package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kzp implements zrl0 {
    public final daq a;
    public final teq b;

    public /* synthetic */ kzp(daq daqVar, teq teqVar) {
        this.a = daqVar;
        this.b = teqVar;
    }

    @Override // p.zrl0
    public asl0 create() {
        return new nzp(this.a, this.b);
    }
}
