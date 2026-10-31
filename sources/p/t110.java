package p;

import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistEpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class t110 {
    public static final ArrayList a(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<zvh> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (zvh zvhVar : list2) {
            List list3 = zvhVar.b;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list3) {
                if (linkedHashSet.add(((rzh) obj).c)) {
                    arrayList2.add(obj);
                }
            }
            arrayList.add(new zvh(zvhVar.a, arrayList2));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Serializable b(String str, onm onmVar, xrc0 xrc0Var) {
        r010 r010Var;
        if (onmVar instanceof r010) {
            r010Var = (r010) onmVar;
            int i = r010Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                r010Var.b = i - Integer.MIN_VALUE;
            } else {
                r010Var = new r010(onmVar);
            }
        } else {
            r010Var = new r010(onmVar);
        }
        Object objF = r010Var.a;
        int i2 = r010Var.b;
        if (i2 == 0) {
            hm5.M(objF);
            hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
            llu0 llu0VarR = PlaylistEpisodeDecorationPolicy.r();
            llu0VarR.s(EpisodeDecorationPolicy.newBuilder().setLink(true));
            hru0VarS.t(llu0VarR);
            PlaylistRequestDecorationPolicy playlistRequestDecorationPolicyBuild = hru0VarS.build();
            playlistRequestDecorationPolicyBuild.getClass();
            trc0 trc0Var = new trc0(playlistRequestDecorationPolicyBuild, (g3d0) null, (Set) null, false, (src0) null, hqz0.a, (prc0) null, 0, (List) null, 478);
            r010Var.b = 1;
            objF = ((rsc0) xrc0Var).f(str, trc0Var, r010Var);
            d9n d9nVar = d9n.a;
            if (objF == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objF);
        }
        wsc0 wsc0Var = (wsc0) ((py21) objF).c();
        if (wsc0Var == null) {
            return z6x.a;
        }
        List list = wsc0Var.e;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((zuc0) it.next()).c);
        }
        return arrayList;
    }
}
