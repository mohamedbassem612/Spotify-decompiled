package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ib00 implements rij0 {
    public static final ie30 g;
    public static final ie30 h;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    public int f;

    static {
        ge30 ge30Var = new ge30();
        ge30Var.o = asj0.p("application/id3");
        g = new ie30(ge30Var);
        ge30 ge30Var2 = new ge30();
        ge30Var2.o = asj0.p("application/x-scte35");
        h = new ie30(ge30Var2);
    }

    public ib00(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    @Override // p.rij0
    public final ie30 a() {
        switch (this.a) {
            case "urn:scte:scte35:2014:bin":
                return h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return g;
            default:
                return null;
        }
    }

    @Override // p.rij0
    public final byte[] c() {
        if (a() != null) {
            return this.e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ib00.class != obj.getClass()) {
            return false;
        }
        ib00 ib00Var = (ib00) obj;
        return this.c == ib00Var.c && this.d == ib00Var.d && this.a.equals(ib00Var.a) && this.b.equals(ib00Var.b) && Arrays.equals(this.e, ib00Var.e);
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        int iD = cy30.d(cy30.d(527, 31, this.a), 31, this.b);
        long j = this.c;
        int i2 = (iD + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        int iHashCode = Arrays.hashCode(this.e) + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        this.f = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }
}
