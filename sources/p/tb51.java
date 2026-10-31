package p;

import android.app.Activity;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tb51 {
    public final Activity a;
    public final di4 b;
    public final rxj0 c;

    public tb51(Activity activity, di4 di4Var, rxj0 rxj0Var) {
        this.a = activity;
        this.b = di4Var;
        this.c = rxj0Var;
    }

    public static String g(tb51 tb51Var, lby lbyVar) {
        tb51Var.getClass();
        return i(tb51Var, lbyVar, false, false, 4).toString();
    }

    public static /* synthetic */ CharSequence i(tb51 tb51Var, lby lbyVar, boolean z, boolean z2, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return tb51Var.h(lbyVar, z, z2);
    }

    public final void a(SpannableStringBuilder spannableStringBuilder) {
        spannableStringBuilder.append("  ");
        Activity activity = this.a;
        g4b1 g4b1Var = new g4b1(activity, j4b1.C6, activity.getResources().getDimensionPixelSize(2131167066));
        g4b1Var.setBounds(0, 0, g4b1Var.n.l(), g4b1Var.n.j());
        spannableStringBuilder.setSpan(new i4b1(g4b1Var, 3, 0), 0, 1, 33);
    }

    public final SpannedString b(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence);
        spannableStringBuilder.append((CharSequence) " • ");
        int length = spannableStringBuilder.length();
        Activity activity = this.a;
        spannableStringBuilder.append((CharSequence) activity.getResources().getString(2131961560));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(activity.getColor(2131101409)), length, spannableStringBuilder.length(), 33);
        return new SpannedString(spannableStringBuilder);
    }

    public final CharSequence c(lby lbyVar) {
        o2v0 o2v0Var = lbyVar.e;
        if (o2v0Var instanceof jjf1) {
            return o7h.y0(((jjf1) o2v0Var).d, ", ", (String) null, (String) null, ub51.b, 30);
        }
        if (o2v0Var instanceof i53) {
            return o7h.y0(((i53) o2v0Var).a, ", ", (String) null, (String) null, ub51.b, 30);
        }
        if (o2v0Var instanceof k48) {
            return ((k48) o2v0Var).a;
        }
        if (o2v0Var instanceof cu7) {
            return ((cu7) o2v0Var).a;
        }
        if (o2v0Var instanceof i6k) {
            return ((i6k) o2v0Var).d;
        }
        if (o2v0Var instanceof tfu0) {
            tfu0 tfu0Var = (tfu0) o2v0Var;
            return d(tfu0Var.b, tfu0Var.a);
        }
        if (o2v0Var instanceof v68) {
            return o7h.y0(((v68) o2v0Var).a, ", ", (String) null, (String) null, (iu30) null, 62);
        }
        if (o2v0Var instanceof xui1) {
            return ((xui1) o2v0Var).a;
        }
        if ((o2v0Var instanceof jb6) || (o2v0Var instanceof k39) || (o2v0Var instanceof ji40) || (o2v0Var instanceof yf51) || (o2v0Var instanceof fww0) || (o2v0Var instanceof yma0) || (o2v0Var instanceof tm8)) {
            return "";
        }
        if (o2v0Var instanceof o2v0) {
            return o2v0Var.b;
        }
        eg.o();
        return null;
    }

    public final CharSequence d(boolean z, boolean z2) {
        if (!z) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        a(spannableStringBuilder);
        Activity activity = this.a;
        if (z2) {
            spannableStringBuilder.append((CharSequence) bmq0.j0(activity.getResources().getString(2131961546), activity.getResources().getString(2131961545)));
        } else {
            spannableStringBuilder.append((CharSequence) activity.getResources().getString(2131961546));
        }
        return new SpannedString(spannableStringBuilder);
    }

    public final String e(boolean z, boolean z2) {
        boolean zU = this.b.U();
        Activity activity = this.a;
        if (zU && z2) {
            return activity.getResources().getString(2131962988);
        }
        return (this.c.b && z) ? activity.getResources().getString(2131962986) : activity.getResources().getString(2131961528);
    }

    public final rle1 f(long j) {
        if (j == 0) {
            return null;
        }
        ytw0 ytw0Var = jfv.b;
        return (rle1) new ogv(this.a.getResources(), (byte) 1).invoke(new jfv(fdg1.l0(j, ngv.e)));
    }

    public final CharSequence h(lby lbyVar, boolean z, boolean z2) {
        CharSequence charSequenceI0;
        String string;
        o940 o940Var = lbyVar.g;
        CharSequence charSequenceC = c(lbyVar);
        o2v0 o2v0Var = lbyVar.e;
        boolean z3 = o2v0Var instanceof jb6;
        Activity activity = this.a;
        if (z3) {
            return bmq0.i0(activity.getResources().getString(2131961519), charSequenceC);
        }
        if (o2v0Var instanceof jjf1) {
            return bmq0.i0(activity.getResources().getString(z ? 2131961527 : 2131961531), charSequenceC);
        }
        if (o2v0Var instanceof i53) {
            Resources resources = activity.getResources();
            int iC = l1d.C(((i53) o2v0Var).b);
            if (iC == 2) {
                string = resources.getString(2131961518);
            } else if (iC != 3) {
                string = iC != 4 ? resources.getString(2131961515) : resources.getString(2131961517);
            } else {
                string = resources.getString(2131961516);
            }
            return bmq0.i0(string, charSequenceC);
        }
        boolean z4 = o2v0Var instanceof tfu0;
        k940 k940Var = k940.b;
        if (z4) {
            if ((o940Var != null ? o940Var.b : null) == k940Var) {
                charSequenceI0 = activity.getResources().getString(2131961555);
                charSequenceI0.getClass();
            } else {
                tfu0 tfu0Var = (tfu0) o2v0Var;
                charSequenceI0 = bmq0.i0(e(tfu0Var.d, tfu0Var.e), charSequenceC);
            }
            return (this.b.c0() && z2) ? b(charSequenceI0) : charSequenceI0;
        }
        CharSequence string2 = "";
        if (o2v0Var instanceof ji40) {
            if ((o940Var != null ? o940Var.b : null) == k940Var) {
                String string3 = activity.getResources().getString(2131961555);
                string3.getClass();
                return string3;
            }
            ji40 ji40Var = (ji40) o2v0Var;
            if (ji40Var.b) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                a(spannableStringBuilder);
                spannableStringBuilder.append((CharSequence) activity.getResources().getString(2131961546));
                string2 = new SpannedString(spannableStringBuilder);
            } else {
                int iC2 = l1d.C(ji40Var.a);
                if (iC2 == 0 || iC2 == 1) {
                    string2 = activity.getResources().getString(2131961525);
                } else if (iC2 != 2) {
                    eg.o();
                    return null;
                }
            }
            return bmq0.i0(string2, charSequenceC);
        }
        if (o2v0Var instanceof k48) {
            return bmq0.i0(activity.getResources().getString(2131961521), charSequenceC);
        }
        if (o2v0Var instanceof cu7) {
            return bmq0.j0(activity.getResources().getString(2131961520), ((cu7) o2v0Var).a);
        }
        if (o2v0Var instanceof fww0) {
            return bmq0.i0(activity.getResources().getString(2131961530), charSequenceC);
        }
        if (o2v0Var instanceof v68) {
            return bmq0.i0(activity.getResources().getString(2131961522), charSequenceC);
        }
        if (o2v0Var instanceof tm8) {
            return bmq0.i0(activity.getResources().getString(2131961523), charSequenceC);
        }
        if (o2v0Var instanceof i6k) {
            return bmq0.i0(activity.getResources().getString(2131961524), charSequenceC);
        }
        if ((o2v0Var instanceof yf51) || (o2v0Var instanceof k39)) {
            return "";
        }
        if (o2v0Var instanceof xui1) {
            return bmq0.i0(activity.getResources().getString(2131961532), charSequenceC);
        }
        if (o2v0Var instanceof yma0) {
            return bmq0.i0(activity.getResources().getString(2131961526), charSequenceC);
        }
        if (o2v0Var instanceof o2v0) {
            return bmq0.i0(activity.getResources().getString(sb51.a[o2v0Var.t.ordinal()] != 1 ? 2131961529 : 2131961527), charSequenceC);
        }
        eg.o();
        return null;
    }
}
