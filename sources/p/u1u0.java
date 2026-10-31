package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u1u0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m1u0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u1u0(m1u0 m1u0Var, byte b) {
        super(1);
        this.a = b;
        this.b = m1u0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        m1u0 m1u0Var = this.b;
        switch (b) {
            case 0:
                return m1u0Var.b((Bundle) obj, "com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_ADD_TO_COLLECTION");
            case 1:
                return m1u0Var.b((Bundle) obj, "com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_BAN");
            case 2:
                return m1u0Var.b((Bundle) obj, "com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_SHUTDOWN");
            case 3:
                return m1u0Var.b((Bundle) obj, "com.spotify.playbacknotifications.playbacknotifications.PAUSE");
            case 4:
                return m1u0Var.b((Bundle) obj, "com.spotify.playbacknotifications.playbacknotifications.RESUME");
            case 5:
                return m1u0Var.b((Bundle) obj, "com.spotify.playbacknotifications.playbacknotifications.SEEK_BACK_15_SEC");
            case 6:
                return m1u0Var.b((Bundle) obj, "com.spotify.playbacknotifications.playbacknotifications.SEEK_FORWARD_15_SEC");
            case 7:
                return m1u0Var.b((Bundle) obj, "com.spotify.playbacknotifications.playbacknotifications.SKIP_NEXT");
            case 8:
                return m1u0Var.b((Bundle) obj, "com.spotify.playbacknotifications.playbacknotifications.SKIP_PREV");
            case 9:
                return m1u0Var.b((Bundle) obj, "com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_REMOVE_FROM_COLLECTION");
            default:
                return m1u0Var.b((Bundle) obj, "com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_UNBAN");
        }
    }
}
