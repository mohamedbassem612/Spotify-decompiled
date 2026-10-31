package p;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lp/hcr0;", "Lp/m6r0;", "Lp/bbr0;", "<init>", "()V", "src_main_java_com_spotify_tome_pageapi-pageapi"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public abstract class hcr0 extends m6r0 implements bbr0 {
    public final wbr0 F1;
    public final vbr0 G1;
    public final sbr0 H1;
    public final rbr0 I1;
    public final n431 J1;
    public final boolean K1;
    public final idd1 L1;
    public final idd1 M1;
    public final idd1 N1;
    public dcr0 O1;
    public air0 P1;
    public final Map Q1;
    public final idd1 R1;
    public final idd1 S1;
    public final idd1 T1;
    public final idd1 U1;
    public final idd1 V1;

    public hcr0(Map map, wbr0 wbr0Var, vbr0 vbr0Var, sbr0 sbr0Var, rbr0 rbr0Var, n431 n431Var, boolean z) {
        this.F1 = wbr0Var;
        this.G1 = vbr0Var;
        this.H1 = sbr0Var;
        this.I1 = rbr0Var;
        this.J1 = n431Var;
        this.K1 = z;
        this.L1 = new idd1(new u6j0(this, (byte) 25));
        this.M1 = new idd1(new fcr0(this, (byte) 3));
        this.N1 = new idd1(new fcr0(this, (byte) 1));
        this.R1 = new idd1(new fcr0(this, (byte) 4));
        this.S1 = new idd1(new fcr0(this, (byte) 6));
        this.T1 = new idd1(new fcr0(this, (byte) 7));
        this.U1 = new idd1(new fcr0(this, (byte) 5));
        this.V1 = new idd1(new fcr0(this, (byte) 2));
        this.Q1 = map;
    }

    public void F0(Bundle bundle) {
        dg30 dg30VarF0;
        air0 air0Var;
        air0 air0Var2 = this.P1;
        if (air0Var2 != null) {
            bundle.putBundle("ui", air0Var2.d());
        }
        dcr0 dcr0Var = this.O1;
        bundle.putBundle("page", dcr0Var != null ? dcr0Var.e() : null);
        n431 n431Var = this.J1;
        bundle.putSerializable("launched_page_ids_map_key", n431Var.b);
        bundle.putSerializable("pending_page_results_map_keys", n431Var.a);
        if (!this.K1 || (dg30VarF0 = f0()) == null || !dg30VarF0.isChangingConfigurations() || (air0Var = this.P1) == null) {
            return;
        }
        air0Var.a();
    }

    public final void G0() {
        ((zf30) this).h1 = true;
        dcr0 dcr0Var = this.O1;
        dcr0Var.getClass();
        dcr0Var.f();
    }

    public final void H0() {
        dg30 dg30VarF0;
        air0 air0Var;
        dcr0 dcr0Var = this.O1;
        dcr0Var.getClass();
        dcr0Var.g();
        ((zf30) this).h1 = true;
        if (!this.K1 || (dg30VarF0 = f0()) == null || !dg30VarF0.isFinishing() || (air0Var = this.P1) == null) {
            return;
        }
        if (air0Var != null) {
            air0Var.a();
        } else {
            u890.C("uiRuntime");
            throw null;
        }
    }

    @Override // p.bbr0
    public final war0 b0(Class cls) {
        return ((ki10) this.T1.getValue()).b0(cls);
    }

    public final h0r0 e1() {
        dcr0 dcr0Var = this.O1;
        if (dcr0Var != null) {
            return dcr0Var.c();
        }
        throw new IllegalStateException(("The Page Runtime is not available (yet). The current state of the " + rc11.a.b(getClass()).r() + "'s lifecycle: " + ((zf30) this).s1.i + ". The Page Runtime is created during onCreate and is destroyed during onDestroy.").toString());
    }

    public void w0(Bundle bundle) {
        super.w0(bundle);
        if (this.O1 == null) {
            ecr0 ecr0Var = (ecr0) this.N1.getValue();
            ebr0 ebr0Var = (ebr0) this.R1.getValue();
            if (ebr0Var == null) {
                eg.m("PageProvider is not found");
                return;
            }
            this.O1 = new dcr0(ecr0Var, ebr0Var, (Parcelable) this.M1.getValue(), (Function0) new t0r0(this, (byte) 3), bundle != null ? bundle.getBundle("page") : null, (x8c0) ((zf30) this).s1, o(), 64);
        }
        if (bundle != null) {
            n431 n431Var = this.J1;
            HashSet hashSet = n431Var.b;
            Serializable serializable = bundle.getSerializable("launched_page_ids_map_key");
            HashSet hashSet2 = serializable instanceof HashSet ? (HashSet) serializable : null;
            if (hashSet2 == null) {
                hashSet2 = new HashSet();
            }
            hashSet.addAll(hashSet2);
            HashMap map = n431Var.a;
            Serializable serializable2 = bundle.getSerializable("pending_page_results_map_keys");
            HashMap map2 = serializable2 instanceof HashMap ? (HashMap) serializable2 : null;
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.putAll(map2);
        }
    }

    public View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (viewGroup == null) {
            if (bundle == null) {
                n57.e("Pages require a non-null parent to attach its views to. \n\nActivity={currentLifecycleState=" + ((f0i) N0()).a.i.name() + "}. \n\n Fragment={currentLifecycleState=" + ((zf30) this).s1.i.name() + "}.");
            }
            return null;
        }
        U0();
        Bundle bundle2 = ((zf30) this).f;
        String string = bundle2 != null ? bundle2.getString("result-receiver-id") : null;
        if (string == null) {
            string = "";
        }
        tbr0 tbr0VarA = this.H1.a(string);
        phi0 phi0Var = new phi0(new t0r0(this, (byte) 4), N0(), this.F1, this.G1, tbr0VarA, this.I1.a(tbr0VarA));
        dcr0 dcr0Var = this.O1;
        dcr0Var.getClass();
        Context context = viewGroup.getContext();
        Bundle bundle3 = bundle != null ? bundle.getBundle("ui") : null;
        mr20 mr20Var = (mr20) this.U1.getValue();
        lj30 lj30VarN0 = n0();
        lj30VarN0.b();
        air0 air0Var = new air0(dcr0Var, phi0Var, mr20Var, context, viewGroup, bundle3, lj30VarN0.e);
        this.P1 = air0Var;
        return air0Var.c();
    }

    public final void y0() {
        dcr0 dcr0Var = this.O1;
        dcr0Var.getClass();
        dcr0Var.a();
        this.O1 = null;
        ((zf30) this).h1 = true;
    }

    public void z0() {
        air0 air0Var = this.P1;
        if (air0Var != null) {
            if (air0Var == null) {
                u890.C("uiRuntime");
                throw null;
            }
            air0Var.a();
        }
        ((zf30) this).h1 = true;
    }

    public hcr0() {
        throw new IllegalStateException("Your FragmentManager doesn't have PageHostingFragmentFactory set as its fragment factory");
    }
}
