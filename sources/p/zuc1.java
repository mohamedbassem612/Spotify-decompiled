package p;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zuc1 extends v4n {
    public static final /* synthetic */ int d2 = 0;
    public wuc1 b2;
    public xuc1 c2;

    public final boolean j1() {
        return false;
    }

    public final View n1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131624698, viewGroup, false);
        int i = 2131427375;
        EncoreButton encoreButtonT = m5n1.t(constraintLayoutInflate, 2131427375);
        if (encoreButtonT != null) {
            i = 2131427729;
            TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131427729);
            if (textView != null) {
                i = 2131427887;
                EncoreButton encoreButtonT2 = m5n1.t(constraintLayoutInflate, 2131427887);
                if (encoreButtonT2 != null) {
                    i = 2131430924;
                    if (m5n1.t(constraintLayoutInflate, 2131430924) != null) {
                        i = 2131431111;
                        TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131431111);
                        if (textView2 != null) {
                            i = 2131431112;
                            TextView textView3 = (TextView) m5n1.t(constraintLayoutInflate, 2131431112);
                            if (textView3 != null) {
                                i = 2131431135;
                                TextView textView4 = (TextView) m5n1.t(constraintLayoutInflate, 2131431135);
                                if (textView4 != null) {
                                    i = 2131431136;
                                    if (m5n1.t(constraintLayoutInflate, 2131431136) != null) {
                                        i = 2131431137;
                                        TextView textView5 = (TextView) m5n1.t(constraintLayoutInflate, 2131431137);
                                        if (textView5 != null) {
                                            i = 2131431356;
                                            TextView textView6 = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                                            if (textView6 != null) {
                                                ConstraintLayout constraintLayout = constraintLayoutInflate;
                                                rwq0.s(constraintLayout, xi81.P0);
                                                wuc1 wuc1Var = this.b2;
                                                if (wuc1Var == null) {
                                                    u890.C("args");
                                                    throw null;
                                                }
                                                textView6.setText(wuc1Var.a.getTitle());
                                                wuc1 wuc1Var2 = this.b2;
                                                if (wuc1Var2 == null) {
                                                    u890.C("args");
                                                    throw null;
                                                }
                                                textView.setText(wuc1Var2.a.r());
                                                wuc1 wuc1Var3 = this.b2;
                                                if (wuc1Var3 == null) {
                                                    u890.C("args");
                                                    throw null;
                                                }
                                                textView3.setText(wuc1Var3.a.v());
                                                wuc1 wuc1Var4 = this.b2;
                                                if (wuc1Var4 == null) {
                                                    u890.C("args");
                                                    throw null;
                                                }
                                                textView2.setText(o7h.y0(wuc1Var4.a.w(), "\n", (String) null, (String) null, (iu30) null, 62));
                                                wuc1 wuc1Var5 = this.b2;
                                                if (wuc1Var5 == null) {
                                                    u890.C("args");
                                                    throw null;
                                                }
                                                textView5.setText(wuc1Var5.a.x());
                                                wuc1 wuc1Var6 = this.b2;
                                                if (wuc1Var6 == null) {
                                                    u890.C("args");
                                                    throw null;
                                                }
                                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(o7h.y0(wuc1Var6.a.y(), "<br>", (String) null, (String) null, (iu30) null, 62), 0));
                                                for (StyleSpan styleSpan : (StyleSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), StyleSpan.class)) {
                                                    if (styleSpan.getStyle() == 1) {
                                                        spannableStringBuilder.setSpan(new l0e1(P0(), 2132018007, -1), spannableStringBuilder.getSpanStart(styleSpan), spannableStringBuilder.getSpanEnd(styleSpan), spannableStringBuilder.getSpanFlags(styleSpan));
                                                        spannableStringBuilder.removeSpan(styleSpan);
                                                    }
                                                }
                                                textView4.setText(spannableStringBuilder);
                                                wuc1 wuc1Var7 = this.b2;
                                                if (wuc1Var7 == null) {
                                                    u890.C("args");
                                                    throw null;
                                                }
                                                encoreButtonT2.setText(wuc1Var7.a.s());
                                                encoreButtonT2.setOnClickListener(new gl61(this, (byte) 6));
                                                wuc1 wuc1Var8 = this.b2;
                                                if (wuc1Var8 == null) {
                                                    u890.C("args");
                                                    throw null;
                                                }
                                                encoreButtonT.setText(wuc1Var8.a.q());
                                                encoreButtonT.setOnClickListener(new yuc1(this));
                                                return constraintLayout;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    public final void v0(Context context) {
        super/*p.t2u*/.v0(context);
        this.c2 = ((zf30) this).X0;
    }

    public final void w0(Bundle bundle) {
        super/*p.t2u*/.w0(bundle);
        Object objT = jhc1.t(O0(), "ARGS_KEY", wuc1.class);
        if (objT != null) {
            this.b2 = (wuc1) objT;
        } else {
            hhg1.n("Required value was null.");
        }
    }
}
