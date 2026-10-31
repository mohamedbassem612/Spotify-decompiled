package p;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gxi1 implements h8l {
    public boolean N0;
    public final idd1 X;
    public List Y;
    public ywi1 Z;
    public final t8r0 a;
    public final Bundle b;
    public final gw70 c;
    public final j2i d;
    public final zb91 e;
    public final qzh f;
    public final qzh g;
    public Consumer h;
    public final idd1 i;
    public final idd1 t;

    public gxi1(LayoutInflater layoutInflater, t8r0 t8r0Var, Bundle bundle, jqr jqrVar, ng20 ng20Var, xfx xfxVar, gw70 gw70Var, j2i j2iVar) {
        this.a = t8r0Var;
        this.b = bundle;
        this.c = gw70Var;
        this.d = j2iVar;
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131626294, (ViewGroup) null, false);
        int i = 2131428200;
        if (m5n1.t(constraintLayoutInflate, 2131428200) != null) {
            if (m5n1.t(constraintLayoutInflate, 2131431568) != null) {
                ConstraintLayout constraintLayout = constraintLayoutInflate;
                this.e = new zb91(constraintLayout, (byte) 26);
                ViewGroup viewGroup = (ViewGroup) constraintLayout.findViewById(2131428200);
                ufx ufxVar = xfxVar.d;
                jys jysVar = new jys(ufxVar.a, ufxVar.b, ng20Var);
                this.f = jysVar;
                h98 h98Var = new h98(xfxVar.e.a, (byte) 17);
                ye90 ye90Var = (ye90) h98Var.b;
                this.g = h98Var;
                this.i = new idd1(vbh1.P0);
                this.t = new idd1(vbh1.N0);
                this.X = new idd1(vbh1.O0);
                this.Y = z6x.a;
                rwq0.s(constraintLayout, rre1.O0);
                viewGroup.addView((View) jysVar.c.b, 0);
                viewGroup.findViewById(2131427590).addView((FrameLayout) ye90Var.b);
                FrameLayout frameLayout = (FrameLayout) ye90Var.b;
                frameLayout.setBackgroundColor(frameLayout.getContext().getColor(2131101505));
                constraintLayout.findViewById(2131431568).setContent(new j2i(1383443778, new eii1((Object) this, (Object) xfxVar, (byte) 4), true));
                return;
            }
            i = 2131431568;
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final Connection L(Consumer consumer) {
        this.h = consumer;
        this.f.n(new fxi1(this, (byte) 0));
        this.g.n(new fxi1(this, (byte) 1));
        bpb1 bpb1Var = (wen0) this.X.getValue();
        fxi1 fxi1Var = new fxi1(this, (byte) 2);
        bpb1 bpb1Var2 = bpb1Var;
        bpb1Var2.getClass();
        bpb1Var2.m((Object) null, fxi1Var);
        return new xj81(this, (byte) 3);
    }

    public final Object getView() {
        return (ConstraintLayout) this.e.b;
    }

    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        ywi1 ywi1Var = this.Z;
        bundle.putInt("venue_page_selected_tab_index", Integer.valueOf(ywi1Var != null ? ywi1Var.c.b : 0).intValue());
        return bundle;
    }

    public final void start() {
    }

    public final void stop() {
    }
}
