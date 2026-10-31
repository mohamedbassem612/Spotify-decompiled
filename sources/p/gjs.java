package p;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gjs implements qzh {
    public final EncoreButton a;
    public final Context b;
    public final float c;

    public gjs(Context context) {
        EncoreButton encoreButtonInflate = LayoutInflater.from(context).inflate(2131625569, (ViewGroup) null);
        this.b = encoreButtonInflate.getContext();
        this.c = encoreButtonInflate.getTextSize();
        this.a = encoreButtonInflate;
    }

    public final SpannableStringBuilder a(g4b1 g4b1Var) {
        i4b1 i4b1Var = new i4b1(g4b1Var, 2, 0);
        String string = this.a.getContext().getString(2131960839);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(f4i1.f(string, " ", g4b1Var.a()));
        spannableStringBuilder.setSpan(i4b1Var, string.length() + 1, g4b1Var.a().length() + string.length() + 1, 18);
        return spannableStringBuilder;
    }

    public final g4b1 b(boolean z) {
        float f = this.c;
        Context context = this.b;
        g4b1 g4b1Var = z ? new g4b1(context, j4b1.E6, f) : new g4b1(context, j4b1.D6, f);
        int iY = a8o.y(2.0f, this.a.getResources());
        pyp0 pyp0Var = g4b1Var.m;
        pyp0Var.y(0, iY);
        g4b1Var.n = pyp0Var;
        g4b1Var.invalidateSelf();
        g4b1Var.setBounds(0, 0, g4b1Var.n.l(), g4b1Var.n.j());
        return g4b1Var;
    }

    public final void f(Object obj) {
        String strValueOf;
        String strF;
        String string;
        msz0 msz0Var = (msz0) obj;
        boolean z = msz0Var instanceof ksz0;
        EncoreButton encoreButton = this.a;
        if (!z) {
            if (msz0Var instanceof lsz0) {
                encoreButton.setText(a(b(false)));
                return;
            } else {
                eg.o();
                return;
            }
        }
        ksz0 ksz0Var = (ksz0) msz0Var;
        Integer num = ksz0Var.c;
        boolean z2 = ksz0Var.a;
        fsz0 fsz0Var = ksz0Var.b;
        Long l = fsz0Var.b;
        Double d = fsz0Var.a;
        Boolean bool = fsz0Var.c;
        g4b1 g4b1VarB = b(z2);
        if (z2 || !u890.j(bool, Boolean.FALSE)) {
            i4b1 i4b1Var = new i4b1(g4b1VarB, 2, 0);
            Boolean bool2 = Boolean.TRUE;
            if (u890.j(bool, bool2)) {
                strValueOf = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d != null ? d.doubleValue() : 0.0d)}, 1));
                strF = f4i1.f("(", boo1.v(l != null ? l.longValue() : 0L, encoreButton.getContext()), ")");
            } else {
                strValueOf = String.valueOf(num);
                strF = "";
            }
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(encoreButton.getContext().getColor(2131101504));
            String str = strValueOf + " " + g4b1VarB.a() + " " + ((Object) strF);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.setSpan(i4b1Var, strValueOf.length() + 1, g4b1VarB.a().length() + strValueOf.length() + 1 + 1, 18);
            spannableStringBuilder.setSpan(foregroundColorSpan, str.length() - strF.length(), str.length(), 18);
            encoreButton.setText(spannableStringBuilder);
            if (u890.j(bool, bool2)) {
                string = encoreButton.getContext().getString(2131951710, String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d != null ? d.doubleValue() : 0.0d)}, 1)), f4i1.f("(", boo1.v(l != null ? l.longValue() : 0L, encoreButton.getContext()), ")"));
            } else {
                string = encoreButton.getContext().getString(2131951709, String.valueOf(num));
            }
            encoreButton.setContentDescription(string);
        } else {
            encoreButton.setText(a(g4b1VarB));
            encoreButton.setContentDescription(encoreButton.getContext().getString(2131960839));
        }
        b8k1.m(encoreButton, fg.g, encoreButton.getContext().getString(2131951708), e4y.Y0);
    }

    public final View getView() {
        return this.a;
    }

    public final void n(iu30 iu30Var) {
        this.a.setOnClickListener(new sis(iu30Var, (byte) 8));
    }
}
