package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tp3 extends hr3 {
    public final String a;

    public tp3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tp3) && u890.j(this.a, ((tp3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
