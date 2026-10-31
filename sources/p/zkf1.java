package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zkf1 {
    public final SpannableStringBuilder a = new SpannableStringBuilder();
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;
    public String e;
    public boolean f;
    public int g;

    public zkf1() {
        new Random();
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public static SpannableString a(Context context) {
        int color = context.getColor(2131101506);
        SpannableString spannableString = new SpannableString("  •  ");
        spannableString.setSpan(new ForegroundColorSpan(color), 0, spannableString.length(), 33);
        return spannableString;
    }

    public final int b(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i2 < arrayList.size()) {
                int length = ((CharSequence) arrayList.get(i2)).length() + ((this.d || i2 > 0) ? ((CharSequence) this.c.get(i2)).length() + i3 : i3);
                if (length >= i) {
                    break;
                }
                i2++;
                i3 = length;
            } else {
                break;
            }
        }
        return i3;
    }

    public final void c(TextView textView, uwd uwdVar) {
        int i;
        boolean z;
        SpannableStringBuilder spannableStringBuilder = this.a;
        spannableStringBuilder.clear();
        spannableStringBuilder.clearSpans();
        this.d = uwdVar.d;
        this.e = (String) uwdVar.h;
        this.f = true;
        this.g = uwdVar.a;
        textView.setGravity(uwdVar.f ? 8388611 : 17);
        ArrayList arrayList = this.b;
        arrayList.clear();
        Context context = textView.getContext();
        ArrayList arrayList2 = (ArrayList) uwdVar.i;
        List listSubList = arrayList2.subList(0, Math.min(uwdVar.e, arrayList2.size()));
        int color = context.getColor(2131101506);
        int color2 = context.getColor(2131104462);
        int color3 = context.getColor(2131101503);
        Iterator it = listSubList.iterator();
        while (true) {
            String str = "";
            if (!it.hasNext()) {
                break;
            }
            ykf1 ykf1Var = (ykf1) it.next();
            boolean z2 = ykf1Var.d;
            boolean z3 = ykf1Var.c;
            int i2 = z2 ? color : color3;
            int i3 = z2 ? color2 : color3;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (uwdVar.b) {
                SpannableString spannableString = new SpannableString(f4i1.e(ykf1Var.b, " "));
                spannableString.setSpan(new ForegroundColorSpan(i3), 0, spannableString.length(), 33);
                spannableStringBuilder2.append((CharSequence) spannableString);
            }
            if (uwdVar.c && z3) {
                str = "  ";
            }
            SpannableString spannableString2 = new SpannableString(l1d.m(str, ykf1Var.a));
            if (!uwdVar.c || z3 == 0) {
                i = 0;
                z = true;
            } else {
                int textSize = (int) textView.getTextSize();
                g4b1 g4b1Var = new g4b1(context, j4b1.n3, textSize);
                g4b1Var.b(i2);
                i = 0;
                g4b1Var.setBounds(0, 0, textSize, textSize);
                z = true;
                spannableString2.setSpan(new ImageSpan((Drawable) g4b1Var, 1), 0, 1, 18);
            }
            spannableString2.setSpan(new ForegroundColorSpan(i2), i, spannableString2.length(), 33);
            spannableStringBuilder2.append((CharSequence) spannableString2);
            arrayList.add(spannableStringBuilder2);
            it = it;
            color = color;
        }
        int size = arrayList.size();
        ArrayList arrayList3 = this.c;
        arrayList3.clear();
        Context context2 = textView.getContext();
        int i4 = 0;
        while (i4 < size) {
            if (this.d) {
                int color4 = context2.getColor(2131104462);
                SpannableString spannableString3 = new SpannableString(gvg.e(i4 + 1, i4 == 0 ? "" : "  ", ". "));
                spannableString3.setSpan(new ForegroundColorSpan(color4), 0, spannableString3.length(), 17);
                arrayList3.add(spannableString3);
            } else {
                arrayList3.add(a(context2));
            }
            i4++;
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            if (uwdVar.d || i5 > 0) {
                spannableStringBuilder.append((CharSequence) arrayList3.get(i5));
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i5));
        }
    }
}
