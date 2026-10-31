package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kp90 {
    public final String a;

    public kp90(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kp90) && u890.j(this.a, ((kp90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
