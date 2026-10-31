package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yi6 {
    public final String a;
    public final yj41 b;

    public yi6(String str, yj41 yj41Var) {
        this.a = str;
        this.b = yj41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi6)) {
            return false;
        }
        yi6 yi6Var = (yi6) obj;
        return u890.j(this.a, yi6Var.a) && u890.j(this.b, yi6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
