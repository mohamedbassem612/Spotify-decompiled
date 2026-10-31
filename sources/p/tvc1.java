package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tvc1 implements uvc1 {
    public final String a;
    public final String b;

    public tvc1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tvc1)) {
            return false;
        }
        tvc1 tvc1Var = (tvc1) obj;
        return this.a.equals(tvc1Var.a) && this.b.equals(tvc1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
