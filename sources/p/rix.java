package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rix implements six {
    public final nix a;
    public final List b;

    public rix(nix nixVar, List list) {
        this.a = nixVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rix)) {
            return false;
        }
        rix rixVar = (rix) obj;
        return u890.j(this.a, rixVar.a) && u890.j(this.b, rixVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public /* synthetic */ rix(nix nixVar) {
        this(nixVar, z6x.a);
    }
}
