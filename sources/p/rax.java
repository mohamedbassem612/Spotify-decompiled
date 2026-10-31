package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rax {
    public final bbx a;
    public final byte[] b;

    public rax(bbx bbxVar, byte[] bArr) {
        if (bbxVar == null) {
            bhn0.i("encoding is null");
            throw null;
        }
        if (bArr == null) {
            bhn0.i("bytes is null");
            throw null;
        }
        this.a = bbxVar;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rax)) {
            return false;
        }
        rax raxVar = (rax) obj;
        if (this.a.equals(raxVar.a)) {
            return Arrays.equals(this.b, raxVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
