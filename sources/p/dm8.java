package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum dm8 implements v190 {
    AUTHENTICATOR_ATTACHMENT_UNSPECIFIED(0),
    AUTHENTICATOR_ATTACHMENT_PLATFORM(1),
    AUTHENTICATOR_ATTACHMENT_CROSS_PLATFORM(2),
    UNRECOGNIZED(-1);

    public final int a;

    dm8(int i) {
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
