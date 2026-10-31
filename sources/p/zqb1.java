package p;

import com.spotify.player.model.command.options.SkipToPrevTrackOptions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zqb1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ arb1 b;

    public /* synthetic */ zqb1(arb1 arb1Var, byte b) {
        this.a = b;
        this.b = arb1Var;
    }

    public final void a(Object obj) {
        spq0 spq0VarAllowSeeking;
        Boolean bool;
        byte b = this.a;
        arb1 arb1Var = this.b;
        switch (b) {
            case 0:
                arb1.b(arb1Var).a();
                break;
            default:
                grb1 grb1VarB = arb1.b(arb1Var);
                SkipToPrevTrackOptions skipToPrevTrackOptions = (SkipToPrevTrackOptions) ((o9u0) obj).n().options().h();
                grb1VarB.f((skipToPrevTrackOptions == null || (spq0VarAllowSeeking = skipToPrevTrackOptions.allowSeeking()) == null || (bool = (Boolean) spq0VarAllowSeeking.e(Boolean.FALSE)) == null) ? false : bool.booleanValue());
                break;
        }
    }
}
