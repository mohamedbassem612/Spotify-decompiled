package p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class f0g extends iaa0 {
    public final ohd g;

    public f0g(ohd ohdVar) {
        this.g = ohdVar;
    }

    @Override // p.iaa0
    public final boolean k() {
        return true;
    }

    @Override // p.iaa0
    public final void l(Throwable th) {
        saa0 saa0VarJ = j();
        ohd ohdVar = this.g;
        Throwable thP = ohdVar.p(saa0VarJ);
        if (ohdVar.x()) {
            vfu vfuVar = (vfu) ohdVar.d;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vfu.h;
            while (true) {
                Object objectVolatile = avg.a.getObjectVolatile(vfuVar, vfu.i);
                if (u890.j(objectVolatile, hr80.b)) {
                    if (hrt.q(vfuVar, thP)) {
                        return;
                    }
                } else {
                    if (objectVolatile instanceof Throwable) {
                        return;
                    }
                    if (hrt.p(vfuVar, objectVolatile)) {
                        break;
                    }
                }
            }
        }
        ohdVar.q(thP);
        if (ohdVar.x()) {
            return;
        }
        ohdVar.m();
    }
}
