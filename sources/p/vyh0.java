package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vyh0 implements rij0 {
    public final String a;

    public vyh0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vyh0) && u890.j(this.a, ((vyh0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
