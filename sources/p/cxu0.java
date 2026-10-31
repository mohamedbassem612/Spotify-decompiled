package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public enum cxu0 implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    ACTION_UNSPECIFIED(0),
    ACTION_ADD_TRACK(1),
    ACTION_REMOVE_TRACK(2),
    UNRECOGNIZED(-1);

    public final int a;

    cxu0(int i) {
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
