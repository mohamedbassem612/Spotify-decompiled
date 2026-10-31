package p;

import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pr3 implements InputFilter {
    public static final pr3 b = new pr3(0);
    public static final pr3 c = new pr3(1);
    public static Character d;
    public final /* synthetic */ byte a;

    public /* synthetic */ pr3(byte b2) {
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0115  */
    /* JADX WARN: Code duplicated, block: B:65:0x011c  */
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        switch (this.a) {
            case 0:
                if (!(charSequence instanceof SpannableStringBuilder)) {
                    String string = charSequence.subSequence(i, i2).toString();
                    for (int i5 = 0; i5 < string.length(); i5++) {
                        if (Character.isUpperCase(string.charAt(i5))) {
                            if (string != null) {
                                return string.toLowerCase(Locale.ROOT);
                            }
                            return null;
                        }
                    }
                    string = null;
                    if (string != null) {
                        return string.toLowerCase(Locale.ROOT);
                    }
                    return null;
                }
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
                int i6 = i2 - 1;
                if (i > i6) {
                    return charSequence;
                }
                while (true) {
                    if (Character.isUpperCase(spannableStringBuilder.charAt(i6))) {
                        spannableStringBuilder.replace(i6, i6 + 1, (CharSequence) String.valueOf(spannableStringBuilder.charAt(i6)).toLowerCase(Locale.ROOT));
                    }
                    if (i6 == i) {
                        return charSequence;
                    }
                    i6--;
                }
                break;
            default:
                int i7 = i2 - i;
                if (i7 == 0 && i4 - i3 == 1) {
                    d = Character.valueOf(spanned.charAt(i3));
                } else {
                    Character ch = d;
                    if (ch != null) {
                        d = null;
                        if (i4 - i3 != 0 || !u890.j(charSequence.subSequence(i, i2).toString(), ". ")) {
                            ch = null;
                        }
                        if (ch != null) {
                            return String.valueOf(ch.charValue());
                        }
                    }
                    if (charSequence instanceof SpannableStringBuilder) {
                        SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) charSequence;
                        int i8 = i2 - 1;
                        if (i > i8) {
                            return charSequence;
                        }
                        while (true) {
                            if (Character.isSpaceChar(spannableStringBuilder2.charAt(i8))) {
                                spannableStringBuilder2.delete(i8, i8 + 1);
                            }
                            if (i8 == i) {
                                return charSequence;
                            }
                            i8--;
                        }
                    } else {
                        tr80 tr80VarQ = yoi1.Q(i, i2);
                        ArrayList arrayList = new ArrayList(q7h.U(tr80VarQ, 10));
                        lr80 it = tr80VarQ.iterator();
                        while (((sr80) it).c) {
                            arrayList.add(Character.valueOf(charSequence.charAt(it.nextInt())));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : arrayList) {
                            if (!Character.isSpaceChar(((Character) obj).charValue())) {
                                arrayList2.add(obj);
                            }
                        }
                        ArrayList arrayList3 = arrayList2.size() != i7 ? arrayList2 : null;
                        if (arrayList3 != null) {
                            return o7h.y0(arrayList3, "", (String) null, (String) null, (iu30) null, 62);
                        }
                    }
                }
                return null;
        }
    }
}
