package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public enum udo implements v190 {
    CTA_STYLE_UNKNOWN(0),
    CTA_STYLE_PRIMARY(1),
    CTA_STYLE_SECONDARY(2),
    UNRECOGNIZED(-1);

    public final int a;

    udo(int i) {
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
