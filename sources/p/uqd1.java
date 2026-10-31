package p;

import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uqd1 implements Function {
    public final /* synthetic */ vqd1 a;
    public final /* synthetic */ Boolean b;

    public uqd1(vqd1 vqd1Var, Boolean bool) {
        this.a = vqd1Var;
        this.b = bool;
    }

    public final Object apply(Object obj) {
        PlayOrigin playOriginCreate;
        ou80 ou80Var = (ou80) obj;
        vqd1 vqd1Var = this.a;
        jgz0 jgz0Var = vqd1Var.f;
        m210 m210Var = vqd1Var.l;
        if (m210Var == null) {
            u890.C("description");
            throw null;
        }
        if (u890.j(m210Var.b, "212b005bde914f2c97ab6f310c28ad98")) {
            playOriginCreate = PlayOrigin.create("spotify-tap-autoplay");
            playOriginCreate.getClass();
        } else {
            playOriginCreate = PlayOrigin.create(vqd1Var.c.a);
            playOriginCreate.getClass();
        }
        return jgz0.a(jgz0Var, playOriginCreate, LoggingParams.builder().interactionId(ou80Var.a).build(), this.b, 20).flatMap(new vr51(ou80Var, (byte) 24));
    }
}
