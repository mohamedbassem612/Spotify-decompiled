package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tvm {
    public final String a;
    public final List b;

    public tvm(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tvm)) {
            return false;
        }
        tvm tvmVar = (tvm) obj;
        return u890.j(this.a, tvmVar.a) && u890.j(this.b, tvmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
