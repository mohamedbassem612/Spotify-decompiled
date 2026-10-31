package p;

import com.spotify.betamax.offline.LicensePreparationException;
import com.spotify.offline_esperanto.proto.EsOffline;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class npt0 implements tna {
    public final byp0 a;

    public npt0(byp0 byp0Var) {
        this.a = byp0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.betamax.offline.LicensePreparationException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // p.tna
    public final void a(String str, upa0 upa0Var) throws NoWhenBranchMatchedException, LicensePreparationException {
        gpz gpzVar;
        List listH = upa0Var.h();
        if (listH.isEmpty()) {
            return;
        }
        int i = hon1.x(str) ? 2 : 1;
        List list = listH;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strR0 = f46.r0((byte[]) it.next(), ent0.Z, 30);
            int iC = l1d.C(i);
            if (iC == 0) {
                gpzVar = gpz.b;
            } else {
                if (iC != 1) {
                    eg.o();
                    return;
                }
                gpzVar = gpz.c;
            }
            vpp0 vpp0Var = this.a.a;
            dpz dpzVarN = EsOffline.PrepareResourceRequest.n();
            dpzVarN.n(strR0);
            dpzVarN.q(gpzVar);
            arrayList.add(vpp0Var.callSingle("spotify.offline_esperanto.proto.Offline", "PrepareResource", dpzVarN.build()).map(ua20.S0).map(rh20.U0).map(new njp1(strR0, (byte) 13)));
        }
        for (mmr0 mmr0Var : (List) Single.zip(arrayList, ok10.W0).blockingGet()) {
            String str2 = (String) mmr0Var.a;
            if (!((Boolean) mmr0Var.b).booleanValue()) {
                throw new LicensePreparationException(l1d.m("License preparation failed for resource ", str2));
            }
        }
    }
}
