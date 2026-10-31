package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum uqt0 implements v190 {
    PLAY_REASON_UNKNOWN(0),
    PLAY_REASON_APP_LOAD(1),
    PLAY_REASON_BACK_BTN(2),
    PLAY_REASON_CLICK_ROW(3),
    PLAY_REASON_CLICK_SIDE(4),
    PLAY_REASON_END_PLAY(5),
    PLAY_REASON_FWD_BTN(6),
    PLAY_REASON_INTERRUPTED(7),
    PLAY_REASON_LOGOUT(8),
    PLAY_REASON_PLAY_BTN(9),
    PLAY_REASON_POPUP(10),
    PLAY_REASON_REMOTE(11),
    PLAY_REASON_SONG_DONE(12),
    PLAY_REASON_TRACK_DONE(13),
    PLAY_REASON_TRACK_ERROR(14),
    PLAY_REASON_PREVIEW(15),
    PLAY_REASON_URI_OPEN(16),
    PLAY_REASON_BACKGROUNDED(17),
    PLAY_REASON_OFFLINE(18),
    PLAY_REASON_UNEXPECTED_EXIT(19),
    PLAY_REASON_UNEXPECTED_EXIT_WHILE_PAUSED(20),
    PLAY_REASON_SWITCHED_TO_AUDIO(21),
    PLAY_REASON_SWITCHED_TO_VIDEO(22),
    PLAY_REASON_RECONNECT(23),
    UNRECOGNIZED(-1);

    public final int a;

    uqt0(int i) {
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
