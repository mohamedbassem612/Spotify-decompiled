package p;

import com.spotify.rcs.resolver.grpc.v0.Context;
import com.spotify.rcs.resolver.grpc.v0.Fetch;
import com.spotify.rcs.resolver.grpc.v0.ResolveRequest;
import com.spotify.rcs.resolver.grpc.v0.h;
import com.spotify.rcs.resolver.grpc.v0.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class otk {
    public static ResolveRequest a(x020 x020Var, xav0 xav0Var) {
        Set setKeySet = xav0Var.b().keySet();
        if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
            Iterator it = setKeySet.iterator();
            do {
                if (!it.hasNext()) {
                    utw0 utw0Var = ike1.a;
                    utw0Var.y("RCS");
                    utw0Var.A("This integration was setup without RemoteConfig ClientVersion as an Identifier. Please fix!", new Object[0]);
                    xav0Var.a(new big());
                    break;
                }
            } while (!u890.j((String) it.next(), "/remote-config/rc-client-version"));
        } else {
            utw0 utw0Var2 = ike1.a;
            utw0Var2.y("RCS");
            utw0Var2.A("This integration was setup without RemoteConfig ClientVersion as an Identifier. Please fix!", new Object[0]);
            xav0Var.a(new big());
            break;
        }
        ArrayList<wav0> arrayListN0 = o7h.N0(z6x.a, xav0Var.b);
        ArrayList arrayList = new ArrayList(q7h.U(arrayListN0, 10));
        for (wav0 wav0Var : arrayListN0) {
            i iVarN = Context.ContextEntry.n();
            iVarN.q(wav0Var.getPolicyId());
            if (wav0Var instanceof vav0) {
                iVarN.r(((vav0) wav0Var).getStringValue());
            } else {
                if (!(wav0Var instanceof cpb)) {
                    eg.o();
                    return null;
                }
                iVarN.n(((cpb) wav0Var).a);
            }
            arrayList.add((Context.ContextEntry) iVarN.build());
        }
        cu21 cu21VarN = ResolveRequest.n();
        cu21VarN.r();
        xy10 xy10VarN = Fetch.n();
        int iOrdinal = x020Var.ordinal();
        yy10 yy10Var = yy10.BLOCKING;
        switch (iOrdinal) {
            case 0:
            case 2:
                break;
            case 1:
                yy10Var = yy10.BACKGROUND_SYNC;
                break;
            case 3:
                yy10Var = yy10.ASYNC;
                break;
            case 4:
                yy10Var = yy10.PUSH_INITIATED;
                break;
            case 5:
                yy10Var = yy10.RECONNECT;
                break;
            case 6:
                yy10Var = yy10.UNRECOGNIZED;
                break;
            default:
                eg.o();
                return null;
        }
        xy10VarN.n(yy10Var);
        cu21VarN.q((Fetch) xy10VarN.build());
        h hVarO = Context.o();
        hVarO.n(arrayList);
        cu21VarN.n(hVarO);
        return (ResolveRequest) cu21VarN.build();
    }
}
