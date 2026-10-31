package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class iz21 implements rz21 {
    public final String a;

    public iz21(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iz21) && u890.j(this.a, ((iz21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
