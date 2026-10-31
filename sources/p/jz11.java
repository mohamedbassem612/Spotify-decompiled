package p;

import android.os.Bundle;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jz11 implements vdh {
    public static eeh d(String str) {
        new Bundle().putString("com.spotify.music.extra.ERROR_MESSAGE", str);
        return new eeh(2, (Bundle) null);
    }

    public final boolean a(String str) {
        return "com.spotify.music.command.COMMAND_REMOTE_CONFIG".equals(str);
    }

    public final Single b(Bundle bundle) {
        if (bundle == null) {
            return Single.just(d("Extras are null"));
        }
        if (!bundle.containsKey("com.spotify.music.extra.REMOTE_PROPERTY")) {
            return Single.just(d("Missing extra com.spotify.music.extra.REMOTE_PROPERTY"));
        }
        String string = bundle.getString("com.spotify.music.extra.REMOTE_PROPERTY", null);
        return string.equals("bypass_auth_hadouken") ? Single.just(new eeh(1, cy30.g("bypass_auth_hadouken", "false"))) : Single.just(d("Unknown property ".concat(string)));
    }

    public final String c() {
        return "com.spotify.music.command.COMMAND_REMOTE_CONFIG";
    }
}
