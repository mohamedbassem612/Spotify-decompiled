package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ruw implements uuw {
    public final String a;
    public final boolean b;

    public ruw(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // p.uuw
    public final String a() {
        return this.a;
    }

    @Override // p.uuw
    public final Set b() {
        return w7x.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ruw)) {
            return false;
        }
        ruw ruwVar = (ruw) obj;
        return this.a.equals(ruwVar.a) && this.b == ruwVar.b;
    }

    @Override // p.uuw
    public final int getStatus() {
        return 1;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
