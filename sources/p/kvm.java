package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kvm extends nvm {
    public final String a;

    public kvm(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kvm) && this.a.equals(((kvm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
