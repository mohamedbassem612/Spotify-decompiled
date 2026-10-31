package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class m9q0 implements p9q0 {
    public final String a;

    public m9q0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m9q0) && this.a.equals(((m9q0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
