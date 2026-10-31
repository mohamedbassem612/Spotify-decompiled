package p;

import androidx.camera.core.ImageCaptureException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hpd1 implements xe30 {
    public st60 b;
    public final ArrayList c;
    public final ArrayDeque a = new ArrayDeque();
    public boolean d = false;

    public hpd1(jxa jxaVar) {
        w8p1.m();
        this.c = new ArrayList();
    }

    @Override // p.xe30
    public final void a(ye30 ye30Var) {
        ((js50) x2g0.A()).execute(new v241(this, (byte) 14));
    }

    public final void b() {
        w8p1.m();
        new ImageCaptureException("Camera is closed.", null);
        ArrayDeque arrayDeque = this.a;
        Iterator it = arrayDeque.iterator();
        if (it.hasNext()) {
            throw pze0.g(it);
        }
        arrayDeque.clear();
        Iterator it2 = new ArrayList(this.c).iterator();
        if (it2.hasNext()) {
            pze0.m(it2.next());
            throw null;
        }
    }

    public final void c() {
        int iH;
        w8p1.m();
        if (this.d) {
            return;
        }
        st60 st60Var = this.b;
        st60Var.getClass();
        w8p1.m();
        aod aodVar = (aod) st60Var.b;
        w8p1.m();
        o0c.q("The ImageReader is not initialized.", ((vnd) aodVar.b) != null);
        vnd vndVar = (vnd) aodVar.b;
        synchronized (vndVar.c) {
            iH = ((ry70) vndVar.d).h() - vndVar.b;
        }
        if (iH == 0 || this.a.poll() == null) {
            return;
        }
        bhn0.d();
    }
}
