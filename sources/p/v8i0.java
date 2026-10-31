package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract /* synthetic */ class v8i0 {
    public static final String a(int i) {
        return c(i);
    }

    public static /* synthetic */ byte b(int i) {
        if (i == 1) {
            return (byte) 2;
        }
        if (i == 2) {
            return (byte) 3;
        }
        if (i == 3) {
            return (byte) 4;
        }
        throw null;
    }

    public static /* synthetic */ String c(int i) {
        if (i == 1) {
            return "observation_end";
        }
        if (i == 2) {
            return "interval_end";
        }
        if (i == 3) {
            return "app_shutdown";
        }
        if (i == 4) {
            return "interval_segment_recovered";
        }
        throw null;
    }

    public static /* synthetic */ String d(int i) {
        if (i == 1) {
            return "default";
        }
        if (i == 2) {
            return "latest_release";
        }
        if (i == 3) {
            return "upcoming_release";
        }
        throw null;
    }

    public static /* synthetic */ String e(int i) {
        switch (i) {
            case 1:
                return "concerts";
            case 2:
                return "editorial_playlist";
            case 3:
                return "editorial_playlist_placements";
            case 4:
                return "fresh_finds_forward";
            case 5:
                return "playlisted";
            case 6:
                return "registered_in_spotify";
            case 7:
                return "releases";
            case 8:
                return "tours";
            case 9:
                return "unknown";
            case 10:
                return "verified_by_spotify";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String f(int i) {
        if (i == 1) {
            return "ai_persona";
        }
        if (i == 2) {
            return "ai_persona_likely";
        }
        if (i == 3) {
            return "fresh_finds_forward";
        }
        throw null;
    }

    public static /* synthetic */ String g(int i) {
        if (i == 1) {
            return "ai_persona";
        }
        if (i == 2) {
            return "ai_persona_likely";
        }
        if (i == 3) {
            return "fresh_finds_forward";
        }
        if (i == 4) {
            return "verified";
        }
        throw null;
    }

    public static int h(s69 s69Var, int i, int i2) {
        return (s69Var.hashCode() + i) * i2;
    }

    public static void i(float f, int i, x340 x340Var, x340 x340Var2, nim0 nim0Var) {
        x340Var.i0(i);
        op71.g(x340Var2, u291.h(nim0Var, f));
    }

    public static void j(String str, String str2) {
        n57.s(str + str2);
    }

    public static /* synthetic */ void k(wvz0 wvz0Var) {
        throw new ClassCastException();
    }

    public static /* synthetic */ void l(yvz0 yvz0Var) {
        throw new ClassCastException();
    }

    public static /* synthetic */ String m(int i) {
        if (i == 1) {
            return "CIRCULAR";
        }
        if (i == 2) {
            return "ROUNDED_CORNER";
        }
        if (i == 3) {
            return "NONE";
        }
        throw null;
    }
}
