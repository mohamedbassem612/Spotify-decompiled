package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zp60 implements cq60 {
    public final String a;

    public zp60(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zp60) && this.a.equals(((zp60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
