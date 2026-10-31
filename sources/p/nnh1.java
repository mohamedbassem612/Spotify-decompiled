package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nnh1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ onh1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nnh1(onh1 onh1Var, byte b) {
        super(1);
        this.a = b;
        this.b = onh1Var;
    }

    public final Object invoke(Object obj) {
        String string;
        byte b = this.a;
        onh1 onh1Var = this.b;
        switch (b) {
            case 0:
                return onh1Var.e;
            case 1:
                ((qtr) obj).b(new k8y0(onh1Var, (lnm) null, (byte) 27));
                return rih1.a;
            case 2:
                mnh1 mnh1Var = (mnh1) obj;
                String str = mnh1Var.a;
                Long l = mnh1Var.d;
                Context context = onh1Var.c;
                String strO = xio1.o(l, context, mnh1Var.e);
                int iC = l1d.C(mnh1Var.c);
                if (iC != 2) {
                    string = iC != 7 ? "" : context.getString(2131963495);
                } else {
                    string = context.getString(2131963493);
                }
                return new cs11(32, str, string, mnh1Var.b, strO, false, mnh1Var.e);
            default:
                return onh1Var.b.a(as11.a);
        }
    }
}
