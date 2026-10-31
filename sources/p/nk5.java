package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nk5 extends af30 {
    public final /* synthetic */ vk5 X;
    public final /* synthetic */ sk5 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk5(vk5 vk5Var, vk5 vk5Var2, sk5 sk5Var) {
        super(vk5Var2);
        this.X = vk5Var;
        this.t = sk5Var;
    }

    @Override // p.af30
    public final gc81 b() {
        return this.t;
    }

    @Override // p.af30
    public final boolean c() {
        vk5 vk5Var = this.X;
        if (vk5Var.getInternalPopup().a()) {
            return true;
        }
        vk5Var.f.i(vk5Var.getTextDirection(), vk5Var.getTextAlignment());
        return true;
    }
}
