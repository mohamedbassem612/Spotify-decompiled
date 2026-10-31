package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum h44 implements z0z {
    EXPAND_FULL_VIDEO("expandFullVideo"),
    /* JADX INFO: Fake field, exist only in values array */
    OPEN_I_A_W_B("openIAWB"),
    OPEN_SPLIT_I_A_W_B("openSplitIAWB");

    public final String a;

    h44(String str) {
        this.a = str;
    }

    @Override // p.z0z
    public final String value() {
        return this.a;
    }
}
