package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum dia1 {
    RECENTLY_UPDATED("recently_updated"),
    RECENTLY_ADDED("recently_added"),
    ALPHABETICAL("alphabetical"),
    CREATOR("creator"),
    CUSTOM("custom"),
    RECENTLY_PLAYED_OR_ADDED("recently_played_or_added"),
    AUTHOR("author"),
    RELEVANCE("relevance"),
    DATE("event_start_time"),
    RELEASE_DATE("release_date");

    public final String a;
    public static final dia1 b = RECENTLY_PLAYED_OR_ADDED;

    dia1(String str) {
        this.a = str;
    }

    public final ywm1 a() {
        int iOrdinal = ordinal();
        ywm1 ywm1Var = ywm1.a;
        switch (iOrdinal) {
            case 0:
                return ywm1.e;
            case 1:
                return ywm1.c;
            case 2:
                return ywm1.b;
            case 3:
                return ywm1Var;
            case 4:
                return ywm1.d;
            case 5:
                return ywm1.f;
            case 6:
                return ywm1Var;
            case 7:
                return ywm1.g;
            case 8:
                return ywm1.h;
            case 9:
                return ywm1.i;
            default:
                eg.o();
                return null;
        }
    }
}
