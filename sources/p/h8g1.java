package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h8g1 extends i8g1 {
    public final String a;

    public h8g1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h8g1) && this.a.equals(((h8g1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
