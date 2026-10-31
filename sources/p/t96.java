package p;

import android.text.Editable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.widget.EditText;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class t96 extends hab0 implements iu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ upx0 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ ven0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t96(boolean z, boolean z2, String str, String str2, boolean z3, upx0 upx0Var, long j, ven0 ven0Var) {
        super(1);
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = z3;
        this.f = upx0Var;
        this.g = j;
        this.h = ven0Var;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f1 A[LOOP:0: B:39:0x00ef->B:40:0x00f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ff A[LOOP:1: B:42:0x00fd->B:43:0x00ff, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x00ed, please report this as an issue */
    public final Object invoke(Object obj) {
        int i;
        EditText editText = (EditText) obj;
        boolean z = this.a;
        boolean z2 = !z;
        editText.setFocusable(z2);
        editText.setFocusableInTouchMode(z2);
        if (z) {
            editText.clearFocus();
            editText.setOnClickListener(new s96(this.h, (byte) 0));
        } else {
            editText.setOnClickListener(null);
        }
        boolean z3 = this.b;
        if (!z3 && editText.getTranslationY() != 0.0f) {
            editText.animate().cancel();
            editText.animate().translationY(0.0f).setDuration(200L).start();
        }
        String string = editText.getText().toString();
        String str = this.c;
        if (!u890.j(string, str)) {
            editText.setText(str);
            if (z) {
                editText.setSelection(0);
            } else {
                editText.setSelection(str.length());
                if (z3) {
                    editText.post(new nx30(editText, str, (byte) 4));
                }
            }
        }
        editText.setHint(str.length() == 0 ? this.d : "");
        if ((this.f instanceof spx0) && this.e && str.length() > 2000) {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new ForegroundColorSpan(r4o1.W(this.g)), 2000, str.length(), 33);
            spannableString.setSpan(new UnderlineSpan(), 2000, str.length(), 33);
            editText.setText(spannableString);
            editText.setSelection(str.length());
        } else {
            Editable text = editText.getText();
            ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) text.getSpans(0, text.length(), ForegroundColorSpan.class);
            UnderlineSpan[] underlineSpanArr = (UnderlineSpan[]) text.getSpans(0, text.length(), UnderlineSpan.class);
            foregroundColorSpanArr.getClass();
            if (foregroundColorSpanArr.length == 0) {
                underlineSpanArr.getClass();
                if (underlineSpanArr.length != 0) {
                    for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
                        text.removeSpan(foregroundColorSpan);
                    }
                    underlineSpanArr.getClass();
                    for (UnderlineSpan underlineSpan : underlineSpanArr) {
                        text.removeSpan(underlineSpan);
                    }
                }
            } else {
                while (i < r2) {
                    text.removeSpan(foregroundColorSpan);
                }
                underlineSpanArr.getClass();
                while (i < r8) {
                    text.removeSpan(underlineSpan);
                }
            }
        }
        return rih1.a;
    }
}
