package p;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@adt
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0002\u0004\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lp/auj;", "Lp/haa;", "<init>", "()V", "p/xtj", "src_main_java_com_spotify_bottomsheet_core-core"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public abstract class auj extends haa {
    public abstract void n1(xtj xtjVar, b0k b0kVar, int i);

    public final void o1(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1321106144);
        int i2 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarS = u291.s(uyn1.z(0.0f, 10.0f, 1, qim0Var), 36.0f, 4.0f);
            uwr uwrVar = cbx.a;
            t1c.a(dug.f(qim0VarS, ((vex) zex.a.e).j, er31.b(4.0f)), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l2i(this, qim0Var, i, (byte) 22);
        }
    }

    @Override // p.zf30
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View ztjVar = new ztj(this, layoutInflater.getContext());
        ytj ytjVar = new ytj(ztjVar, layoutInflater.getContext());
        ytjVar.addView(ztjVar);
        return ytjVar;
    }

    @Override // p.haa
    public final void m1(nk80 nk80Var) {
    }
}
