package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mfp1 {
    public static final mhn1 d = mhn1.a(new byte[0]);
    public final long[] a;
    public final List[] b;
    public final List c;

    public /* synthetic */ mfp1(long[] jArr, List[] listArr, List list) {
        this.a = jArr;
        this.b = listArr;
        this.c = list;
    }

    public static long a(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 32) | ((((long) bArr[1]) & 255) << 24) | ((((long) bArr[2]) & 255) << 16) | ((((long) bArr[3]) & 255) << 8) | (((long) bArr[4]) & 255);
    }
}
