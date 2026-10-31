package p;

import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pq00 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pq00(View view, Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = view;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        byte b = this.a;
        AppCompatTextView appCompatTextView = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                CharSequence charSequence = (CharSequence) obj2;
                SpannableString spannableString = (SpannableString) obj;
                AppCompatTextView appCompatTextView2 = (qq00) appCompatTextView;
                if (appCompatTextView2.getMeasuredWidth() != 0) {
                    appCompatTextView2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    int measuredWidth = (appCompatTextView2.getMeasuredWidth() - appCompatTextView2.getPaddingLeft()) - appCompatTextView2.getPaddingRight();
                    TextPaint paint = appCompatTextView2.getPaint();
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    StaticLayout staticLayout = new StaticLayout((CharSequence) obj2, paint, measuredWidth, alignment, 1.0f, 0.0f, false);
                    if (staticLayout.getLineCount() > 2) {
                        CharSequence charSequenceE1 = ihc1.e1(charSequence.subSequence(0, staticLayout.getLineEnd(1)));
                        if (new StaticLayout(charSequenceE1, appCompatTextView2.getPaint(), measuredWidth, alignment, 1.0f, 0.0f, false).getLineCount() != 1) {
                            int i = 0;
                            do {
                                int iA0 = ihc1.A0(charSequenceE1, ' ', 0, 6);
                                if (iA0 != -1) {
                                    int length = charSequenceE1.length() - iA0;
                                    charSequenceE1 = charSequenceE1.subSequence(0, iA0);
                                    if (length < spannableString.length()) {
                                        i += length;
                                    }
                                }
                                appCompatTextView2.setText(charSequenceE1);
                                appCompatTextView2.append(spannableString);
                                break;
                            } while (i < spannableString.length());
                            appCompatTextView2.setText(charSequenceE1);
                            appCompatTextView2.append(spannableString);
                        } else {
                            appCompatTextView2.setText(charSequenceE1);
                            appCompatTextView2.append("\n");
                            appCompatTextView2.append(spannableString);
                        }
                    } else {
                        appCompatTextView2.setText(charSequence);
                    }
                    break;
                }
                break;
            case 1:
                RecyclerView recyclerView = (RecyclerView) appCompatTextView;
                a layoutManager = recyclerView.getLayoutManager();
                if (layoutManager == null || layoutManager.I() != 0) {
                    ho60 ho60Var = (ho60) obj2;
                    ho60Var.a(recyclerView, (List) obj, ho60Var.i, false);
                    recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
                break;
            default:
                ParagraphView paragraphView = (ParagraphView) obj;
                mjd0 mjd0Var = (mjd0) obj2;
                gpr0 gpr0Var = mjd0Var.j;
                ParagraphView paragraphView2 = (ParagraphView) appCompatTextView;
                paragraphView2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int lineCount = paragraphView2.getLineCount();
                if (lineCount != 1) {
                    gpr0 gpr0Var2 = mjd0Var.i;
                    if (lineCount == 2) {
                        mjd0.i(paragraphView2, gpr0Var2, 2132018023);
                        mjd0.i(paragraphView, gpr0Var, 2132018023);
                    } else {
                        mjd0.i(paragraphView2, gpr0Var2, 2132018024);
                        mjd0.i(paragraphView, gpr0Var, 2132018024);
                    }
                }
                break;
        }
    }
}
