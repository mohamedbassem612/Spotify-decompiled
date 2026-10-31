package p;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rtb extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rtb(int i, int i2, rk41 rk41Var) {
        super(0);
        this.a = (byte) 2;
        this.b = i;
        this.c = i2;
        this.d = rk41Var;
    }

    public final Object invoke() {
        String strA;
        char c;
        char c2;
        String str;
        String str2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.d;
        int i = this.c;
        int i2 = this.b;
        switch (b) {
            case 0:
                lub lubVar = (lub) obj;
                hp80 hp80Var = lubVar.b;
                if (i2 == 0 || (strA = lubVar.a()) == null) {
                    return rih1Var;
                }
                mub mubVar = lubVar.a;
                uba ubaVar = mubVar.b;
                opl0 opl0VarA = mubVar.a(strA, hp80Var);
                int iC = l1d.C(i2);
                if (iC == 0) {
                    c = 5;
                } else if (iC == 1) {
                    c = 4;
                } else if (iC == 2) {
                    c = 1;
                } else {
                    if (iC != 3) {
                        if (iC == 4) {
                            c = 3;
                        } else {
                            eg.o();
                        }
                        return null;
                    }
                    c = 2;
                }
                int iC2 = l1d.C(i);
                if (iC2 == 0) {
                    c2 = 2;
                } else {
                    if (iC2 != 1) {
                        eg.o();
                        return null;
                    }
                    c2 = 1;
                }
                x6h1 x6h1VarC = opl0VarA.c.c();
                if (c == 1) {
                    str = "like";
                } else if (c == 2) {
                    str = "navigate";
                } else if (c == 3) {
                    str = "navigate_to_next";
                } else if (c == 4) {
                    str = "save";
                } else {
                    if (c != 5) {
                        throw null;
                    }
                    str = "share";
                }
                String str3 = str;
                if (c2 == 1) {
                    str2 = "not_saved";
                } else {
                    if (c2 != 2) {
                        throw null;
                    }
                    str2 = "saved";
                }
                x6h1VarC.i.add(new a7h1("center_button", str3, (Integer) null, (String) null, str2));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = opl0VarA.b;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                lubVar.f = ubaVar.p(k7h1Var.a(), mub.d);
                return rih1Var;
            case 1:
                return new i390(new Surface((SurfaceTexture) obj), new l291(i2, i), true);
            default:
                if (i2 == i) {
                    ((xgm1) ((rk41) obj).c).a(fgm1.a);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rtb(Object obj, int i, int i2, byte b) {
        super(0);
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }
}
