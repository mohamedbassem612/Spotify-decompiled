package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ecw implements liw {
    public final String a;
    public final int b;

    public ecw(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ecw)) {
            return false;
        }
        ecw ecwVar = (ecw) obj;
        return this.a.equals(ecwVar.a) && this.b == ecwVar.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
