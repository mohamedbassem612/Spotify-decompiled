package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kwc implements nwc {
    public final int a;
    public final List b;

    public kwc(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwc)) {
            return false;
        }
        kwc kwcVar = (kwc) obj;
        return this.a == kwcVar.a && u890.j(this.b, kwcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public /* synthetic */ kwc(int i) {
        this(i, z6x.a);
    }
}
