package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xu81 implements zu81 {
    public final String a;

    public xu81(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xu81) && this.a.equals(((xu81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
