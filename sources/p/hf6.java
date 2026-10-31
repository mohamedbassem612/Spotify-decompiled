package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hf6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ ola0 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf6(c380 c380Var, String str, boolean z, int i, iu30 iu30Var, String str2, ven0 ven0Var) {
        super(1);
        this.e = c380Var;
        this.f = str;
        this.b = z;
        this.c = i;
        this.g = iu30Var;
        this.h = str2;
        this.d = ven0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.f;
        Object obj3 = this.h;
        Object obj4 = this.g;
        c380 c380Var = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                dw91 dw91Var = (dw91) c380Var;
                int i = this.c;
                if (!zBooleanValue) {
                    boolean z = dw91Var.remove(Integer.valueOf(i)) != null;
                    Integer numValueOf = Integer.valueOf(i);
                    boolean z2 = this.b;
                    ((dw91) obj2).put(numValueOf, Boolean.valueOf(z2));
                    if (z && i == ((kes) obj4).o()) {
                        this.d.setValue(wgo1.y((re6) obj3, i, z2 ? tf6.a : tf6.b));
                    }
                } else {
                    dw91Var.put(Integer.valueOf(i), Boolean.TRUE);
                }
                break;
            default:
                rtb0 rtb0Var = (rtb0) obj;
                rtb0.b(rtb0Var, c380Var.size(), vxd1.h, new j2i(1947776035, new b1e1(c380Var, this.b, this.c, (iu30) obj4, (String) obj3, this.d), true), 4);
                String str = (String) obj2;
                if (str != null && str.length() != 0) {
                    rtb0.c(rtb0Var, "provider_credit", new j2i(1905271605, new dba1(str, (byte) 5), true), 2);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf6(dw91 dw91Var, int i, dw91 dw91Var2, boolean z, kes kesVar, re6 re6Var, ven0 ven0Var) {
        super(1);
        this.e = dw91Var;
        this.c = i;
        this.f = dw91Var2;
        this.b = z;
        this.g = kesVar;
        this.h = re6Var;
        this.d = ven0Var;
    }
}
