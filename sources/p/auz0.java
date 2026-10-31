package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class auz0 implements duz0 {
    public final String a;

    public auz0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof auz0) && u890.j(this.a, ((auz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
