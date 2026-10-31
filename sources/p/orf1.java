package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class orf1 implements srf1 {
    public final String a;

    public orf1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof orf1) && u890.j(this.a, ((orf1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
