package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum dnz implements v190 {
    MEDIA_MANIFEST_SUCCESS(0),
    MEDIA_MANIFEST_INVALID_MANIFEST_ID(1),
    MEDIA_MANIFEST_CONNECTION_ERROR(2),
    MEDIA_MANIFEST_HTTP_ERROR(3),
    MEDIA_MANIFEST_CONNECTION_TIMEOUT(4),
    MEDIA_MANIFEST_HTTP_FORBIDDEN(5),
    UNRECOGNIZED(-1);

    public final int a;

    dnz(int i2) {
        this.a = i2;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
