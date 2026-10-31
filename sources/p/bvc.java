package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bvc implements hvc {
    public final String a;

    public bvc(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bvc) && u890.j(this.a, ((bvc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
