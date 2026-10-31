package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c181 {
    public final m081 a;

    public c181(m081 m081Var) {
        this.a = m081Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c181) && this.a.equals(((c181) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
