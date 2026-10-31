package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zkv0 implements blv0 {
    public final String a;

    public zkv0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zkv0) && u890.j(this.a, ((zkv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
