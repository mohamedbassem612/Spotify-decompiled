package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum gw80 implements v190 {
    INTERACTION_TYPE_UNSPECIFIED(0),
    ANSWER_BUTTON_ENTRY(1),
    TIMER_ENTRY(2),
    BUTTON_TAP(3),
    CORRECT_ANSWER(4),
    INCORRECT_ANSWER(5),
    NEXT_BUTTON(6),
    QUIZ_COMPLETE(7),
    UNRECOGNIZED(-1);

    public final int a;

    gw80(int i) {
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
