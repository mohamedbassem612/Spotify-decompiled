package p;

import android.graphics.Typeface;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class qw4 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qw4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                rw4 rw4Var = (rw4) obj5;
                e2h1 e2h1VarA = rw4Var.e.a((FontFamily) obj, (FontWeight) obj2, ((FontStyle) obj3).a, ((FontSynthesis) obj4).a);
                if (e2h1VarA instanceof e2h1) {
                    return (Typeface) e2h1VarA.a;
                }
                dlg1 dlg1Var = rw4Var.t;
                dlg1 dlg1Var2 = new dlg1();
                dlg1Var2.a = e2h1VarA;
                dlg1Var2.b = dlg1Var;
                dlg1Var2.c = e2h1VarA.getValue();
                rw4Var.t = dlg1Var2;
                return (Typeface) dlg1Var2.c;
            case 1:
                j2i j2iVar = (j2i) obj5;
                gpb0 gpb0Var = (gpb0) obj;
                ((Integer) obj2).getClass();
                x340 x340Var = (b0k) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var.g(gpb0Var) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 131) != 130)) {
                    j2iVar.invoke(gpb0Var, x340Var2, Integer.valueOf(iIntValue & 14));
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                Float f = (Float) obj2;
                f.getClass();
                Float f2 = (Float) obj4;
                f2.getClass();
                ((zu30) ((ven0) obj5).getValue()).J((Offset) obj, f, (Offset) obj3, f2);
                return rih1Var;
        }
    }
}
