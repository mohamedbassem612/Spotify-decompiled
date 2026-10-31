package p;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j7c1 implements cn00 {
    public final Activity a;
    public final lzn0 b;
    public final yt91 c;
    public Uri d;

    public j7c1(Activity activity, lzn0 lzn0Var, yt91 yt91Var) {
        this.a = activity;
        this.b = lzn0Var;
        this.c = yt91Var;
    }

    public final void a() {
        Uri uri = this.d;
        lzn0 lzn0Var = this.b;
        if (uri == null) {
            lzn0Var.c();
            return;
        }
        String string = uri.toString();
        yt91 yt91Var = this.c;
        i8h1 i8h1Var = (i8h1) yt91Var.b;
        x6h1 x6h1VarC = ((yok0) yt91Var.d).b.c();
        x6h1VarC.i.add(new a7h1("story_container", "", (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        lzn0Var.a(string, i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null), (Bundle) null);
        this.a.finish();
    }
}
