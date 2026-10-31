package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x9z extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byp b;
    public final /* synthetic */ zuc0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x9z(byp bypVar, zuc0 zuc0Var, byte b) {
        super(3);
        this.a = b;
        this.b = bypVar;
        this.c = zuc0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        zuc0 zuc0Var = this.c;
        byp bypVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                rit0 rit0Var = (rit0) bypVar.c;
                String str = (String) bypVar.b;
                String str2 = zuc0Var.a;
                ih90 ih90VarE = byp.E(zuc0Var);
                b9v0 b9v0VarA = zuc0Var.q.a(b9v0.class);
                otw.c(rit0Var, new git0(str2, str, ih90VarE, (b9v0VarA == null || !b9v0VarA.a || b9v0VarA.b) ? 0 : 1), (qim0) null, (ipb1) null, b0kVar, 0, 12);
                break;
            default:
                ((Number) obj3).intValue();
                otw.c((u7p0) bypVar.i, new q671(zuc0Var.c, zuc0Var.i, (String) bypVar.b), (qim0) null, (ipb1) null, (b0k) obj2, 0, 12);
                break;
        }
        return rih1Var;
    }
}
