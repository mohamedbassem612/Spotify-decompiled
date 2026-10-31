package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ink implements snk {
    public final String a;
    public final String b;

    public ink(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ink)) {
            return false;
        }
        ink inkVar = (ink) obj;
        return u890.j(this.a, inkVar.a) && this.b.equals(inkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
