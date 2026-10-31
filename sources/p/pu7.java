package p;

import com.spotify.player.model.AudioStream;
import com.spotify.timeline_conductor.audiofocus.proto.GainAudioFocusRequest;
import com.spotify.timeline_conductor.audiofocus.proto.LoseAudioFocusRequest;
import io.reactivex.rxjava3.core.SingleEmitter;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pu7 implements hnh0 {
    public final /* synthetic */ ru7 a;

    public pu7(ru7 ru7Var) {
        this.a = ru7Var;
    }

    @Override // p.hnh0
    public final void a() {
        if (this.a.S0) {
            return;
        }
        ru7 ru7Var = this.a;
        boolean z = true;
        boolean z2 = ru7Var.X.f() && ru7Var.W0;
        ru7 ru7Var2 = this.a;
        if (!z2) {
            boolean zG = ru7Var2.X.g();
            ru7 ru7Var3 = this.a;
            if (!zG) {
                ru7Var3.c();
                return;
            } else {
                ru7Var3.R0.add(new lu7());
                this.a.e();
                return;
            }
        }
        if (!ru7Var2.X0 || !ru7Var2.U0 || ((!ru7Var2.X.e() && ru7Var2.b.f == AudioStream.ALARM) || (ru7Var2.V0 && !ru7Var2.a()))) {
            z = false;
        }
        v6a0 v6a0Var = ru7Var2.Z;
        sy30 sy30VarN = GainAudioFocusRequest.n();
        sy30VarN.n(z);
        GainAudioFocusRequest gainAudioFocusRequestBuild = sy30VarN.build();
        vku vkuVar = (vku) v6a0Var.c;
        be beVar = (be) v6a0Var.b;
        gainAudioFocusRequestBuild.getClass();
        vkuVar.a(beVar.callSingle("spotify.timeline_conductor.audio_focus.proto.ConductorAudioFocus", "GainAudioFocus", gainAudioFocusRequestBuild).map(q9w.S0).subscribe(k530.c1, k530.d1));
        for (dxg1 dxg1Var : ru7Var2.i) {
            SingleEmitter singleEmitter = dxg1Var.b;
            if (singleEmitter != null && dxg1Var.c) {
                singleEmitter.onSuccess(Boolean.TRUE);
            }
            dxg1Var.c = false;
        }
    }

    @Override // p.hnh0
    public final void b(boolean z, boolean z2) {
        if (this.a.S0) {
            return;
        }
        ru7 ru7Var = this.a;
        boolean z3 = ru7Var.X.f() && ru7Var.W0;
        ru7 ru7Var2 = this.a;
        if (!z3) {
            boolean zG = ru7Var2.X.g();
            ru7 ru7Var3 = this.a;
            if (zG) {
                ru7Var3.R0.add(new mu7(z, z2));
                this.a.e();
                return;
            }
            ru7Var3.U0 = z;
            if (z && z2) {
                return;
            }
            ru7Var3.b();
            return;
        }
        ru7Var2.U0 = z;
        ru7Var2.X0 = false;
        if (z && z2) {
            return;
        }
        ru7Var2.V0 = ru7Var2.a();
        ru7Var2.X0 = z;
        v6a0 v6a0Var = ru7Var2.Z;
        s7f0 s7f0VarN = LoseAudioFocusRequest.n();
        s7f0VarN.n(z);
        LoseAudioFocusRequest loseAudioFocusRequestBuild = s7f0VarN.build();
        vku vkuVar = (vku) v6a0Var.c;
        be beVar = (be) v6a0Var.b;
        loseAudioFocusRequestBuild.getClass();
        vkuVar.a(beVar.callSingle("spotify.timeline_conductor.audio_focus.proto.ConductorAudioFocus", "LoseAudioFocus", loseAudioFocusRequestBuild).map(s9w.S0).subscribe(k530.e1, zzc0.b));
        Iterator it = ru7Var2.i.iterator();
        while (it.hasNext()) {
            ((dxg1) it.next()).c = z;
        }
    }
}
