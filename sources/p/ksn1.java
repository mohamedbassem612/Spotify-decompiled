package p;

import android.text.TextUtils;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ksn1 implements eg61 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;

    public /* synthetic */ ksn1(ytn1 ytn1Var) {
        Objects.requireNonNull(ytn1Var);
        this.b = ytn1Var;
    }

    public final void a(ca61 ca61Var, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                pue0 pue0Var = ytn1.g;
                Object[] objArr = {Integer.valueOf(i)};
                pue0 pue0Var2 = ytn1.g;
                pue0Var2.a("onSessionEnded with error = %d", objArr);
                ytn1 ytn1Var = (ytn1) obj;
                ytn1Var.getClass();
                pue0Var2.a("No need to notify transferred if the transfer type is unknown", new Object[0]);
                ytn1Var.a();
                break;
            default:
                ftn1 ftn1Var = new ftn1(9);
                ftn1Var.b = Integer.valueOf(i);
                e821 e821Var = (e821) obj;
                ftn1Var.c = Boolean.valueOf(((son1) e821Var.a).m == 2);
                e821Var.z(new dwn1(ftn1Var));
                e821Var.B();
                break;
        }
    }

    public final void b(ca61 ca61Var) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
            default:
                b4e b4eVar = (b4e) ca61Var;
                ftn1 ftn1Var = new ftn1(2);
                e821 e821Var = (e821) this.b;
                ftn1Var.c = Boolean.valueOf(((son1) e821Var.a).m == 2);
                e821Var.z(new dwn1(ftn1Var));
                nbn1 nbn1Var = (nbn1) e821Var.d;
                zod.s(nbn1Var);
                nbn1Var.a(b4eVar);
                b4eVar.l = (utw0) e821Var.e;
                break;
        }
    }

    public final void c(ca61 ca61Var, int i) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
            default:
                ftn1 ftn1Var = new ftn1(5);
                ftn1Var.b = Integer.valueOf(i);
                dwn1 dwn1Var = new dwn1(ftn1Var);
                e821 e821Var = (e821) this.b;
                e821Var.z(dwn1Var);
                e821Var.B();
                break;
        }
    }

    public final /* bridge */ /* synthetic */ void d(ca61 ca61Var) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
            default:
                break;
        }
    }

    public final void e(ca61 ca61Var, String str) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
            default:
                dwn1 dwn1Var = new dwn1(new ftn1(7));
                e821 e821Var = (e821) this.b;
                e821Var.z(dwn1Var);
                nbn1 nbn1Var = (nbn1) e821Var.d;
                zod.s(nbn1Var);
                nbn1Var.a((b4e) ca61Var);
                nbn1 nbn1Var2 = (nbn1) e821Var.d;
                zod.s(nbn1Var2);
                String str2 = nbn1Var2.k;
                if (str2 == null) {
                    nbn1Var2.k = str;
                } else if (!TextUtils.equals(str, str2)) {
                    nbn1Var2.b(4);
                }
                break;
        }
    }

    public final /* synthetic */ void f(ca61 ca61Var, boolean z) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
            default:
                dwn1 dwn1Var = new dwn1(new ftn1(4));
                e821 e821Var = (e821) this.b;
                e821Var.z(dwn1Var);
                nbn1 nbn1Var = (nbn1) e821Var.d;
                zod.s(nbn1Var);
                nbn1Var.a((b4e) ca61Var);
                break;
        }
    }

    public final void g(ca61 ca61Var, int i) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
            default:
                ftn1 ftn1Var = new ftn1(8);
                ftn1Var.b = Integer.valueOf(i);
                dwn1 dwn1Var = new dwn1(ftn1Var);
                e821 e821Var = (e821) this.b;
                e821Var.z(dwn1Var);
                e821Var.B();
                break;
        }
    }

    public final void h(ca61 ca61Var, String str) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ytn1 ytn1Var = (ytn1) obj;
                ytn1Var.getClass();
                ytn1.g.a("onSessionStarted with transferType = %d", new Object[]{0});
                if (ytn1Var.e) {
                    boolean z = ytn1Var.a.Q0;
                }
                ytn1Var.a();
                break;
            default:
                e821 e821Var = (e821) obj;
                e821Var.z(new dwn1(new ftn1(4)));
                nbn1 nbn1Var = (nbn1) e821Var.d;
                zod.s(nbn1Var);
                nbn1Var.a((b4e) ca61Var);
                nbn1 nbn1Var2 = (nbn1) e821Var.d;
                zod.s(nbn1Var2);
                String str2 = nbn1Var2.k;
                if (str2 == null) {
                    nbn1Var2.k = str;
                } else if (!TextUtils.equals(str, str2)) {
                    nbn1Var2.b(4);
                }
                break;
        }
    }

    public final void i(ca61 ca61Var, int i) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
            default:
                ftn1 ftn1Var = new ftn1(6);
                ftn1Var.b = Integer.valueOf(i);
                dwn1 dwn1Var = new dwn1(ftn1Var);
                e821 e821Var = (e821) this.b;
                e821Var.z(dwn1Var);
                nbn1 nbn1Var = (nbn1) e821Var.d;
                zod.s(nbn1Var);
                nbn1Var.a((b4e) ca61Var);
                break;
        }
    }

    public ksn1(e821 e821Var) {
        this.b = e821Var;
    }
}
