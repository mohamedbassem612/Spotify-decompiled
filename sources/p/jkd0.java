package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.messages.ListeningPartyMusicTrackEnded;
import com.spotify.messages.ListeningPartyPlayedTalkTrack;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class jkd0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hr0 b;

    public /* synthetic */ jkd0(hr0 hr0Var, byte b) {
        this.a = b;
        this.b = hr0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        hr0 hr0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                sxt0 sxt0Var = (sxt0) obj;
                t2j0 t2j0Var = hr0Var.a;
                mkd0 mkd0VarN = ListeningPartyMusicTrackEnded.n();
                mkd0VarN.r(sxt0Var.a.toString());
                mkd0VarN.s(sxt0Var.b.toString());
                mkd0VarN.q(sxt0Var.c);
                mkd0VarN.t(sxt0Var.e);
                Long l = sxt0Var.d;
                if (l != null) {
                    mkd0VarN.n(l.longValue());
                }
                t2j0Var.a(mkd0VarN.build());
                break;
            default:
                uxt0 uxt0Var = (uxt0) obj;
                t2j0 t2j0Var2 = hr0Var.a;
                ukd0 ukd0VarN = ListeningPartyPlayedTalkTrack.n();
                ukd0VarN.r(uxt0Var.a.toString());
                ukd0VarN.q(uxt0Var.b);
                ukd0VarN.n(uxt0Var.c);
                ukd0VarN.s(uxt0Var.d);
                t2j0Var2.a(ukd0VarN.build());
                break;
        }
    }
}
