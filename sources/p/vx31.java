package p;

import android.R;
import android.content.Context;
import android.util.TypedValue;
import android.widget.TextView;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public class vx31 extends su31 implements sx31 {
    public final TextView c;
    public final TextView d;

    public vx31(s7s0 s7s0Var) {
        super(s7s0Var);
        TextView textView = (TextView) s7s0Var.findViewById(R.id.text1);
        this.c = textView;
        TextView textView2 = (TextView) s7s0Var.findViewById(R.id.text2);
        this.d = textView2;
        if (!s7s0Var.isInEditMode()) {
            r6p1.x(new TextView[]{textView});
            r6p1.y(new TextView[]{textView2});
            r6p1.w(s7s0Var);
        }
        v9w0 v9w0VarQ = b2u.q(s7s0Var.findViewById(2131430720));
        Collections.addAll(v9w0VarQ.c, textView, textView2);
        v9w0VarQ.a();
    }

    public final void a(boolean z) {
        Context context = this.a.getContext();
        int i = z ? 2130970019 : 2130970023;
        int i2 = z ? 2130968791 : 2130969399;
        TextView textView = this.d;
        foo1.F(context, textView, i);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        textView.setTextColor(context.getColor(typedValue.resourceId));
    }

    @Override // p.sx31
    public final TextView getSubtitleView() {
        return this.d;
    }

    @Override // p.sx31
    public final TextView getTitleView() {
        return this.c;
    }

    @Override // p.sx31
    public final void m(CharSequence charSequence) {
        a(true);
        this.d.setText(charSequence);
    }

    @Override // p.sx31
    public final void setSubtitle(CharSequence charSequence) {
        a(false);
        TextView textView = this.d;
        textView.setTransformationMethod(null);
        textView.setText(charSequence);
    }

    @Override // p.sx31
    public final void setTitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }
}
