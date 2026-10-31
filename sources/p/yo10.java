package p;

import com.spotify.mobius.android.AndroidLogger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yo10 extends hab0 implements iu30 {
    public final /* synthetic */ zo10 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo10(zo10 zo10Var) {
        super(1);
        this.a = zo10Var;
    }

    public final Object invoke(Object obj) {
        cas casVar = (a7m0) obj;
        casVar.a = wo10.b;
        casVar.a(xc10.V0, xc10.W0);
        zo10 zo10Var = this.a;
        casVar.e = new xo10(zo10Var, (byte) 0);
        casVar.d = new xo10(zo10Var, (byte) 1);
        casVar.g = new AndroidLogger();
        return rih1.a;
    }
}
