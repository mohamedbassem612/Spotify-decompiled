package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum oiz implements v190 {
    ERROR_REASON_UNSPECIFIED(0),
    ERROR_REASON_PROMPT_REJECTED(1),
    ERROR_REASON_ATTACHMENT_REJECTED(2),
    ERROR_REASON_ATTACHMENT_NOT_VALIDATED(3),
    ERROR_REASON_NO_CREDITS(4),
    ERROR_REASON_GENERATION_NOT_FOUND(5),
    ERROR_REASON_INVALID_VOICE(6),
    ERROR_REASON_INVALID_SCHEDULE(7),
    UNRECOGNIZED(-1);

    public final int a;

    oiz(int i) {
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
