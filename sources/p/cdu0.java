package p;

import com.spotify.player.model.SleepTimer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cdu0 implements vr20 {
    public final /* synthetic */ fdu0 a;

    public cdu0(fdu0 fdu0Var) {
        this.a = fdu0Var;
    }

    @Override // p.vr20
    public final Object emit(Object obj, lnm lnmVar) {
        fdu0 fdu0Var = this.a;
        Object objH = c921.H(fdu0Var.e, new bdu0((SleepTimer.Timestamp) obj, fdu0Var, null), lnmVar);
        return objH == d9n.a ? objH : rih1.a;
    }
}
