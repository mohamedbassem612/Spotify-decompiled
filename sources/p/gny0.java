package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum gny0 implements v190 {
    PUBLIC_KEY_CREDENTIAL_TYPE_UNSPECIFIED(0),
    PUBLIC_KEY_CREDENTIAL_TYPE_PUBLIC_KEY(1),
    UNRECOGNIZED(-1);

    public final int a;

    gny0(int i) {
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
