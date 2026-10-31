package p;

import android.content.Context;
import android.content.res.Configuration;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tid {
    public final g26 a;

    public tid(g26 g26Var) {
        this.a = g26Var;
    }

    public final boolean a(Context context) {
        int i;
        Configuration configuration = context.getResources().getConfiguration();
        boolean z = configuration.screenHeightDp > configuration.screenWidthDp;
        g26 g26Var = this.a;
        return (z && g26Var.d()) || (!z && g26Var.c()) || ((i = configuration.screenWidthDp) < 600 && i / configuration.screenHeightDp < 1);
    }
}
