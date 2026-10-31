package p;

import com.spotify.music.SpotifyMainActivity;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class m481 extends rg30 {
    public final /* synthetic */ byte b = 1;
    public final Object c;

    public m481(Map map, gg11 gg11Var) {
        this.c = new a2k(sqg0.O(map, gg11Var));
    }

    public final zf30 a(ClassLoader classLoader, String str) {
        byte b = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                return ((a2k) obj).a(classLoader, str);
            default:
                ynb0 ynb0Var = ((SpotifyMainActivity) obj).k1;
                if (ynb0Var != null) {
                    return ((a2k) ynb0Var.get()).a(classLoader, str);
                }
                u890.C("compositeFragmentFactory");
                throw null;
        }
    }

    public m481(SpotifyMainActivity spotifyMainActivity) {
        this.c = spotifyMainActivity;
    }
}
