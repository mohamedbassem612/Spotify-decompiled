package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class h9q0 implements p9q0 {
    public final String a;

    public h9q0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h9q0) && u890.j(this.a, ((h9q0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
