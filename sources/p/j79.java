package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public enum j79 implements v190 {
    AUTOMATION_SPECIAL_ROLE_UNSPECIFIED(0),
    AUTOMATION_SPECIAL_ROLE_BYPASS(1),
    AUTOMATION_SPECIAL_ROLE_OFF(2),
    AUTOMATION_SPECIAL_ROLE_MUTE(3),
    AUTOMATION_SPECIAL_ROLE_KILL(4),
    UNRECOGNIZED(-1);

    public final int a;

    j79(int i) {
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
