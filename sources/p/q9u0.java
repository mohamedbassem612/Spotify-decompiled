package p;

import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.SeekToCommand;
import com.spotify.player.model.command.SignalCommand;
import com.spotify.player.model.command.SkipToNextTrackCommand;
import com.spotify.player.model.command.SkipToPrevTrackCommand;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public abstract class q9u0 {
    public static d9u0 c(String str, boolean z) {
        return new d9u0(str, z);
    }

    public static e9u0 d(PauseCommand pauseCommand) {
        return new e9u0(pauseCommand);
    }

    public static g9u0 e(String str, boolean z) {
        return new g9u0(str, z);
    }

    public static h9u0 f(ResumeCommand resumeCommand) {
        return new h9u0(resumeCommand);
    }

    public static i9u0 g(long j) {
        return new i9u0(j);
    }

    public static j9u0 h(SeekToCommand seekToCommand) {
        return new j9u0(seekToCommand);
    }

    public static k9u0 i(SignalCommand signalCommand) {
        return new k9u0(signalCommand);
    }

    public static l9u0 j() {
        return new l9u0();
    }

    public static m9u0 k(SkipToNextTrackCommand skipToNextTrackCommand) {
        return new m9u0(skipToNextTrackCommand);
    }

    public static o9u0 l(SkipToPrevTrackCommand skipToPrevTrackCommand) {
        return new o9u0(skipToPrevTrackCommand);
    }

    public static p9u0 m() {
        return new p9u0();
    }

    public Object a(ogr ogrVar, ouz ouzVar, dqu dquVar, laz lazVar, fey feyVar, lmw lmwVar, puz puzVar, quz quzVar, mjv mjvVar, qmr qmrVar, rmr rmrVar, efr efrVar, tzo tzoVar) {
        return dquVar.apply(this);
    }

    public void b(yqb1 yqb1Var, o2b1 o2b1Var, zqb1 zqb1Var, utw0 utw0Var, yqb1 yqb1Var2, vr51 vr51Var, dn81 dn81Var, q881 q881Var, zqb1 zqb1Var2, wqb1 wqb1Var, xqb1 xqb1Var, y281 y281Var) {
        zqb1Var.a(this);
    }
}
