package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class xmd0 {
    public final rjp0 a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ ymd0 d;

    public xmd0(ymd0 ymd0Var, rjp0 rjp0Var) {
        this.d = ymd0Var;
        this.a = rjp0Var;
    }

    public final void a(boolean z) {
        if (z == this.b) {
            return;
        }
        this.b = z;
        int i = z ? 1 : -1;
        ymd0 ymd0Var = this.d;
        int i2 = ymd0Var.c;
        ymd0Var.c = i + i2;
        if (!ymd0Var.d) {
            ymd0Var.d = true;
            while (true) {
                try {
                    int i3 = ymd0Var.c;
                    if (i2 == i3) {
                        break;
                    }
                    boolean z2 = i2 == 0 && i3 > 0;
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        ymd0Var.h();
                    } else if (z3) {
                        ymd0Var.i();
                    }
                    i2 = i3;
                } catch (Throwable th) {
                    ymd0Var.d = false;
                    throw th;
                }
            }
            ymd0Var.d = false;
        }
        if (this.b) {
            ymd0Var.d(this);
        }
    }

    public boolean c(iac0 iac0Var) {
        return false;
    }

    public boolean d() {
        return true;
    }

    public void b() {
    }
}
