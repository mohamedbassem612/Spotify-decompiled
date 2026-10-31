package p;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qpc implements Closeable, Flushable {
    public final beu a;

    public qpc(File file, long j) {
        gka0 gka0Var = i520.a;
        String str = s8s0.b;
        this.a = new beu(gka0Var, gtv0.e(file), j, isd1.l);
    }

    public final void a() {
        beu beuVar = this.a;
        synchronized (beuVar) {
            try {
                beuVar.f();
                for (udu uduVar : (udu[]) beuVar.i.values().toArray(new udu[0])) {
                    uduVar.getClass();
                    beuVar.o(uduVar);
                }
                beuVar.O0 = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(ln21 ln21Var) {
        beu beuVar = this.a;
        String strK = jch0.K(ln21Var.a);
        synchronized (beuVar) {
            beuVar.f();
            beuVar.a();
            beu.q(strK);
            udu uduVar = (udu) beuVar.i.get(strK);
            if (uduVar == null) {
                return;
            }
            beuVar.o(uduVar);
            if (beuVar.g <= beuVar.c) {
                beuVar.O0 = false;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.a.flush();
    }
}
