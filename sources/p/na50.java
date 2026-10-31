package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class na50 implements oa50 {
    public final String a;

    public na50(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof na50) && u890.j(this.a, ((na50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
