package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum zhx0 implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    REASON_UNSPECIFIED(0),
    REASON_ACTIVATION_UNMUTE(1),
    REASON_ACTIVATION_ADDED_TO_LIBRARY(2),
    /* JADX INFO: Fake field, exist only in values array */
    REASON_ACTIVATION_ADDED_TO_PLAYLIST(3),
    REASON_ACTIVATION_DOWNLOADED(4),
    REASON_ACTIVATION_TIME_THRESHOLD_EXCEEDED(5),
    REASON_ACTIVATION_GENERIC(6),
    REASON_PLAYBACK_PERIODIC(8),
    REASON_PLAYBACK_ENDED(9),
    /* JADX INFO: Fake field, exist only in values array */
    REASON_PLAYBACK_GENERIC(10),
    REASON_ACTIVATION_SHARED(7),
    /* JADX INFO: Fake field, exist only in values array */
    REASON_ACTIVATION_ADDED_TO_QUEUE(11),
    REASON_ACTIVATION_PAGE_MATCH(12),
    REASON_ACTIVATION_SEEK(13),
    UNRECOGNIZED(-1);

    public final int a;

    zhx0(int i) {
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
