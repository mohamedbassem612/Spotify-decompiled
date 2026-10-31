package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class igo implements it80 {
    public final /* synthetic */ byte a;
    public final Context b;

    public /* synthetic */ igo(Context context, byte b) {
        this.a = b;
        this.b = context;
    }

    public final void a(ajq0 ajq0Var) {
        switch (this.a) {
            case 0:
                ajq0Var.G(blc0.W5, "Component for cultural moments data stories", new a0m(this, (byte) 5));
                break;
            default:
                ajq0Var.G(blc0.H6, "Component for fandom collectibles data stories", new lmw(this, (byte) 13));
                break;
        }
    }
}
