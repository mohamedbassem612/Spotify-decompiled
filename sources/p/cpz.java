package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum cpz implements v190 {
    NOT_DOWNLOADED(0),
    ERROR(1),
    DOWNLOADED_EXPIRED(2),
    DOWNLOADED(3),
    WAITING_FOR_REDOWNLOAD(4),
    DOWNLOADING(5),
    WAITING(6),
    WAITING_LIMIT_EXCEEDED(7),
    UNRECOGNIZED(-1);

    public final int a;

    cpz(int i) {
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
