package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s1p0 {
    public final String a;
    public final cam b;
    public final d7l c;
    public final Map d;

    public s1p0(String str, cam camVar, d7l d7lVar, Map map) {
        this.a = str;
        this.b = camVar;
        this.c = d7lVar;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1p0)) {
            return false;
        }
        s1p0 s1p0Var = (s1p0) obj;
        return this.a.equals(s1p0Var.a) && u890.j(this.b, s1p0Var.b) && u890.j(this.c, s1p0Var.c) && u890.j(this.d, s1p0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
