package p;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yck1 implements View.OnClickListener {
    public static final HashSet e = new HashSet();
    public final View.OnClickListener a;
    public final WeakReference b;
    public final WeakReference c;
    public final String d;

    public yck1(View view, View view2, String str) {
        this.a = ibk1.f(view);
        this.b = new WeakReference(view2);
        this.c = new WeakReference(view);
        this.d = nhc1.W(str.toLowerCase(), "activity", "");
    }

    public final void a() {
        yck1 yck1Var;
        Set set = dhn.a;
        if (set.contains(this)) {
            return;
        }
        try {
            View view = (View) this.b.get();
            View view2 = (View) this.c.get();
            if (view == null || view2 == null) {
                return;
            }
            try {
                String strD = dtc1.d(view2);
                String strB = fnv0.b(view2, strD);
                if (strB != null && !s9p1.K(strB, strD)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("view", dtc1.b(view, view2));
                    jSONObject.put("screenname", this.d);
                    if (!set.contains(this)) {
                        try {
                            yck1Var = this;
                            try {
                                wf10.c().execute(new m2d((Object) jSONObject, (Object) strD, (Object) yck1Var, (Object) strB, (byte) 29));
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    dhn.a(yck1Var, th);
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            yck1Var = this;
                        }
                    }
                }
                return;
            } catch (Exception unused) {
                return;
            }
        } catch (Throwable th4) {
            th = th4;
            yck1Var = this;
        }
        dhn.a(yck1Var, th);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            View.OnClickListener onClickListener = this.a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            a();
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }
}
