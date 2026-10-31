package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mem {
    public final String a;

    public mem(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mem) && u890.j(this.a, ((mem) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
