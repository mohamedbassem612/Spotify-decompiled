package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gim0 {
    public final String a;

    public gim0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gim0) && u890.j(this.a, ((gim0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
