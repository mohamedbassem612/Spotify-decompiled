package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kvk1 {
    public final String a;

    public kvk1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kvk1) && u890.j(this.a, ((kvk1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
