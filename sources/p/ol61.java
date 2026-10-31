package p;

import android.content.Context;
import android.net.Uri;
import com.spotify.playlistartwork.setpictureimpl.SetPlaylistPictureWorker;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ol61 {
    public final Context a;

    public ol61(Context context) {
        this.a = context;
    }

    public final void a(Uri uri, String str, boolean z) {
        String strS = rqo1.s(str);
        ciq0 ciq0Var = new ciq0(SetPlaylistPictureWorker.class);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("KEY_PLAYLIST_URI", strS);
        linkedHashMap.put("KEY_IMAGE_URI", uri.toString());
        linkedHashMap.put("KEY_SHOW_RETRY_SNACKBAR", Boolean.valueOf(z));
        ewq ewqVar = new ewq(linkedHashMap);
        o0c.N(ewqVar);
        awl1.d(this.a).c(strS, 1, ciq0Var.i(ewqVar).b());
    }
}
