package p;

import com.spotify.thestage.vtec.events.proto.VtecEvent;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class my30 {
    public long a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public final Object g;

    public my30(flb0 flb0Var, wat watVar, f930 f930Var, lee1 lee1Var, Object obj) {
        this.b = flb0Var;
        this.c = watVar;
        this.d = f930Var;
        this.e = lee1Var;
        this.f = obj;
        this.g = v8r.q(Boolean.TRUE);
        this.a = 0L;
    }

    public static void b(my30 my30Var, flb0 flb0Var, wat watVar, lee1 lee1Var, int i) {
        if ((i & 1) != 0) {
            flb0Var = (flb0) my30Var.b;
        }
        if ((i & 2) != 0) {
            watVar = (wat) my30Var.c;
        }
        f930 f930Var = (f930) my30Var.d;
        if ((i & 8) != 0) {
            lee1Var = (lee1) my30Var.e;
        }
        Object obj = my30Var.f;
        flb0 flb0Var2 = (flb0) my30Var.b;
        hrr0 hrr0Var = (hrr0) my30Var.g;
        if (flb0Var == flb0Var2 && u890.j(watVar, (wat) my30Var.c) && u890.j(f930Var, (f930) my30Var.d) && u890.j(lee1Var, (lee1) my30Var.e)) {
            if (u890.j(obj, my30Var.f)) {
                return;
            }
            my30Var.f = obj;
            hrr0Var.setValue(Boolean.TRUE);
            return;
        }
        my30Var.b = flb0Var;
        my30Var.c = watVar;
        my30Var.d = f930Var;
        my30Var.e = lee1Var;
        hrr0Var.setValue(Boolean.TRUE);
    }

    public void a(l2l1 l2l1Var) {
        LinkedHashMap linkedHashMap;
        mmr0 mmr0Var;
        t2j0 t2j0Var = (t2j0) this.e;
        m1l1 m1l1VarN = VtecEvent.n();
        m1l1VarN.t((String) this.b);
        m1l1VarN.s((String) this.c);
        m1l1VarN.n((((yqg) this.d).b() - this.a) / 1000.0d);
        m1l1VarN.r(l2l1Var.c);
        Map map = l2l1Var.b;
        if (map != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (((String) entry.getValue()) != null) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(zno1.s(linkedHashMap2.size()));
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                Object key = entry2.getKey();
                String str = (String) entry2.getValue();
                str.getClass();
                linkedHashMap3.put(key, str);
            }
            m1l1VarN.q(((nfa0) this.f).b((nlc0) this.g, linkedHashMap3));
        }
        String str2 = l2l1Var.a;
        if (str2 != null) {
            URI uri = new URI(str2);
            String rawQuery = uri.getRawQuery();
            if (rawQuery != null) {
                List<String> listQ0 = ihc1.Q0(rawQuery, new String[]{"&"}, 0, 6);
                ArrayList arrayList = new ArrayList();
                for (String str3 : listQ0) {
                    if (ihc1.Q0(str3, new String[]{"="}, 0, 6).size() == 2) {
                        List listQ1 = ihc1.Q0(str3, new String[]{"="}, 0, 6);
                        mmr0Var = new mmr0((String) listQ1.get(0), (String) listQ1.get(1));
                    } else {
                        mmr0Var = null;
                    }
                    if (mmr0Var != null) {
                        arrayList.add(mmr0Var);
                    }
                }
                linkedHashMap = new LinkedHashMap(sqg0.T(arrayList));
            } else {
                linkedHashMap = new LinkedHashMap();
            }
            linkedHashMap.remove("utm_app_version");
            linkedHashMap.remove("utm_session_id");
            String strY0 = o7h.y0(linkedHashMap.entrySet(), "&", (String) null, (String) null, gq30.Z0, 30);
            String strConcat = "";
            String strConcat2 = strY0.equals("") ? "" : "?".concat(strY0);
            String fragment = uri.getFragment();
            if (fragment != null && !nhc1.Y(fragment, "id_token", false)) {
                strConcat = "#".concat(fragment);
            }
            m1l1VarN.u(uri.getScheme() + "://" + uri.getAuthority() + uri.getPath() + strConcat2 + strConcat);
        }
        VtecEvent vtecEvent = (VtecEvent) m1l1VarN.build();
        Objects.toString(vtecEvent);
        t2j0Var.a(vtecEvent);
    }

    public my30(String str, String str2, long j, yqg yqgVar, t2j0 t2j0Var, nfa0 nfa0Var) {
        this.b = str;
        this.c = str2;
        this.a = j;
        this.d = yqgVar;
        this.e = t2j0Var;
        this.f = nfa0Var;
        chc1 chc1Var = chc1.a;
        this.g = new nlc0(chc1Var, chc1Var);
    }
}
