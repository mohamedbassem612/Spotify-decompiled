package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ui31 implements oi31 {
    public final byte[] a;
    public final Map b;

    public ui31(byte[] bArr, Map map) {
        this.a = bArr;
        this.b = map;
    }

    @Override // p.oi31
    public final Map a() {
        return this.b;
    }

    @Override // p.oi31
    public final byte[] b() {
        return this.a;
    }
}
