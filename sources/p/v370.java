package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class v370 implements z370 {
    public final String a;
    public final String b;

    public v370(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v370)) {
            return false;
        }
        v370 v370Var = (v370) obj;
        return this.a.equals(v370Var.a) && this.b.equals(v370Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
