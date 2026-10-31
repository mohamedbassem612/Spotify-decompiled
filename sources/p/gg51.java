package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum gg51 implements v190 {
    CTA_TYPE_UNSPECIFIED(0),
    CTA_TYPE_URI(1),
    CTA_TYPE_EDITORIAL(2),
    UNRECOGNIZED(-1);

    public final int a;

    gg51(int i) {
        this.a = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
