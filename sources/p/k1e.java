package p;

import com.google.android.gms.internal.wearable.zzdv;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class k1e {
    public final /* synthetic */ byte a;
    public int b;
    public int c;
    public int d;
    public int e;

    public k1e(String str) {
        this.a = (byte) 1;
        String[] strArrSplit = str.split("\\.");
        this.b = Integer.parseInt(strArrSplit[0]);
        this.c = Integer.parseInt(strArrSplit[1]);
        this.d = Integer.parseInt(strArrSplit[2]);
        this.e = Integer.parseInt(strArrSplit[3]);
    }

    public static int b(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long c(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.wearable.zzdv */
    public int a(int i) throws zzdv {
        if (i < 0) {
            throw new zzdv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = i + this.d;
        if (i2 < 0) {
            throw new zzdv("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i3 = this.e;
        if (i2 > i3) {
            throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.e = i2;
        int i4 = this.b + this.c;
        this.b = i4;
        if (i4 <= i2) {
            this.c = 0;
            return i3;
        }
        int i5 = i4 - i2;
        this.c = i5;
        this.b = i4 - i5;
        return i3;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                int i = this.b;
                int i2 = this.c;
                int i3 = this.d;
                int i4 = this.e;
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append(".");
                sb.append(i2);
                sb.append(".");
                sb.append(i3);
                return gvg.l(sb, ".", i4);
            default:
                return super.toString();
        }
    }

    public k1e(byte b) {
        this.a = b;
        switch (b) {
            case 2:
                break;
            default:
                this.d = 0;
                break;
        }
    }

    public /* synthetic */ k1e(byte[] bArr, int i) {
        this.a = (byte) 3;
        this.e = Integer.MAX_VALUE;
        this.b = i;
        this.d = 0;
    }
}
