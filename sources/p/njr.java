package p;

import com.spotify.libs.connect.events.proto.BLEDeviceDiscoverySnapshot;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class njr {
    public static final SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX", Locale.US);
    public final xir a;
    public final uya b;
    public final g0l c;
    public final t2j0 d;
    public final ni9 e;
    public final q8n f;
    public yya g;
    public long h;
    public llm i;

    public njr(xir xirVar, uya uyaVar, g0l g0lVar, t2j0 t2j0Var, dgb dgbVar, ni9 ni9Var, q8n q8nVar) {
        this.a = xirVar;
        this.b = uyaVar;
        this.c = g0lVar;
        this.d = t2j0Var;
        this.e = ni9Var;
        this.f = q8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:28:0x0126  */
    /* JADX WARN: Code duplicated, block: B:38:0x012d A[SYNTHETIC] */
    public final rih1 a(int i, List list) {
        String str;
        String id;
        ci9 ci9VarN;
        mmr0 mmr0Var;
        if (!list.isEmpty()) {
            Map map = (Map) this.b.a().getValue();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                nya nyaVar = (nya) entry.getValue();
                String strA = nyaVar.a.a();
                linkedHashMap.put(strA, nyaVar.a);
                linkedHashMap2.put(strA, str2);
            }
            yya yyaVarG = dgb.g(list, linkedHashMap, linkedHashMap2, i);
            yya yyaVar = this.g;
            if (yyaVar != null && ((ArrayList) yyaVar.a()).size() == ((ArrayList) yyaVarG.a()).size()) {
                List listA1 = o7h.a1(yyaVar.a(), new p0d((byte) 23));
                List listA2 = o7h.a1(yyaVarG.a(), new p0d((byte) 24));
                int iIntValue = ((Number) this.e.n.b()).intValue();
                ArrayList arrayListV1 = o7h.v1(listA1, listA2);
                if (!arrayListV1.isEmpty()) {
                    Iterator it = arrayListV1.iterator();
                    do {
                        if (it.hasNext()) {
                            mmr0Var = (mmr0) it.next();
                        }
                    } while (((zya) mmr0Var.a).g((zya) mmr0Var.b, iIntValue));
                    this.g = yyaVarG;
                    str = j.format(new Date());
                    id = TimeZone.getDefault().getID();
                    for (zya zyaVar : (ArrayList) yyaVarG.a()) {
                        ci9VarN = BLEDeviceDiscoverySnapshot.n();
                        ci9VarN.x(yyaVarG.c());
                        ci9VarN.n(zyaVar.a());
                        ci9VarN.s(zyaVar.d());
                        ci9VarN.w(zyaVar.f());
                        ci9VarN.u(zyaVar.e());
                        ci9VarN.q(zyaVar.b());
                        if (zyaVar.c() != null) {
                            ci9VarN.r(zyaVar.c());
                        }
                        ci9VarN.v(i3a.h(yyaVarG.b()));
                        ci9VarN.t(str);
                        ci9VarN.y(id);
                        BLEDeviceDiscoverySnapshot bLEDeviceDiscoverySnapshotBuild = ci9VarN.build();
                        bLEDeviceDiscoverySnapshotBuild.getClass();
                        this.d.a(bLEDeviceDiscoverySnapshotBuild);
                    }
                }
            } else {
                this.g = yyaVarG;
                str = j.format(new Date());
                id = TimeZone.getDefault().getID();
                while (r1.hasNext()) {
                    ci9VarN = BLEDeviceDiscoverySnapshot.n();
                    ci9VarN.x(yyaVarG.c());
                    ci9VarN.n(zyaVar.a());
                    ci9VarN.s(zyaVar.d());
                    ci9VarN.w(zyaVar.f());
                    ci9VarN.u(zyaVar.e());
                    ci9VarN.q(zyaVar.b());
                    if (zyaVar.c() != null) {
                        ci9VarN.r(zyaVar.c());
                    }
                    ci9VarN.v(i3a.h(yyaVarG.b()));
                    ci9VarN.t(str);
                    ci9VarN.y(id);
                    BLEDeviceDiscoverySnapshot bLEDeviceDiscoverySnapshotBuild2 = ci9VarN.build();
                    bLEDeviceDiscoverySnapshotBuild2.getClass();
                    this.d.a(bLEDeviceDiscoverySnapshotBuild2);
                }
            }
        }
        return rih1.a;
    }
}
