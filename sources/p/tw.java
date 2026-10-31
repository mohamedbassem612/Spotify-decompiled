package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tw {
    public final String a;
    public final hyo1 b;

    public tw(String str, hyo1 hyo1Var) {
        this.a = str;
        this.b = hyo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw)) {
            return false;
        }
        tw twVar = (tw) obj;
        return this.a.equals(twVar.a) && this.b.equals(twVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
