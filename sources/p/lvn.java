package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lvn implements l5r0, lqb1 {
    public f4h1 a;
    public final /* synthetic */ fsl b;

    public lvn(fsl fslVar) {
        this.b = fslVar;
    }

    public final void c(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.a = this.b.a(context, (Bundle) null, layoutInflater, viewGroup);
    }

    public final void d(Bundle bundle) {
        d031 d031Var = this.a;
        d031 d031Var2 = d031Var instanceof d031 ? d031Var : null;
        if (d031Var2 != null) {
            kqw kqwVar = (kqw) d031Var2;
            kqwVar.d = bundle;
            Iterator it = kqwVar.c.iterator();
            while (it.hasNext()) {
                ((iu30) it.next()).invoke(bundle);
            }
        }
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        d031 d031Var = this.a;
        d031 d031Var2 = d031Var instanceof d031 ? d031Var : null;
        if (d031Var2 != null) {
            Iterator it = ((kqw) d031Var2).b.iterator();
            while (it.hasNext()) {
                ((iu30) it.next()).invoke(bundle);
            }
        }
        return bundle;
    }

    public final View getView() {
        f4h1 f4h1Var = this.a;
        if (f4h1Var != null) {
            return (View) f4h1Var.getView();
        }
        return null;
    }

    public final void start() {
        f4h1 f4h1Var = this.a;
        if (f4h1Var != null) {
            f4h1Var.start();
        }
    }

    public final void stop() {
        f4h1 f4h1Var = this.a;
        if (f4h1Var != null) {
            f4h1Var.stop();
        }
    }
}
