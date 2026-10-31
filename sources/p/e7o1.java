package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class e7o1 extends mh70 {
    public final mcn1 l;
    public final bsd1 m;
    public final /* synthetic */ nbo1 n;

    /* JADX WARN: Multi-variable type inference failed */
    public e7o1(nbo1 nbo1Var, bsd1 bsd1Var) {
        mcn1 mcn1Var = new mcn1("OnRequestCrossDevicePromptCallback");
        this.n = nbo1Var;
        super((byte) 8);
        attachInterface(this, "com.google.android.play.core.crossdeviceprompt.protocol.ICrossDevicePromptServiceCallback");
        this.l = mcn1Var;
        this.m = bsd1Var;
    }
}
