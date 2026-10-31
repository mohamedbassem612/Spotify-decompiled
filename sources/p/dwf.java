package p;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import app.p000rive.runtime.kotlin.R;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lp/dwf;", "Lp/t2u;", "<init>", "()V", "p/wvf", "p/bwf", "p/awf", "src_main_java_com_spotify_checkout_alert-alert"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class dwf extends t2u {
    public wvf V1;
    public bwf W1;
    public sp00 X1;

    public final void I0(View view, Bundle bundle) {
        sp00 sp00Var = this.X1;
        if (sp00Var == null) {
            return;
        }
        TextView textView = (TextView) sp00Var.b;
        EncoreButton encoreButton = (EncoreButton) sp00Var.d;
        EncoreButton encoreButton2 = (EncoreButton) sp00Var.c;
        TextView textView2 = (TextView) sp00Var.e;
        wvf wvfVar = this.V1;
        if (wvfVar == null) {
            u890.C("args");
            throw null;
        }
        textView2.setText(wvfVar.a);
        wvf wvfVar2 = this.V1;
        if (wvfVar2 == null) {
            u890.C("args");
            throw null;
        }
        textView.setText(wvfVar2.b, TextView.BufferType.SPANNABLE);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        wvf wvfVar3 = this.V1;
        if (wvfVar3 == null) {
            u890.C("args");
            throw null;
        }
        encoreButton2.setVisibility(wvfVar3.c != null ? 0 : 8);
        wvf wvfVar4 = this.V1;
        if (wvfVar4 == null) {
            u890.C("args");
            throw null;
        }
        String str = wvfVar4.c;
        if (str != null) {
            encoreButton2.setText(str);
            encoreButton2.setOnClickListener(new cwf(this, (byte) 0));
        }
        wvf wvfVar5 = this.V1;
        if (wvfVar5 == null) {
            u890.C("args");
            throw null;
        }
        encoreButton.setVisibility(wvfVar5.d != null ? 0 : 8);
        wvf wvfVar6 = this.V1;
        if (wvfVar6 == null) {
            u890.C("args");
            throw null;
        }
        String str2 = wvfVar6.d;
        if (str2 != null) {
            encoreButton.setText(str2);
            encoreButton.setOnClickListener(new cwf(this, (byte) 1));
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        bwf bwfVar = this.W1;
        if (bwfVar != null) {
            String str = ((zf30) this).a1;
            str.getClass();
            bwfVar.x(str);
        }
        String str2 = ((zf30) this).a1;
        str2.getClass();
        Parcelable xvfVar = new xvf(str2);
        Bundle bundle = new Bundle();
        bundle.putParcelable("RESULT_KEY", xvfVar);
        sap1.m(this, "checkout_dialog", bundle);
    }

    public final void v0(Context context) {
        super.v0(context);
        bwf bwfVar = ((zf30) this).X0;
        bwf bwfVar2 = null;
        bwf bwfVar3 = bwfVar instanceof bwf ? bwfVar : null;
        if (bwfVar3 == null) {
            dg30 dg30VarN0 = N0();
            if (dg30VarN0 instanceof bwf) {
                bwfVar2 = (bwf) dg30VarN0;
            }
        } else {
            bwfVar2 = bwfVar3;
        }
        this.W1 = bwfVar2;
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        Object objT = jhc1.t(O0(), "ARGS_KEY", wvf.class);
        if (objT == null) {
            hhg1.n("Required value was null.");
        } else {
            this.V1 = (wvf) objT;
            e1(0, 2132017474);
        }
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131624660, viewGroup, false);
        int i = 2131427729;
        TextView textView = (TextView) m5n1.t(viewInflate, 2131427729);
        if (textView != null) {
            ScrollView scrollView = (ScrollView) viewInflate;
            i = 2131430498;
            EncoreButton encoreButtonT = m5n1.t(viewInflate, 2131430498);
            if (encoreButtonT != null) {
                i = 2131430864;
                EncoreButton encoreButtonT2 = m5n1.t(viewInflate, 2131430864);
                if (encoreButtonT2 != null) {
                    i = R.id.title;
                    TextView textView2 = (TextView) m5n1.t(viewInflate, R.id.title);
                    if (textView2 != null) {
                        this.X1 = new sp00(scrollView, textView, encoreButtonT, encoreButtonT2, textView2);
                        return scrollView;
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
