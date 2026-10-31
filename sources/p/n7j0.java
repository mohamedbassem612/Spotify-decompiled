package p;

import com.spotify.mobius.android.AndroidLogger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n7j0 extends hab0 implements iu30 {
    public final /* synthetic */ res a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7j0(res resVar) {
        super(1);
        this.a = resVar;
    }

    public final Object invoke(Object obj) {
        cas casVar = (a7m0) obj;
        casVar.a = m2j0.d;
        res resVar = this.a;
        casVar.e = new m7j0(resVar, (byte) 0);
        casVar.d = new m7j0(resVar, (byte) 1);
        casVar.a(hvi0.X, hvi0.Y);
        casVar.g = new AndroidLogger();
        return rih1.a;
    }
}
