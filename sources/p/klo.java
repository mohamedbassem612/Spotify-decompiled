package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class klo implements mko, gs80 {
    public final qlw a;
    public final String b;
    public MobiusLoop c;
    public final idd1 d = new idd1(new z5o(this, (byte) 3));

    public klo(qlw qlwVar, String str) {
        this.a = qlwVar;
        this.b = str;
    }

    public final void a(Set set) {
        MobiusLoop mobiusLoop = this.c;
        if (mobiusLoop != null) {
            mobiusLoop.a(new y450(set));
        } else {
            u890.C("loop");
            throw null;
        }
    }

    public final kko b() {
        return (kko) this.d.getValue();
    }

    public final void start() {
        MobiusLoop.Builder builderG = l1d.g(Mobius.d(rve0.c, this.a.a((String) null, new m95(this.b, (lnm) null, (byte) 1))));
        w7x w7xVar = w7x.a;
        this.c = builderG.g(new ijo(12, w7xVar, w7xVar));
    }

    public final void stop() {
    }
}
