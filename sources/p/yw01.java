package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yw01 extends zw01 {
    public final String a;

    public yw01(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yw01) && u890.j(this.a, ((yw01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
