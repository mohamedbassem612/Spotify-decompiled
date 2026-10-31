package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cjj0 implements z190 {
    public static final cjj0 b = new cjj0(0);
    public static final cjj0 c = new cjj0(1);
    public static final cjj0 d = new cjj0(2);
    public static final cjj0 e = new cjj0(3);
    public static final cjj0 f = new cjj0(4);
    public static final cjj0 g = new cjj0(5);
    public static final cjj0 h = new cjj0(6);
    public static final cjj0 i = new cjj0(7);
    public static final cjj0 j = new cjj0(8);
    public static final cjj0 k = new cjj0(9);
    public static final cjj0 l = new cjj0(10);
    public static final cjj0 m = new cjj0(11);
    public static final cjj0 n = new cjj0(12);
    public static final cjj0 o = new cjj0(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final cjj0 f10p = new cjj0(14);
    public static final cjj0 q = new cjj0(15);
    public static final cjj0 r = new cjj0(16);
    public final /* synthetic */ byte a;

    public /* synthetic */ cjj0(byte b2) {
        this.a = b2;
    }

    public final boolean isInRange(int i2) {
        gru0 gru0Var = null;
        switch (this.a) {
            case 0:
                if (i2 == 0) {
                    gru0Var = djj0.MIXED;
                } else if (i2 == 1) {
                    gru0Var = djj0.AUDIO;
                } else if (i2 == 2) {
                    gru0Var = djj0.VIDEO;
                }
                return gru0Var != null;
            case 1:
                return ejj0.a(i2) != null;
            case 2:
                if (i2 == 0) {
                    gru0Var = fjj0.UNKNOWN;
                } else if (i2 == 1) {
                    gru0Var = fjj0.NONE;
                } else if (i2 == 2) {
                    gru0Var = fjj0.ALLOWED;
                } else if (i2 == 3) {
                    gru0Var = fjj0.MANDATORY;
                }
                return gru0Var != null;
            case 3:
                return oln0.a(i2) != null;
            case 4:
                if (i2 == 0) {
                    gru0Var = pln0.NONE;
                } else if (i2 == 1) {
                    gru0Var = pln0.CANVAS_DISABLED;
                } else if (i2 == 2) {
                    gru0Var = pln0.LOW_DISTRACTION;
                } else if (i2 == 3) {
                    gru0Var = pln0.DATA_SAVER;
                } else if (i2 == 4) {
                    gru0Var = pln0.TRAIT_NOT_RESOLVED;
                }
                return gru0Var != null;
            case 5:
                if (i2 == 0) {
                    gru0Var = qln0.IOS;
                } else if (i2 == 1) {
                    gru0Var = qln0.ANDROID;
                } else if (i2 == 2) {
                    gru0Var = qln0.DESKTOP;
                }
                return gru0Var != null;
            case 6:
                if (i2 == 0) {
                    gru0Var = rln0.RENDER_MODE_UNSET;
                } else if (i2 == 1) {
                    gru0Var = rln0.RENDER_MODE_VIDEO_AUTOPLAY;
                } else if (i2 == 2) {
                    gru0Var = rln0.RENDER_MODE_VIDEO_STATIC;
                } else if (i2 == 3) {
                    gru0Var = rln0.RENDER_MODE_AUDIO_FALLBACK;
                }
                return gru0Var != null;
            case 7:
                if (i2 == 0) {
                    gru0Var = sln0.b;
                } else if (i2 == 1) {
                    gru0Var = sln0.c;
                } else if (i2 == 2) {
                    gru0Var = sln0.d;
                } else if (i2 == 3) {
                    gru0Var = sln0.e;
                } else if (i2 == 4) {
                    gru0Var = sln0.f;
                }
                return gru0Var != null;
            case 8:
                if (i2 == 0) {
                    gru0Var = tln0.HOME;
                } else if (i2 == 1) {
                    gru0Var = tln0.BROWSE;
                }
                return gru0Var != null;
            case 9:
                if (i2 == 0) {
                    gru0Var = tls0.CLAIM_FAIL_REASON_UNSPECIFIED;
                } else if (i2 == 1) {
                    gru0Var = tls0.CLAIM_FAIL_REASON_ANONYMOUS;
                } else if (i2 == 2) {
                    gru0Var = tls0.CLAIM_FAIL_REASON_NO_GRANT_FOUND;
                } else if (i2 == 3) {
                    gru0Var = tls0.CLAIM_FAIL_REASON_GRANT_EXPIRED;
                }
                return gru0Var != null;
            case 10:
                return vls0.a(i2) != null;
            case 11:
                return yls0.a(i2) != null;
            case 12:
                if (i2 == 0) {
                    gru0Var = gru0.b;
                } else if (i2 == 1) {
                    gru0Var = gru0.c;
                }
                return gru0Var != null;
            case 13:
                if (i2 == 0) {
                    gru0Var = loy0.PUBLISHED_STATE_UNSPECIFIED;
                } else if (i2 == 1) {
                    gru0Var = loy0.PUBLISHED_STATE_NOT_PUBLISHED;
                } else if (i2 == 2) {
                    gru0Var = loy0.PUBLISHED_STATE_PUBLISHED;
                }
                return gru0Var != null;
            case 14:
                return o981.a(i2) != null;
            case 15:
                return ja81.a(i2) != null;
            default:
                return la81.a(i2) != null;
        }
    }
}
