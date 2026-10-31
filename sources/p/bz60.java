package p;

import android.net.Uri;
import android.view.animation.Interpolator;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleTransformer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bz60 implements SingleTransformer {
    public long a;
    public boolean b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;

    public bz60() {
        this.a = -1L;
        this.f = new pek1(this);
        this.c = new ArrayList();
    }

    public void a() {
        if (this.b) {
            Iterator it = ((ArrayList) this.c).iterator();
            while (it.hasNext()) {
                ((oek1) it.next()).c();
            }
            this.b = false;
        }
    }

    public void b(String str, int i, boolean z, boolean z2) {
        int i2;
        iu30 iu30Var = (iu30) this.c;
        Float f = (Float) this.e;
        Float f2 = (Float) this.f;
        boolean z3 = this.b;
        this.b = false;
        this.e = null;
        this.f = null;
        Set set = v070.a;
        if (z2) {
            i2 = 2;
        } else {
            i2 = (z3 && z) ? 1 : 3;
        }
        int i3 = i2;
        String scheme = Uri.parse(str).getScheme();
        if (!o7h.i0(v070.a, scheme != null ? scheme.toLowerCase(Locale.ROOT) : null)) {
            iu30Var.invoke(new l070(str, 1, i3, i, f, f2));
            return;
        }
        if (!z || !z3) {
            iu30Var.invoke(new l070(str, 2, i3, i, f, f2));
            return;
        }
        long jB = ((yqg) this.d).b();
        if (jB - this.a < 500) {
            iu30Var.invoke(new l070(str, 3, i3, i, f, f2));
        } else {
            this.a = jB;
            iu30Var.invoke(new i070(str, i3, i, f, f2));
        }
    }

    public Single c(Single single) {
        return single.flatMap(new qkn0(this, (byte) 3));
    }

    public void d() {
        if (this.b) {
            return;
        }
        for (oek1 oek1Var : (ArrayList) this.c) {
            long j = this.a;
            if (j >= 0) {
                oek1Var.d(j);
            }
            Interpolator interpolator = (Interpolator) this.d;
            if (interpolator != null) {
                oek1Var.e(interpolator);
            }
            if (((qek1) this.e) != null) {
                oek1Var.f((pek1) this.f);
            }
            oek1Var.g();
        }
        this.b = true;
    }

    public bz60(yqg yqgVar, iu30 iu30Var) {
        this.c = iu30Var;
        this.d = yqgVar;
    }

    public bz60(g990 g990Var, long j, boolean z, ven0 ven0Var, mim1 mim1Var, z990 z990Var) {
        this.c = g990Var;
        this.a = j;
        this.b = z;
        this.d = ven0Var;
        this.e = mim1Var;
        this.f = z990Var;
    }

    public bz60(jyo0 jyo0Var, String str, long j, hs41 hs41Var, lv4 lv4Var, boolean z) {
        this.c = jyo0Var;
        this.d = str;
        this.a = j;
        this.e = hs41Var;
        this.f = lv4Var;
        this.b = z;
    }
}
