package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class z2p1 extends hug {
    public final byte[] a;

    public z2p1(byte[] bArr) {
        this.a = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hug)) {
            return false;
        }
        hug hugVar = (hug) obj;
        boolean z = hugVar instanceof z2p1;
        return Arrays.equals(this.a, ((z2p1) hugVar).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a) ^ 1000003;
    }

    public final String toString() {
        return f4i1.f("CoDoingState{state=", Arrays.toString(this.a), "}");
    }
}
