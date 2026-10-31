package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fgb0 implements dyf0 {
    public final i8h1 a;
    public final xok0 b = new xok0((byte) 17);

    public fgb0(i8h1 i8h1Var) {
        this.a = i8h1Var;
    }

    public final void a(Intent intent) {
        String dataString;
        if (!intent.getBooleanExtra("customshortcut.lastvisitedpage", false) || (dataString = intent.getDataString()) == null) {
            return;
        }
        this.a.m(this.b.e().a(dataString), (xj61) null);
    }
}
