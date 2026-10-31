package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum yec implements v190 {
    BUTTON_ICON_ALIGNMENT_UNKNOWN(0),
    BUTTON_ICON_ALIGNMENT_LEADING(1),
    BUTTON_ICON_ALIGNMENT_TRAILING(2),
    UNRECOGNIZED(-1);

    public final int a;

    yec(int i) {
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
