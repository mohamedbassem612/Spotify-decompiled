package p;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wdd1 {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public wdd1(Handler handler) {
        this.a = handler;
    }

    public static vdd1 e() {
        vdd1 vdd1Var;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                vdd1Var = arrayList.isEmpty() ? new vdd1() : (vdd1) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return vdd1Var;
    }

    public final vdd1 a(int i) {
        vdd1 vdd1VarE = e();
        vdd1VarE.a = this.a.obtainMessage(i);
        return vdd1VarE;
    }

    public final vdd1 b(int i, int i2, int i3) {
        vdd1 vdd1VarE = e();
        vdd1VarE.a = this.a.obtainMessage(i, i2, i3);
        return vdd1VarE;
    }

    public final vdd1 c(int i, Object obj) {
        vdd1 vdd1VarE = e();
        vdd1VarE.a = this.a.obtainMessage(i, obj);
        return vdd1VarE;
    }

    public final vdd1 d(Object obj, int i, int i2, int i3) {
        vdd1 vdd1VarE = e();
        vdd1VarE.a = this.a.obtainMessage(i, i2, i3, obj);
        return vdd1VarE;
    }

    public final void f(Runnable runnable) {
        this.a.post(runnable);
    }

    public final void g(Runnable runnable, long j) {
        this.a.postDelayed(runnable, j);
    }

    public final void h() {
        this.a.removeCallbacksAndMessages(null);
    }

    public final void i(int i) {
        dm5.m(i != 0);
        this.a.removeMessages(i);
    }

    public final void j(int i) {
        this.a.sendEmptyMessage(i);
    }

    public final void k(int i, int i2) {
        this.a.sendEmptyMessageDelayed(i, i2);
    }
}
