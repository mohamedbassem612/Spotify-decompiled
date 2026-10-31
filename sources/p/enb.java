package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class enb implements gnb {
    public final String a;

    public enb(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof enb) && u890.j(this.a, ((enb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
