package p;

import j$.time.LocalDateTime;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ojd0 {
    public final String a;
    public final LocalDateTime b;
    public final String c;
    public final String d;
    public final int e;

    public ojd0(String str, LocalDateTime localDateTime, String str2, String str3, int i) {
        this.a = str;
        this.b = localDateTime;
        this.c = str2;
        this.d = str3;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojd0)) {
            return false;
        }
        ojd0 ojd0Var = (ojd0) obj;
        return u890.j(this.a, ojd0Var.a) && this.b.equals(ojd0Var.b) && this.c.equals(ojd0Var.c) && u890.j(this.d, ojd0Var.d) && this.e == ojd0Var.e;
    }

    public final int hashCode() {
        int iD = cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        return Integer.hashCode(this.e) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
