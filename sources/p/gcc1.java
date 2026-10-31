package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gcc1 extends kcc1 {
    public final String a;

    public gcc1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gcc1) && this.a.equals(((gcc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
