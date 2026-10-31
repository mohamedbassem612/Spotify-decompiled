package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class imk implements omk {
    public final String a;
    public final String b;

    public imk(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imk)) {
            return false;
        }
        imk imkVar = (imk) obj;
        return this.a.equals(imkVar.a) && this.b.equals(imkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
