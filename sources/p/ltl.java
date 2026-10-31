package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum ltl implements v190 {
    CONTENT_EXPERIENCE_UNSPECIFIED(0),
    CONTENT_EXPERIENCE_MUSIC(1),
    CONTENT_EXPERIENCE_TALK(2),
    UNRECOGNIZED(-1);

    public final int a;

    ltl(int i) {
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
