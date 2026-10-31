package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tb61 implements ub61 {
    public final String a;

    public tb61(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tb61) && u890.j(this.a, ((tb61) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
