package p;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.textview.EncoreTextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jay implements bik1 {
    public final /* synthetic */ byte a;
    public final tv30 b;

    public /* synthetic */ jay(tv30 tv30Var, byte b) {
        this.a = b;
        this.b = tv30Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0070 A[PHI: r0
      0x0070: PHI (r0v12 int) = (r0v11 int), (r0v17 int) binds: [B:7:0x0030, B:15:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p.bik1
    public final w611 a(ViewGroup viewGroup) {
        int i = 2131431306;
        switch (this.a) {
            case 0:
                ConstraintLayout constraintLayoutL = eqq.l(viewGroup, 2131624583, viewGroup, false);
                if (((ImageView) m5n1.t(constraintLayoutL, 2131429627)) == null) {
                    i = 2131429627;
                } else if (((ImageView) m5n1.t(constraintLayoutL, 2131429629)) != null) {
                    EncoreTextView encoreTextViewT = m5n1.t(constraintLayoutL, 2131431297);
                    if (encoreTextViewT != null) {
                        EncoreTextView encoreTextViewT2 = m5n1.t(constraintLayoutL, 2131431298);
                        if (encoreTextViewT2 != null) {
                            EncoreTextView encoreTextViewT3 = m5n1.t(constraintLayoutL, 2131431306);
                            if (encoreTextViewT3 != null) {
                                return new iay(this, new yzu(constraintLayoutL, encoreTextViewT, encoreTextViewT2, encoreTextViewT3));
                            }
                        } else {
                            i = 2131431298;
                        }
                    } else {
                        i = 2131431297;
                    }
                } else {
                    i = 2131429629;
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutL.getResources().getResourceName(i)));
                return null;
            default:
                ConstraintLayout constraintLayoutL2 = eqq.l(viewGroup, 2131625346, viewGroup, false);
                if (((ImageView) m5n1.t(constraintLayoutL2, 2131429627)) != null) {
                    int i2 = 2131429628;
                    if (((ImageView) m5n1.t(constraintLayoutL2, 2131429628)) == null) {
                        i = i2;
                    } else if (((ImageView) m5n1.t(constraintLayoutL2, 2131429629)) != null) {
                        EncoreTextView encoreTextViewT4 = m5n1.t(constraintLayoutL2, 2131431297);
                        if (encoreTextViewT4 != null) {
                            EncoreTextView encoreTextViewT5 = m5n1.t(constraintLayoutL2, 2131431298);
                            if (encoreTextViewT5 != null) {
                                i2 = 2131431299;
                                EncoreTextView encoreTextViewT6 = m5n1.t(constraintLayoutL2, 2131431299);
                                if (encoreTextViewT6 != null) {
                                    EncoreTextView encoreTextViewT7 = m5n1.t(constraintLayoutL2, 2131431306);
                                    if (encoreTextViewT7 != null) {
                                        return new jiq0(this, new phi0(constraintLayoutL2, encoreTextViewT4, encoreTextViewT5, encoreTextViewT6, encoreTextViewT7, (byte) 5));
                                    }
                                } else {
                                    i = i2;
                                }
                            } else {
                                i = 2131431298;
                            }
                        } else {
                            i = 2131431297;
                        }
                    } else {
                        i = 2131429629;
                    }
                } else {
                    i = 2131429627;
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutL2.getResources().getResourceName(i)));
                return null;
        }
    }

    @Override // p.bik1
    public final void b(w611 w611Var, aik1 aik1Var) {
        switch (this.a) {
            case 0:
                iay iayVar = (iay) w611Var;
                kay kayVar = (kay) aik1Var;
                yzu yzuVar = iayVar.U0;
                Context context = ((ConstraintLayout) yzuVar.a).getContext();
                EncoreTextView encoreTextView = (EncoreTextView) yzuVar.c;
                Resources resources = context.getResources();
                int i = kayVar.a;
                encoreTextView.setText(resources.getQuantityString(2131820735, i, Integer.valueOf(i)));
                EncoreTextView encoreTextView2 = (EncoreTextView) yzuVar.d;
                hcf1 hcf1Var = iayVar.V0.b;
                encoreTextView2.setText(context.getString(2131963317, hcf1Var.invoke(kayVar.b)));
                ((EncoreTextView) yzuVar.b).setText(context.getString(2131963313, hcf1Var.invoke(kayVar.c)));
                break;
            default:
                jiq0 jiq0Var = (jiq0) w611Var;
                kiq0 kiq0Var = (kiq0) aik1Var;
                phi0 phi0Var = jiq0Var.U0;
                Context context2 = ((ConstraintLayout) phi0Var.b).getContext();
                EncoreTextView encoreTextView3 = (EncoreTextView) phi0Var.d;
                Resources resources2 = context2.getResources();
                int i2 = kiq0Var.a;
                encoreTextView3.setText(resources2.getQuantityString(2131820735, i2, Integer.valueOf(i2)));
                EncoreTextView encoreTextView4 = (EncoreTextView) phi0Var.e;
                Resources resources3 = context2.getResources();
                int i3 = kiq0Var.b;
                encoreTextView4.setText(resources3.getQuantityString(2131820944, i3, Integer.valueOf(i3), Integer.valueOf(i2)));
                EncoreTextView encoreTextView5 = (EncoreTextView) phi0Var.f;
                hcf1 hcf1Var2 = jiq0Var.V0.b;
                encoreTextView5.setText(context2.getString(2131963317, hcf1Var2.invoke(kiq0Var.c)));
                ((EncoreTextView) phi0Var.c).setText(context2.getString(2131963313, hcf1Var2.invoke(kiq0Var.d)));
                break;
        }
    }
}
