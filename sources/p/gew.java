package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gew extends iiw {
    public final String a;
    public final List b;
    public final wuz c;

    public gew(String str, List list, wuz wuzVar) {
        this.a = str;
        this.b = list;
        this.c = wuzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gew)) {
            return false;
        }
        gew gewVar = (gew) obj;
        return u890.j(this.a, gewVar.a) && u890.j(this.b, gewVar.b) && u890.j(this.c, gewVar.c);
    }

    public final int hashCode() {
        int iB = f4i1.b(this.a.hashCode() * 31, 31, this.b);
        wuz wuzVar = this.c;
        return iB + (wuzVar == null ? 0 : wuzVar.hashCode());
    }
}
