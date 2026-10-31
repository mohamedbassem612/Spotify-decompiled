package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum tv50 implements v190 {
    HEADER_ARTIST_ROLE_UNSPECIFIED(0),
    HEADER_ARTIST_ROLE_HEADLINER(1),
    HEADER_ARTIST_ROLE_SUPPORTING(2),
    UNRECOGNIZED(-1);

    public final int a;

    tv50(int i) {
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
