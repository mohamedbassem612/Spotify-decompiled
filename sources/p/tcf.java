package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tcf implements rcf {
    public final String a;
    public final List b;

    public tcf(String str, List list) {
        this.a = str;
        this.b = list;
    }

    @Override // p.rcf
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tcf)) {
            return false;
        }
        tcf tcfVar = (tcf) obj;
        return u890.j(this.a, tcfVar.a) && this.b.equals(tcfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
