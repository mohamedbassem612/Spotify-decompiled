package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bqa extends iqa {
    public final boolean a;

    public bqa(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bqa) && this.a == ((bqa) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
