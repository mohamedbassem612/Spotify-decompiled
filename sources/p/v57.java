package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class v57 implements chu {
    public final String a;

    public v57(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v57) && u890.j(this.a, ((v57) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
