package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum gyc implements v190 {
    UNDEFINED_CTA(0),
    AUDIOBOOK_ONBOARDING(1),
    PODCAST_ONBOARDING(2),
    MUSIC_ONBOARDING(3),
    COURSE_ONBOARDING(4),
    UNRECOGNIZED(-1);

    public final int a;

    gyc(int i) {
        this.a = i;
    }

    public static gyc a(int i) {
        if (i == 0) {
            return UNDEFINED_CTA;
        }
        if (i == 1) {
            return AUDIOBOOK_ONBOARDING;
        }
        if (i == 2) {
            return PODCAST_ONBOARDING;
        }
        if (i == 3) {
            return MUSIC_ONBOARDING;
        }
        if (i != 4) {
            return null;
        }
        return COURSE_ONBOARDING;
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
