package p;

import com.spotify.wrapped.v1.proto.Paragraph;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oq20 implements pq20 {
    public final Paragraph a;
    public final Paragraph b;

    public oq20(Paragraph paragraph, Paragraph paragraph2) {
        this.a = paragraph;
        this.b = paragraph2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq20)) {
            return false;
        }
        oq20 oq20Var = (oq20) obj;
        return this.a.equals(oq20Var.a) && this.b.equals(oq20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
