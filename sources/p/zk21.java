package p;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class zk21 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, k8c0 k8c0Var) {
        if (activity instanceof iac0) {
            x8c0 lifecycle = ((iac0) activity).getLifecycle();
            if (lifecycle instanceof tac0) {
                ((tac0) lifecycle).g(k8c0Var);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            bl21.a.Companion.getClass();
            al21.a(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new bl21(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
