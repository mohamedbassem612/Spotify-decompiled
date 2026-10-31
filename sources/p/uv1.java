package p;

import android.app.Activity;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uv1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv1(ven0 ven0Var, int i, ven0 ven0Var2, c9n c9nVar, mj11 mj11Var, Activity activity, dx1 dx1Var, upo upoVar) {
        super(1);
        this.c = ven0Var;
        this.b = i;
        this.d = ven0Var2;
        this.e = c9nVar;
        this.f = mj11Var;
        this.g = activity;
        this.h = dx1Var;
        this.i = upoVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.e;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                int iIntValue = ((Number) obj).intValue();
                ven0 ven0Var = (ven0) obj7;
                ven0 ven0Var2 = (ven0) obj8;
                int i = this.b;
                if (iIntValue >= i) {
                    i = iIntValue;
                }
                ven0Var2.setValue(Integer.valueOf(i));
                if (!((Boolean) ven0Var.getValue()).booleanValue() && iIntValue > 0) {
                    ven0Var.setValue(Boolean.TRUE);
                    fn31.T((c9n) obj2, (o8n) null, 0, new tv1((mj11) obj6, (Activity) obj5, (dx1) obj4, iIntValue, (upo) obj3, (lnm) null, (byte) 0), 3);
                }
                break;
            default:
                rtb0 rtb0Var = (rtb0) obj;
                String str = (String) obj8;
                if (str != null) {
                    rtb0.c(rtb0Var, (Object) null, new j2i(1263669464, new kaf(str, (byte) 15), true), 3);
                }
                c380 c380Var = (c380) obj7;
                iu30 iu30Var = (iu30) obj4;
                vky vkyVar = (vky) obj3;
                rtb0Var.e(c380Var.size(), (iu30) null, new f1m(c380Var, (byte) 1), new j2i(2039820996, new l3m(c380Var, (d0r) obj6, this.b, (String) obj5, iu30Var, vkyVar), true));
                vu30 vu30Var = (vu30) obj2;
                if (vu30Var != null) {
                    rtb0.c(rtb0Var, (Object) null, new j2i(248838593, new a2(vu30Var, (byte) 2), true), 3);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv1(String str, c380 c380Var, vu30 vu30Var, d0r d0rVar, int i, String str2, iu30 iu30Var, vky vkyVar) {
        super(1);
        this.c = str;
        this.d = c380Var;
        this.e = vu30Var;
        this.f = d0rVar;
        this.b = i;
        this.g = str2;
        this.h = iu30Var;
        this.i = vkyVar;
    }
}
