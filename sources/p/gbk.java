package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gbk {
    public final String a;
    public final String b;

    public gbk(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbk)) {
            return false;
        }
        gbk gbkVar = (gbk) obj;
        return this.a.equals(gbkVar.a) && this.b.equals(gbkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
