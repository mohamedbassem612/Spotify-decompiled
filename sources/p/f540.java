package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class f540 implements h540 {
    public final String a;

    public f540(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f540) && this.a.equals(((f540) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
