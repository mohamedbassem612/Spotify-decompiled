package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class d43 implements f43 {
    public final String a;

    public d43(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d43) && u890.j(this.a, ((d43) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
