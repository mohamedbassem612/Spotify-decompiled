package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum kl7 implements v190 {
    ATTACHMENT_VALIDATION_STATUS_UNSPECIFIED(0),
    ATTACHMENT_VALIDATION_STATUS_PENDING(1),
    ATTACHMENT_VALIDATION_STATUS_SAFE(2),
    ATTACHMENT_VALIDATION_STATUS_REJECTED(3),
    UNRECOGNIZED(-1);

    public final int a;

    kl7(int i) {
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
