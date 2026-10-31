package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum rdh1 implements v190 {
    UI_STRING_KEY_UNSPECIFIED(0),
    PREHEADLINE(1),
    HEADLINE(2),
    TITLE(3),
    PRIMARY_BUTTON(4),
    EXPLANATION_TEXT(5),
    MARKER(6),
    SUB_MARKER(7),
    SOURCES(8),
    OTHER(9),
    POSITIVE_MESSAGE(10),
    NEGATIVE_MESSAGE(11),
    COMPLETION_BUTTON(12),
    SECONDARY_BUTTON(13),
    ROUND_NAME(14),
    COMPLETION_TIME_LABEL(15),
    SHARE_TEXT(16),
    UNRECOGNIZED(-1);

    public final int a;

    rdh1(int i) {
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
