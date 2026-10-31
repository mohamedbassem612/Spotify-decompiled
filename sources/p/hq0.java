package p;

import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hq0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ziu b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hq0(ziu ziuVar, iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = ziuVar;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        rs70 rs70Var = rs70.a;
        iu30 iu30Var = this.c;
        ziu ziuVar = this.b;
        switch (b) {
            case 0:
                String strR = ila0.r(ziuVar.f.e);
                Logger.d("Failed to load image: ".concat(strR != null ? strR : ""), new Object[0]);
                iu30Var.invoke(rs70Var);
                break;
            case 1:
                String strR2 = ila0.r(ziuVar.f.e);
                Logger.d("Failed to load image: %s", new Object[]{strR2 != null ? strR2 : ""});
                iu30Var.invoke(rs70Var);
                break;
            case 2:
                String strR3 = ila0.r(ziuVar.f.e);
                Logger.d("Failed to load image: ".concat(strR3 != null ? strR3 : ""), new Object[0]);
                iu30Var.invoke(rs70Var);
                break;
            default:
                String strR4 = ila0.r(ziuVar.f.e);
                Logger.d("Failed to load image: ".concat(strR4 != null ? strR4 : ""), new Object[0]);
                iu30Var.invoke(rs70Var);
                break;
        }
        return rih1Var;
    }
}
