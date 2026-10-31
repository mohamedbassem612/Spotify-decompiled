package p;

import com.spotify.mobius.android.AndroidLogger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eo7 extends hab0 implements iu30 {
    public final /* synthetic */ fo7 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo7(fo7 fo7Var) {
        super(1);
        this.a = fo7Var;
    }

    public final Object invoke(Object obj) {
        cas casVar = (a7m0) obj;
        casVar.a = c37.X;
        fo7 fo7Var = this.a;
        casVar.e = new do7(fo7Var, (byte) 0);
        casVar.d = new do7(fo7Var, (byte) 1);
        casVar.g = new AndroidLogger();
        return rih1.a;
    }
}
