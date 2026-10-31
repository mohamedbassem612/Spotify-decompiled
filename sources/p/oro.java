package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum oro implements v190 {
    CUSTOM_TRANSITION_CHANGE_TYPE_UNSPECIFIED(0),
    CUSTOM_TRANSITION_CHANGE_TYPE_ADDED(1),
    CUSTOM_TRANSITION_CHANGE_TYPE_EDITED(2),
    CUSTOM_TRANSITION_CHANGE_TYPE_CLEARED(3),
    UNRECOGNIZED(-1);

    public final int a;

    oro(int i) {
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
