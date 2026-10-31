package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum mkz implements v190 {
    success(0),
    userNotFound(1),
    userAlreadyExists(2),
    UNRECOGNIZED(-1);

    public final int a;

    mkz(int i) {
        this.a = i;
    }

    @Override // p.v190
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
