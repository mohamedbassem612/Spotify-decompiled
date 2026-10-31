package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d240 implements i240 {
    public final String a;

    public d240(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d240) && u890.j(this.a, ((d240) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
