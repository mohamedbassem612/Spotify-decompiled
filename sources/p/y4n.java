package p;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y4n implements l120 {
    public final Context a;
    public final Uri b;
    public final int c;
    public final int d;
    public final jsc e;
    public final f5n f;
    public final cxc g;
    public final nq80 h;
    public final String i;

    public y4n(Context context, Uri uri, int i, int i2, jsc jscVar, f5n f5nVar, cxc cxcVar, nq80 nq80Var, String str) {
        this.a = context;
        this.b = uri;
        this.c = i;
        this.d = i2;
        this.e = jscVar;
        this.f = f5nVar;
        this.g = cxcVar;
        this.h = nq80Var;
        this.i = str;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(lnm lnmVar) {
        w4n w4nVar;
        y4n y4nVar;
        if (lnmVar instanceof w4n) {
            w4nVar = (w4n) lnmVar;
            int i = w4nVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w4nVar.c = i - Integer.MIN_VALUE;
            } else {
                w4nVar = new w4n(this, (onm) lnmVar);
            }
        } else {
            w4nVar = new w4n(this, (onm) lnmVar);
        }
        w4n w4nVar2 = w4nVar;
        Object objB = w4nVar2.a;
        int i2 = w4nVar2.c;
        if (i2 == 0) {
            hm5.M(objB);
            w4nVar2.c = 1;
            y4nVar = this;
            objB = y4nVar.b(this.b, this.c, this.d, this.e, w4nVar2);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
            y4nVar = this;
        }
        ls70 ls70Var = (ls70) objB;
        Uri uri = y4nVar.b;
        if (ls70Var == null) {
            jah.h("Unable to open '", uri, "'.");
            return null;
        }
        g5n g5nVar = ls70Var.b;
        int iOrdinal = g5nVar.ordinal();
        int i3 = 3;
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal != 2 && iOrdinal != 3) {
                eg.o();
                return null;
            }
            i3 = 4;
        }
        nq80 nq80Var = y4nVar.h;
        if (nq80Var != null) {
            nq80Var.h(y4nVar.i, g5nVar, ls70Var.c);
        }
        return new oka1(jhc1.g(sj1.g(si1.v(ls70Var.a)), i520.a), y4nVar.a.getContentResolver().getType(uri), i3);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0107  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Uri uri, int i, int i2, jsc jscVar, onm onmVar) {
        x4n x4nVar;
        upc upcVarR;
        ne neVar;
        if (onmVar instanceof x4n) {
            x4nVar = (x4n) onmVar;
            int i3 = x4nVar.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                x4nVar.e = i3 - Integer.MIN_VALUE;
            } else {
                x4nVar = new x4n(this, onmVar);
            }
        } else {
            x4nVar = new x4n(this, onmVar);
        }
        Object objC = x4nVar.c;
        int i4 = x4nVar.e;
        if (i4 == 0) {
            hm5.M(objC);
            x4nVar.a = uri;
            x4nVar.b = jscVar;
            x4nVar.e = 1;
            f5n f5nVar = this.f;
            f5nVar.getClass();
            if (uri == null || uri.equals(Uri.EMPTY)) {
                objC = null;
            } else {
                String string = uri.toString();
                String scheme = uri.getScheme();
                if ("spotify".equals(scheme)) {
                    if (nhc1.Y(string, "spotify:image:", false)) {
                        string = Base64.encodeToString(string.substring(14).getBytes(nne.a), 0);
                    } else if (nhc1.Y(string, "spotify:localfileimage:", false)) {
                        string = Base64.encodeToString(string.getBytes(nne.a), 0);
                    }
                } else if ("http".equals(scheme) || m3i1.b.equals(scheme)) {
                    string = Base64.encodeToString(string.getBytes(nne.a), 0);
                }
                objC = f5nVar.a.d.c(string, i, i2, x4nVar);
            }
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i4 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jscVar = x4nVar.b;
            uri = x4nVar.a;
            hm5.M(objC);
        }
        ls70 ls70Var = (ls70) objC;
        if (ls70Var != null) {
            return ls70Var;
        }
        String scheme2 = uri.getScheme();
        if (!"http".equals(scheme2) && !m3i1.b.equals(scheme2)) {
            return null;
        }
        String string2 = uri.toString();
        int iOrdinal = jscVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                tpc tpcVar = new tpc();
                nyn1.W(tpcVar);
                upcVarR = nyn1.R(tpcVar);
            } else if (iOrdinal == 2) {
                tpc tpcVar2 = new tpc();
                nyn1.V(tpcVar2);
                upcVarR = nyn1.R(tpcVar2);
            } else if (iOrdinal != 3) {
                eg.o();
                return null;
            }
            neVar = new ne((byte) 9);
            neVar.e0(string2);
            if (upcVarR != null) {
                neVar.k(upcVarR);
            }
            return new ls70(this.g.a(new ln21(neVar)).e().g.a(), g5n.c, null);
        }
        upc upcVar = upc.n;
        upcVarR = null;
        neVar = new ne((byte) 9);
        neVar.e0(string2);
        if (upcVarR != null) {
            neVar.k(upcVarR);
        }
        return new ls70(this.g.a(new ln21(neVar)).e().g.a(), g5n.c, null);
    }
}
