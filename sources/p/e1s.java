package p;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class e1s implements kl60 {
    public final /* synthetic */ h1s a;

    public e1s(h1s h1sVar) {
        this.a = h1sVar;
    }

    @Override // p.kl60
    public final void c() {
        this.a.e.remove(this);
    }

    @Override // p.kl60
    public final boolean e(Uri uri, sw9 sw9Var, boolean z) {
        h1s h1sVar = this.a;
        HashMap map = h1sVar.d;
        if (h1sVar.S0 == null) {
            mk60 mk60Var = h1sVar.Z;
            boolean z2 = mk60Var != null && mk60Var.k;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            g1s g1sVar = (g1s) map.get(uri);
            g1sVar.getClass();
            ml60 ml60Var = g1sVar.a;
            int size = ml60Var.b.size();
            mjh1 mjh1VarK = t380.p(ml60Var.b.values()).k();
            int i = 0;
            while (mjh1VarK.hasNext()) {
                if (h1sVar.e((Uri) mjh1VarK.next(), jElapsedRealtime)) {
                    i++;
                }
            }
            int size2 = h1sVar.N0.size();
            w280 w280VarR = h1sVar.N0.r(0);
            int i2 = 0;
            while (w280VarR.hasNext()) {
                ml60 ml60Var2 = (ml60) w280VarR.next();
                if (z2 ? h1sVar.e(ml60Var2.b(), jElapsedRealtime) : h1sVar.f(ml60Var2, jElapsedRealtime)) {
                    i2++;
                }
            }
            a2e0 a2e0Var = new a2e0(z2, size, i, size2, i2);
            h1sVar.c.getClass();
            b2e0 b2e0VarL = ij81.l(a2e0Var, sw9Var);
            if (b2e0VarL != null) {
                long j = b2e0VarL.a;
                if (z2 && b2e0VarL.b == 1) {
                    mk60 mk60Var2 = h1sVar.Z;
                    mk60Var2.getClass();
                    return mk60Var2.a(j);
                }
                g1s g1sVar2 = (g1s) map.get(uri);
                if (g1sVar2 != null) {
                    return g1sVar2.a(j, uri, null);
                }
            }
        }
        return false;
    }
}
