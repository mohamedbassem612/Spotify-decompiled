package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class yts extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mxr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yts(mxr mxrVar, byte b) {
        super(1);
        this.a = b;
        this.b = mxrVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        mxr mxrVar = this.b;
        switch (b) {
            case 0:
                Bundle bundle = (Bundle) obj;
                Integer num = (Integer) mxrVar.c;
                if (num != null) {
                    bundle.putInt("selectedPosition", num.intValue());
                }
                return rih1.a;
            default:
                ito itoVar = (ito) obj;
                g23 g23Var = (g23) mxrVar.d;
                return g23Var != null ? g23Var.l(itoVar) : itoVar.f;
        }
    }
}
