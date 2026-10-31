package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k731 implements m731 {
    public final String a;

    public k731(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k731) && u890.j(this.a, ((k731) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
