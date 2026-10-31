package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xdu implements AutoCloseable {
    public final vdu a;
    public boolean b;
    public final /* synthetic */ ceu c;

    public xdu(ceu ceuVar, vdu vduVar) {
        this.c = ceuVar;
        this.a = vduVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        ceu ceuVar = this.c;
        synchronized (ceuVar.h) {
            vdu vduVar = this.a;
            int i = vduVar.h - 1;
            vduVar.h = i;
            if (i == 0 && vduVar.f) {
                ceuVar.z(vduVar);
            }
        }
    }
}
