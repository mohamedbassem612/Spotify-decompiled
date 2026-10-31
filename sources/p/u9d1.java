package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class u9d1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v8o0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u9d1(v8o0 v8o0Var, byte b) {
        super(0);
        this.a = b;
        this.b = v8o0Var;
    }

    public final Object invoke() {
        m9d1 m9d1Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        v8o0 v8o0Var = this.b;
        switch (b) {
            case 0:
                ((Function0) v8o0Var.e).invoke();
                return rih1Var;
            case 1:
                ((Function0) v8o0Var.e).invoke();
                return rih1Var;
            case 2:
                ((Function0) v8o0Var.e).invoke();
                return rih1Var;
            default:
                int i = v8o0Var.a;
                Context context = (Context) v8o0Var.c;
                int iC = l1d.C(i);
                byte b2 = 0;
                if (iC != 0) {
                    byte b3 = 1;
                    if (iC == 1) {
                        u9d1 u9d1Var = new u9d1(v8o0Var, b3);
                        plm plmVar = new plm(context, 2132018135);
                        int iO = ago1.o(plmVar, 2130968844, 0);
                        int iO2 = ago1.o(plmVar, 2130968831, 0);
                        Drawable drawable = plmVar.getDrawable(2131232431);
                        if (drawable != null) {
                            drawable.setTint(iO);
                        } else {
                            drawable = null;
                        }
                        Drawable drawable2 = plmVar.getDrawable(2131231569);
                        if (drawable2 != null) {
                            drawable2.setTint(iO);
                        } else {
                            drawable2 = null;
                        }
                        if (drawable2 == null || drawable == null) {
                            return null;
                        }
                        return new m9d1(iO2, new ads(drawable2, drawable), u9d1Var);
                    }
                    byte b4 = 2;
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    u9d1 u9d1Var2 = new u9d1(v8o0Var, b4);
                    plm plmVar2 = new plm(context, 2132018135);
                    int iO3 = ago1.o(plmVar2, 2130968787, 0);
                    int iO4 = ago1.o(plmVar2, 2130969842, 0);
                    Drawable drawable3 = plmVar2.getDrawable(2131231690);
                    if (drawable3 != null) {
                        drawable3.setTint(iO3);
                    } else {
                        drawable3 = null;
                    }
                    if (drawable3 == null) {
                        return null;
                    }
                    m9d1Var = new m9d1(iO4, new ads(drawable3, (Drawable) null), u9d1Var2);
                } else {
                    u9d1 u9d1Var3 = new u9d1(v8o0Var, b2);
                    plm plmVar3 = new plm(context, 2132018135);
                    int iO5 = ago1.o(plmVar3, 2130968844, 0);
                    int iO6 = ago1.o(plmVar3, 2130968831, 0);
                    Drawable drawable4 = plmVar3.getDrawable(2131231360);
                    if (drawable4 != null) {
                        drawable4.setTint(iO5);
                    } else {
                        drawable4 = null;
                    }
                    if (drawable4 == null) {
                        return null;
                    }
                    m9d1Var = new m9d1(iO6, new ads(drawable4, (Drawable) null), u9d1Var3);
                }
                return m9d1Var;
        }
    }
}
