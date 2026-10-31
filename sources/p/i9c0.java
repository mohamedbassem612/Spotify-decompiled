package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class i9c0 implements hac0, c2d {
    public final iac0 b;
    public final a5d c;
    public final Object a = new Object();
    public boolean d = false;

    public i9c0(iac0 iac0Var, a5d a5dVar) {
        this.b = iac0Var;
        this.c = a5dVar;
        if (iac0Var.getLifecycle().b().a(w8c0.d)) {
            a5dVar.e();
        } else {
            a5dVar.s();
        }
        iac0Var.getLifecycle().a(this);
    }

    @Override // p.c2d
    public final l3d a() {
        return this.c.P0;
    }

    public final List b() {
        List listUnmodifiableList;
        synchronized (this.a) {
            listUnmodifiableList = Collections.unmodifiableList(this.c.w());
        }
        return listUnmodifiableList;
    }

    public final void e() {
        synchronized (this.a) {
            try {
                if (this.d) {
                    return;
                }
                onStop(this.b);
                this.d = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this.a) {
            try {
                if (this.d) {
                    this.d = false;
                    if (this.b.getLifecycle().b().a(w8c0.d)) {
                        onStart(this.b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @n5q0(k8c0.ON_DESTROY)
    public void onDestroy(iac0 iac0Var) {
        synchronized (this.a) {
            a5d a5dVar = this.c;
            a5dVar.z((ArrayList) a5dVar.w());
        }
    }

    @n5q0(k8c0.ON_PAUSE)
    public void onPause(iac0 iac0Var) {
        this.c.a.f(false);
    }

    @n5q0(k8c0.ON_RESUME)
    public void onResume(iac0 iac0Var) {
        this.c.a.f(true);
    }

    @n5q0(k8c0.ON_START)
    public void onStart(iac0 iac0Var) {
        synchronized (this.a) {
            try {
                if (!this.d) {
                    this.c.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @n5q0(k8c0.ON_STOP)
    public void onStop(iac0 iac0Var) {
        synchronized (this.a) {
            try {
                if (!this.d) {
                    this.c.s();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
