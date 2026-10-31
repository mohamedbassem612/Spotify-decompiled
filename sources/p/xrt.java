package p;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xrt implements h0r0 {
    public final qyj a;
    public final lqc b;
    public final Activity c;
    public final urt d;
    public final dst e;
    public final kst f;
    public final cbr0 g;

    public xrt(qyj qyjVar, lqc lqcVar, Activity activity, urt urtVar, dst dstVar, kst kstVar) {
        this.a = qyjVar;
        this.b = lqcVar;
        this.c = activity;
        this.d = urtVar;
        this.e = dstVar;
        this.f = kstVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarT3 = yon1.t3();
        dbr0 hgr0Var = new hgr0(egr0.a, 0, 2);
        Parcelable.Creator creator = lik1.CREATOR;
        this.g = new cbr0(new dbr0[]{hgr0Var, new bn70(p6r0VarT3, oap1.i("spotify:internal:permissions-location-request"), (nar0) null), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.g;
    }

    public final p2r0 b() {
        return this.a.a(apo.j(2088487940, new i4o(this, (byte) 29), true));
    }

    public final void c(boolean z, cir0 cir0Var) {
        if (z) {
            urt urtVar = this.d;
            if (!urtVar.a()) {
                urtVar.d(new wrt(this, cir0Var, (byte) 0));
                return;
            }
        }
        d(z ? est.a : est.b, cir0Var);
    }

    public final void d(est estVar, cir0 cir0Var) {
        this.f.a(estVar);
        cir0Var.c().a(new y231(new cst(estVar)));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void e(ost ostVar, hur hurVar, cir0 cir0Var) throws NoWhenBranchMatchedException {
        if (!ostVar.equals(lst.a)) {
            if (ostVar.equals(mst.a)) {
                hurVar.q();
                d(est.c, cir0Var);
                return;
            } else {
                if (!ostVar.equals(nst.a)) {
                    eg.o();
                    return;
                }
                hurVar.r();
                this.c.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.spotify.com/legal/privacy-policy/")));
                return;
            }
        }
        int iOrdinal = this.e.a().ordinal();
        if (iOrdinal == 0) {
            hurVar.p();
            d(est.a, cir0Var);
            return;
        }
        if (iOrdinal != 1) {
            eg.o();
            return;
        }
        urt urtVar = this.d;
        int iC = l1d.C(urtVar.c());
        if (iC == 0 || iC == 1) {
            hurVar.p();
            c(true, cir0Var);
        } else if (iC == 2 || iC == 3) {
            hurVar.p();
            urtVar.f(new wrt(this, cir0Var, (byte) 1));
        } else if (iC != 4) {
            eg.o();
        } else {
            hurVar.s();
            urtVar.e(new wrt(this, cir0Var, (byte) 2));
        }
    }
}
