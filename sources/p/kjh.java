package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kjh extends emc0 implements Connectable {
    public final szn0 N0;
    public final zl7 O0;
    public boolean P0;
    public RecyclerView Q0;
    public boolean R0;
    public String S0;
    public final fo4 X;
    public final eg21 Y;
    public final PublishSubject Z;
    public final rfx e;
    public final zfx f;
    public final pp g;
    public final ye3 h;
    public final ye3 i;
    public final wp20 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kjh(rfx rfxVar, zfx zfxVar, pp ppVar, wp20 wp20Var, fo4 fo4Var) {
        super(kn5.g);
        ye3 ye3Var = ye3.T0;
        ye3 ye3Var2 = ye3.S0;
        this.e = rfxVar;
        this.f = zfxVar;
        this.g = ppVar;
        this.h = ye3Var;
        this.i = ye3Var2;
        this.t = wp20Var;
        this.X = fo4Var;
        y(2);
        this.Y = eg21.a;
        this.Z = new PublishSubject();
        this.N0 = new szn0(new jjh(this, (byte) 0), new jjh(this, (byte) 1));
        this.O0 = new zl7(this, (byte) 3);
        this.S0 = "";
    }

    @Override // com.spotify.mobius.Connectable
    public final Connection L(Consumer consumer) {
        return new cn(this, this.Z.subscribe((io.reactivex.rxjava3.functions.Consumer) new dn(consumer, (byte) 12)), (byte) 9);
    }

    public final int g(int i) {
        return ((pkh) A(i)).a().ordinal();
    }

    public final void m(RecyclerView recyclerView) {
        this.Q0 = recyclerView;
        recyclerView.m(this.N0);
    }

    public final void n(int i, w611 w611Var) {
        hgh hghVar = (hgh) w611Var;
        View view = ((w611) hghVar).a;
        ekh ekhVar = (pkh) A(i);
        ekhVar.getClass();
        hghVar.E(ekhVar, i, this.P0, this.S0, new qka(this.Z));
        boolean z = ekhVar instanceof ekh;
        wp20 wp20Var = this.t;
        if (z) {
            wp20Var.F(view, ekhVar);
        } else if (ekhVar instanceof hkh) {
            wp20Var.G(view, (hkh) ekhVar);
        }
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        fkh[] fkhVarArr = fkh.a;
        int iOrdinal = f7p1.q(i).ordinal();
        fo4 fo4Var = this.X;
        rfx rfxVar = this.e;
        switch (iOrdinal) {
            case 0:
                return new cjh(rfxVar.a((l0i) null), fo4Var.a(), (byte) 0);
            case 1:
                return new eae0(cfd.p(LayoutInflater.from(viewGroup.getContext()), viewGroup));
            case 2:
                return new cjh(rfxVar.a((l0i) null), fo4Var.a(), (byte) 1);
            case 3:
                return new hg21(this.f.a(this.Y), (byte) 0);
            case 4:
                return new h561(wb80.a(LayoutInflater.from(viewGroup.getContext()), viewGroup), (byte) 0);
            case 5:
                return new h561(wb80.a(LayoutInflater.from(viewGroup.getContext()), viewGroup), (byte) 1);
            case 6:
                return new eae0(r961.j(LayoutInflater.from(viewGroup.getContext()), viewGroup));
            case 7:
                return new hg21(r961.j(LayoutInflater.from(viewGroup.getContext()), viewGroup));
            case 8:
                return new eae0(ke71.i(LayoutInflater.from(viewGroup.getContext()), viewGroup));
            case 9:
                return new hg21(this.g.a((l0i) null), (byte) 1);
            default:
                eg.o();
                return null;
        }
    }

    public final void r(RecyclerView recyclerView) {
        this.Q0 = null;
        recyclerView.p0(this.N0);
        recyclerView.p0(this.O0);
    }
}
