package p;

import com.spotify.wrapped.v1.proto.Paragraph;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nq20 implements pq20 {
    public final Paragraph a;

    public nq20(Paragraph paragraph) {
        this.a = paragraph;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nq20) && this.a.equals(((nq20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
