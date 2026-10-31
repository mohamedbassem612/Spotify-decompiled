package p;

import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gvc0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ xrc0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gvc0(xrc0 xrc0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = xrc0Var;
    }

    public static final String e(qvc0 qvc0Var) {
        return qvc0Var.a + qvc0Var.b + qvc0Var.c + qvc0Var.d;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                gvc0 gvc0Var = new gvc0(this.d, lnmVar, (byte) 0);
                gvc0Var.c = obj;
                return gvc0Var;
            case 1:
                gvc0 gvc0Var2 = new gvc0(this.d, lnmVar, (byte) 1);
                gvc0Var2.c = obj;
                return gvc0Var2;
            case 2:
                gvc0 gvc0Var3 = new gvc0(this.d, lnmVar, (byte) 2);
                gvc0Var3.c = obj;
                return gvc0Var3;
            default:
                gvc0 gvc0Var4 = new gvc0(this.d, lnmVar, (byte) 3);
                gvc0Var4.c = obj;
                return gvc0Var4;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Set set = (Set) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return create(set, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG;
        Object objG2;
        byte b = this.a;
        rsc0 rsc0Var = this.d;
        Serializable serializable = d9n.a;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                Set set = (Set) this.c;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    Set<qvc0> set2 = set;
                    int iS = zno1.s(q7h.U(set2, 10));
                    if (iS < 16) {
                        iS = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                    for (qvc0 qvc0Var : set2) {
                        linkedHashMap.put(e(qvc0Var), new wrc0(qvc0Var.a, trc0.a(xsc0.a, (PlaylistRequestDecorationPolicy) null, qvc0Var.b, qvc0Var.c, qvc0Var.d, 473)));
                    }
                    Integer num = new Integer(20);
                    this.c = set;
                    this.b = true;
                    objG = rsc0Var.g(linkedHashMap, num, this);
                    if (objG == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objG = obj;
                }
                Map map = (Map) objG;
                Set set3 = set;
                int iS2 = zno1.s(q7h.U(set3, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS2 < 16 ? 16 : iS2);
                for (Object obj2 : set3) {
                    linkedHashMap2.put(obj2, (py21) map.get(e((qvc0) obj2)));
                }
                return linkedHashMap2;
            case 1:
                Set set4 = (Set) this.c;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                gvc0 gvc0Var = new gvc0(rsc0Var, lnmVar, (byte) 0);
                this.c = null;
                this.b = true;
                Serializable serializableM = ljo1.m(set4, gvc0Var, this);
                return serializableM == serializable ? serializable : serializableM;
            case 2:
                Set set5 = (Set) this.c;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    Set set6 = set5;
                    int iS3 = zno1.s(q7h.U(set6, 10));
                    if (iS3 < 16) {
                        iS3 = 16;
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(iS3);
                    Iterator it = set6.iterator();
                    while (it.hasNext()) {
                        String str = ((rxc0) it.next()).a;
                        linkedHashMap3.put(str, new wrc0(str, xsc0.b));
                    }
                    Integer num2 = new Integer(20);
                    this.c = set5;
                    this.b = true;
                    objG2 = rsc0Var.g(linkedHashMap3, num2, this);
                    if (objG2 == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objG2 = obj;
                }
                Map map2 = (Map) objG2;
                Set set7 = set5;
                int iS4 = zno1.s(q7h.U(set7, 10));
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(iS4 >= 16 ? iS4 : 16);
                for (Object obj3 : set7) {
                    linkedHashMap4.put(obj3, (py21) map2.get(((rxc0) obj3).a));
                }
                return linkedHashMap4;
            default:
                Set set8 = (Set) this.c;
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                gvc0 gvc0Var2 = new gvc0(rsc0Var, lnmVar, (byte) 2);
                this.c = null;
                this.b = true;
                Serializable serializableM2 = ljo1.m(set8, gvc0Var2, this);
                return serializableM2 == serializable ? serializable : serializableM2;
        }
    }
}
