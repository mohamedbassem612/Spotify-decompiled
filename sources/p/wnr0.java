package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum wnr0 implements v190 {
    direction_policy_unspecified(0),
    first_strong_character(1),
    UNRECOGNIZED(-1);

    public final int a;

    wnr0(int i) {
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
