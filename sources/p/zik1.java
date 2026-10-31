package p;

import com.spotify.ads.esperanto.proto.SubEventRequest;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zik1 {
    public final jo0 a;
    public final jjh1 b;
    public final d18 c;

    public zik1(jo0 jo0Var, jjh1 jjh1Var, bf3 bf3Var) {
        this.a = jo0Var;
        this.b = jjh1Var;
        yqg yqgVar = bf3Var.a;
        d18 d18Var = new d18();
        d18Var.b = yqgVar;
        d18Var.a = 1800000L;
        d18Var.c = Collections.synchronizedMap(new LinkedHashMap());
        this.c = d18Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object a(String str, onm onmVar) {
        xik1 xik1Var;
        Object obj;
        Long l;
        d18 d18Var = this.c;
        yqg yqgVar = (yqg) d18Var.b;
        Map map = (Map) d18Var.c;
        if (onmVar instanceof xik1) {
            xik1Var = (xik1) onmVar;
            int i = xik1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xik1Var.d = i - Integer.MIN_VALUE;
            } else {
                xik1Var = new xik1(this, onmVar);
            }
        } else {
            xik1Var = new xik1(this, onmVar);
        }
        Object objJ = xik1Var.b;
        int i2 = xik1Var.d;
        if (i2 == 0) {
            hm5.M(objJ);
            mmr0 mmr0Var = (mmr0) map.get(str);
            if (mmr0Var != null) {
                long jLongValue = ((Number) mmr0Var.a).longValue();
                obj = mmr0Var.b;
                if (yqgVar.b() >= jLongValue) {
                    map.remove(str);
                    obj = null;
                }
                map.put(str, new mmr0(Long.valueOf(yqgVar.b() + d18Var.a), new e331(l)));
                return l;
            }
            obj = null;
            e331 e331Var = (e331) obj;
            if (e331Var != null) {
                return e331Var.a;
            }
            if (((ji0) this.b.a.get(str)) != null) {
                l = new Long(3000L);
            } else {
                LinkedHashMap linkedHashMap = co0.b;
                jo0 jo0Var = this.a;
                jo0Var.getClass();
                ukc1 ukc1VarN = SubEventRequest.n();
                ukc1VarN.getClass();
                ukc1VarN.n("started");
                xkb1 xkb1Var = new xkb1(new ik(new ik(new any(jo0Var.a.callStream("spotify.ads.esperanto.proto.Events", "subEvent", ukc1VarN.build()), (byte) 7), (byte) 1), (byte) 2), (byte) 16);
                lm9 lm9Var = new lm9(str, (lnm) null, (byte) 8);
                xik1Var.a = str;
                xik1Var.d = 1;
                objJ = b5p1.j(xkb1Var, lm9Var, xik1Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            }
            map.put(str, new mmr0(Long.valueOf(yqgVar.b() + d18Var.a), new e331(l)));
            return l;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = xik1Var.a;
        hm5.M(objJ);
        l = ((ji0) objJ).X0;
        if (l == null) {
            l = new m231(new IllegalStateException(l1d.m("viewable threshold is missing for ad ", str)));
        }
        map.put(str, new mmr0(Long.valueOf(yqgVar.b() + d18Var.a), new e331(l)));
        return l;
    }
}
