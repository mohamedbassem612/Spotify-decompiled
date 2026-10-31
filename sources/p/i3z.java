package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i3z implements nwo0 {
    public final /* synthetic */ byte a;
    public final yyn b;
    public final avp c;
    public final lv4 d;

    public /* synthetic */ i3z(yyn yynVar, avp avpVar, lv4 lv4Var, byte b) {
        this.a = b;
        this.b = yynVar;
        this.c = avpVar;
        this.d = lv4Var;
    }

    @Override // p.nwo0
    public final owo0 a(q2p0 q2p0Var, ivn0 ivn0Var, v1r0 v1r0Var, kko kkoVar) {
        switch (this.a) {
            case 0:
                return new j3z(this.b, this.c, kkoVar, this.d, (byte) 0);
            default:
                return new j3z(this.b, this.c, kkoVar, this.d, (byte) 1);
        }
    }
}
