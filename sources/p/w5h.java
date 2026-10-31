package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum w5h implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(0),
    IGNOREINRECS(4),
    /* JADX INFO: Fake field, exist only in values array */
    BANNED_ARTISTS(8),
    CONCERTS(10),
    PRERELEASE(12),
    MARKED_AS_FINISHED(13),
    NOT_INTERESTED(14),
    PAGE_MATCH(16),
    ISBN_SCAN(18),
    RATINGS(19),
    HOME_HIDES(20),
    MVCDP_NOTIFICATIONS(21),
    UNRECOGNIZED(-1);

    public final int a;

    w5h(int i) {
        this.a = i;
    }

    @Override // p.v190
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
