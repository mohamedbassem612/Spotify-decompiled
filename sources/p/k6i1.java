package p;

import com.spotify.mobius.android.AndroidLogger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k6i1 extends hab0 implements iu30 {
    public final /* synthetic */ m6i1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6i1(m6i1 m6i1Var) {
        super(1);
        this.a = m6i1Var;
    }

    public final Object invoke(Object obj) {
        m6i1 m6i1Var = this.a;
        cas casVar = (a7m0) obj;
        casVar.a = new rvd1(m6i1Var, (byte) 24);
        casVar.e = new j6i1(m6i1Var, (byte) 0);
        casVar.d = new j6i1(m6i1Var, (byte) 1);
        casVar.g = new AndroidLogger();
        return rih1.a;
    }
}
