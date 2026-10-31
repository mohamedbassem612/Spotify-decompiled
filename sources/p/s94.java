package p;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.ui.text.intl.LocaleList;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class s94 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ha4 b;

    public /* synthetic */ s94(ha4 ha4Var, byte b) {
        this.a = b;
        this.b = ha4Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 0;
        ha4 ha4Var = this.b;
        switch (b) {
            case 0:
                Class cls = ha4.j2;
                l9x0.a(ha4Var);
                return rih1Var;
            case 1:
                Boolean bool = (Boolean) ha4Var.S0.getValue();
                bool.getClass();
                return bool;
            case 2:
                fhe0 fhe0VarA = yoi1.A(ha4Var.getConfiguration());
                if (fhe0VarA.a.a.isEmpty()) {
                    fhe0VarA = fhe0.d(n8p1.p());
                }
                int iC = fhe0VarA.c();
                ArrayList arrayList = new ArrayList(iC);
                while (i < iC) {
                    Locale localeB = fhe0VarA.b(i);
                    localeB.getClass();
                    arrayList.add(new ehe0(localeB));
                    i++;
                }
                return new LocaleList(arrayList);
            case 3:
                MotionEvent motionEvent = ha4Var.N1;
                if (motionEvent != null) {
                    boolean zContains = p7h.M(new Integer[]{9, 7, 8}).contains(Integer.valueOf(motionEvent.getActionMasked()));
                    MotionEvent motionEvent2 = ha4Var.N1;
                    if (motionEvent2 != null && motionEvent2.getButtonState() == 0) {
                        i = 1;
                    }
                    if (zContains && i != 0) {
                        ha4Var.O1 = SystemClock.uptimeMillis();
                        ha4Var.post(ha4Var.V1);
                    }
                }
                ha4Var.b2.invoke();
                return rih1Var;
            default:
                q75 q75Var = ha4Var.q1;
                if (q75Var != null) {
                    int childCount = q75Var.getChildCount();
                    while (i < childCount) {
                        View childAt = q75Var.getChildAt(i);
                        k75 k75Var = childAt instanceof k75 ? (k75) childAt : null;
                        if (k75Var != null && k75Var.isLayoutRequested()) {
                            k75Var.layout(k75Var.getLeft(), k75Var.getTop(), k75Var.getRight(), k75Var.getBottom());
                        }
                        i++;
                    }
                }
                return rih1Var;
        }
    }
}
