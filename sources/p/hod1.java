package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hod1 {
    public final String a;

    public hod1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hod1) && this.a.equals(((hod1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
