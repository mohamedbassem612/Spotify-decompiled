package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum d0x0 implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    PROFILE_COMPLETION_SCREEN_UNSPECIFIED(0),
    INTRO(1),
    DISPLAY_NAME(2),
    PROFILE_PICTURE(3),
    CONFIRM(4),
    UNRECOGNIZED(-1);

    public final int a;

    d0x0(int i) {
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
