package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class igh extends am70 {
    public final String b;
    public final String c;
    public final String d;

    public igh(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || igh.class != obj.getClass()) {
            return false;
        }
        igh ighVar = (igh) obj;
        return this.c.equals(ighVar.c) && this.b.equals(ighVar.b) && Objects.equals(this.d, ighVar.d);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(527, 31, this.b), 31, this.c);
        String str = this.d;
        return iD + (str != null ? str.hashCode() : 0);
    }

    @Override // p.am70
    public final String toString() {
        return this.a + ": language=" + this.b + ", description=" + this.c + ", text=" + this.d;
    }
}
