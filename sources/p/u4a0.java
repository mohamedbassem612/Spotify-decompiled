package p;

import android.app.Activity;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u4a0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ohd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u4a0(ohd ohdVar, byte b) {
        super(1);
        this.a = b;
        this.b = ohdVar;
    }

    public final Object invoke(Object obj) {
        ovf0 ovf0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ohd ohdVar = this.b;
        switch (b) {
            case 0:
                ohdVar.k((iu30) null, (Activity) obj);
                return rih1Var;
            case 1:
                qc40 qc40Var = (qc40) obj;
                if (qc40Var.equals(pc40.a)) {
                    ovf0Var = ovf0.a;
                } else {
                    if (!qc40Var.equals(oc40.a)) {
                        eg.o();
                        return null;
                    }
                    ovf0Var = mvf0.a;
                }
                ohdVar.k(dvf0.b, ovf0Var);
                return rih1Var;
            case 2:
                ohdVar.resumeWith(Integer.valueOf(((Number) obj).intValue()));
                return rih1Var;
            case 3:
                ohdVar.resumeWith((Map) obj);
                return rih1Var;
            default:
                ohdVar.resumeWith(new xs1((pia1) obj));
                return rih1Var;
        }
    }
}
