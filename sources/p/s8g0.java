package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s8g0 extends x8g0 {
    public final String a;

    public s8g0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s8g0) && this.a.equals(((s8g0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
