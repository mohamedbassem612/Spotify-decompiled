package p;

import com.spotify.messages.UbiProd1Impression;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b9h1 {
    public final z8h1 a;
    public final UbiProd1Impression b;
    public final a9h1 c;

    public b9h1(z8h1 z8h1Var, UbiProd1Impression ubiProd1Impression, a9h1 a9h1Var) {
        this.a = z8h1Var;
        this.b = ubiProd1Impression;
        this.c = a9h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9h1)) {
            return false;
        }
        b9h1 b9h1Var = (b9h1) obj;
        return this.a.equals(b9h1Var.a) && this.b.equals(b9h1Var.b) && this.c.equals(b9h1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
