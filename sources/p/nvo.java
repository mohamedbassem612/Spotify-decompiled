package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nvo implements s7c {
    @Override // p.s7c
    public final List d(int i, int i2) {
        return Collections.singletonList(new kvo(new k3h1(i)));
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof nvo);
    }

    @Override // p.s7c
    public final String getId() {
        return "dsa-banner-section";
    }

    public final int hashCode() {
        return -134719520;
    }
}
