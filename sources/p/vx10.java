package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vx10 implements xx10 {
    public final String a;
    public final String b;

    public vx10(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vx10)) {
            return false;
        }
        vx10 vx10Var = (vx10) obj;
        return this.a.equals(vx10Var.a) && u890.j(this.b, vx10Var.b);
    }

    public final String getEventId() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
