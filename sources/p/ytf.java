package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ytf implements xtf {
    public final int a;
    public final String b;

    public ytf(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ytf)) {
            return false;
        }
        ytf ytfVar = (ytf) obj;
        return this.a == ytfVar.a && u890.j(this.b, ytfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
