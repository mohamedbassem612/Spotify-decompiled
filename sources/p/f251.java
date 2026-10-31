package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f251 extends i251 {
    public final String a;

    public f251(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f251) && u890.j(this.a, ((f251) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
