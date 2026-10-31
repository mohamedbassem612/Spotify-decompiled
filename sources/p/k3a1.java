package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class k3a1 implements h4a1 {
    public final String a;

    public k3a1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k3a1) && this.a.equals(((k3a1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
