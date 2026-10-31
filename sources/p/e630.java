package p;

import android.R;
import android.app.Activity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e630 {
    public static void a(Activity activity, int i, iu30 iu30Var) {
        mw40 mw40VarT = yoi1.T(activity, activity.getString(2131956080), activity.getString(i));
        String string = activity.getString(R.string.ok);
        d630 d630Var = new d630(iu30Var, (byte) 0);
        mw40VarT.a = string;
        mw40VarT.c = d630Var;
        mw40VarT.e = true;
        mw40VarT.b().b();
        iu30Var.invoke(c630.a);
    }

    public static void b(Activity activity, a530 a530Var, iu30 iu30Var) {
        if (a530Var instanceof y430) {
            a(activity, 2131956078, iu30Var);
        } else if (a530Var instanceof z430) {
            a(activity, 2131956079, iu30Var);
        } else {
            eg.o();
        }
    }
}
