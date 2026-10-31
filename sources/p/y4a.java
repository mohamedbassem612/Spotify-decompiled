package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum y4a implements v190 {
    BANNER_BODY_ICON_UNSPECIFIED(0),
    SUCCESS(1),
    NO_MATCH(2),
    FAIL(3),
    UNRECOGNIZED(-1);

    public final int a;

    y4a(int i) {
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
