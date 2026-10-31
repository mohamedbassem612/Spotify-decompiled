package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class j420 implements a080 {
    public final s8s0 a;
    public final i520 b;
    public final String c;
    public final AutoCloseable d;
    public final Object e = new Object();
    public boolean f;
    public ff01 g;

    public j420(s8s0 s8s0Var, i520 i520Var, String str, AutoCloseable autoCloseable) {
        this.a = s8s0Var;
        this.b = i520Var;
        this.c = str;
        this.d = autoCloseable;
    }

    @Override // p.a080
    public final s8s0 W0() {
        s8s0 s8s0Var;
        synchronized (this.e) {
            if (this.f) {
                throw new IllegalStateException("closed");
            }
            s8s0Var = this.a;
        }
        return s8s0Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0014 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.AutoCloseable
    public final void close() {
        AutoCloseable autoCloseable;
        synchronized (this.e) {
            this.f = true;
            ff01 ff01Var = this.g;
            if (ff01Var != null) {
                try {
                    ff01Var.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
                autoCloseable = this.d;
                if (autoCloseable != null) {
                    try {
                        xcg1.l(autoCloseable);
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                    }
                }
            } else {
                autoCloseable = this.d;
                if (autoCloseable != null) {
                    xcg1.l(autoCloseable);
                }
            }
            throw th;
        }
    }

    @Override // p.a080
    public final gbc d1() {
        synchronized (this.e) {
            if (this.f) {
                throw new IllegalStateException("closed");
            }
            ff01 ff01Var = this.g;
            if (ff01Var != null) {
                return ff01Var;
            }
            ff01 ff01VarG = sj1.g(this.b.j(this.a));
            this.g = ff01VarG;
            return ff01VarG;
        }
    }

    @Override // p.a080
    public final i520 getFileSystem() {
        return this.b;
    }

    @Override // p.a080
    public final m5n1 getMetadata() {
        return null;
    }
}
