package p;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.intl.LocaleList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class odt0 {
    public static final kiv a = new kiv(new el70((byte) 23), (byte) 1);
    public static final oub0 b;

    /* JADX WARN: Type inference failed for: r0v1, types: [p.oub0] */
    static {
        final byte b2 = 1;
        b = new zu30() { // from class: p.oub0
            public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
                switch (b2) {
                    case 0:
                        j2i j2iVar = lfi.a;
                        rub0 rub0Var = (rub0) obj;
                        ((Integer) obj2).getClass();
                        x340 x340Var = (b0k) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= x340Var.g(rub0Var) ? 4 : 2;
                        }
                        x340 x340Var2 = x340Var;
                        if (x340Var2.Y(iIntValue & 1, (iIntValue & 131) != 130)) {
                            j2iVar.invoke(rub0Var, x340Var2, Integer.valueOf(iIntValue & 14));
                        } else {
                            x340Var2.b0();
                        }
                        return rih1.a;
                    default:
                        return new ndt0((o8n) obj, (Context) obj2, (fw51) obj3, (LocaleList) obj4);
                }
            }
        };
    }

    public static final void a(d3e1 d3e1Var, Context context, boolean z, CharSequence charSequence, nbe1 nbe1Var, hdt0 hdt0Var, iu30 iu30Var) {
        if (Build.VERSION.SDK_INT >= 28 && charSequence != null && nbe1Var != null && hdt0Var != null && (hdt0Var instanceof ndt0)) {
            ((ndt0) hdt0Var).a(d3e1Var, charSequence, nbe1Var.a, iu30Var);
            bwp0.f(d3e1Var, context, z, charSequence, nbe1Var.a);
            return;
        }
        iu30Var.invoke(d3e1Var);
        if (charSequence == null || nbe1Var == null) {
            return;
        }
        bwp0.f(d3e1Var, context, z, charSequence, nbe1Var.a);
    }

    public static final hdt0 b(LocaleList localeList, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(430530635);
        if (Build.VERSION.SDK_INT < 28) {
            x340Var.r(false);
            return null;
        }
        Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
        o8n o8nVar = (o8n) x340Var.k(a);
        boolean zG = x340Var.g(o8nVar) | x340Var.g(context) | x340Var.g(localeList);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            b.getClass();
            objT = new ndt0(o8nVar, context, fw51.a, localeList);
            x340Var.s0(objT);
        }
        hdt0 hdt0Var = (hdt0) objT;
        x340Var.r(false);
        return hdt0Var;
    }
}
