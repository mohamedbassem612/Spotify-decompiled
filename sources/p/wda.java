package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wda {
    public final String a;
    public final boolean b;
    public final String c;
    public final r2q0 d;
    public final Map e;

    public wda(String str, boolean z, String str2, r2q0 r2q0Var, Map map) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = r2q0Var;
        this.e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wda)) {
            return false;
        }
        wda wdaVar = (wda) obj;
        return u890.j(this.a, wdaVar.a) && this.b == wdaVar.b && u890.j(this.c, wdaVar.c) && this.d == wdaVar.d && u890.j(this.e, wdaVar.e);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iG + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }
}
