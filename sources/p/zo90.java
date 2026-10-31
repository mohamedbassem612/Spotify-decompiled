package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zo90 {
    public final String a;
    public final String b;

    public zo90(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zo90)) {
            return false;
        }
        zo90 zo90Var = (zo90) obj;
        return u890.j(this.a, zo90Var.a) && u890.j(this.b, zo90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
