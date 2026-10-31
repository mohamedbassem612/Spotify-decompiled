package p;

import com.spotify.adsinternal.adscore.model.Format;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ate0 implements chu {
    public final fq0 a;
    public final String b;
    public final Format c;

    public ate0(fq0 fq0Var, String str, Format format) {
        this.a = fq0Var;
        this.b = str;
        this.c = format;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ate0)) {
            return false;
        }
        ate0 ate0Var = (ate0) obj;
        return this.a.equals(ate0Var.a) && this.b.equals(ate0Var.b) && this.c == ate0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
