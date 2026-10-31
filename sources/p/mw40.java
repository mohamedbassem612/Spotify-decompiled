package p;

import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mw40 {
    public CharSequence a;
    public CharSequence b;
    public DialogInterface.OnClickListener c;
    public DialogInterface.OnClickListener d;
    public boolean e = true;
    public DialogInterface.OnCancelListener f;
    public DialogInterface.OnDismissListener g;
    public qw40 h;
    public final Context i;
    public final lw40 j;

    public mw40(Context context, lw40 lw40Var) {
        this.i = context;
        this.j = lw40Var;
    }

    public final void a(boolean z) {
        this.e = z;
    }

    public final pw40 b() {
        return new pw40(this.i, this);
    }

    public final void c(String str, DialogInterface.OnClickListener onClickListener) {
        this.a = str;
        this.c = onClickListener;
    }
}
