package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.android.AndroidLogger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vx00 extends hab0 implements iu30 {
    public final /* synthetic */ zx00 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx00(zx00 zx00Var) {
        super(1);
        this.a = zx00Var;
    }

    public final Object invoke(Object obj) {
        zx00 zx00Var = this.a;
        cas casVar = (a7m0) obj;
        casVar.a = new htu(zx00Var, (byte) 22);
        casVar.c = new r1k(new Connectable[]{zx00Var.b, zx00Var.c, new qn(zx00Var.d, zx00Var.g, (byte) 6)}, (byte) 1);
        casVar.e = new ux00(zx00Var, (byte) 0);
        casVar.d = new ux00(zx00Var, (byte) 1);
        casVar.g = new AndroidLogger();
        return rih1.a;
    }
}
