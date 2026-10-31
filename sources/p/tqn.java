package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum tqn implements v190 {
    CREATE_REQUEST_RESULT_UNSPECIFIED(0),
    CREATE_REQUEST_RESULT_CREATED(1),
    CREATE_REQUEST_RESULT_ALREADY_PENDING(2),
    CREATE_REQUEST_RESULT_BLOCKED(3),
    CREATE_REQUEST_RESULT_DAILY_LIMIT_REACHED(4),
    CREATE_REQUEST_RESULT_ALREADY_ALLOWED(5),
    CREATE_REQUEST_RESULT_REQUESTS_DISABLED(6),
    CREATE_REQUEST_RESULT_DENIED_COOLDOWN(7),
    UNRECOGNIZED(-1);

    public final int a;

    tqn(int i) {
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
