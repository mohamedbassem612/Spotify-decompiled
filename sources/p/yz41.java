package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yz41 implements p151 {
    public final String a;

    public yz41(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yz41) && u890.j(this.a, ((yz41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
