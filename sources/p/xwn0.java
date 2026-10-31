package p;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xwn0 {
    public final b4n0 a;
    public final th30 b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public int d;
    public int e;

    public xwn0(dg30 dg30Var, b4n0 b4n0Var) {
        this.a = b4n0Var;
        this.b = dg30Var.e0();
    }

    public final int a() {
        return this.e;
    }

    public final boolean b() {
        return this.e != 0;
    }

    public final void c(Function0 function0, Function0 function1, boolean z) {
        if (!this.a.b()) {
            int i = this.e;
            this.e = 1;
            try {
                function1.invoke();
                return;
            } finally {
                this.e = i;
            }
        }
        if (this.d != 0 || b() || !((Boolean) function0.invoke()).booleanValue()) {
            this.d++;
            this.c.post(new n1d(this, z, function1));
            return;
        }
        th30 th30Var = this.b;
        if (th30Var.L) {
            return;
        }
        if (z || !th30Var.U()) {
            int i2 = this.e;
            this.e = 2;
            try {
                function1.invoke();
            } finally {
                this.e = i2;
            }
        }
    }
}
