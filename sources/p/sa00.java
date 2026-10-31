package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum sa00 implements v190 {
    EVENT_HERO_TREATMENT_UNSPECIFIED(0),
    EVENT_HERO_TREATMENT_STANDARD(1),
    EVENT_HERO_TREATMENT_CAMPAIGN_RESERVED(2),
    UNRECOGNIZED(-1);

    public final int a;

    sa00(int i) {
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
