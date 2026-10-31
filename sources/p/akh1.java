package p;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class akh1 implements Spannable {
    public boolean a = false;
    public Spannable b;

    public akh1(Spannable spannable) {
        this.b = spannable;
    }

    public final void a() {
        Spannable spannable = this.b;
        if (!this.a) {
            if ((Build.VERSION.SDK_INT < 28 ? new ubc((byte) 28) : new zjh1()).g(spannable)) {
                this.b = new SpannableString(spannable);
            }
        }
        this.a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.b.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return who1.o(this.b);
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return who1.p(this.b);
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        a();
        this.b.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.b.toString();
    }
}
