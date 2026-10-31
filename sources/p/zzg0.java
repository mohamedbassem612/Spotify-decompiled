package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zzg0 implements k0h0 {
    public final String a;

    public zzg0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzg0) && this.a.equals(((zzg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
