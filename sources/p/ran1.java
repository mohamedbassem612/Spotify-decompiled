package p;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ran1 extends Fragment implements bac0 {
    public static final WeakHashMap b = new WeakHashMap();
    public final ftn1 a = new ftn1();

    public static ran1 b(Activity activity) {
        ran1 ran1Var;
        WeakHashMap weakHashMap = b;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (ran1Var = (ran1) weakReference.get()) != null) {
            return ran1Var;
        }
        try {
            ran1 ran1Var2 = (ran1) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (ran1Var2 == null || ran1Var2.isRemoving()) {
                ran1Var2 = new ran1();
                activity.getFragmentManager().beginTransaction().add(ran1Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(ran1Var2));
            return ran1Var2;
        } catch (ClassCastException e) {
            k220.p("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
            return null;
        }
    }

    public final Activity H() {
        return getActivity();
    }

    public final void a(c8n1 c8n1Var) {
        this.a.b(c8n1Var);
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.a.j();
    }

    public final c8n1 l() {
        return this.a.a();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.a.f(i, i2, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.c(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.a.i();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.a.e();
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.a.g(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.a.d();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.a.h();
    }
}
