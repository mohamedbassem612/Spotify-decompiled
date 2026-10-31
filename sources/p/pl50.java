package p;

import com.spotify.mobius.android.AndroidLogger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pl50 extends hab0 implements iu30 {
    public final /* synthetic */ zo10 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl50(zo10 zo10Var) {
        super(1);
        this.a = zo10Var;
    }

    public final Object invoke(Object obj) {
        zo10 zo10Var = this.a;
        cas casVar = (a7m0) obj;
        casVar.a = new yg20(zo10Var, (byte) 16);
        casVar.a(r850.a1, r850.b1);
        casVar.e = new ol50(zo10Var, (byte) 0);
        casVar.d = new ol50(zo10Var, (byte) 1);
        casVar.g = new AndroidLogger();
        return rih1.a;
    }
}
