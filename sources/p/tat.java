package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum tat implements v190 {
    DENOMINATION_SELECTION_STATE_UNSPECIFIED(0),
    DENOMINATION_SELECTION_STATE_DISABLED(1),
    DENOMINATION_SELECTION_STATE_PRE_SELECTED(2),
    UNRECOGNIZED(-1);

    public final int a;

    tat(int i) {
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
