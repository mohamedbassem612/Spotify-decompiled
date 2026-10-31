package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum d01 implements v190 {
    ENTITY_PAGE(0),
    SEARCH(1),
    TRACK_SKIP(2),
    HOME(3),
    NOW_PLAYING(4);

    private static final y190 internalValueMap = new jcx0((byte) 27);
    private final int value;

    d01(int i) {
        this.value = i;
    }

    public static d01 a(int i) {
        if (i == 0) {
            return ENTITY_PAGE;
        }
        if (i == 1) {
            return SEARCH;
        }
        if (i == 2) {
            return TRACK_SKIP;
        }
        if (i == 3) {
            return HOME;
        }
        if (i != 4) {
            return null;
        }
        return NOW_PLAYING;
    }

    public final int getNumber() {
        return this.value;
    }
}
