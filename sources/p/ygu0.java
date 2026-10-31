package p;

import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.offline_esperanto.proto.c;
import com.spotify.offline_esperanto.proto.d;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class ygu0 {
    public static final PlaylistRequestDecorationPolicy a;

    static {
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.G();
        hru0VarS.x(sku0VarP);
        a = hru0VarS.build();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object a(String str, xrc0 xrc0Var, m2l1 m2l1Var, onm onmVar) {
        wgu0 wgu0Var;
        String str2 = str;
        m2l1 m2l1Var2 = m2l1Var;
        if (onmVar instanceof wgu0) {
            wgu0Var = (wgu0) onmVar;
            int i = wgu0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wgu0Var.d = i - Integer.MIN_VALUE;
            } else {
                wgu0Var = new wgu0(onmVar);
            }
        } else {
            wgu0Var = new wgu0(onmVar);
        }
        Object objF = wgu0Var.c;
        int i2 = wgu0Var.d;
        if (i2 == 0) {
            hm5.M(objF);
            if (!u890.j(m2l1Var2.a.get(str2), Boolean.FALSE)) {
                trc0 trc0Var = new trc0(a, (g3d0) null, (Set) null, false, (src0) null, jqz0.a, (prc0) null, 0, (List) null, 478);
                wgu0Var.a = str2;
                wgu0Var.b = m2l1Var2;
                wgu0Var.d = 1;
                objF = ((rsc0) xrc0Var).f(str2, trc0Var, wgu0Var);
                d9n d9nVar = d9n.a;
                if (objF == d9nVar) {
                    return d9nVar;
                }
            }
            return gfg.a;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        m2l1 m2l1Var3 = wgu0Var.b;
        String str3 = wgu0Var.a;
        hm5.M(objF);
        m2l1Var2 = m2l1Var3;
        str2 = str3;
        oy21 oy21Var = (py21) objF;
        if (oy21Var instanceof ly21) {
            return ffg.a;
        }
        if (!(oy21Var instanceof oy21)) {
            eg.o();
            return null;
        }
        Map map = ((wsc0) oy21Var.a).f.q;
        boolean z = map.get("workout.type") != null;
        m2l1Var2.a.put(str2, Boolean.valueOf(z));
        if (z) {
            String str4 = (String) map.get("workout.cue.voice");
            if (str4 == null) {
                str4 = "voice2";
            }
            String str5 = (String) map.get("workout.cue.provider");
            if (str5 == null) {
                str5 = "sonantic_large";
            }
            return new hfg(new cyp0(str4, str5));
        }
        return gfg.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Serializable b(String str, vpp0 vpp0Var, onm onmVar) {
        xgu0 xgu0Var;
        if (onmVar instanceof xgu0) {
            xgu0Var = (xgu0) onmVar;
            int i = xgu0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                xgu0Var.b = i - Integer.MIN_VALUE;
            } else {
                xgu0Var = new xgu0(onmVar);
            }
        } else {
            xgu0Var = new xgu0(onmVar);
        }
        Object objJ = xgu0Var.a;
        int i2 = xgu0Var.b;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                c cVarQ = EsOffline.GetContextsRequest.q();
                qoz qozVarN = EsOffline.ContextInfoPolicy.n();
                qozVarN.n(false);
                cVarQ.t(qozVarN);
                d dVarQ = EsOffline.GetContextsRequest.Filtering.q();
                dVarQ.q(str);
                cVarQ.s(dVarQ);
                EsOffline.GetContextsRequest getContextsRequestBuild = cVarQ.build();
                getContextsRequestBuild.getClass();
                Single singleB = vpp0Var.b(getContextsRequestBuild);
                xgu0Var.b = 1;
                objJ = fc11.j(singleB, xgu0Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objJ);
            }
            EsOffline.GetContextsResponse getContextsResponse = (EsOffline.GetContextsResponse) objJ;
            getContextsResponse.getClass();
            if (getContextsResponse.q() == 0) {
                h290 h290VarP = getContextsResponse.p();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarP, 10));
                Iterator it = h290VarP.iterator();
                while (it.hasNext()) {
                    arrayList.add(((EsOffline.ContextInfo) it.next()).o().getUri());
                }
                return arrayList;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return null;
    }
}
