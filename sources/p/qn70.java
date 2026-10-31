package p;

import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin;
import com.spotify.offline.offlineplugin_proto.e;
import com.spotify.offline.offlineplugin_proto.f;
import com.spotify.offline.offlineplugin_proto.g;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class qn70 {
    public static final PlaylistRequestDecorationPolicy a;

    static {
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.H();
        sku0VarP.G();
        hru0VarS.x(sku0VarP);
        a = hru0VarS.build();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0109  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0147, code lost:
    
        if (r2 == r12) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(java.util.ArrayList r17, p.vpp0 r18, p.xrc0 r19, p.m2l1 r20, p.onm r21) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.qn70.a(java.util.ArrayList, p.vpp0, p.xrc0, p.m2l1, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:56:0x010b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object b(EsOfflinePlugin.IdentifyCommand identifyCommand, vpp0 vpp0Var, xrc0 xrc0Var, rm5 rm5Var, m2l1 m2l1Var, onm onmVar) {
        nn70 nn70Var;
        rm5 rm5Var2;
        ArrayList<String> arrayList;
        g gVar;
        if (onmVar instanceof nn70) {
            nn70Var = (nn70) onmVar;
            int i = nn70Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nn70Var.d = i - Integer.MIN_VALUE;
            } else {
                nn70Var = new nn70(onmVar);
            }
        } else {
            nn70Var = new nn70(onmVar);
        }
        Object objO = nn70Var.c;
        int i2 = nn70Var.d;
        Set set = null;
        try {
            if (i2 == 0) {
                hm5.M(objO);
                h290 h290VarN = identifyCommand.n();
                ArrayList arrayList2 = new ArrayList(q7h.U(h290VarN, 10));
                Iterator it = h290VarN.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((EsOfflinePlugin.IdentifyCommand.Query) it.next()).getLink());
                }
                try {
                    lqv lqvVar = new lqv(arrayList2, vpp0Var, xrc0Var, m2l1Var, (lnm) null, (byte) 23);
                    nn70Var.a = rm5Var;
                    nn70Var.b = arrayList2;
                    nn70Var.d = 1;
                    objO = rc2.O(15000L, lqvVar, nn70Var);
                    d9n d9nVar = d9n.a;
                    if (objO == d9nVar) {
                        return d9nVar;
                    }
                    rm5Var2 = rm5Var;
                    arrayList = arrayList2;
                } catch (Exception unused) {
                    rm5Var2 = rm5Var;
                    arrayList = arrayList2;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                arrayList = nn70Var.b;
                rm5Var2 = nn70Var.a;
                try {
                    hm5.M(objO);
                } catch (Exception unused2) {
                }
            }
            set = (Set) objO;
            e eVarO = EsOfflinePlugin.IdentifyResponse.o();
            for (String str : arrayList) {
                if (set == null || !set.contains(str)) {
                    gVar = g.d;
                } else {
                    str.getClass();
                    rm5Var2.getClass();
                    if (new File(rm5Var2.P(str), ".cue-manifest").exists()) {
                        File file = new File(rm5Var2.P(str), ".cue-manifest");
                        if (file.exists()) {
                            String string = ihc1.e1(y520.H(file)).toString();
                            if (string.length() != 0) {
                                List listD0 = ihc1.D0(string);
                                if (!(listD0 instanceof Collection) || !listD0.isEmpty()) {
                                    Iterator it2 = listD0.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            if (!rm5Var2.n(str, (String) it2.next()).exists()) {
                                                gVar = g.b;
                                            }
                                        }
                                    }
                                }
                            }
                            gVar = g.c;
                        } else {
                            gVar = g.b;
                        }
                    } else {
                        gVar = g.b;
                    }
                }
                f fVarO = EsOfflinePlugin.IdentifyResponse.Result.o();
                fVarO.q(gVar);
                eVarO.n(str, fVarO.build());
            }
            return eVarO.build();
        } catch (CancellationException e) {
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object c(ArrayList arrayList, xrc0 xrc0Var, m2l1 m2l1Var, onm onmVar) {
        on70 on70Var;
        ArrayList arrayListJ;
        Object objA;
        m2l1 m2l1Var2 = m2l1Var;
        if (onmVar instanceof on70) {
            on70Var = (on70) onmVar;
            int i = on70Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                on70Var.d = i - Integer.MIN_VALUE;
            } else {
                on70Var = new on70(onmVar);
            }
        } else {
            on70Var = new on70(onmVar);
        }
        Object obj = on70Var.c;
        int i2 = on70Var.d;
        try {
            if (i2 == 0) {
                arrayListJ = hrt.j(obj);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    Boolean bool = (Boolean) m2l1Var2.a.get(str);
                    if (bool == null) {
                        arrayList2.add(str);
                    } else if (bool.booleanValue()) {
                        arrayListJ.add(str);
                    }
                }
                if (arrayList2.isEmpty()) {
                    return arrayListJ;
                }
                int iS = zno1.s(q7h.U(arrayList2, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj2 : arrayList2) {
                    linkedHashMap.put(obj2, new wrc0((String) obj2, new trc0(a, (g3d0) null, (Set) null, false, (src0) null, jqz0.a, (prc0) null, 0, (List) null, 478)));
                }
                try {
                    on70Var.a = m2l1Var2;
                    on70Var.b = arrayListJ;
                    on70Var.d = 1;
                    objA = xrc0.a(xrc0Var, linkedHashMap, on70Var);
                    d9n d9nVar = d9n.a;
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                } catch (Exception unused) {
                    return arrayListJ;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ArrayList arrayList3 = on70Var.b;
                m2l1 m2l1Var3 = on70Var.a;
                try {
                    hm5.M(obj);
                    arrayListJ = arrayList3;
                    m2l1Var2 = m2l1Var3;
                    objA = obj;
                } catch (Exception unused2) {
                    return arrayList3;
                }
            }
            Map map = (Map) objA;
            ArrayList arrayList4 = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                oy21 oy21Var = (py21) entry.getValue();
                if (oy21Var instanceof oy21) {
                    boolean z = ((wsc0) oy21Var.a).f.q.get("workout.type") != null;
                    m2l1Var2.a.put(str2, Boolean.valueOf(z));
                    if (z) {
                        arrayList4.add(str2);
                    }
                }
            }
            return o7h.N0(arrayList4, arrayListJ);
        } catch (CancellationException e) {
            throw e;
        }
    }
}
