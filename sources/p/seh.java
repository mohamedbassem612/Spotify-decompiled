package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class seh implements afh {
    public final String a;
    public final ygh b;

    public seh(String str, ygh yghVar) {
        this.a = str;
        this.b = yghVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof seh)) {
            return false;
        }
        seh sehVar = (seh) obj;
        return this.a.equals(sehVar.a) && this.b.equals(sehVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
