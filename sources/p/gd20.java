package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gd20 implements od20 {
    public final String a;

    public gd20(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gd20) && u890.j(this.a, ((gd20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
