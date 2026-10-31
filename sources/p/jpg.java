package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jpg {
    public final String a;
    public final String b;
    public final int c;

    public jpg(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpg)) {
            return false;
        }
        jpg jpgVar = (jpg) obj;
        return this.a.equals(jpgVar.a) && this.b.equals(jpgVar.b) && this.c == jpgVar.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
