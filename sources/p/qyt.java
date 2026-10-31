package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qyt {
    public final String a;
    public final oxt b;

    public qyt(String str, oxt oxtVar) {
        this.a = str;
        this.b = oxtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyt)) {
            return false;
        }
        qyt qytVar = (qyt) obj;
        return this.a.equals(qytVar.a) && this.b == qytVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
