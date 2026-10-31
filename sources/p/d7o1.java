package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class d7o1 extends mh70 {
    public final hdn1 l;
    public final bsd1 m;
    public final /* synthetic */ mbo1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d7o1(mbo1 mbo1Var, bsd1 bsd1Var) {
        super((byte) 9);
        this.n = mbo1Var;
        attachInterface(this, "com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback");
        this.l = new hdn1("OnCheckAgeSignalsCallback");
        this.m = bsd1Var;
    }
}
