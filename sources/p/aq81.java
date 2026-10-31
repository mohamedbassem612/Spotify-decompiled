package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class aq81 extends eq81 {
    public final String a;

    public aq81(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aq81) && u890.j(this.a, ((aq81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
