package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zat0 implements ebt0 {
    public final String a;

    public zat0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zat0) && this.a.equals(((zat0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
