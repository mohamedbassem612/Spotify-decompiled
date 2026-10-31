package p;

import com.spotify.music.SpotifyMainActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b5b1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SpotifyMainActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b5b1(SpotifyMainActivity spotifyMainActivity, byte b) {
        super(0);
        this.a = b;
        this.b = spotifyMainActivity;
    }

    public final Object invoke() {
        byte b = this.a;
        SpotifyMainActivity spotifyMainActivity = this.b;
        switch (b) {
            case 0:
                return new t4t(spotifyMainActivity, spotifyMainActivity.J1);
            case 1:
                yxn0 yxn0Var = spotifyMainActivity.r1;
                if (yxn0Var != null) {
                    return yxn0Var.c;
                }
                u890.C("navigationStateStore");
                throw null;
            case 2:
                return new ve41(new b5b1(spotifyMainActivity, (byte) 1), new dr91(spotifyMainActivity, (byte) 28));
            default:
                return Boolean.valueOf(spotifyMainActivity.isTaskRoot());
        }
    }
}
