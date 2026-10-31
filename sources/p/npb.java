package p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class npb extends lpb {
    public final LinkedHashMap b;
    public final byte[] c;

    public npb(byte[] bArr, LinkedHashMap linkedHashMap, byte[] bArr2) {
        super(linkedHashMap);
        this.b = linkedHashMap;
        this.c = bArr2;
    }

    @Override // p.lpb
    public final Map a() {
        return this.b;
    }
}
