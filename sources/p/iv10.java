package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class iv10 implements rv10 {
    public final String a;

    public iv10(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iv10) && u890.j(this.a, ((iv10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
