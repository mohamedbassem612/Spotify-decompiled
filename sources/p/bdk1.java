package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bdk1 implements qzh {
    public final Context a;
    public final boolean b;
    public final int c;
    public final idd1 d;
    public final idd1 e;
    public final zck1 f;
    public final zck1 g;

    public bdk1(Context context, boolean z) {
        this.a = context;
        this.b = z;
        int color = context.getColor(2131101506);
        this.c = color;
        idd1 idd1Var = new idd1(new adk1(this, (byte) 0));
        this.d = idd1Var;
        this.e = new idd1(new adk1(this, (byte) 1));
        zck1 zck1Var = new zck1(context);
        zck1Var.setId(2131431620);
        zck1Var.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        zck1Var.setTextAppearance(2132018006);
        zck1Var.setTextColor(z ? ((Number) idd1Var.getValue()).intValue() : color);
        zck1Var.setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 4.0f, zck1Var.getContext().getResources().getDisplayMetrics()));
        this.f = zck1Var;
        this.g = zck1Var;
    }

    public final Drawable a(msz0 msz0Var) {
        int iIntValue;
        boolean z = msz0Var instanceof ksz0;
        ksz0 ksz0Var = z ? (ksz0) msz0Var : null;
        boolean z2 = ksz0Var != null ? ksz0Var.a : false;
        ksz0 ksz0Var2 = z ? (ksz0) msz0Var : null;
        boolean zJ = ksz0Var2 != null ? u890.j(ksz0Var2.b.c, Boolean.TRUE) : false;
        int i = 2131232678;
        if (this.b) {
            iIntValue = zJ ? ((Number) this.d.getValue()).intValue() : ((Number) this.e.getValue()).intValue();
        } else {
            i = z2 ? 2131232678 : 2131232675;
            iIntValue = this.c;
        }
        Context context = this.a;
        Drawable drawable = context.getDrawable(i);
        if (drawable == null) {
            return null;
        }
        int iApplyDimension = (int) TypedValue.applyDimension(1, 14.0f, context.getResources().getDisplayMetrics());
        drawable.mutate().setTint(iIntValue);
        drawable.setBounds(0, 0, iApplyDimension, iApplyDimension);
        return drawable;
    }

    public final void f(Object obj) {
        String string;
        String strValueOf;
        String strF;
        msz0 msz0Var = (msz0) obj;
        boolean z = this.b;
        zck1 zck1Var = this.f;
        if (z) {
            boolean z2 = msz0Var instanceof ksz0;
            ksz0 ksz0Var = z2 ? (ksz0) msz0Var : null;
            boolean zJ = ksz0Var != null ? u890.j(ksz0Var.b.c, Boolean.TRUE) : false;
            idd1 idd1Var = this.e;
            if (z2 && zJ) {
                fsz0 fsz0Var = ((ksz0) msz0Var).b;
                Double d = fsz0Var.a;
                String str = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d != null ? d.doubleValue() : 0.0d)}, 1));
                Long l = fsz0Var.b;
                String strF2 = f4i1.f(str, " ", f4i1.f("(", boo1.v(l != null ? l.longValue() : 0L, zck1Var.getContext()), ")"));
                SpannableString spannableString = new SpannableString(strF2);
                spannableString.setSpan(new ForegroundColorSpan(((Number) this.d.getValue()).intValue()), 0, str.length(), 33);
                spannableString.setSpan(new ForegroundColorSpan(((Number) idd1Var.getValue()).intValue()), str.length() + 1, strF2.length(), 33);
                zck1Var.setText(spannableString);
            } else {
                zck1Var.setTextColor(((Number) idd1Var.getValue()).intValue());
                zck1Var.setText(zck1Var.getContext().getString(2131960839));
            }
            Drawable drawableA = a(msz0Var);
            if (drawableA != null) {
                zck1Var.setCompoundDrawablesRelative(drawableA, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        } else {
            boolean z3 = msz0Var instanceof ksz0;
            Context context = this.a;
            if (z3) {
                ksz0 ksz0Var2 = (ksz0) msz0Var;
                fsz0 fsz0Var2 = ksz0Var2.b;
                Boolean bool = fsz0Var2.c;
                if (ksz0Var2.a || !u890.j(bool, Boolean.FALSE)) {
                    if (u890.j(bool, Boolean.TRUE)) {
                        Double d2 = fsz0Var2.a;
                        strValueOf = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d2 != null ? d2.doubleValue() : 0.0d)}, 1));
                        Long l2 = fsz0Var2.b;
                        strF = f4i1.f("(", boo1.v(l2 != null ? l2.longValue() : 0L, context), ")");
                    } else {
                        strValueOf = String.valueOf(ksz0Var2.c);
                        strF = "";
                    }
                    string = ihc1.e1(strValueOf + " " + strF).toString();
                } else {
                    string = context.getString(2131960839);
                }
            } else {
                if (!(msz0Var instanceof lsz0)) {
                    eg.o();
                    return;
                }
                string = context.getString(2131960839);
            }
            string.getClass();
            zck1Var.setText(string);
            Drawable drawableA2 = a(msz0Var);
            if (drawableA2 != null) {
                zck1Var.setCompoundDrawablesRelative(drawableA2, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
        zck1Var.setContentDescription(zck1Var.getContext().getString(2131951714) + " " + ((Object) zck1Var.getText()));
    }

    public final View getView() {
        return this.g;
    }

    public final void n(iu30 iu30Var) {
        View.OnClickListener zl51Var = new zl51(iu30Var, (byte) 14);
        zck1 zck1Var = this.f;
        zck1Var.setOnClickListener(zl51Var);
        zck1Var.w();
    }
}
