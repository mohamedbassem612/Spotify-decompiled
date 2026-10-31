package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class oc1 implements pc1 {
    public final String a;

    public oc1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oc1) && u890.j(this.a, ((oc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
