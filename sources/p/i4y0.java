package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i4y0 extends n4y0 implements l4y0 {
    public final String a;

    public i4y0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i4y0) && u890.j(this.a, ((i4y0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public /* synthetic */ i4y0() {
        this("");
    }
}
