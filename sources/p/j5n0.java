package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j5n0 implements l5n0 {
    public final String a;

    public j5n0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j5n0) && this.a.equals(((j5n0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
