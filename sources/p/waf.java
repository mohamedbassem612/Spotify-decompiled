package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum waf implements v190 {
    CHAT_MEDIA_UPLOAD_STATE_UNSPECIFIED(0),
    CHAT_MEDIA_UPLOAD_STATE_PROCESSING(1),
    CHAT_MEDIA_UPLOAD_STATE_COMPLETED(2),
    CHAT_MEDIA_UPLOAD_STATE_FAILED(3),
    UNRECOGNIZED(-1);

    public final int a;

    waf(int i) {
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
