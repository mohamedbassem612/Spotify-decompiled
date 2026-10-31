package p;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hkt0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public hkt0(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hkt0)) {
            return false;
        }
        hkt0 hkt0Var = (hkt0) obj;
        return u890.j(this.a, hkt0Var.a) && u890.j(this.b, hkt0Var.b) && u890.j(this.c, hkt0Var.c) && u890.j(this.d, hkt0Var.d) && u890.j(this.e, hkt0Var.e);
    }

    public final byte[] f() {
        String str = this.a;
        int length = str.length();
        String str2 = this.b;
        int length2 = str2.length() + length;
        String str3 = this.c;
        int length3 = str3.length() + length2;
        int i = length3 + 3;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length3 + 5);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) i);
        zzo1.u(str, byteBufferAllocate);
        zzo1.u(str2, byteBufferAllocate);
        zzo1.u(str3, byteBufferAllocate);
        return byteBufferAllocate.array();
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.e.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }

    public /* synthetic */ hkt0(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, "");
    }
}
