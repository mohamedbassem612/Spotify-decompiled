package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kwf0 extends zf30 {
    public final c8d0 F1;
    public nxf0 G1;
    public kg0 H1;

    public kwf0(c8d0 c8d0Var) {
        this.F1 = c8d0Var;
    }

    public final void v0(Context context) {
        this.F1.f(this);
        super.v0(context);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    public final void w0(Bundle bundle) {
        String string;
        String string2;
        bk8 bk8Var;
        String string3;
        super.w0(bundle);
        if (bundle == null) {
            nxf0 nxf0Var = this.G1;
            if (nxf0Var == null) {
                u890.C("magicLinkInstrumentor");
                throw null;
            }
            nxf0Var.a(new yp80());
        }
        Bundle bundle2 = ((zf30) this).f;
        if (bundle2 == null || (string = bundle2.getString("MAGIC_LINK_TOKEN")) == null) {
            eg.m("Magiclink token required");
            return;
        }
        Bundle bundle3 = ((zf30) this).f;
        String str = "";
        if (bundle3 == null || (string2 = bundle3.getString("MAGIC_LINK_USERNAME")) == null) {
            string2 = "";
        }
        Bundle bundle4 = ((zf30) this).f;
        if (bundle4 != null && (string3 = bundle4.getString("MAGIC_LINK_FLOW")) != null) {
            str = string3;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1371716166) {
            if (iHashCode != -1204932211) {
                if (iHashCode == 307811376 && str.equals("parental_consent")) {
                    bk8Var = bk8.Y;
                } else {
                    bk8Var = bk8.b;
                }
            } else if (str.equals("managed_account")) {
                bk8Var = bk8.t;
            } else {
                bk8Var = bk8.b;
            }
        } else if (str.equals("free_managed_account")) {
            bk8Var = bk8.X;
        } else {
            bk8Var = bk8.b;
        }
        nxf0 nxf0Var2 = this.G1;
        if (nxf0Var2 == null) {
            u890.C("magicLinkInstrumentor");
            throw null;
        }
        nxf0Var2.a(new wp80(1, 1));
        kg0 kg0Var = this.H1;
        if (kg0Var != null) {
            kg0Var.d(new yit(new f3f0(string, string2), bk8Var, (n5o) null, 12), true);
        } else {
            u890.C("zeroNavigator");
            throw null;
        }
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131624673, viewGroup, false);
    }
}
