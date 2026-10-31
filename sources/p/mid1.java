package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mid1 implements tjd1 {
    public final String a;

    public mid1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mid1) && u890.j(this.a, ((mid1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
