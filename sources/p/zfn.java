package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zfn implements ugn {
    public final String a;

    public zfn(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zfn) && this.a.equals(((zfn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
