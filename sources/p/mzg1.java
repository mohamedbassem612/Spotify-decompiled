package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mzg1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mzg1(Object obj, byte b) {
        super(1);
        this.a = b;
    }

    @Override // p.iu30
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                lzg1 lzg1Var = (lzg1) obj;
                return new j511(lzg1Var.a, nhc1.W(lzg1Var.b, "{0}", ""), zqo1.n(lzg1Var.d, lzg1Var.c));
            default:
                ((View) obj).setTag(2131427536, Boolean.TRUE);
                return rih1.a;
        }
    }
}
