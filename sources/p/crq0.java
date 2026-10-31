package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum crq0 implements v190 {
    APP_LAUNCH(0),
    MANUAL_LOGOUT(1),
    FORCED_LOGOUT(2),
    UNRECOGNIZED(-1);

    public final int a;

    crq0(int i) {
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
