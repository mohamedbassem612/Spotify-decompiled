package p;

import com.spotify.mdata.esperanto.proto.ObserveRequest;
import com.spotify.mdata.esperanto.proto.a;
import com.spotify.mdata.esperanto.proto.b;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zu00 implements uu00 {
    public final zmj0 a;
    public final pv00 b;
    public final ihp0 c;

    public zu00(zmj0 zmj0Var, pv00 pv00Var) {
        hhp0 hhp0Var = hhp0.a;
        this.a = zmj0Var;
        this.b = pv00Var;
        this.c = hhp0Var;
    }

    public final ObserveRequest a(oi oiVar) {
        ObserveRequest.ExtensionQuery extensionQueryBuild;
        a aVarO = ObserveRequest.o();
        ArrayList<rv00> arrayListG = oiVar.G();
        ArrayList arrayList = new ArrayList();
        for (rv00 rv00Var : arrayListG) {
            ov00 ov00VarA = this.b.a(rv00Var.b);
            if (ov00VarA == null) {
                extensionQueryBuild = null;
            } else {
                hz00 hz00VarB = hz00.b(ov00VarA.b());
                b bVarN = ObserveRequest.ExtensionQuery.n();
                bVarN.q(hz00VarB);
                bVarN.n(rv00Var.a);
                bVarN.r(rv00Var.c);
                extensionQueryBuild = bVarN.build();
            }
            if (extensionQueryBuild != null) {
                arrayList.add(extensionQueryBuild);
            }
        }
        aVarO.n(arrayList);
        aVarO.q(oiVar.D());
        aVarO.r(oiVar.F());
        return aVarO.build();
    }

    public final Observable b(oi oiVar) {
        return Observable.defer(new xf0(this, oiVar, (byte) 4));
    }
}
