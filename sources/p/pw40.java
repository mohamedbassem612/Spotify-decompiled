package p;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pw40 {
    public final uo5 a;
    public final iw40 b;

    public pw40(Context context, mw40 mw40Var) {
        iw40 iw40Var = new iw40(context, mw40Var.j);
        this.b = iw40Var;
        uo5 uo5Var = new uo5(iw40Var, (byte) 19);
        this.a = uo5Var;
        iw40Var.setCancelable(mw40Var.e);
        iw40Var.setOnCancelListener(mw40Var.f);
        iw40Var.setOnDismissListener(mw40Var.g);
        final byte b = 0;
        final byte b2 = 1;
        if (TextUtils.isEmpty(mw40Var.a)) {
            iw40Var.b(false);
        } else {
            uo5Var.c = mw40Var.c;
            iw40Var.b(true);
        }
        if (TextUtils.isEmpty(mw40Var.b)) {
            iw40Var.a(false);
        } else {
            uo5Var.d = mw40Var.d;
            iw40Var.a(true);
        }
        iw40Var.d = (qw40) cwl1.y(mw40Var.h, iw40.f);
        CharSequence charSequence = mw40Var.a;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: p.ow40
            public final /* synthetic */ pw40 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                pw40 pw40Var = this.b;
                switch (b3) {
                    case 0:
                        uo5 uo5Var2 = pw40Var.a;
                        iw40 iw40Var2 = (iw40) uo5Var2.b;
                        DialogInterface.OnClickListener onClickListener2 = (DialogInterface.OnClickListener) uo5Var2.c;
                        if (onClickListener2 != null) {
                            onClickListener2.onClick(iw40Var2, -1);
                        }
                        iw40Var2.dismiss();
                        break;
                    default:
                        uo5 uo5Var3 = pw40Var.a;
                        iw40 iw40Var3 = (iw40) uo5Var3.b;
                        DialogInterface.OnClickListener onClickListener3 = (DialogInterface.OnClickListener) uo5Var3.d;
                        if (onClickListener3 != null) {
                            onClickListener3.onClick(iw40Var3, -2);
                        }
                        iw40Var3.dismiss();
                        break;
                }
            }
        };
        Button button = iw40Var.b;
        button.setText(charSequence);
        button.setOnClickListener(onClickListener);
        if (!TextUtils.isEmpty(charSequence)) {
            button.setVisibility(0);
        }
        CharSequence charSequence2 = mw40Var.b;
        View.OnClickListener onClickListener2 = new View.OnClickListener(this) { // from class: p.ow40
            public final /* synthetic */ pw40 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                pw40 pw40Var = this.b;
                switch (b3) {
                    case 0:
                        uo5 uo5Var2 = pw40Var.a;
                        iw40 iw40Var2 = (iw40) uo5Var2.b;
                        DialogInterface.OnClickListener onClickListener3 = (DialogInterface.OnClickListener) uo5Var2.c;
                        if (onClickListener3 != null) {
                            onClickListener3.onClick(iw40Var2, -1);
                        }
                        iw40Var2.dismiss();
                        break;
                    default:
                        uo5 uo5Var3 = pw40Var.a;
                        iw40 iw40Var3 = (iw40) uo5Var3.b;
                        DialogInterface.OnClickListener onClickListener4 = (DialogInterface.OnClickListener) uo5Var3.d;
                        if (onClickListener4 != null) {
                            onClickListener4.onClick(iw40Var3, -2);
                        }
                        iw40Var3.dismiss();
                        break;
                }
            }
        };
        Button button2 = iw40Var.c;
        button2.setText(charSequence2);
        button2.setOnClickListener(onClickListener2);
        if (TextUtils.isEmpty(charSequence2)) {
            return;
        }
        button2.setVisibility(0);
    }

    public final void a() {
        ((iw40) this.a.b).dismiss();
    }

    public final void b() {
        ((iw40) this.a.b).show();
    }
}
