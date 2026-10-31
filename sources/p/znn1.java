package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public enum znn1 implements tin1 {
    JS_CODE_UNSPECIFIED(0),
    JS_CODE_SUCCESS(1),
    JS_NETWORK_ERROR(2),
    JS_INTERNAL_ERROR(3),
    JS_INVALID_SITE_KEY(4),
    JS_INVALID_SITE_KEY_TYPE(5),
    JS_3P_APP_PACKAGE_NAME_NOT_ALLOWED(6),
    JS_INVALID_ACTION(7),
    JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED(8),
    JS_PROGRAM_ERROR(9),
    UNRECOGNIZED(-1);

    public final int a;

    znn1(int i) {
        this.a = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.a);
    }
}
