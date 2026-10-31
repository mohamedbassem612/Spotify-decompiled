package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum eai1 implements v190 {
    USER_GAME_STATE_UNSPECIFIED(0),
    USER_GAME_STATE_AVAILABLE_FIRST_GAME(1),
    USER_GAME_STATE_AVAILABLE(2),
    USER_GAME_STATE_COMPLETED(3),
    USER_GAME_STATE_INELIGIBLE(4),
    UNRECOGNIZED(-1);

    public final int a;

    eai1(int i) {
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
