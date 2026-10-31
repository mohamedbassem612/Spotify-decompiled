package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zfg1 {
    public final int a;
    public final String b;
    public final String c;
    public final int d;

    public zfg1(int i, String str, String str2, int i2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
    }

    public final w4c0 a() {
        w4c0 w4c0Var = new w4c0((byte) 9);
        w4c0Var.b = this.a;
        w4c0Var.d = this.b;
        w4c0Var.e = this.c;
        w4c0Var.c = this.d;
        return w4c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zfg1)) {
            return false;
        }
        zfg1 zfg1Var = (zfg1) obj;
        return this.a == zfg1Var.a && Objects.equals(this.b, zfg1Var.b) && Objects.equals(this.c, zfg1Var.c) && this.d == zfg1Var.d;
    }

    public final int hashCode() {
        int i = this.a * 31;
        String str = this.b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformationRequest{outputHeight=");
        sb.append(this.a);
        sb.append(", audioMimeType='");
        sb.append(this.b);
        sb.append("', videoMimeType='");
        sb.append(this.c);
        sb.append("', hdrMode=");
        return l1d.o(sb, this.d, '}');
    }
}
