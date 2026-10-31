package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum tzy implements v190 {
    ENTRY_KIND_UNSPECIFIED(0),
    ENTRY_KIND_RESERVATION(1),
    ENTRY_KIND_PRESALE(2),
    ENTRY_KIND_GENERAL_SALE(3),
    ENTRY_KIND_MILESTONE(4),
    UNRECOGNIZED(-1);

    public final int a;

    tzy(int i) {
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
