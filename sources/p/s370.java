package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s370 {
    public final String a;
    public final String b;

    public s370(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s370)) {
            return false;
        }
        s370 s370Var = (s370) obj;
        return this.a.equals(s370Var.a) && this.b.equals(s370Var.b);
    }

    public final int hashCode() {
        return cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
