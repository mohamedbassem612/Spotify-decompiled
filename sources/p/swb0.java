package p;

import android.content.Context;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class swb0 extends v4n {
    public static final /* synthetic */ int d2 = 0;
    public qfk1 b2;
    public qwb0 c2;

    public final boolean j1() {
        return false;
    }

    public final View n1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131624671, viewGroup, false);
        int i = 2131427729;
        TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131427729);
        if (textView != null) {
            i = 2131428103;
            EncoreButton encoreButtonT = m5n1.t(constraintLayoutInflate, 2131428103);
            if (encoreButtonT != null) {
                i = 2131429736;
                TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131429736);
                if (textView2 != null) {
                    i = 2131430924;
                    if (m5n1.t(constraintLayoutInflate, 2131430924) != null) {
                        i = 2131431115;
                        TextView textView3 = (TextView) m5n1.t(constraintLayoutInflate, 2131431115);
                        if (textView3 != null) {
                            i = 2131431356;
                            TextView textView4 = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                            if (textView4 != null) {
                                ConstraintLayout constraintLayout = constraintLayoutInflate;
                                rwq0.s(constraintLayout, j830.U0);
                                qfk1 qfk1Var = this.b2;
                                if (qfk1Var == null) {
                                    u890.C("learnMoreDialog");
                                    throw null;
                                }
                                textView4.setText(qfk1Var.a);
                                qfk1 qfk1Var2 = this.b2;
                                if (qfk1Var2 == null) {
                                    u890.C("learnMoreDialog");
                                    throw null;
                                }
                                String str = qfk1Var2.b;
                                textView3.setVisibility((str == null || ihc1.y0(str)) ? 8 : 0);
                                qfk1 qfk1Var3 = this.b2;
                                if (qfk1Var3 == null) {
                                    u890.C("learnMoreDialog");
                                    throw null;
                                }
                                textView3.setText(qfk1Var3.b);
                                qfk1 qfk1Var4 = this.b2;
                                if (qfk1Var4 == null) {
                                    u890.C("learnMoreDialog");
                                    throw null;
                                }
                                String str2 = qfk1Var4.c;
                                textView.setVisibility((str2 == null || ihc1.y0(str2)) ? 8 : 0);
                                qfk1 qfk1Var5 = this.b2;
                                if (qfk1Var5 == null) {
                                    u890.C("learnMoreDialog");
                                    throw null;
                                }
                                String str3 = qfk1Var5.c;
                                textView.setText(str3 != null ? ulo1.s(str3, new rwb0(this, (byte) 0)) : null);
                                textView.setMovementMethod(LinkMovementMethod.getInstance());
                                qfk1 qfk1Var6 = this.b2;
                                if (qfk1Var6 == null) {
                                    u890.C("learnMoreDialog");
                                    throw null;
                                }
                                String str4 = qfk1Var6.d;
                                textView2.setVisibility((str4 == null || ihc1.y0(str4)) ? 8 : 0);
                                qfk1 qfk1Var7 = this.b2;
                                if (qfk1Var7 == null) {
                                    u890.C("learnMoreDialog");
                                    throw null;
                                }
                                String str5 = qfk1Var7.d;
                                textView2.setText(str5 != null ? ulo1.s(str5, new rwb0(this, (byte) 1)) : null);
                                textView2.setMovementMethod(LinkMovementMethod.getInstance());
                                qfk1 qfk1Var8 = this.b2;
                                if (qfk1Var8 == null) {
                                    u890.C("learnMoreDialog");
                                    throw null;
                                }
                                encoreButtonT.setText(qfk1Var8.e);
                                encoreButtonT.setOnClickListener(new zfs(this, (byte) 25));
                                return constraintLayout;
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
        Object objT = jhc1.t(O0(), "DIALOG_KEY", qfk1.class);
        if (objT != null) {
            this.b2 = (qfk1) objT;
        } else {
            hhg1.n("Required value was null.");
        }
    }
}
