package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class quw implements uuw {
    public final String a;
    public final Set b;

    public quw(String str, Set set) {
        this.a = str;
        this.b = set;
    }

    @Override // p.uuw
    public final String a() {
        return this.a;
    }

    @Override // p.uuw
    public final Set b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof quw)) {
            return false;
        }
        quw quwVar = (quw) obj;
        return this.a.equals(quwVar.a) && this.b.equals(quwVar.b);
    }

    @Override // p.uuw
    public final int getStatus() {
        return 2;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
