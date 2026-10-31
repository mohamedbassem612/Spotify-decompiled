package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zzb0 {
    public final String a;
    public final String b;

    public zzb0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzb0)) {
            return false;
        }
        zzb0 zzb0Var = (zzb0) obj;
        return u890.j(this.a, zzb0Var.a) && this.b.equals(zzb0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
