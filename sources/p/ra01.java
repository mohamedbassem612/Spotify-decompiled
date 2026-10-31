package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ra01 {
    public final String a;

    public ra01(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ra01) && u890.j(this.a, ((ra01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
