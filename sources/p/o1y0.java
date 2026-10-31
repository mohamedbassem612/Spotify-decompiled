package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum o1y0 implements v190 {
    UNSPECIFIED(0),
    MANUAL(1),
    SCHEDULED(2),
    OUTDATED_PROMPT_VERSION_TRIGGER(3),
    OVERDUE_SCHEDULED_PLAYLIST_OPENED(4),
    UNRECOGNIZED(-1);

    public final int a;

    o1y0(int i) {
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
