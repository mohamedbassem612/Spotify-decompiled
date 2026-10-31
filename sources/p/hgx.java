package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hgx implements u0i {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ gw70 c;

    public /* synthetic */ hgx(Context context, gw70 gw70Var, byte b) {
        this.a = b;
        this.b = context;
        this.c = gw70Var;
    }

    public final qzh a(l0i l0iVar) {
        byte b = this.a;
        gw70 gw70Var = this.c;
        Context context = this.b;
        switch (b) {
            case 0:
                if (l0iVar == null) {
                    return new nts(context, gw70Var);
                }
                bhn0.d();
                return null;
            default:
                if (l0iVar == null) {
                    return new h98(context, gw70Var, (byte) 16);
                }
                bhn0.d();
                return null;
        }
    }
}
