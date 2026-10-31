package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class egl {
    public final String a;
    public final String b;

    public egl(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egl)) {
            return false;
        }
        egl eglVar = (egl) obj;
        return u890.j(this.a, eglVar.a) && u890.j(this.b, eglVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
