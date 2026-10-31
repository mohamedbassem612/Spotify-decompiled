package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class isn extends ti {
    public final String b;
    public final String c;

    public isn(String str, String str2) {
        super(str);
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isn)) {
            return false;
        }
        isn isnVar = (isn) obj;
        return this.b.equals(isnVar.b) && this.c.equals(isnVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
