package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dt10 implements st10 {
    public final String a;
    public final String b;

    public dt10(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dt10)) {
            return false;
        }
        dt10 dt10Var = (dt10) obj;
        return this.a.equals(dt10Var.a) && this.b.equals(dt10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
