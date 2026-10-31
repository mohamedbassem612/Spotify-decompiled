package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum fh8 implements v190 {
    AUTH_PROVIDER_STATE_UNSPECIFIED(0),
    AUTH_PROVIDER_STATE_LOGIN_ONLY(1),
    AUTH_PROVIDER_STATE_LOGIN_SIGNUP(2),
    UNRECOGNIZED(-1);

    public final int a;

    fh8(int i) {
        this.a = i;
    }

    public static fh8 a(int i) {
        if (i == 0) {
            return AUTH_PROVIDER_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return AUTH_PROVIDER_STATE_LOGIN_ONLY;
        }
        if (i != 2) {
            return null;
        }
        return AUTH_PROVIDER_STATE_LOGIN_SIGNUP;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
