package p;

import io.reactivex.rxjava3.subjects.PublishSubject;
import java.io.File;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rn21 extends tn21 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public rn21(rn21 rn21Var) {
        this.a = (byte) 1;
        this.b = rn21Var;
        this.c = new PublishSubject();
    }

    public final long a() {
        switch (this.a) {
            case 0:
                return ((File) this.c).length();
            default:
                return ((File) ((rn21) this.b).c).length();
        }
    }

    public final r8i0 b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (r8i0) obj;
            default:
                return (r8i0) ((rn21) obj).b;
        }
    }

    public final void d(fbc fbcVar) {
        switch (this.a) {
            case 0:
                xj80 xj80VarU = si1.u((File) this.c);
                try {
                    fbcVar.B(xj80VarU);
                    xj80VarU.close();
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        u890.p(xj80VarU, th);
                        throw th2;
                    }
                }
            default:
                fbc df01Var = new df01(new za41(fbcVar, new zw11(this, (byte) 24)));
                ((rn21) this.b).d(df01Var);
                df01Var.flush();
                return;
        }
    }

    public rn21(r8i0 r8i0Var, File file) {
        this.a = (byte) 0;
        this.b = r8i0Var;
        this.c = file;
    }
}
