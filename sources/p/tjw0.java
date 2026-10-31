package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public interface tjw0 {
    static ww81 a(jp00 jp00Var, Context context) {
        Context applicationContext = context.getApplicationContext();
        ojs ojsVar = new ojs(context.getApplicationContext());
        exs exsVar = new exs(context.getApplicationContext());
        bo00 bo00Var = new bo00(applicationContext, ojsVar);
        bo00Var.c(exsVar);
        dm5.y(!bo00Var.A);
        bo00Var.A = true;
        return new ww81(bo00Var);
    }
}
