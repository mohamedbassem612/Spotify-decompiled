package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nio1 extends w1o1 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nio1(Object obj, byte b) {
        this.b = b;
        this.c = obj;
    }

    @Override // p.w1o1
    public final void a() {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                synchronized (((rzo1) this.c).f) {
                    try {
                        if (((rzo1) this.c).k.get() > 0 && ((rzo1) this.c).k.decrementAndGet() > 0) {
                            ((rzo1) this.c).b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        rzo1 rzo1Var = (rzo1) this.c;
                        if (rzo1Var.m != null) {
                            rzo1Var.b.d("Unbind from service.", new Object[0]);
                            rzo1 rzo1Var2 = (rzo1) this.c;
                            rzo1Var2.a.unbindService(rzo1Var2.l);
                            rzo1Var = (rzo1) this.c;
                            rzo1Var.g = false;
                            rzo1Var.m = null;
                            rzo1Var.l = null;
                        }
                        rzo1Var.f();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                rzo1 rzo1Var3 = (rzo1) ((v7y) this.c).b;
                rzo1Var3.b.d("unlinkToDeath", new Object[0]);
                rzo1Var3.m.asBinder().unlinkToDeath(rzo1Var3.j, 0);
                rzo1Var3.m = null;
                rzo1Var3.g = false;
                return;
        }
    }
}
