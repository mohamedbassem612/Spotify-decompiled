package p;

import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jgs extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tps b;
    public final /* synthetic */ ConstraintLayout c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jgs(tps tpsVar, ConstraintLayout constraintLayout, boolean z, byte b) {
        super(1);
        this.a = b;
        this.b = tpsVar;
        this.c = constraintLayout;
        this.d = z;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.d;
        ConstraintLayout constraintLayout = this.c;
        tps tpsVar = this.b;
        switch (b) {
            case 0:
                tpsVar.b(constraintLayout, z, Integer.valueOf(((Number) obj).intValue()));
                break;
            default:
                tpsVar.b(constraintLayout, z, null);
                break;
        }
        return rih1Var;
    }
}
