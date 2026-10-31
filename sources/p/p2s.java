package p;

import android.content.Context;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class p2s extends tho1 {
    public final /* synthetic */ byte c;
    public final Object d;
    public final Object e;

    public p2s(TextView textView, i4x i4xVar) {
        this.c = (byte) 1;
        this.d = new WeakReference(textView);
        this.e = new WeakReference(i4xVar);
    }

    public void r() {
        switch (this.c) {
            case 0:
                ((her) this.e).b = w2g0.b;
                break;
        }
    }

    public final void s() {
        InputFilter[] filters;
        int length;
        byte b = this.c;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                ((hrr0) obj2).setValue(Boolean.TRUE);
                ((her) obj).b = new m280(true);
                break;
            case 1:
                TextView textView = (TextView) ((WeakReference) obj2).get();
                InputFilter inputFilter = (InputFilter) ((WeakReference) obj).get();
                if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
                    for (InputFilter inputFilter2 : filters) {
                        if (inputFilter2 == inputFilter) {
                            if (textView.isAttachedToWindow()) {
                                CharSequence text = textView.getText();
                                a4x a4xVarA = a4x.a();
                                if (text == null) {
                                    length = 0;
                                } else {
                                    a4xVarA.getClass();
                                    length = text.length();
                                }
                                CharSequence charSequenceH = a4xVarA.h(0, length, 0, text);
                                if (text != charSequenceH) {
                                    int selectionStart = Selection.getSelectionStart(charSequenceH);
                                    int selectionEnd = Selection.getSelectionEnd(charSequenceH);
                                    textView.setText(charSequenceH);
                                    if (charSequenceH instanceof Spannable) {
                                        Spannable spannable = (Spannable) charSequenceH;
                                        if (selectionStart >= 0 && selectionEnd >= 0) {
                                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                                        } else if (selectionStart >= 0) {
                                            Selection.setSelection(spannable, selectionStart);
                                        } else if (selectionEnd >= 0) {
                                            Selection.setSelection(spannable, selectionEnd);
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                b5x.O0 = true;
                b5x b5xVar = (b5x) obj2;
                llm llmVar = b5xVar.d;
                fns fnsVar = igu.a;
                fn31.T(llmVar, b3s.c, 0, new p1r((Context) obj, b5xVar, (lnm) null, (byte) 16), 2);
                break;
        }
    }

    public /* synthetic */ p2s(Object obj, Object obj2, byte b) {
        this.c = b;
        this.d = obj;
        this.e = obj2;
    }

    private final void B() {
    }
}
