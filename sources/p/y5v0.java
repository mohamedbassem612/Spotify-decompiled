package p;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatMapCompletable;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class y5v0 {
    public final ynb0 a;
    public final ynb0 b;
    public final kly0 c;
    public final kly0 d;
    public final kly0 e;
    public final kly0 f;
    public final i1r0 g;
    public final aru0 h;
    public final Context i;
    public final Optional j;
    public final CompositeDisposable k = new CompositeDisposable();

    public y5v0(ynb0 ynb0Var, ynb0 ynb0Var2, jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3, jly0 jly0Var4, i1r0 i1r0Var, aru0 aru0Var, Context context, Optional optional) {
        this.a = ynb0Var;
        this.b = ynb0Var2;
        this.c = jly0Var;
        this.d = jly0Var2;
        this.e = jly0Var3;
        this.f = jly0Var4;
        this.g = i1r0Var;
        this.h = aru0Var;
        this.i = context;
        this.j = optional;
    }

    public final void a(String str, String str2) {
        this.k.b(((dds0) this.e.get()).a(str).subscribe(new qg7(str2, this, str, (byte) 20), new jkt0(this, (byte) 1)));
    }

    public final void b(k281 k281Var, String str, String str2, String str3, String str4) {
        ((a6v0) this.a.get()).a(str4, cuo1.G(k281Var), cuo1.E(k281Var), new lnc1((gw70) this.b.get(), str, str2, str3, k281Var.w(), k281Var.t()));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final CompletableEmpty c(String str, boolean z, String str2, String str3, String str4, String str5, w281 w281Var, String str6, v740 v740Var) throws NoWhenBranchMatchedException {
        k281 k281VarS;
        String strO;
        if ((w281Var != null ? w281Var.j : null) != null) {
            Optional optional = this.j;
            if (optional.isPresent() && ((ori0) optional.get()).a(str)) {
                return CompletableEmpty.a;
            }
        }
        if (w281Var == null || (k281VarS = w281Var.a) == null) {
            return CompletableEmpty.a;
        }
        if (k281VarS instanceof k281) {
            k281 k281Var = k281VarS;
            int iV = k281Var.v();
            int i = iV == 0 ? -1 : x5v0.a[l1d.C(iV)];
            if (i == -1) {
                if (v740Var != null && (strO = xto.o(v740Var)) != null) {
                    k281VarS = k281.s(k281Var, strO);
                }
                b(k281VarS, str2, str3, str4, str5);
            } else if (i != 1) {
                if (i != 2) {
                    eg.o();
                    return null;
                }
                if (v740Var != null) {
                    k281VarS = k281.s(k281Var, strO);
                }
                b(k281VarS, str2, str3, str4, str5);
            } else if (k281Var.x() != null) {
                ezh1 ezh1Var = (ezh1) this.d.get();
                String str7 = str4 == null ? "" : str4;
                String strX = k281Var.x();
                ezh1.c(ezh1Var, new dzh1(k281Var.w(), k281Var.t(), str6, "", k281Var.u(), str7, strX == null ? "" : strX, this.i.getString(2131960327)));
            } else {
                b(k281Var, str2, str3, str4, str5);
            }
            CompletableEmpty completableEmpty = CompletableEmpty.a;
            completableEmpty.getClass();
            return completableEmpty;
        }
        boolean z2 = k281VarS instanceof n281;
        kly0 kly0Var = this.c;
        if (z2) {
            ((b840) kly0Var.get()).a((n281) k281VarS, str4, str, z);
            CompletableEmpty completableEmpty2 = CompletableEmpty.a;
            completableEmpty2.getClass();
            return completableEmpty2;
        }
        if (k281VarS instanceof p281) {
            j281 j281Var = w281Var.f;
            s281 s281VarA = j281Var != null ? j281Var.a() : null;
            if (s281VarA != null) {
                ((b840) kly0Var.get()).b((p281) k281VarS, str, s281VarA.a(), s281VarA.b());
            } else {
                Logger.d("Price info were not available for web checkout overlay dialog", new Object[0]);
            }
            CompletableEmpty completableEmpty3 = CompletableEmpty.a;
            completableEmpty3.getClass();
            return completableEmpty3;
        }
        if (k281VarS instanceof o281) {
            this.k.b(((o78) this.f.get()).a(new bxf(str, 0.0d)).onErrorComplete().subscribe());
            CompletableEmpty completableEmpty4 = CompletableEmpty.a;
            completableEmpty4.getClass();
            return completableEmpty4;
        }
        if (k281VarS instanceof l281) {
            this.g.a(str);
            CompletableEmpty completableEmpty5 = CompletableEmpty.a;
            completableEmpty5.getClass();
            return completableEmpty5;
        }
        if (k281VarS instanceof m281) {
            return CompletableEmpty.a;
        }
        eg.o();
        return null;
    }

    public final void d(String str) {
        new MaybeFlatMapCompletable(this.h.f(str), new tym0(this, (byte) 27)).subscribe();
    }
}
