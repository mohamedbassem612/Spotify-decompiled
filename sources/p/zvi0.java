package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zvi0 extends awi0 {
    public final String a;

    public zvi0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zvi0) && this.a.equals(((zvi0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
