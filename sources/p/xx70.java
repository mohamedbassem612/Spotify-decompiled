package p;

import androidx.camera.core.ImageProcessingUtil;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class xx70 implements xe30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zx70 b;

    public /* synthetic */ xx70(zx70 zx70Var, zx70 zx70Var2, byte b) {
        this.a = b;
        this.b = zx70Var2;
    }

    @Override // p.xe30
    public final void a(ye30 ye30Var) throws Exception {
        byte b = this.a;
        zx70 zx70Var = this.b;
        switch (b) {
            case 0:
                int i = ImageProcessingUtil.a;
                zx70Var.close();
                break;
            default:
                int i2 = ImageProcessingUtil.a;
                zx70Var.close();
                break;
        }
    }
}
