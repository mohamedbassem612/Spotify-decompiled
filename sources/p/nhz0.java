package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum nhz0 implements v190 {
    QUIZ_CONTENT_VARIANT_UNSPECIFIED(0),
    QUIZ_CONTENT_VARIANT_PLAY_QUIZ(1),
    QUIZ_CONTENT_VARIANT_SCORE_SHARE(2),
    QUIZ_CONTENT_VARIANT_CHALLENGE_FRIEND(3),
    UNRECOGNIZED(-1);

    public final int a;

    nhz0(int i) {
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
