package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class g9g0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v8l0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g9g0(v8l0 v8l0Var, byte b) {
        super(1);
        this.a = b;
        this.b = v8l0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        v8l0 v8l0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj).intValue();
                x6h1 x6h1VarC = v8l0Var.a.c();
                x6h1VarC.i.add(new a7h1("items", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                r6h1 r6h1Var = r6h1.c;
                return new r6h1(kk0.l(y6h1VarA), (u8h1) null);
            case 1:
                ((Number) obj).intValue();
                return v8l0Var.b();
            default:
                return new h3h1(new g9g0(v8l0Var, (byte) 1));
        }
    }
}
