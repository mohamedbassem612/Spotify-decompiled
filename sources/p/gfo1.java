package p;

import android.os.RemoteException;
import com.google.android.engage.service.AppEngageException;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gfo1 extends w1o1 {
    public final /* synthetic */ byte b = 1;
    public final /* synthetic */ bsd1 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfo1(ndn1 ndn1Var, bsd1 bsd1Var, tcn1 tcn1Var, bsd1 bsd1Var2) {
        super(bsd1Var);
        this.d = tcn1Var;
        this.c = bsd1Var2;
        this.e = ndn1Var;
    }

    @Override // p.w1o1
    public final void a() {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                synchronized (((rzo1) this.e).f) {
                    try {
                        rzo1 rzo1Var = (rzo1) this.e;
                        bsd1 bsd1Var = this.c;
                        rzo1Var.e.add(bsd1Var);
                        bsd1Var.a.b(new frl1(rzo1Var, bsd1Var, (byte) 18));
                        if (((rzo1) this.e).k.getAndIncrement() > 0) {
                            ((rzo1) this.e).b.d("Already connected to the service.", new Object[0]);
                        }
                        rzo1.c((rzo1) this.e, (gfo1) this.d);
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                bsd1 bsd1Var2 = this.c;
                try {
                    hg70 hg70Var = ((ndn1) this.e).e.m;
                    if (hg70Var != null) {
                        ((tcn1) this.d).e(hg70Var, bsd1Var2);
                    } else {
                        bsd1Var2.c(new AppEngageException(2));
                    }
                    return;
                } catch (RemoteException unused) {
                    bsd1Var2.c(new AppEngageException(3));
                    return;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfo1(rzo1 rzo1Var, bsd1 bsd1Var, bsd1 bsd1Var2, gfo1 gfo1Var) {
        super(bsd1Var);
        this.c = bsd1Var2;
        this.d = gfo1Var;
        this.e = rzo1Var;
    }
}
