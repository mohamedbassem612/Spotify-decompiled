package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class i4o1 implements q7o1 {
    public final /* synthetic */ byte a;

    public static final /* synthetic */ tnn1 d(String str) {
        snn1 snn1VarX = tnn1.x();
        snn1VarX.j(str);
        return snn1VarX.e();
    }

    @Override // p.q7o1
    public final qwo1 c(sln1 sln1Var) {
        switch (this.a) {
            case 0:
                return new qwo1(new q82(this, (lnm) null, (byte) 12));
            default:
                return new qwo1(new q82(this, (lnm) null, (byte) 13));
        }
    }

    @Override // p.q7o1
    public final int zza() {
        switch (this.a) {
            case 0:
                return 11;
            default:
                return 10;
        }
    }

    @Override // p.q7o1
    public final boolean zzb() {
        switch (this.a) {
        }
        return true;
    }
}
