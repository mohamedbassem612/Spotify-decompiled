package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class iv70 implements wpw, cvl1 {
    public final u0i a;
    public final lzn0 b;
    public final vgm c;
    public final au70 d;
    public final rey0 e = new rey0(new gn50(this, (byte) 20));
    public final hy00 f = n3o1.r(this).c(h40.P0, new kds(this, (byte) 17));
    public final rsw g = lnn1.h(new ft30(1, this, iv70.class, "propsToModel", "propsToModel(Lcom/spotify/home/evopage/element/imagelinks/models/ImageLinkProps;)Lcom/spotify/home/evopage/element/imagelinks/imagelinkcard/ImageLinkCard$Model;", 0, (byte) 11), vu70.Z, new zi50(this, (byte) 28));

    public iv70(u0i u0iVar, lzn0 lzn0Var, vgm vgmVar, au70 au70Var, gw70 gw70Var) {
        this.a = u0iVar;
        this.b = lzn0Var;
        this.c = vgmVar;
        this.d = au70Var;
    }

    public final rqw a() {
        return this.f;
    }

    public final rsw c() {
        return this.g;
    }

    public final mqw getBehavior() {
        return this.e;
    }
}
