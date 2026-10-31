package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ghe extends am70 implements ehe {
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final am70[] g;

    public ghe(String str, int i, int i2, long j, long j2, am70[] am70VarArr) {
        String str2;
        super("CHAP");
        dm5.m(i <= i2);
        this.b = str;
        this.c = i;
        this.d = i2;
        int length = am70VarArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                str2 = null;
                break;
            }
            am70 am70Var = am70VarArr[i3];
            if (am70Var instanceof v8e1) {
                v8e1 v8e1Var = (v8e1) am70Var;
                b380 b380Var = v8e1Var.c;
                if (v8e1Var.a.equals("TIT2") && !b380Var.isEmpty()) {
                    str2 = (String) b380Var.get(0);
                    break;
                }
            }
            i3++;
        }
        if (str2 != null) {
            new u9b0(null, str2);
        }
        this.e = j;
        this.f = j2;
        this.g = am70VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ghe.class != obj.getClass()) {
            return false;
        }
        ghe gheVar = (ghe) obj;
        return this.c == gheVar.c && this.d == gheVar.d && this.e == gheVar.e && this.f == gheVar.f && this.b.equals(gheVar.b) && Arrays.equals(this.g, gheVar.g);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((((((527 + this.c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31);
    }
}
