package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cv2 {
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public cv2(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv2)) {
            return false;
        }
        cv2 cv2Var = (cv2) obj;
        return this.a.equals(cv2Var.a) && this.b.equals(cv2Var.b) && this.c == cv2Var.c && this.d == cv2Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
