package p;

import com.spotify.mobius.MobiusLoop;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g7c extends x7e0 {
    public final zwa d;
    public final j7c e;
    public final rmt f;
    public xab1 g;
    public final llm h;
    public final bpb1 i;
    public final bpb1 t;

    public g7c(zwa zwaVar, j7c j7cVar, rmt rmtVar) {
        b3s b3sVar = b3s.c;
        this.d = zwaVar;
        this.e = j7cVar;
        this.f = rmtVar;
        this.h = smo1.e(flo1.l(guo1.B(), b3sVar).y(new z8n("BrowseDestinationLoadableResource")));
        bpb1 bpb1VarB = gio1.b(yol.a);
        this.i = bpb1VarB;
        this.t = bpb1VarB;
    }

    public final void e() {
        Iterator it = this.f.a.iterator();
        while (it.hasNext()) {
            ((klo) ((gs80) it.next())).start();
        }
        this.g = fn31.T(this.h, (o8n) null, 0, new vk6(this, (lnm) null, (byte) 16), 3);
    }

    public final void f() {
        Iterator it = this.f.a.iterator();
        while (it.hasNext()) {
            MobiusLoop mobiusLoop = ((klo) ((gs80) it.next())).c;
            if (mobiusLoop == null) {
                u890.C("loop");
                throw null;
            }
            mobiusLoop.dispose();
        }
        xab1 xab1Var = this.g;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.g = null;
    }
}
