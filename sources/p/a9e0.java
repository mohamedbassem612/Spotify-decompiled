package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a9e0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b9e0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a9e0(b9e0 b9e0Var, byte b) {
        super(0);
        this.a = b;
        this.b = b9e0Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x008a A[PHI: r5
      0x008a: PHI (r5v1 int) = (r5v0 int), (r5v2 int) binds: [B:5:0x0026, B:7:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b9e0 b9e0Var = this.b;
        switch (b) {
            case 0:
                b9e0Var.t.invoke();
                return rih1Var;
            case 1:
                ArrayList arrayList = b9e0Var.g;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (obj instanceof anc0) {
                        arrayList2.add(obj);
                    }
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((anc0) it.next()).n();
                }
                return rih1Var;
            default:
                dzp0 dzp0Var = b9e0Var.e;
                LayoutInflater layoutInflater = b9e0Var.f;
                ViewGroup viewGroup = b9e0Var.d;
                dzp0Var.getClass();
                FrameLayout frameLayout = null;
                CoordinatorLayout coordinatorLayoutInflate = layoutInflater.inflate(2131625411, (ViewGroup) null, false);
                int i = 2131427413;
                if (((FrameLayout) m5n1.t(coordinatorLayoutInflate, 2131427413)) != null) {
                    i = 2131428155;
                    ComposeView composeViewT = m5n1.t(coordinatorLayoutInflate, 2131428155);
                    if (composeViewT != null) {
                        ewn0 ewn0Var = new ewn0(coordinatorLayoutInflate, composeViewT);
                        dzp0Var.b = composeViewT;
                        dzp0Var.d = ewn0Var;
                        View viewInflate = layoutInflater.inflate(2131625415, viewGroup, false);
                        FrameLayout frameLayout2 = (FrameLayout) m5n1.t(viewInflate, 2131428198);
                        if (frameLayout2 != null) {
                            jxp0 jxp0Var = new jxp0((FrameLayout) viewInflate, frameLayout2);
                            ewn0 ewn0Var2 = (ewn0) dzp0Var.d;
                            frameLayout2.addView(ewn0Var2 != null ? (CoordinatorLayout) ewn0Var2.b : null);
                            dzp0Var.c = jxp0Var;
                            frameLayout2.setBackgroundColor(0);
                            jxp0 jxp0Var2 = (jxp0) dzp0Var.c;
                            frameLayout = jxp0Var2 != null ? (FrameLayout) jxp0Var2.b : null;
                            frameLayout.getClass();
                        } else {
                            bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(2131428198)));
                        }
                    } else {
                        bhn0.i("Missing required view with ID: ".concat(coordinatorLayoutInflate.getResources().getResourceName(i)));
                    }
                } else {
                    bhn0.i("Missing required view with ID: ".concat(coordinatorLayoutInflate.getResources().getResourceName(i)));
                }
                return frameLayout;
        }
    }
}
