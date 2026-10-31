package p;

import com.spotify.mobius.android.AndroidLogger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fcd0 extends hab0 implements iu30 {
    public final /* synthetic */ gcd0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcd0(gcd0 gcd0Var) {
        super(1);
        this.a = gcd0Var;
    }

    public final Object invoke(Object obj) {
        gcd0 gcd0Var = this.a;
        cas casVar = (a7m0) obj;
        casVar.a = new s2c0((Object) gcd0Var, (byte) 15);
        casVar.a(ecd0.b, ecd0.c);
        casVar.e = new dcd0(gcd0Var, (byte) 0);
        casVar.d = new dcd0(gcd0Var, (byte) 1);
        casVar.g = new AndroidLogger();
        return rih1.a;
    }
}
