package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.android.MobiusAndroid;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class afz implements l4h1 {
    public final tez a;
    public final rep b;
    public final sep c;

    public afz(tez tezVar, rep repVar, sep sepVar) {
        this.a = tezVar;
        this.b = repVar;
        this.c = sepVar;
    }

    public final f4h1 a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, Object obj) {
        kp5 kp5Var = (kp5) this.b.a.c;
        xfx xfxVar = (xfx) ((sez) kp5Var.a).d.get();
        c8o.l(xfxVar);
        xfx xfxVar2 = (xfx) ((sez) kp5Var.a).d.get();
        c8o.l(xfxVar2);
        mez mezVar = new mez(xfxVar2);
        yzu yzuVar = new yzu();
        yzuVar.a = mezVar;
        idd1 idd1Var = new idd1(new t3x(viewGroup, yzuVar, (byte) 13));
        yzuVar.b = idd1Var;
        int i = kgr0.T0;
        yzuVar.c = xyn1.z(((c6r0) idd1Var.getValue()).a);
        yzuVar.d = new idd1(new t3x(yzuVar, xfxVar, (byte) 14));
        this.c.getClass();
        bfz bfzVar = new bfz(yzuVar);
        qez qezVar = this.a.a;
        qezVar.getClass();
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(rgw.class, new pez(qezVar, (byte) 0));
        subtypeEffectHandlerBuilderC.g(egw.class, new pez(qezVar, (byte) 1));
        return new zez(yzuVar, MobiusAndroid.b(Mobius.d(uez.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h())), (qhm0) obj, vez.a), bfzVar);
    }
}
