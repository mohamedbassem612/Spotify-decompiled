package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum j8y implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    ENGAGEMENT_TYPE_UNSPECIFIED(0),
    IMPRESSION(1),
    INTERACTION_CTA_TAP(2),
    INTERACTION_DISMISSAL(3),
    INTERACTION_SECONDARY_CTA(4),
    INTERACTION_REPLACE_ITEMS(5),
    UNRECOGNIZED(-1);

    public final int a;

    j8y(int i) {
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
