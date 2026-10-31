package p;

import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f831 implements uxh0 {
    public final /* synthetic */ byte c;
    public final mxh0 d;

    public /* synthetic */ f831(mxh0 mxh0Var, byte b) {
        this.c = b;
        this.d = mxh0Var;
    }

    public final m210 a(String str) {
        switch (this.c) {
            case 0:
                return new m210("", "", "", "app_to_app", "", "app", "", "", "", "media_session", str);
            default:
                return new m210(286, "Rockscout", (String) null, (String) null, (String) null, "car", "mirrorlink", "rockscout", (String) null, "media_session", str);
        }
    }

    public final boolean b(String str) {
        switch (this.c) {
            case 0:
                return "com.android.systemui".equals(str);
            default:
                return "com.carconnectivity.mlmediaplayer".equals(str);
        }
    }

    public final lxh0 c(x610 x610Var, int i) {
        byte b = this.c;
        PlayOrigin playOrigin = uxh0.a;
        g8q g8qVar = this.d;
        switch (b) {
            case 0:
                return g8qVar.b(x610Var, playOrigin, i);
            default:
                return ((f8q) g8qVar).b(x610Var, playOrigin, i);
        }
    }
}
