package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qka1 implements a080 {
    public final i520 a;
    public final m5n1 b;
    public final Object c = new Object();
    public boolean d;
    public final gbc e;

    public qka1(gbc gbcVar, i520 i520Var, m5n1 m5n1Var) {
        this.a = i520Var;
        this.b = m5n1Var;
        this.e = gbcVar;
    }

    @Override // p.a080
    public final s8s0 W0() {
        synchronized (this.c) {
            if (this.d) {
                throw new IllegalStateException("closed");
            }
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.c) {
            this.d = true;
            gbc gbcVar = this.e;
            if (gbcVar != null) {
                try {
                    gbcVar.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // p.a080
    public final gbc d1() {
        gbc gbcVar;
        synchronized (this.c) {
            try {
                if (this.d) {
                    throw new IllegalStateException("closed");
                }
                gbcVar = this.e;
                if (gbcVar == null) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gbcVar;
    }

    @Override // p.a080
    public final i520 getFileSystem() {
        return this.a;
    }

    @Override // p.a080
    public final m5n1 getMetadata() {
        return this.b;
    }
}
