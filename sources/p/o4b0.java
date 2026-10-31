package p;

import com.spotify.accessory.categorizer.CategorizerResponse;
import kotlinx.serialization.MissingFieldException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@o661
public final class o4b0 {
    public static final n4b0 Companion = new n4b0();
    public final CategorizerResponse a;
    public final long b;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.MissingFieldException */
    public /* synthetic */ o4b0(int i, CategorizerResponse categorizerResponse, long j) throws MissingFieldException {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, m4b0.a.getDescriptor());
            throw null;
        }
        this.a = categorizerResponse;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4b0)) {
            return false;
        }
        o4b0 o4b0Var = (o4b0) obj;
        return u890.j(this.a, o4b0Var.a) && this.b == o4b0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public o4b0(CategorizerResponse categorizerResponse, long j) {
        this.a = categorizerResponse;
        this.b = j;
    }
}
