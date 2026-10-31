package p;

import android.content.Intent;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b6b1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c6b1 b;

    public /* synthetic */ b6b1(c6b1 c6b1Var, byte b) {
        this.a = b;
        this.b = c6b1Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        c6b1 c6b1Var = this.b;
        switch (b) {
            case 0:
                bma1 bma1Var = c6b1.f;
                Intent intent = new Intent("com.spotify.music.metadatachanged");
                yqg yqgVar = (yqg) c6b1Var.b.get();
                owt0.a(intent, (PlayerState) obj, yqgVar);
                intent.putExtra("timeSent", yqgVar.b());
                c6b1Var.a.sendStickyBroadcast(intent);
                break;
            case 1:
                PlayerState playerState = (PlayerState) obj;
                bma1 bma1Var2 = c6b1.f;
                Intent intent2 = new Intent("com.spotify.music.playbackstatechanged");
                yqg yqgVar2 = (yqg) c6b1Var.b.get();
                owt0.a(intent2, playerState, yqgVar2);
                boolean z = false;
                intent2.putExtra("playing", !playerState.isPaused() && playerState.isPlaying());
                if (!playerState.isPaused() && playerState.isPlaying()) {
                    z = true;
                }
                intent2.putExtra("playstate", z);
                intent2.putExtra("timeSent", yqgVar2.b());
                c6b1Var.a.sendStickyBroadcast(intent2);
                break;
            default:
                bma1 bma1Var3 = c6b1.f;
                Intent intent3 = new Intent("com.spotify.music.queuechanged");
                intent3.putExtra("timeSent", ((yqg) c6b1Var.b.get()).b());
                c6b1Var.a.sendStickyBroadcast(intent3);
                break;
        }
    }
}
