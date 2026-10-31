package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kuh0 {
    public final p1f0 a;
    public final bjx b;
    public final yge0 c;
    public final kly0 d;

    public kuh0(p1f0 p1f0Var, bjx bjxVar, yge0 yge0Var, caq caqVar) {
        this.a = p1f0Var;
        this.b = bjxVar;
        this.c = yge0Var;
        this.d = caqVar;
    }

    public final juh0 a(Uri uri, String str) {
        if (u890.j(o7h.s0(uri.getPathSegments()), "canvas")) {
            return this.c;
        }
        int iOrdinal = ((xr4) this.d.get()).c().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                eg.o();
                return null;
            }
        } else if (!flo1.c(str)) {
            return this.b;
        }
        return this.a;
    }
}
