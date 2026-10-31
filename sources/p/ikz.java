package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public enum ikz implements v190 {
    INVALID_CREDENTIALS(0),
    HTTP_ERROR(1),
    OFFLINE(2),
    BAD_REQUEST(3),
    UNSUPPORTED_LOGIN_PROTOCOL(4),
    TOO_MANY_ATTEMPTS(5),
    NOT_ALLOWED(6),
    UNRECOGNIZED(-1);

    public final int a;

    ikz(int i) {
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
