package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public enum r9c1 implements v190 {
    STORY_TYPE_UNSPECIFIED(0),
    STORY_TYPE_EVERGREEN(1),
    STORY_TYPE_TIMELY(2),
    UNRECOGNIZED(-1);

    public final int a;

    r9c1(int i) {
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
