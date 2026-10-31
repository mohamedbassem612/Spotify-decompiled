package p;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class h561 extends hgh {
    public final /* synthetic */ byte W0;
    public final wb80 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h561(wb80 wb80Var, byte b) {
        super(wb80Var.a, rc11.a.b(jkh.class));
        this.W0 = b;
        switch (b) {
            case 1:
                super(wb80Var.a, rc11.a.b(kkh.class));
                this.X0 = wb80Var;
                break;
            default:
                this.X0 = wb80Var;
                break;
        }
    }

    @Override // p.hgh
    public final void F(pkh pkhVar, int i, qka qkaVar) {
        byte b = this.W0;
        wb80 wb80Var = this.X0;
        dlh dlhVar = dlh.a;
        switch (b) {
            case 0:
                qkaVar.invoke(dlhVar);
                wb80Var.a.setOnClickListener(new wa21(qkaVar, (jkh) pkhVar, (byte) 7));
                break;
            default:
                qkaVar.invoke(dlhVar);
                wb80Var.a.setOnClickListener(new wa21(qkaVar, (kkh) pkhVar, (byte) 8));
                break;
        }
    }

    @Override // p.hgh
    public final void G(pkh pkhVar, int i, boolean z, String str) {
        String string;
        String string2;
        byte b = this.W0;
        wb80 wb80Var = this.X0;
        switch (b) {
            case 0:
                ConstraintLayout constraintLayout = wb80Var.a;
                Context context = constraintLayout.getContext();
                String string3 = constraintLayout.getContext().getString(2131961625);
                String string4 = constraintLayout.getContext().getString(2131961624);
                String strF = f4i1.f(string3, " ", string4);
                SpannableString spannableString = new SpannableString(strF);
                int iW0 = ihc1.w0(strF, string4, 0, false, 6);
                int length = string4.length() + iW0;
                int color = context.getColor(2131104462);
                StyleSpan styleSpan = new StyleSpan(1);
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(color);
                TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(context, 2132018007);
                spannableString.setSpan(styleSpan, iW0, length, 33);
                spannableString.setSpan(foregroundColorSpan, iW0, length, 33);
                spannableString.setSpan(textAppearanceSpan, iW0, length, 33);
                wb80Var.b.setText(spannableString);
                break;
            default:
                ConstraintLayout constraintLayout2 = wb80Var.a;
                Context context2 = constraintLayout2.getContext();
                c380 c380Var = ((kkh) pkhVar).b;
                if (c380Var.size() == 1) {
                    string = constraintLayout2.getContext().getString(2131961628);
                    string.getClass();
                } else {
                    string = constraintLayout2.getContext().getString(2131961625);
                    string.getClass();
                }
                if (c380Var.size() == 1) {
                    string2 = constraintLayout2.getContext().getString(2131961627);
                    string2.getClass();
                } else {
                    string2 = constraintLayout2.getContext().getString(2131961622);
                    string2.getClass();
                }
                String strF2 = f4i1.f(string, " ", string2);
                SpannableString spannableString2 = new SpannableString(strF2);
                int iW1 = ihc1.w0(strF2, string2, 0, false, 6);
                int length2 = string2.length() + iW1;
                int color2 = context2.getColor(2131104462);
                StyleSpan styleSpan2 = new StyleSpan(1);
                ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(color2);
                TextAppearanceSpan textAppearanceSpan2 = new TextAppearanceSpan(context2, 2132018007);
                spannableString2.setSpan(styleSpan2, iW1, length2, 33);
                spannableString2.setSpan(foregroundColorSpan2, iW1, length2, 33);
                spannableString2.setSpan(textAppearanceSpan2, iW1, length2, 33);
                wb80Var.b.setText(spannableString2);
                break;
        }
    }
}
