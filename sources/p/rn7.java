package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum rn7 implements v190 {
    AUDIENCE_SOURCE_UNSPECIFIED(0),
    AUDIENCE_SOURCE_DM(1),
    AUDIENCE_SOURCE_GROUP(2),
    UNRECOGNIZED(-1);

    public final int a;

    rn7(int i) {
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
