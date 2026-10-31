package p;

import com.spotify.prefs.esperanto.proto.EsPrefs;
import io.reactivex.rxjava3.core.Completable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nqc1 {
    public final pov0 a;

    public nqc1(pov0 pov0Var) {
        this.a = pov0Var;
    }

    public final Completable a(hpc1 hpc1Var) {
        String str = hpc1Var != null ? hpc1Var.f : null;
        if (str == null) {
            str = "";
        }
        boolean z = hpc1Var != null ? hpc1Var.g : false;
        fqz fqzVarP = EsPrefs.SetParams.p();
        iqz iqzVarR = EsPrefs.Value.r();
        iqzVarR.r(str);
        fqzVarP.n("video.subtitles", iqzVarR.build());
        iqz iqzVarR2 = EsPrefs.Value.r();
        iqzVarR2.n(z);
        fqzVarP.n("video.subtitles_cc", iqzVarR2.build());
        EsPrefs.SetParams setParamsBuild = fqzVarP.build();
        setParamsBuild.getClass();
        return this.a.callSingle("spotify.prefs.esperanto.proto.Prefs", "Set", setParamsBuild).map(a020.d1).flatMapCompletable(new nl51(setParamsBuild, (byte) 24));
    }
}
