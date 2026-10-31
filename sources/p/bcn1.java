package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bcn1 extends ldp1 {
    public final acn1 a;

    public bcn1(acn1 acn1Var) {
        this.a = acn1Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bcn1) && ((bcn1) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(bcn1.class, this.a);
    }

    public final String toString() {
        String str = this.a.b;
        return l1d.q(new StringBuilder(str.length() + 30), "Ed25519 Parameters (variant: ", str, ")");
    }
}
