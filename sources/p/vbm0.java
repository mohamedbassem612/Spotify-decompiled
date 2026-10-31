package p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vbm0 implements xbm0 {
    public final RetrofitMaker a;
    public final dma1 b;

    public vbm0(RetrofitMaker retrofitMaker, dma1 dma1Var) {
        this.a = retrofitMaker;
        this.b = dma1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbm0)) {
            return false;
        }
        vbm0 vbm0Var = (vbm0) obj;
        return this.a.equals(vbm0Var.a) && this.b.equals(vbm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
