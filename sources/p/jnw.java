package p;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.encoremobile.buttons.TertiaryButtonView;
import com.spotify.legacyglue.widgetstate.StateListAnimatorButton;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lp/jnw;", "Lp/dwb;", "Lp/lir0;", "<init>", "()V", "src_main_java_com_spotify_effortlesslogin_effortlesslogin-effortlesslogin"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class jnw extends dwb implements lir0 {
    public ohv0 V1;
    public b2r0 W1;
    public evl0 X1;
    public znw Y1;
    public kg0 Z1;
    public Button a2;
    public TertiaryButtonView b2;
    public TextView c2;
    public TextView d2;
    public TextView e2;
    public ynw f2;

    public final int b1() {
        return 2132017530;
    }

    public final mir0 c() {
        uba ubaVar = this.W1;
        if (ubaVar != null) {
            return new mir0(ubaVar.a());
        }
        u890.C("ubiLogger");
        throw null;
    }

    public final Dialog c1(Bundle bundle) {
        i1().a(new nhv0("samsung_effortless_login_sheet", (String) null));
        cwb cwbVar = new cwb(P0(), 2132017530);
        View viewInflate = LayoutInflater.from(P0()).inflate(2131624558, (ViewGroup) null);
        this.d2 = (TextView) viewInflate.findViewById(2131431324);
        this.e2 = (TextView) viewInflate.findViewById(2131431323);
        this.a2 = (Button) viewInflate.findViewById(2131427862);
        Bundle bundle2 = ((zf30) this).f;
        String string = bundle2 != null ? bundle2.getString("username") : null;
        TextView textView = (TextView) viewInflate.findViewById(2131431325);
        this.c2 = textView;
        if (string != null) {
            String str = String.format(k0().getString(2131955423), Arrays.copyOf(new Object[]{string}, 1));
            TextView textView2 = this.c2;
            if (textView2 == null) {
                u890.C("usernameView");
                throw null;
            }
            textView2.setText(Html.fromHtml(str));
        } else {
            textView.setVisibility(8);
        }
        j1(false);
        TertiaryButtonView tertiaryButtonView = (TertiaryButtonView) viewInflate.findViewById(2131427858);
        this.b2 = tertiaryButtonView;
        tertiaryButtonView.setTextColor(tyd1.b);
        StateListAnimatorButton stateListAnimatorButton = this.b2;
        if (stateListAnimatorButton == null) {
            u890.C("secondaryButton");
            throw null;
        }
        stateListAnimatorButton.setOnClickListener(new zfs(this, (byte) 6));
        znw znwVar = this.Y1;
        if (znwVar == null) {
            u890.C("effortlessLoginViewModelFactory");
            throw null;
        }
        hce1 hce1Var = new hce1(o(), znwVar, n9p1.s(this));
        tka0 tka0VarB = rc11.a.b(ynw.class);
        String strO = tka0VarB.o();
        if (strO == null) {
            hhg1.n("Local and anonymous classes can not be ViewModels");
            return null;
        }
        ynw ynwVar = (ynw) hce1Var.t("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strO), tka0VarB);
        this.f2 = ynwVar;
        ynwVar.e.f(this, new z11(this, (byte) 13));
        cwbVar.setContentView(viewInflate);
        return cwbVar;
    }

    public final ohv0 i1() {
        ohv0 ohv0Var = this.V1;
        if (ohv0Var != null) {
            return ohv0Var;
        }
        u890.C("tracker");
        throw null;
    }

    public final void j1(boolean z) {
        Button button = this.a2;
        if (z) {
            if (button == null) {
                u890.C("primaryButton");
                throw null;
            }
            button.setText(2131955420);
        } else {
            if (button == null) {
                u890.C("primaryButton");
                throw null;
            }
            button.setText(2131955419);
        }
        Button button2 = this.a2;
        if (button2 == null) {
            u890.C("primaryButton");
            throw null;
        }
        button2.setOnClickListener(new hnw(z, this));
        Button button3 = this.a2;
        if (button3 != null) {
            button3.setEnabled(true);
        } else {
            u890.C("primaryButton");
            throw null;
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        i1().a(new mhv0("samsung_effortless_login_sheet", "samsung_effortless_login_dismissed", ew80.c, "none"));
        uba ubaVar = this.W1;
        if (ubaVar == null) {
            u890.C("ubiLogger");
            throw null;
        }
        evl0 evl0Var = this.X1;
        if (evl0Var == null) {
            u890.C("eventFactory");
            throw null;
        }
        b7x b7xVar = b7x.a;
        ubaVar.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), evl0Var.a, r6h1.c, System.currentTimeMillis()));
    }

    public final void v0(Context context) {
        nmn1.p(this);
        super/*p.t2u*/.v0(context);
    }
}
