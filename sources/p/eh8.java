package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum eh8 implements v190 {
    AUTH_PROVIDER_UNSPECIFIED(0),
    AUTH_PROVIDER_EMAIL(1),
    AUTH_PROVIDER_FACEBOOK(2),
    AUTH_PROVIDER_APPLE(3),
    AUTH_PROVIDER_PHONE_NUMBER(4),
    AUTH_PROVIDER_GOOGLE(5),
    AUTH_PROVIDER_NAVER(7),
    AUTH_PROVIDER_PASSKEYS(8),
    UNRECOGNIZED(-1);

    public final int a;

    eh8(int i) {
        this.a = i;
    }

    public static eh8 a(int i) {
        switch (i) {
            case 0:
                return AUTH_PROVIDER_UNSPECIFIED;
            case 1:
                return AUTH_PROVIDER_EMAIL;
            case 2:
                return AUTH_PROVIDER_FACEBOOK;
            case 3:
                return AUTH_PROVIDER_APPLE;
            case 4:
                return AUTH_PROVIDER_PHONE_NUMBER;
            case 5:
                return AUTH_PROVIDER_GOOGLE;
            case 6:
            default:
                return null;
            case 7:
                return AUTH_PROVIDER_NAVER;
            case 8:
                return AUTH_PROVIDER_PASSKEYS;
        }
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
