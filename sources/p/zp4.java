package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zp4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new lp4(this, (byte) 13));

    public zp4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        zp4 zp4Var = (zp4) this.c.getValue();
        return zp4Var != null ? zp4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("hide_share_header_action_for_music_video_playlists", "android-list-ux-platform-consumers-share-headeractions-share", a()));
    }
}
