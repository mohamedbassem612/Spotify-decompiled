package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qwm {
    public final String a;
    public final String b;

    public qwm(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwm)) {
            return false;
        }
        qwm qwmVar = (qwm) obj;
        return u890.j(this.a, qwmVar.a) && u890.j(this.b, qwmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
