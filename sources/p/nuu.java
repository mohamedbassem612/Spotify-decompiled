package p;

import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nuu {
    public final Context a;

    public nuu(Context context) {
        this.a = context;
    }

    public final pw40 a(String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        mw40 mw40VarT = yoi1.T(this.a, str, str2);
        mw40VarT.e = true;
        mw40VarT.a = str3;
        mw40VarT.c = onClickListener;
        mw40VarT.b = str4;
        mw40VarT.d = onClickListener2;
        return mw40VarT.b();
    }

    public final pw40 b(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnDismissListener onDismissListener) {
        Context context = this.a;
        String string = context.getString(2131955020);
        String string2 = context.getString(2131955018);
        String string3 = context.getString(2131955107);
        String string4 = context.getString(2131955019);
        mw40 mw40VarT = yoi1.T(context, string, string2);
        mw40VarT.e = true;
        mw40VarT.a = string3;
        mw40VarT.c = onClickListener;
        mw40VarT.b = string4;
        mw40VarT.d = onClickListener2;
        mw40VarT.g = onDismissListener;
        return mw40VarT.b();
    }
}
