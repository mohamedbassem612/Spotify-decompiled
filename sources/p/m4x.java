package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.emoji2.emojipicker.EmojiView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m4x extends z511 {
    public Integer X;
    public Integer Y;
    public final Context d;
    public final int e;
    public final Float f;
    public final r2a1 g;
    public final hx4 h;
    public final w9 i;
    public final LayoutInflater t;

    public m4x(Context context, int i, Float f, r2a1 r2a1Var, hx4 hx4Var, w9 w9Var) {
        this.d = context;
        this.e = i;
        this.f = f;
        this.g = r2a1Var;
        this.h = hx4Var;
        this.i = w9Var;
        this.t = LayoutInflater.from(context);
    }

    public final int e() {
        Iterator it = ((List) ((h46) this.h.invoke()).b).iterator();
        int iB = 0;
        while (it.hasNext()) {
            iB += ((lj90) it.next()).b();
        }
        return iB;
    }

    public final long f(int i) {
        return ((h46) this.h.invoke()).c(i).hashCode();
    }

    public final int g(int i) {
        return ((h46) this.h.invoke()).c(i).b;
    }

    public final void n(int i, w611 w611Var) {
        View view = w611Var.a;
        ln90 ln90VarC = ((h46) this.h.invoke()).c(i);
        int iC = l1d.C(l1d.H(3)[g(i)]);
        if (iC == 0) {
            ((TextView) b8k1.n(view, 2131427940)).setText(((o9e) ln90VarC).c);
            return;
        }
        if (iC == 1) {
            ((TextView) b8k1.n(view, 2131428606)).setText(((q6t0) ln90VarC).c);
            return;
        }
        if (iC != 2) {
            eg.o();
            return;
        }
        o5x o5xVar = (o5x) w611Var;
        String str = ((m5x) ln90VarC).c;
        EmojiView emojiView = o5xVar.Y0;
        emojiView.setEmoji(str);
        p5x p5xVarE = o5x.E(str);
        o5xVar.Z0 = p5xVarE;
        if (p5xVarE.b.isEmpty()) {
            emojiView.setOnLongClickListener(null);
            emojiView.setLongClickable(false);
        } else {
            emojiView.setOnLongClickListener(o5xVar.X0);
            emojiView.setLongClickable(true);
        }
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        Integer numValueOf = this.X;
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(((viewGroup.getMeasuredWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight()) / this.e);
        }
        this.X = numValueOf;
        Integer numValueOf2 = this.Y;
        Context context = this.d;
        if (numValueOf2 == null) {
            Float f = this.f;
            if (f != null) {
                numValueOf2 = Integer.valueOf((int) (((viewGroup.getMeasuredHeight() - (context.getResources().getDimensionPixelSize(2131165698) * 2)) - context.getResources().getDimensionPixelSize(2131165699)) / f.floatValue()));
            } else {
                numValueOf2 = null;
            }
            if (numValueOf2 == null) {
                numValueOf2 = this.X;
            }
        }
        this.Y = numValueOf2;
        int iC = l1d.C(l1d.H(3)[i]);
        LayoutInflater layoutInflater = this.t;
        if (iC == 0) {
            View viewInflate = layoutInflater.inflate(2131624327, viewGroup, false);
            viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new l4x(viewInflate);
        }
        if (iC == 1) {
            View viewInflate2 = layoutInflater.inflate(2131624565, viewGroup, false);
            viewInflate2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            Integer num = this.Y;
            num.getClass();
            viewInflate2.setMinimumHeight(num.intValue());
            return new l4x(viewInflate2);
        }
        if (iC != 2) {
            eg.o();
            return null;
        }
        Integer num2 = this.X;
        num2.getClass();
        int iIntValue = num2.intValue();
        Integer num3 = this.Y;
        num3.getClass();
        return new o5x(context, iIntValue, num3.intValue(), this.g, new k4x(this, (byte) 0), new k4x(this, (byte) 1));
    }
}
