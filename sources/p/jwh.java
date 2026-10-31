package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jwh {
    public final iwh a;
    public final List b;
    public final int c;

    public jwh(iwh iwhVar, List list, int i) {
        this.a = iwhVar;
        this.b = list;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwh)) {
            return false;
        }
        jwh jwhVar = (jwh) obj;
        return this.a.equals(jwhVar.a) && u890.j(this.b, jwhVar.b) && this.c == jwhVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
