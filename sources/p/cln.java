package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.First;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final /* synthetic */ class cln extends tv30 implements vu30 {
    public static final cln a = new cln(2, nln.class, "init", "init(Lcom/spotify/campfire/chatsharepage/elements/creategroup/CreateGroupPageElement$Props;Lcom/spotify/campfire/chatsharepage/elements/creategroup/CreateGroupPageElement$State;)Lcom/spotify/mobius/First;", 1);

    public final Object invoke(Object obj, Object obj2) {
        e031 e031Var;
        Map map;
        Map linkedHashMap;
        ykn yknVar = (ykn) obj;
        zkn zknVar = (bln) obj2;
        if (zknVar instanceof aln) {
            aln alnVar = (aln) zknVar;
            if (alnVar.b) {
                map = alnVar.a;
            } else {
                List list = yknVar.d;
                if (list != null) {
                    List list2 = list;
                    int iS = zno1.s(q7h.U(list2, 10));
                    if (iS < 16) {
                        iS = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iS);
                    for (Object obj3 : list2) {
                        linkedHashMap.put(((w4i1) obj3).a, obj3);
                    }
                } else {
                    map = b7x.a;
                }
                e031Var = new e031(linkedHashMap, alnVar.c, alnVar.d, alnVar.g, alnVar.e, alnVar.f);
            }
            linkedHashMap = map;
            e031Var = new e031(linkedHashMap, alnVar.c, alnVar.d, alnVar.g, alnVar.e, alnVar.f);
        } else {
            if (!(zknVar instanceof zkn)) {
                eg.o();
                return null;
            }
            zkn zknVar2 = zknVar;
            e031Var = new e031(zknVar2.g, zknVar2.b, zknVar2.i, zknVar2.j, zknVar2.e, zknVar2.f);
        }
        boolean z = yknVar.c != null;
        t7q0 t7q0Var = yknVar.b;
        List list3 = e031Var.b;
        return First.c(new zkn(yknVar.a, list3 == null ? z6x.a : list3, t7q0Var, z, e031Var.e, e031Var.f, e031Var.a, list3 == null ? 1 : 2, e031Var.c, e031Var.d, false), list3 == null ? Effects.a(new okn[]{new mkn(t7q0Var.getUri())}) : w7x.a);
    }
}
