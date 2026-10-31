package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ud81 {
    public final String a;
    public final String b;
    public final int c;

    public ud81(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud81)) {
            return false;
        }
        ud81 ud81Var = (ud81) obj;
        return u890.j(this.a, ud81Var.a) && u890.j(this.b, ud81Var.b) && this.c == ud81Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
