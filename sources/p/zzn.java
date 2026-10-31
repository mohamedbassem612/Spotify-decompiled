package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zzn implements a0o {
    public final String a;

    public zzn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzn) && u890.j(this.a, ((zzn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
