package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lay {
    public final String a;
    public final String b;
    public final String c;

    public lay(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lay)) {
            return false;
        }
        lay layVar = (lay) obj;
        return this.a.equals(layVar.a) && this.b.equals(layVar.b) && this.c.equals(layVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
