package p;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y0t0 extends bk5 {
    public final pjq0 V1;
    public ca40 W1;
    public String X1;
    public String Y1;
    public String Z1;
    public tv80 a2;
    public boolean b2;

    public y0t0(pjq0 pjq0Var) {
        this.V1 = pjq0Var;
    }

    public final void v0(Context context) {
        String string;
        String string2;
        String string3;
        this.V1.f(this);
        Bundle bundle = ((zf30) this).f;
        String str = "";
        if (bundle == null || (string = bundle.getString("pageUri")) == null) {
            string = "";
        }
        this.X1 = string;
        Bundle bundle2 = ((zf30) this).f;
        if (bundle2 == null || (string2 = bundle2.getString("title")) == null) {
            string2 = "";
        }
        this.Y1 = string2;
        Bundle bundle3 = ((zf30) this).f;
        if (bundle3 != null && (string3 = bundle3.getString("subtitle")) != null) {
            str = string3;
        }
        this.Z1 = str;
        Bundle bundle4 = ((zf30) this).f;
        this.a2 = bundle4 != null ? (tv80) jhc1.v(bundle4, "interactionLoggingResult", tv80.class) : null;
        super/*p.t2u*/.v0(context);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ca40 ca40Var = this.W1;
        if (ca40Var == null) {
            u890.C("callbacks");
            throw null;
        }
        String str = this.X1;
        if (str == null) {
            u890.C("pageUri");
            throw null;
        }
        ca40Var.d.b.add(str);
        ComposeView composeView = new ComposeView(P0(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setFilterTouchesWhenObscured(true);
        composeView.setContent(apo.j(-432622027, new x0t0(this, (byte) 2), true));
        return composeView;
    }

    public final void y0() {
        ((zf30) this).h1 = true;
        ca40 ca40Var = this.W1;
        if (ca40Var == null) {
            u890.C("callbacks");
            throw null;
        }
        String str = this.X1;
        if (str == null) {
            u890.C("pageUri");
            throw null;
        }
        tv80 tv80Var = this.a2;
        if (this.b2) {
            ca40Var.c.w(str, tv80Var);
        } else {
            ca40Var.b(str, oc40.a);
        }
    }
}
