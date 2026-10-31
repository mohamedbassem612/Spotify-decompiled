package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ivf {
    public final boolean a;
    public final String b;

    public ivf(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivf)) {
            return false;
        }
        ivf ivfVar = (ivf) obj;
        return this.a == ivfVar.a && u890.j(this.b, ivfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
