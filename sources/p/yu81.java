package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yu81 implements zu81 {
    public final String a;

    public yu81(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yu81) && this.a.equals(((yu81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
