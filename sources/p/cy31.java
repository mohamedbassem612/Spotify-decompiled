package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cy31 implements dy31 {
    public final String a;

    public cy31(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cy31) && u890.j(this.a, ((cy31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
