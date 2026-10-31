package p;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jyf0 implements byf0 {
    public nh91 X;
    public final Context a;
    public final ynb0 b;
    public final Set c;
    public final ynb0 d;
    public final c9n e;
    public final q8n f;
    public final int g;
    public faa0 h;
    public xab1 i;
    public nqs t;

    public jyf0(Context context, ynb0 ynb0Var, t380 t380Var, ynb0 ynb0Var2, c9n c9nVar, q8n q8nVar, int i) {
        this.a = context;
        this.b = ynb0Var;
        this.c = t380Var;
        this.d = ynb0Var2;
        this.e = c9nVar;
        this.f = q8nVar;
        this.g = i;
    }

    public final void c() {
        Set set = this.c;
        if (set.isEmpty()) {
            return;
        }
        this.h = c921.y(this.e, this.f, 0, new tfe0(this, (lnm) null, (byte) 11), 2);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((nh91) it.next()).start();
        }
    }

    public final void d() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((nh91) it.next()).stop();
        }
        faa0 faa0Var = this.h;
        if (faa0Var != null) {
            faa0Var.d((CancellationException) null);
        }
        xab1 xab1Var = this.i;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        nqs nqsVar = this.t;
        if (nqsVar != null) {
            nqsVar.a();
        }
        this.t = null;
        this.X = null;
    }

    public final void g(ViewGroup viewGroup) {
    }
}
