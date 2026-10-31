package p;

import android.net.Uri;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zw1 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ ven0 e;

    public /* synthetic */ zw1(ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4, byte b) {
        this.a = b;
        this.b = ven0Var;
        this.c = ven0Var2;
        this.d = ven0Var3;
        this.e = ven0Var4;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        tbr0 tbr0Var;
        ou80 ou80Var;
        String str;
        String str2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.e;
        ven0 ven0Var2 = this.d;
        ven0 ven0Var3 = this.c;
        ven0 ven0Var4 = this.b;
        u7h u7hVar = null;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                wp1 wp1Var = (wp1) obj;
                if (wp1Var instanceof tp1) {
                    b431 b431Var = (b431) ven0Var4.getValue();
                    if (b431Var == null) {
                        return rih1Var;
                    }
                    tp1 tp1Var = (tp1) wp1Var;
                    cqn cqnVar = tp1Var.a;
                    tv80 tv80Var = tp1Var.b;
                    if (tv80Var != null && (ou80Var = tv80Var.a) != null) {
                        u7hVar = ou80Var.a;
                    }
                    b431Var.a(cqnVar, u7hVar);
                    return rih1Var;
                }
                if (wp1Var instanceof vp1) {
                    ven0Var3.setValue(Boolean.TRUE);
                    return rih1Var;
                }
                if (!(wp1Var instanceof up1)) {
                    eg.o();
                    return null;
                }
                if (((Boolean) ven0Var2.getValue()).booleanValue() || (tbr0Var = (tbr0) ven0Var.getValue()) == null) {
                    return rih1Var;
                }
                ven0Var2.setValue(Boolean.TRUE);
                tbr0Var.a(new y231(new hv1(((up1) wp1Var).a)));
                return rih1Var;
            case 1:
                nmr0 nmr0Var = (nmr0) obj;
                nmr0Var.getClass();
                String str3 = (String) nmr0Var.a;
                eww0 eww0Var = (eww0) nmr0Var.b;
                ven0Var4.setValue(str3);
                ven0Var3.setValue(eww0Var != null ? eww0Var.b : null);
                ven0Var2.setValue((eww0Var == null || (str = eww0Var.f) == null) ? null : Uri.parse(str));
                ven0Var.setValue(eww0Var != null ? new u7h(u7h.b(z4p1.e(eww0Var.g), 1.0f, 0.0f, 0.0f, 0.0f, 14)) : null);
                return rih1Var;
            default:
                nmr0 nmr0Var2 = (nmr0) obj;
                nmr0Var2.getClass();
                String str4 = (String) nmr0Var2.a;
                eww0 eww0Var2 = (eww0) nmr0Var2.b;
                ven0Var4.setValue(str4);
                ven0Var3.setValue(eww0Var2 != null ? eww0Var2.b : null);
                ven0Var2.setValue((eww0Var2 == null || (str2 = eww0Var2.f) == null) ? null : Uri.parse(str2));
                ven0Var.setValue(eww0Var2 != null ? new u7h(u7h.b(z4p1.e(eww0Var2.g), 1.0f, 0.0f, 0.0f, 0.0f, 14)) : null);
                return rih1Var;
        }
    }
}
