package p;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.spotify.encoreconsumermobile.elements.playprogressbar.PlayProgressBarView;
import com.spotify.encoremobile.component.textview.EncoreTextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xfv implements isw {
    public final zeu a;
    public final LinearLayout b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;

    public xfv(Context context, ViewGroup viewGroup, int i) {
        this.c = context;
        this.d = i;
        View viewInflate = LayoutInflater.from(context).inflate(2131624555, viewGroup, false);
        int i2 = 2131430530;
        PlayProgressBarView playProgressBarViewT = m5n1.t(viewInflate, 2131430530);
        if (playProgressBarViewT != null) {
            i2 = 2131430539;
            EncoreTextView encoreTextViewT = m5n1.t(viewInflate, 2131430539);
            if (encoreTextViewT != null) {
                i2 = 2131430540;
                EncoreTextView encoreTextViewT2 = m5n1.t(viewInflate, 2131430540);
                if (encoreTextViewT2 != null) {
                    LinearLayout linearLayout = (LinearLayout) viewInflate;
                    this.a = new zeu(linearLayout, playProgressBarViewT, encoreTextViewT, encoreTextViewT2);
                    this.b = linearLayout;
                    return;
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0080  */
    public final void a(Object obj, ysw yswVar) {
        long j;
        rle1 rle1Var;
        boolean z;
        int i;
        nqt0 nqt0Var;
        ufv ufvVar = (ufv) obj;
        zeu zeuVar = this.a;
        EncoreTextView encoreTextView = (EncoreTextView) zeuVar.b;
        int i2 = ufvVar.a.b;
        gix0 gix0Var = ufvVar.b;
        Resources resources = this.c.getResources();
        boolean z2 = gix0Var instanceof gix0;
        ngv ngvVar = ngv.d;
        if (z2) {
            ogv ogvVar = new ogv(resources, (byte) 0);
            ytw0 ytw0Var = jfv.b;
            gix0 gix0Var2 = gix0Var;
            j = 0;
            rle1Var = (rle1) ogvVar.invoke(new jfv(fdg1.l0(gix0Var2.b - gix0Var2.c, ngvVar)));
        } else {
            j = 0;
            if (!(gix0Var instanceof hix0)) {
                eg.o();
                return;
            }
            long j2 = ((hix0) gix0Var).b;
            if (j2 == 0) {
                rle1Var = null;
            } else {
                ogv ogvVar2 = new ogv(resources, (byte) 1);
                ytw0 ytw0Var2 = jfv.b;
                rle1Var = (rle1) ogvVar2.invoke(new jfv(fdg1.l0(j2, ngvVar)));
            }
        }
        int i3 = this.d;
        int iC = l1d.C(i3);
        if (iC == 0) {
            z = true;
        } else if (iC != 1) {
            eg.o();
            return;
        } else if (z2 || ((gix0Var instanceof hix0) && !((hix0) gix0Var).a)) {
            z = true;
        } else {
            z = false;
        }
        int iC2 = l1d.C(i2);
        if (iC2 == 0) {
            i = 2130970418;
        } else {
            if (iC2 != 1) {
                eg.o();
                return;
            }
            i = 2130970440;
        }
        if (z && rle1Var != null) {
            EncoreTextView encoreTextView2 = (EncoreTextView) zeuVar.c;
            encoreTextView2.setVisibility(0);
            encoreTextView2.setText(rle1Var.a);
            encoreTextView2.setTextColor(xfo1.r(encoreTextView2, i));
            encoreTextView2.setContentDescription(rle1Var.b);
        }
        boolean zX = y9g1.x(i3, gix0Var);
        if (z && zX) {
            encoreTextView.setVisibility(0);
            encoreTextView.setTextColor(xfo1.r(encoreTextView, i));
        } else {
            encoreTextView.setVisibility(8);
        }
        PlayProgressBarView playProgressBarView = (PlayProgressBarView) zeuVar.a;
        boolean zX2 = y9g1.x(i3, gix0Var);
        boolean zG = gix0Var.g();
        float f = 0.0f;
        if (z2) {
            gix0 gix0Var3 = gix0Var;
            long j3 = gix0Var3.b;
            if (j3 != j) {
                long j4 = gix0Var3.c;
                if (j4 > j3) {
                    j4 = j3;
                }
                f = j4 / j3;
            }
        } else if (!(gix0Var instanceof hix0)) {
            eg.o();
            return;
        }
        float f2 = f;
        int i4 = zX2 ? 2 : 3;
        boolean zX3 = y9g1.x(i3, gix0Var);
        int iC3 = l1d.C(i2);
        if (iC3 == 0) {
            nqt0Var = nqt0.e;
        } else {
            if (iC3 != 1) {
                eg.o();
                return;
            }
            nqt0Var = nqt0.f;
        }
        playProgressBarView.W0.a(new oqt0(zG, z2, f2, i4, nqt0Var, zX3));
    }

    public final View getView() {
        return this.b;
    }
}
