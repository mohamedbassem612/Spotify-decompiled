package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h4f extends m4f {
    public final String c;
    public final jwm d;
    public final String e;

    public h4f(String str, jwm jwmVar) {
        super(rnx.c, 2131953290);
        this.c = str;
        this.d = jwmVar;
        Set set = s4b1.f;
        this.e = pcf.e(uic.C(str, (String) null));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4f)) {
            return false;
        }
        h4f h4fVar = (h4f) obj;
        return u890.j(this.c, h4fVar.c) && this.d.equals(h4fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
