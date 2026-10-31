package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum m960 implements v190 {
    UNSPECIFIED_STYLE(0),
    ARTIST(1),
    TRACK(2),
    PLAYLIST(3),
    MOOD(5),
    UNRECOGNIZED(-1);

    public final int a;

    m960(int i) {
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
