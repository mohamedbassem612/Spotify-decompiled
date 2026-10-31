package p;

import com.spotify.music.SpotifyMainActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cyn0 implements o5s {
    public final /* synthetic */ eyn0 a;

    public cyn0(eyn0 eyn0Var) {
        this.a = eyn0Var;
    }

    public final void onCreate(iac0 iac0Var) {
        eyn0 eyn0Var = this.a;
        ((SpotifyMainActivity) eyn0Var.a).J().b((du9) eyn0Var.o);
        hds hdsVar = (hds) eyn0Var.h;
        hdsVar.b.add(new dyn0((xkm0) eyn0Var.f25p));
        hdsVar.a();
    }

    public final void onDestroy(iac0 iac0Var) {
        eyn0 eyn0Var = this.a;
        hds hdsVar = (hds) eyn0Var.h;
        hdsVar.b.remove(new dyn0((xkm0) eyn0Var.f25p));
    }
}
