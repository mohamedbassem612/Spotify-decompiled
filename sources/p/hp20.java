package p;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hp20 {
    public final Activity a;
    public final swv0 b;
    public final lzn0 c;

    public /* synthetic */ hp20(Activity activity, swv0 swv0Var, lzn0 lzn0Var) {
        this.a = activity;
        this.b = swv0Var;
        this.c = lzn0Var;
    }

    public void a(doc docVar) {
        String str = docVar.b;
        String str2 = docVar.c;
        if (str2 == null || str2.length() == 0) {
            str2 = "Unknown";
        }
        rwv0 rwv0Var = new rwv0(new ixf(str2), "", (str == null || str.length() == 0) ? null : Uri.parse(str));
        Activity activity = (Activity) new WeakReference(this.a).get();
        if (activity != null) {
            swv0.c(this.b, activity, rwv0Var);
        }
    }

    public void b(int i, qp20 qp20Var, tv80 tv80Var) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", new np20(i, qp20Var));
        this.c.i(new dwn0(nik1.c2.a, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80Var != null ? new bwn0(tv80Var) : null), bundle);
    }
}
