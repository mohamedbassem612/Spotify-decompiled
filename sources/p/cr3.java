package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cr3 extends hr3 {
    public final String a;

    public cr3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cr3) && u890.j(this.a, ((cr3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
