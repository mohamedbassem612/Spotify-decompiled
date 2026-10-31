package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pbf extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qbf b;
    public final /* synthetic */ qto0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pbf(qbf qbfVar, qto0 qto0Var, byte b) {
        super(1);
        this.a = b;
        this.b = qbfVar;
        this.c = qto0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        qto0 qto0Var = this.c;
        qbf qbfVar = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                wmy wmyVar = qbfVar.b;
                cvy0 cvy0Var = qto0Var.j;
                String str = cvy0Var.a;
                String str2 = cvy0Var.c;
                String str3 = cvy0Var.b;
                Bundle bundle = new Bundle();
                bundle.putString("groupId", qto0Var.f);
                return wmyVar.m(iIntValue, str, str2, str3, bundle);
            default:
                return t3p1.w(qbfVar.b, ((Number) obj).intValue(), qto0Var.c.c, qto0Var.j);
        }
    }
}
