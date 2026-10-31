package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum i8y implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    ENGAGEMENT_TYPE_UNSPECIFIED(0),
    ENGAGEMENT_TYPE_INTERACTION_DISMISSAL(1),
    ENGAGEMENT_TYPE_IMPRESSION(2),
    ENGAGEMENT_TYPE_INTERACTION_CTA_TAP(3),
    UNRECOGNIZED(-1);

    public final int a;

    i8y(int i) {
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
