package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bva implements vi0 {
    public final String a;

    public bva(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bva) && u890.j(this.a, ((bva) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
