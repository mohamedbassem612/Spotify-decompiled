package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ote1 implements qte1 {
    public final String a;

    public ote1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ote1) && this.a.equals(((ote1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
