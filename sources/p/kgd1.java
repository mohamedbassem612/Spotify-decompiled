package p;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kgd1 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qm91 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kgd1(qm91 qm91Var, byte b) {
        super(4);
        this.a = b;
        this.b = qm91Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        qm91 qm91Var = this.b;
        switch (b) {
            case 0:
                return new i2m0(Integer.valueOf(((Number) obj3).intValue()), ((ito) ((ArrayList) qm91Var.f).get(((fgd1) obj).a)).b, (r6h1) obj4);
            default:
                return new vh((Context) obj2, qm91Var);
        }
    }
}
