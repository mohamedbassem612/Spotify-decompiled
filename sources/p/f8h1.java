package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f8h1 {
    public final Uri a;
    public final /* synthetic */ g8h1 b;

    public f8h1(Uri uri, g8h1 g8h1Var) {
        this.b = g8h1Var;
        this.a = uri;
    }

    public final void a() {
        String str;
        dfa0 dfa0VarC = g8h1.c(this.a);
        if (dfa0VarC == null || (str = dfa0VarC.f) == null) {
            return;
        }
        this.b.b.j().a(new cwz(str.concat(":end")));
    }
}
