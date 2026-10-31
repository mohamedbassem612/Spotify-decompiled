package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class efi0 implements hfi0 {
    public final thh a;

    public efi0(thh thhVar) {
        this.a = thhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof efi0) && this.a == ((efi0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
