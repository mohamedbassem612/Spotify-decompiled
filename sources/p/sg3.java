package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sg3 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ug3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sg3(ug3 ug3Var, byte b) {
        super(1);
        this.a = b;
        this.b = ug3Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ug3 ug3Var = this.b;
        switch (b) {
            case 0:
                return new c1v0(((opv0) ug3Var.d).b(((og3) obj).a, (ymd0) null), (byte) 7);
            case 1:
                ((qtr) obj).b(new kr(ug3Var, (lnm) null, (byte) 2));
                return rih1.a;
            default:
                return new r740(((Context) ug3Var.b).getString(2131952188), ((rg3) obj) instanceof pg3);
        }
    }
}
