package p;

import com.spotify.wrapped.v1.proto.Paragraph;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sk51 {
    public final Paragraph a;
    public final Paragraph b;
    public final boolean c;

    public sk51(Paragraph paragraph, Paragraph paragraph2, boolean z) {
        this.a = paragraph;
        this.b = paragraph2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sk51)) {
            return false;
        }
        sk51 sk51Var = (sk51) obj;
        return u890.j(this.a, sk51Var.a) && u890.j(this.b, sk51Var.b) && this.c == sk51Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
