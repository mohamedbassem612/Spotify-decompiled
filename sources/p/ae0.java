package p;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ae0 implements dkl {
    public final /* synthetic */ byte a;
    public Object b;

    public /* synthetic */ ae0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void accept(Object obj) {
        Uri m231Var;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                fe0 fe0Var = (fe0) this.b;
                fe0Var.h.c(fe0.j[1], fe0Var, bool);
                return;
            case 1:
                bab1 bab1Var = (bab1) this.b;
                lik1 lik1Var = jf2.b;
                if (fae1.s((Intent) obj)) {
                    qe2 qe2Var = new qe2(nik1.Y6.a, null);
                    if (bab1Var.d.c(qe2Var, smg1.a)) {
                        return;
                    }
                    aab1.e(bab1Var.d, qe2Var);
                    return;
                }
                return;
            case 2:
                ((dkl) this.b).accept(obj);
                return;
            case 3:
                ((iu30) this.b).invoke(((p5x) obj).a);
                return;
            case 4:
                t930 t930Var = (t930) obj;
                if (t930Var == null) {
                    t930Var = new t930(-3);
                }
                ((q59) this.b).r(t930Var);
                return;
            case 5:
                t930 t930Var2 = (t930) obj;
                synchronized (u930.c) {
                    try {
                        jv81 jv81Var = u930.d;
                        ArrayList arrayList = (ArrayList) jv81Var.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        jv81Var.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((dkl) arrayList.get(i)).accept(t930Var2);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                Intent intent = (Intent) obj;
                w911 w911Var = (w911) this.b;
                Activity activity = w911Var.a;
                if (intent.getBooleanExtra("is_internal_navigation", false)) {
                    return;
                }
                activity.setIntent(intent);
                try {
                    m231Var = ag0.z0(activity);
                    break;
                } catch (Throwable th2) {
                    m231Var = new m231(th2);
                }
                w911Var.b = m231Var instanceof m231 ? null : m231Var;
                return;
        }
    }
}
