package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vgr implements j0x {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public vgr(c5r c5rVar, dyb0 dyb0Var, nsm0 nsm0Var) {
        int i;
        k5s0 aalVar;
        int i2 = c5rVar.g;
        g1d1 g1d1Var = c5rVar.c;
        String str = c5rVar.b;
        z341 z341Var = c5rVar.p;
        this.c = c5rVar;
        this.d = dyb0Var;
        z6x z6xVar = c5rVar.e;
        this.e = z6xVar == null ? z6x.a : z6xVar;
        h1d1 h1d1VarB = null;
        boolean z = false;
        if (z341Var != null) {
            this.g = null;
            byte b = 8;
            if (z341Var.c()) {
                aalVar = new k5s0(new ic9(this, z341Var, z, b), str == null ? ":memory:" : str, nsm0Var);
            } else if (str == null) {
                aalVar = new aal(new ic9(this, z341Var, z, b));
            } else {
                ic9 ic9Var = new ic9(this, z341Var, z, b);
                int iC = l1d.C(i2);
                if (iC == 1) {
                    i = 1;
                } else {
                    if (iC != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + fd21.q(i2) + '\'').toString());
                    }
                    i = 4;
                }
                int iC2 = l1d.C(i2);
                if (iC2 != 1 && iC2 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + fd21.q(i2) + '\'').toString());
                }
                aalVar = new aal(ic9Var, str, i);
            }
            this.f = aalVar;
        } else {
            if (g1d1Var == null) {
                hhg1.n("SQLiteManager was constructed with both null driver and open helper factory!");
                throw null;
            }
            h1d1VarB = g1d1Var.b(new uqs(c5rVar.a, str, new up20(this, dyb0Var.a), false, false));
            this.g = h1d1VarB;
            this.f = new k5s0(new zb91(h1d1VarB, (byte) 11), str == null ? ":memory:" : str, nsm0Var);
        }
        z = i2 == 3;
        if (h1d1VarB != null) {
            h1d1VarB.setWriteAheadLoggingEnabled(z);
        }
    }

    public static void d(StringBuilder sb, Map map, kx10 kx10Var, Set set) {
        set.add(kx10Var);
        String str = (String) map.get(kx10Var);
        if (str != null) {
            sb.append(kx10Var.a + ": " + str);
            sb.append('\n');
        }
    }

    public static void k(y341 y341Var) {
        d441 d441VarG1 = y341Var.g1("PRAGMA busy_timeout");
        try {
            d441VarG1.f1();
            long j = d441VarG1.getLong(0);
            o0c.v(d441VarG1, (Throwable) null);
            if (j < 3000) {
                qxy0.s(y341Var, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                o0c.v(d441VarG1, th);
                throw th2;
            }
        }
    }

    public static String p(Map map, boolean z) {
        if (map.isEmpty()) {
            return "";
        }
        if (!z) {
            return o7h.y0(map.entrySet(), "\n", (String) null, (String) null, zs10.Q0, 30);
        }
        kx10 kx10Var = kx10.PROPERTY_USERNAME;
        String str = (String) map.get(kx10Var);
        String str2 = str != null ? str : "";
        kx10 kx10Var2 = kx10.PROPERTY_IS_EMPLOYEE;
        boolean zJ = u890.j(map.get(kx10Var2), "true");
        Set setW0 = dm61.w0(new kx10[]{kx10Var, kx10Var2});
        StringBuilder sb = new StringBuilder();
        sb.append("----\n*Reporter Contact:*\n");
        sb.append("Username: ".concat(str2));
        sb.append("\n\n----\n*Device & App Info:*\nPlatform: Android\n");
        d(sb, map, kx10.PROPERTY_MODEL, setW0);
        d(sb, map, kx10.PROPERTY_BRAND, setW0);
        d(sb, map, kx10.PROPERTY_MANUFACTURER, setW0);
        d(sb, map, kx10.PROPERTY_ANDROID_VERSION, setW0);
        d(sb, map, kx10.PROPERTY_VERSION, setW0);
        d(sb, map, kx10.PROPERTY_BUILD_PACKAGE, setW0);
        d(sb, map, kx10.PROPERTY_BUILD_VARIANT, setW0);
        d(sb, map, kx10.PROPERTY_SCREEN_RESOLUTION, setW0);
        d(sb, map, kx10.PROPERTY_ORIENTATION, setW0);
        d(sb, map, kx10.PROPERTY_LOCALE, setW0);
        d(sb, map, kx10.PROPERTY_FONT_SCALE, setW0);
        d(sb, map, kx10.PROPERTY_CONNECTIVITY_TYPE, setW0);
        d(sb, map, kx10.PROPERTY_WI_FI_SUPPLICANT_STATE, setW0);
        d(sb, map, kx10.PROPERTY_MOBILE_DATA_ENABLED, setW0);
        sb.append('\n');
        sb.append("----");
        sb.append('\n');
        sb.append("*Identifiers:*");
        sb.append('\n');
        d(sb, map, kx10.PROPERTY_PARTNER_ID, setW0);
        kx10 kx10Var3 = kx10.PROPERTY_USER_ID;
        if (zJ) {
            d(sb, map, kx10Var3, setW0);
        } else {
            setW0.add(kx10Var3);
        }
        sb.append("Employee: " + zJ);
        sb.append('\n');
        sb.append('\n');
        sb.append("----");
        sb.append('\n');
        d(sb, map, kx10.PROPERTY_LOCAL_TIME, setW0);
        d(sb, map, kx10.PROPERTY_TIMEZONE, setW0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!setW0.contains((kx10) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (!linkedHashMap.isEmpty()) {
            sb.append('\n');
            sb.append("----");
            sb.append('\n');
            sb.append("*Other:*");
            sb.append('\n');
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                kx10 kx10Var4 = (kx10) entry2.getKey();
                sb.append(kx10Var4.a + ": " + ((String) entry2.getValue()));
                sb.append('\n');
            }
        }
        return ihc1.e1(sb.toString()).toString();
    }

    /* JADX WARN: Code duplicated, block: B:120:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:? A[LOOP:4: B:9:0x0025->B:124:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    /* JADX WARN: Code duplicated, block: B:18:0x003e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d9  */
    public void A(y341 y341Var, int i, int i2) {
        z6x z6xVar;
        LinkedHashMap linkedHashMap;
        TreeMap treeMap;
        mmr0 mmr0Var;
        Iterator it;
        boolean z;
        int iIntValue;
        TreeMap treeMap2;
        boolean z2;
        dyb0 dyb0Var = (dyb0) this.d;
        c5r c5rVar = (c5r) this.c;
        abg abgVar = c5rVar.d;
        if (i == i2) {
            z6xVar = z6x.a;
        } else {
            boolean z3 = i2 > i;
            z6x arrayList = new ArrayList();
            int i3 = i;
            while (true) {
                if (z3) {
                    if (i3 < i2) {
                        linkedHashMap = abgVar.a;
                        if (z3) {
                            treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                            if (treeMap2 == null) {
                                mmr0Var = null;
                            } else {
                                mmr0Var = new mmr0(treeMap2, treeMap2.descendingKeySet());
                            }
                        } else {
                            treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                            if (treeMap == null) {
                                mmr0Var = null;
                            } else {
                                mmr0Var = new mmr0(treeMap, treeMap.keySet());
                            }
                        }
                        if (mmr0Var == null) {
                            Map map = (Map) mmr0Var.a;
                            it = ((Iterable) mmr0Var.b).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    z = false;
                                    break;
                                }
                                iIntValue = ((Number) it.next()).intValue();
                                if (!z3) {
                                    if (i2 <= iIntValue && iIntValue < i3) {
                                        Object obj = map.get(Integer.valueOf(iIntValue));
                                        obj.getClass();
                                        arrayList.add(obj);
                                        z = true;
                                        i3 = iIntValue;
                                        break;
                                        break;
                                    }
                                } else if (i3 + 1 <= iIntValue && iIntValue <= i2) {
                                    Object obj2 = map.get(Integer.valueOf(iIntValue));
                                    obj2.getClass();
                                    arrayList.add(obj2);
                                    z = true;
                                    i3 = iIntValue;
                                    break;
                                }
                            }
                            if (!z) {
                            }
                        }
                        z6xVar = null;
                    } else {
                        z6xVar = arrayList;
                    }
                } else if (i3 > i2) {
                    linkedHashMap = abgVar.a;
                    if (z3) {
                        treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                        if (treeMap2 == null) {
                            mmr0Var = null;
                        } else {
                            mmr0Var = new mmr0(treeMap2, treeMap2.descendingKeySet());
                        }
                    } else {
                        treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                        if (treeMap == null) {
                            mmr0Var = null;
                        } else {
                            mmr0Var = new mmr0(treeMap, treeMap.keySet());
                        }
                    }
                    if (mmr0Var == null) {
                        Map map2 = (Map) mmr0Var.a;
                        it = ((Iterable) mmr0Var.b).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z = false;
                                break;
                                break;
                            }
                            iIntValue = ((Number) it.next()).intValue();
                            if (!z3) {
                                if (i3 + 1 <= iIntValue) {
                                    continue;
                                }
                            } else if (i2 <= iIntValue) {
                                continue;
                            }
                        }
                        if (!z) {
                        }
                    }
                    z6xVar = null;
                } else {
                    z6xVar = arrayList;
                }
            }
        }
        if (z6xVar != null) {
            dyb0Var.w(y341Var);
            Iterator it2 = ((Iterable) z6xVar).iterator();
            while (it2.hasNext()) {
                ((trj0) it2.next()).b(y341Var);
            }
            nql nqlVarX = dyb0Var.x(y341Var);
            if (!nqlVarX.c) {
                bhn0.B(nqlVarX.b, "Migration didn't properly handle: ");
                return;
            } else {
                dyb0Var.v();
                D(y341Var);
                return;
            }
        }
        if (i <= i2 || !c5rVar.k) {
            Set set = c5rVar.l;
            if (!c5rVar.j || (set != null && set.contains(Integer.valueOf(i)))) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        if (z2) {
            throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (c5rVar.o) {
            d441 d441VarG1 = y341Var.g1("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                smc0 smc0VarN = k4p1.n();
                while (d441VarG1.f1()) {
                    String strP0 = d441VarG1.P0(0);
                    if (!nhc1.Y(strP0, "sqlite_", false) && !strP0.equals("android_metadata")) {
                        smc0VarN.add(new mmr0(strP0, Boolean.valueOf(u890.j(d441VarG1.P0(1), "view"))));
                    }
                }
                smc0 smc0VarK = k4p1.k(smc0VarN);
                o0c.v(d441VarG1, (Throwable) null);
                rmc0 rmc0VarListIterator = smc0VarK.listIterator(0);
                while (true) {
                    rmc0 rmc0Var = rmc0VarListIterator;
                    if (!rmc0Var.hasNext()) {
                        break;
                    }
                    mmr0 mmr0Var2 = (mmr0) rmc0Var.next();
                    String str = (String) mmr0Var2.a;
                    if (((Boolean) mmr0Var2.b).booleanValue()) {
                        qxy0.s(y341Var, "DROP VIEW IF EXISTS `" + str + '`');
                    } else {
                        qxy0.s(y341Var, "DROP TABLE IF EXISTS `" + str + '`');
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    o0c.v(d441VarG1, th);
                    throw th2;
                }
            }
        } else {
            dyb0Var.c(y341Var);
        }
        Iterator it3 = ((List) this.e).iterator();
        while (it3.hasNext()) {
            ((cn31) it3.next()).getClass();
        }
        dyb0Var.a(y341Var);
    }

    public void B(y341 y341Var) throws Throwable {
        rih1 m231Var;
        dyb0 dyb0Var = (dyb0) this.d;
        String str = (String) dyb0Var.b;
        d441 d441VarG1 = y341Var.g1("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            boolean z = d441VarG1.f1() && d441VarG1.getLong(0) != 0;
            o0c.v(d441VarG1, (Throwable) null);
            if (z) {
                d441 d441VarG2 = y341Var.g1("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                try {
                    String strP0 = d441VarG2.f1() ? d441VarG2.P0(0) : null;
                    o0c.v(d441VarG2, (Throwable) null);
                    if (!str.equals(strP0) && !((String) dyb0Var.c).equals(strP0)) {
                        nkx0.p("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: ", str, ", found: ", strP0);
                        return;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        o0c.v(d441VarG2, th);
                        throw th2;
                    }
                }
            } else {
                qxy0.s(y341Var, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    nql nqlVarX = dyb0Var.x(y341Var);
                    if (!nqlVarX.c) {
                        throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + nqlVarX.b).toString());
                    }
                    dyb0Var.v();
                    D(y341Var);
                    m231Var = rih1.a;
                    if (!(m231Var instanceof m231)) {
                        qxy0.s(y341Var, "END TRANSACTION");
                    }
                    Throwable thA = e331.a(m231Var);
                    if (thA != null) {
                        qxy0.s(y341Var, "ROLLBACK TRANSACTION");
                        throw thA;
                    }
                } catch (Throwable th3) {
                    m231Var = new m231(th3);
                }
            }
            dyb0Var.u(y341Var);
            for (cn31 cn31Var : (List) this.e) {
                cn31Var.getClass();
                if (y341Var instanceof f1d1) {
                    cn31Var.a(((f1d1) y341Var).a);
                }
            }
            this.a = true;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                o0c.v(d441VarG1, th4);
                throw th5;
            }
        }
    }

    public void C(vda vdaVar) {
        this.f = vdaVar;
    }

    public void D(y341 y341Var) {
        qxy0.s(y341Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        qxy0.s(y341Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) ((dyb0) this.d).b) + "')");
    }

    public Object E(boolean z, vu30 vu30Var, onm onmVar) {
        return ((x9l) this.f).W(z, vu30Var, onmVar);
    }

    @Override // p.j0x
    public mr20 a(qrd1 qrd1Var) {
        return rqt0.u(new ht20(z4p1.J(new m441(new rzu(this, qrd1Var, (lnm) null, (byte) 8)), new n0x(3, null, (byte) 1)), new qjr(2, (lnm) null, (byte) 20)));
    }

    @Override // p.j0x
    public rm0 b(int i) {
        return new rm0(new s0x(this, null, (byte) 0), ((h0x) this.c).c(i == 2, new ett(this, (lnm) null, (byte) 11)));
    }

    public void e(zct zctVar, int i, ArrayList arrayList, dz31 dz31Var) {
        s6j1 s6j1Var = zctVar.d;
        dz31 dz31Var2 = ((xpl1) s6j1Var).c;
        zct zctVar2 = ((xpl1) s6j1Var).i;
        zct zctVar3 = ((xpl1) s6j1Var).h;
        if (dz31Var2 == null) {
            djl djlVar = (djl) this.c;
            if (s6j1Var == ((cjl) djlVar).d || s6j1Var == ((cjl) djlVar).e) {
                return;
            }
            if (dz31Var == null) {
                dz31Var = new dz31();
                dz31Var.a = null;
                dz31Var.b = new ArrayList();
                dz31Var.a = s6j1Var;
                arrayList.add(dz31Var);
            }
            ((xpl1) s6j1Var).c = dz31Var;
            dz31Var.b.add(s6j1Var);
            for (xct xctVar : zctVar3.k) {
                if (xctVar instanceof zct) {
                    e((zct) xctVar, i, arrayList, dz31Var);
                }
            }
            for (xct xctVar2 : zctVar2.k) {
                if (xctVar2 instanceof zct) {
                    e((zct) xctVar2, i, arrayList, dz31Var);
                }
            }
            if (i == 1 && (s6j1Var instanceof s6j1)) {
                for (xct xctVar3 : s6j1Var.k.k) {
                    if (xctVar3 instanceof zct) {
                        e((zct) xctVar3, i, arrayList, dz31Var);
                    }
                }
            }
            Iterator it = zctVar3.l.iterator();
            while (it.hasNext()) {
                e((zct) it.next(), i, arrayList, dz31Var);
            }
            Iterator it2 = zctVar2.l.iterator();
            while (it2.hasNext()) {
                e((zct) it2.next(), i, arrayList, dz31Var);
            }
            if (i == 1 && (s6j1Var instanceof s6j1)) {
                Iterator it3 = s6j1Var.k.l.iterator();
                while (it3.hasNext()) {
                    e((zct) it3.next(), i, arrayList, dz31Var);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0208  */
    public void f(djl djlVar) {
        int iM;
        bjl bjlVar;
        bjl bjlVar2;
        bjl bjlVar3;
        bjl bjlVar4;
        bjl bjlVar5;
        Iterator it = djlVar.u0.iterator();
        while (it.hasNext()) {
            cjl cjlVar = (cjl) it.next();
            bjl[] bjlVarArr = cjlVar.U;
            lhl[] lhlVarArr = cjlVar.R;
            lhl lhlVar = cjlVar.M;
            lhl lhlVar2 = cjlVar.K;
            lhl lhlVar3 = cjlVar.L;
            lhl lhlVar4 = cjlVar.J;
            bjl bjlVar6 = bjlVarArr[0];
            bjl bjlVar7 = bjlVarArr[1];
            if (cjlVar.i0 == 8) {
                cjlVar.a = true;
            } else {
                float f = cjlVar.x;
                bjl bjlVar8 = bjl.c;
                if (f < 1.0f && bjlVar6 == bjlVar8) {
                    cjlVar.s = 2;
                }
                float f2 = cjlVar.A;
                if (f2 < 1.0f && bjlVar7 == bjlVar8) {
                    cjlVar.t = 2;
                }
                float f3 = cjlVar.Y;
                bjl bjlVar9 = bjl.a;
                bjl bjlVar10 = bjl.b;
                Iterator it2 = it;
                if (f3 > 0.0f) {
                    if (bjlVar6 == bjlVar8 && (bjlVar7 == bjlVar10 || bjlVar7 == bjlVar9)) {
                        cjlVar.s = 3;
                    } else if (bjlVar7 == bjlVar8 && (bjlVar6 == bjlVar10 || bjlVar6 == bjlVar9)) {
                        cjlVar.t = 3;
                    } else if (bjlVar6 == bjlVar8 && bjlVar7 == bjlVar8) {
                        if (cjlVar.s == 0) {
                            cjlVar.s = 3;
                        }
                        if (cjlVar.t == 0) {
                            cjlVar.t = 3;
                        }
                    }
                }
                if (bjlVar6 == bjlVar8 && cjlVar.s == 1 && (lhlVar4.f == null || lhlVar3.f == null)) {
                    bjlVar6 = bjlVar10;
                }
                if (bjlVar7 == bjlVar8 && cjlVar.t == 1 && (lhlVar2.f == null || lhlVar.f == null)) {
                    bjlVar7 = bjlVar10;
                }
                ur60 ur60Var = cjlVar.d;
                ((xpl1) ur60Var).d = bjlVar6;
                int i = cjlVar.s;
                ((xpl1) ur60Var).a = i;
                s6j1 s6j1Var = cjlVar.e;
                ((xpl1) s6j1Var).d = bjlVar7;
                int i2 = cjlVar.t;
                ((xpl1) s6j1Var).a = i2;
                bjl bjlVar11 = bjl.d;
                if ((bjlVar6 == bjlVar11 || bjlVar6 == bjlVar9 || bjlVar6 == bjlVar10) && (bjlVar7 == bjlVar11 || bjlVar7 == bjlVar9 || bjlVar7 == bjlVar10)) {
                    int iS = cjlVar.s();
                    if (bjlVar6 == bjlVar11) {
                        iS = (djlVar.s() - lhlVar4.g) - lhlVar3.g;
                        bjlVar6 = bjlVar9;
                    }
                    int iM2 = cjlVar.m();
                    if (bjlVar7 == bjlVar11) {
                        iM = (djlVar.m() - lhlVar2.g) - lhlVar.g;
                        bjlVar = bjlVar9;
                    } else {
                        iM = iM2;
                        bjlVar = bjlVar7;
                    }
                    x(cjlVar, bjlVar6, iS, bjlVar, iM);
                    ((xpl1) cjlVar.d).e.d(cjlVar.s());
                    ((xpl1) cjlVar.e).e.d(cjlVar.m());
                    cjlVar.a = true;
                } else {
                    if (bjlVar6 != bjlVar8 || (bjlVar7 != bjlVar10 && bjlVar7 != bjlVar9)) {
                        bjlVar2 = bjlVar7;
                        bjlVar3 = bjlVar10;
                    } else if (i == 3) {
                        if (bjlVar7 == bjlVar10) {
                            x(cjlVar, bjlVar10, 0, bjlVar10, 0);
                        }
                        int iM3 = cjlVar.m();
                        x(cjlVar, bjlVar9, (int) ((iM3 * cjlVar.Y) + 0.5f), bjlVar9, iM3);
                        ((xpl1) cjlVar.d).e.d(cjlVar.s());
                        ((xpl1) cjlVar.e).e.d(cjlVar.m());
                        cjlVar.a = true;
                    } else if (i == 1) {
                        x(cjlVar, bjlVar10, 0, bjlVar7, 0);
                        ((xpl1) cjlVar.d).e.m = cjlVar.s();
                    } else {
                        bjlVar3 = bjlVar10;
                        if (i == 2) {
                            bjl bjlVar12 = ((cjl) djlVar).U[0];
                            if (bjlVar12 == bjlVar9 || bjlVar12 == bjlVar11) {
                                x(cjlVar, bjlVar9, (int) ((f * djlVar.s()) + 0.5f), bjlVar7, cjlVar.m());
                                ((xpl1) cjlVar.d).e.d(cjlVar.s());
                                ((xpl1) cjlVar.e).e.d(cjlVar.m());
                                cjlVar.a = true;
                            } else {
                                bjlVar2 = bjlVar7;
                            }
                        } else {
                            bjlVar2 = bjlVar7;
                            if (lhlVarArr[0].f == null || lhlVarArr[1].f == null) {
                                bjlVar9 = bjlVar9;
                                bjlVar9 = bjlVar9;
                                x(cjlVar, bjlVar3, 0, bjlVar2, 0);
                                ((xpl1) cjlVar.d).e.d(cjlVar.s());
                                ((xpl1) cjlVar.e).e.d(cjlVar.m());
                                cjlVar.a = true;
                            }
                        }
                    }
                    if (bjlVar2 != bjlVar8 || (bjlVar6 != bjlVar3 && bjlVar6 != bjlVar9)) {
                        bjlVar9 = bjlVar9;
                        bjlVar4 = bjlVar3;
                        bjlVar5 = bjlVar9;
                    } else if (i2 == 3) {
                        if (bjlVar6 == bjlVar3) {
                            x(cjlVar, bjlVar3, 0, bjlVar3, 0);
                        }
                        int iS2 = cjlVar.s();
                        float f4 = cjlVar.Y;
                        if (cjlVar.Z == -1) {
                            f4 = 1.0f / f4;
                        }
                        x(cjlVar, bjlVar9, iS2, bjlVar9, (int) ((iS2 * f4) + 0.5f));
                        ((xpl1) cjlVar.d).e.d(cjlVar.s());
                        ((xpl1) cjlVar.e).e.d(cjlVar.m());
                        cjlVar.a = true;
                    } else {
                        bjlVar4 = bjlVar3;
                        bjlVar5 = bjlVar9;
                        if (i2 == 1) {
                            x(cjlVar, bjlVar6, 0, bjlVar4, 0);
                            ((xpl1) cjlVar.e).e.m = cjlVar.m();
                        } else if (i2 == 2) {
                            bjl bjlVar13 = ((cjl) djlVar).U[1];
                            if (bjlVar13 == bjlVar5 || bjlVar13 == bjlVar11) {
                                x(cjlVar, bjlVar6, cjlVar.s(), bjlVar5, (int) ((f2 * djlVar.m()) + 0.5f));
                                ((xpl1) cjlVar.d).e.d(cjlVar.s());
                                ((xpl1) cjlVar.e).e.d(cjlVar.m());
                                cjlVar.a = true;
                            }
                        } else if (lhlVarArr[2].f == null || lhlVarArr[3].f == null) {
                            x(cjlVar, bjlVar4, 0, bjlVar2, 0);
                            ((xpl1) cjlVar.d).e.d(cjlVar.s());
                            ((xpl1) cjlVar.e).e.d(cjlVar.m());
                            cjlVar.a = true;
                        }
                    }
                    if (bjlVar6 == bjlVar8 && bjlVar2 == bjlVar8) {
                        if (i == 1 || i2 == 1) {
                            bjl bjlVar14 = bjlVar4;
                            x(cjlVar, bjlVar14, 0, bjlVar14, 0);
                            ((xpl1) cjlVar.d).e.m = cjlVar.s();
                            ((xpl1) cjlVar.e).e.m = cjlVar.m();
                        } else if (i2 == 2 && i == 2) {
                            bjl[] bjlVarArr2 = ((cjl) djlVar).U;
                            if (bjlVarArr2[0] == bjlVar5 && bjlVarArr2[1] == bjlVar5) {
                                x(cjlVar, bjlVar5, (int) ((f * djlVar.s()) + 0.5f), bjlVar5, (int) ((f2 * djlVar.m()) + 0.5f));
                                ((xpl1) cjlVar.d).e.d(cjlVar.s());
                                ((xpl1) cjlVar.e).e.d(cjlVar.m());
                                cjlVar.a = true;
                            }
                        }
                    }
                }
                it = it2;
            }
        }
    }

    public ygr g() {
        Context context = (Context) this.c;
        dm5.y(!this.b);
        this.b = true;
        if (((k9r) this.e) == null) {
            this.e = new k9r(new f18[0]);
        }
        r58 r58Var = (r58) this.g;
        sgr sgrVar = (sgr) this.h;
        if (r58Var == null) {
            if (sgrVar == null) {
                this.h = new sgr(context);
            }
            if (((pbo1) this.f) == null) {
                this.f = pbo1.T0;
            }
            yu3 yu3Var = new yu3(context);
            qp7 qp7Var = context != null ? null : (qp7) this.d;
            Context context2 = (Context) yu3Var.b;
            if (context2 == null) {
                yu3Var.e = qp7Var;
            }
            sgr sgrVar2 = (sgr) this.h;
            yu3Var.c = sgrVar2;
            yu3Var.d = (pbo1) this.f;
            if (sgrVar2 == null) {
                yu3Var.c = new sgr(context2);
            }
            this.g = new r58(yu3Var);
        } else {
            dm5.y(sgrVar == null);
            dm5.y(((pbo1) this.f) == null);
        }
        return new ygr(this);
    }

    public void h() {
        djl djlVar = (djl) this.c;
        ArrayList arrayList = (ArrayList) this.h;
        ArrayList<xpl1> arrayList2 = (ArrayList) this.e;
        arrayList2.clear();
        cjl cjlVar = (djl) this.d;
        cjlVar.d.f();
        cjlVar.e.f();
        arrayList2.add(cjlVar.d);
        arrayList2.add(cjlVar.e);
        HashSet hashSet = null;
        for (tq50 tq50Var : ((djl) cjlVar).u0) {
            if (tq50Var instanceof tq50) {
                uq50 uq50Var = new uq50(tq50Var);
                ((cjl) tq50Var).d.f();
                ((cjl) tq50Var).e.f();
                ((xpl1) uq50Var).f = tq50Var.y0;
                arrayList2.add(uq50Var);
            } else {
                if (tq50Var.z()) {
                    if (((cjl) tq50Var).b == null) {
                        ((cjl) tq50Var).b = new xbe(tq50Var, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(((cjl) tq50Var).b);
                } else {
                    arrayList2.add(((cjl) tq50Var).d);
                }
                if (tq50Var.A()) {
                    if (((cjl) tq50Var).c == null) {
                        ((cjl) tq50Var).c = new xbe(tq50Var, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(((cjl) tq50Var).c);
                } else {
                    arrayList2.add(((cjl) tq50Var).e);
                }
                if (tq50Var instanceof l660) {
                    arrayList2.add(new k660(tq50Var));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((xpl1) it.next()).f();
        }
        for (xpl1 xpl1Var : arrayList2) {
            if (xpl1Var.b != cjlVar) {
                xpl1Var.d();
            }
        }
        arrayList.clear();
        o(((cjl) djlVar).d, 0, arrayList);
        o(((cjl) djlVar).e, 1, arrayList);
        this.a = false;
    }

    public void i() throws Exception {
        ((x9l) this.f).close();
        h1d1 h1d1Var = (h1d1) this.g;
        if (h1d1Var != null) {
            h1d1Var.close();
        }
    }

    public int j(djl djlVar, int i) {
        ArrayList arrayList;
        int i2;
        long j;
        float f;
        long j2;
        ArrayList arrayList2 = (ArrayList) this.h;
        int size = arrayList2.size();
        long j3 = 0;
        int i3 = 0;
        long jMax = 0;
        while (i3 < size) {
            xbe xbeVar = ((dz31) arrayList2.get(i3)).a;
            if (!(xbeVar instanceof xbe) ? !(i != 0 ? (xbeVar instanceof s6j1) : (xbeVar instanceof ur60)) : ((xpl1) xbeVar).f != i) {
                zct zctVar = ((xpl1) (i == 0 ? ((cjl) djlVar).d : ((cjl) djlVar).e)).h;
                zct zctVar2 = ((xpl1) (i == 0 ? ((cjl) djlVar).d : ((cjl) djlVar).e)).i;
                zct zctVar3 = ((xpl1) xbeVar).h;
                zct zctVar4 = ((xpl1) xbeVar).i;
                boolean zContains = zctVar3.l.contains(zctVar);
                boolean zContains2 = zctVar4.l.contains(zctVar2);
                long j4 = xbeVar.j();
                if (zContains && zContains2) {
                    long jB = dz31.b(zctVar3, j3);
                    arrayList = arrayList2;
                    long jA = dz31.a(zctVar4, j3);
                    long j5 = jB - j4;
                    int i4 = zctVar4.f;
                    i2 = i3;
                    if (j5 >= (-i4)) {
                        j5 += (long) i4;
                    }
                    long j6 = zctVar3.f;
                    long j7 = ((-jA) - j4) - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    cjl cjlVar = ((xpl1) xbeVar).b;
                    if (i == 0) {
                        f = cjlVar.f0;
                    } else if (i == 1) {
                        f = cjlVar.g0;
                    } else {
                        cjlVar.getClass();
                        f = -1.0f;
                    }
                    if (f > 0.0f) {
                        j2 = (long) ((j5 / (1.0f - f)) + (j7 / f));
                    } else {
                        j2 = 0;
                    }
                    float f2 = j2;
                    j = (((long) zctVar3.f) + ((((long) ((f2 * f) + 0.5f)) + j4) + ((long) l1d.e(1.0f, f, f2, 0.5f)))) - ((long) zctVar4.f);
                } else {
                    arrayList = arrayList2;
                    i2 = i3;
                    if (zContains) {
                        j = Math.max(dz31.b(zctVar3, zctVar3.f), ((long) zctVar3.f) + j4);
                    } else if (zContains2) {
                        j = Math.max(-dz31.a(zctVar4, zctVar4.f), ((long) (-zctVar4.f)) + j4);
                    } else {
                        j = (xbeVar.j() + ((long) zctVar3.f)) - ((long) zctVar4.f);
                    }
                }
            } else {
                arrayList = arrayList2;
                j = j3;
                i2 = i3;
            }
            jMax = Math.max(jMax, j);
            i3 = i2 + 1;
            arrayList2 = arrayList;
            j3 = 0;
        }
        return (int) jMax;
    }

    public void l(y341 y341Var) throws Throwable {
        rih1 m231Var;
        int i = ((dyb0) this.d).a;
        k(y341Var);
        c5r c5rVar = (c5r) this.c;
        if (c5rVar.g == 3) {
            qxy0.s(y341Var, "PRAGMA journal_mode = WAL");
        } else {
            qxy0.s(y341Var, "PRAGMA journal_mode = TRUNCATE");
        }
        if (c5rVar.g == 3) {
            qxy0.s(y341Var, "PRAGMA synchronous = NORMAL");
        } else {
            qxy0.s(y341Var, "PRAGMA synchronous = FULL");
        }
        d441 d441VarG1 = y341Var.g1("PRAGMA user_version");
        try {
            d441VarG1.f1();
            int i2 = (int) d441VarG1.getLong(0);
            o0c.v(d441VarG1, (Throwable) null);
            if (i2 != i) {
                qxy0.s(y341Var, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i2 == 0) {
                        z(y341Var);
                    } else {
                        A(y341Var, i2, i);
                    }
                    qxy0.s(y341Var, "PRAGMA user_version = " + i);
                    m231Var = rih1.a;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                if (!(m231Var instanceof m231)) {
                    qxy0.s(y341Var, "END TRANSACTION");
                }
                Throwable thA = e331.a(m231Var);
                if (thA != null) {
                    qxy0.s(y341Var, "ROLLBACK TRANSACTION");
                    throw thA;
                }
            }
            B(y341Var);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                o0c.v(d441VarG1, th2);
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009d  */
    public boolean m(int i, boolean z) {
        boolean z2;
        bjl bjlVar;
        ArrayList<xpl1> arrayList = (ArrayList) this.e;
        cjl cjlVar = (djl) this.c;
        boolean z3 = false;
        bjl bjlVarL = cjlVar.l(0);
        bjl bjlVarL2 = cjlVar.l(1);
        int iT = cjlVar.t();
        int iU = cjlVar.u();
        bjl bjlVar2 = bjl.a;
        if (z && (bjlVarL == (bjlVar = bjl.b) || bjlVarL2 == bjlVar)) {
            for (xpl1 xpl1Var : arrayList) {
                if (xpl1Var.f == i && !xpl1Var.k()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && bjlVarL == bjlVar) {
                    cjlVar.P(bjlVar2);
                    cjlVar.T(j(cjlVar, 0));
                    ((xpl1) cjlVar.d).e.d(cjlVar.s());
                }
            } else if (z && bjlVarL2 == bjlVar) {
                cjlVar.R(bjlVar2);
                cjlVar.O(j(cjlVar, 1));
                ((xpl1) cjlVar.e).e.d(cjlVar.m());
            }
        }
        bjl[] bjlVarArr = cjlVar.U;
        bjl bjlVar3 = bjl.d;
        if (i == 0) {
            bjl bjlVar4 = bjlVarArr[0];
            if (bjlVar4 == bjlVar2 || bjlVar4 == bjlVar3) {
                int iS = cjlVar.s() + iT;
                ((xpl1) cjlVar.d).i.d(iS);
                ((xpl1) cjlVar.d).e.d(iS - iT);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            bjl bjlVar5 = bjlVarArr[1];
            if (bjlVar5 == bjlVar2 || bjlVar5 == bjlVar3) {
                int iM = cjlVar.m() + iU;
                ((xpl1) cjlVar.e).i.d(iM);
                ((xpl1) cjlVar.e).e.d(iM - iU);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        y();
        for (xpl1 xpl1Var2 : arrayList) {
            if (xpl1Var2.f == i && (xpl1Var2.b != cjlVar || xpl1Var2.g)) {
                xpl1Var2.e();
            }
        }
        for (xpl1 xpl1Var3 : arrayList) {
            if (xpl1Var3.f == i && (z2 || xpl1Var3.b != cjlVar)) {
                if (!xpl1Var3.h.j || !xpl1Var3.i.j || (!(xpl1Var3 instanceof xbe) && !((zct) xpl1Var3.e).j)) {
                    cjlVar.P(bjlVarL);
                    cjlVar.R(bjlVarL2);
                    return z3;
                }
            }
        }
        z3 = true;
        cjlVar.P(bjlVarL);
        cjlVar.R(bjlVarL2);
        return z3;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00ee A[Catch: CancellationException -> 0x0171, Exception -> 0x0173, TryCatch #2 {CancellationException -> 0x0171, Exception -> 0x0173, blocks: (B:16:0x0044, B:85:0x0164, B:21:0x0059, B:74:0x013b, B:76:0x0140, B:78:0x0146, B:80:0x014c, B:86:0x0169, B:87:0x0170, B:24:0x006c, B:56:0x00e8, B:58:0x00ee, B:61:0x00f4, B:63:0x00f8, B:65:0x010a, B:70:0x0114, B:27:0x0079, B:52:0x00cb, B:48:0x00ae), top: B:94:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f4 A[Catch: CancellationException -> 0x0171, Exception -> 0x0173, TryCatch #2 {CancellationException -> 0x0171, Exception -> 0x0173, blocks: (B:16:0x0044, B:85:0x0164, B:21:0x0059, B:74:0x013b, B:76:0x0140, B:78:0x0146, B:80:0x014c, B:86:0x0169, B:87:0x0170, B:24:0x006c, B:56:0x00e8, B:58:0x00ee, B:61:0x00f4, B:63:0x00f8, B:65:0x010a, B:70:0x0114, B:27:0x0079, B:52:0x00cb, B:48:0x00ae), top: B:94:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:69:0x0113  */
    /* JADX WARN: Code duplicated, block: B:72:0x0134  */
    /* JADX WARN: Code duplicated, block: B:73:0x0135  */
    /* JADX WARN: Code duplicated, block: B:76:0x0140 A[Catch: CancellationException -> 0x0171, Exception -> 0x0173, TryCatch #2 {CancellationException -> 0x0171, Exception -> 0x0173, blocks: (B:16:0x0044, B:85:0x0164, B:21:0x0059, B:74:0x013b, B:76:0x0140, B:78:0x0146, B:80:0x014c, B:86:0x0169, B:87:0x0170, B:24:0x006c, B:56:0x00e8, B:58:0x00ee, B:61:0x00f4, B:63:0x00f8, B:65:0x010a, B:70:0x0114, B:27:0x0079, B:52:0x00cb, B:48:0x00ae), top: B:94:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    public Object n(qrd1 qrd1Var, onm onmVar) {
        t0x t0xVar;
        boolean z;
        String str;
        ay0 ay0Var;
        int i;
        qrd1 qrd1Var2;
        int i2;
        pc91 pc91Var;
        oc91 oc91Var;
        List list;
        nu0 nu0Var;
        String str2;
        List list2;
        String str3;
        int i3;
        z6x z6xVar;
        rih1 rih1Var;
        qrd1 qrd1Var3;
        int i4;
        String str4;
        qrd1 qrd1Var4;
        List list3;
        ay0 ay0Var2;
        List list4;
        qrd1 qrd1Var5;
        qrd1 qrd1Var6 = qrd1Var;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.h;
        ay0 ay0Var3 = (ay0) this.d;
        if (onmVar instanceof t0x) {
            t0xVar = (t0x) onmVar;
            int i5 = t0xVar.h;
            if ((i5 & os00.INVALID_ID) != 0) {
                t0xVar.h = i5 - os00.INVALID_ID;
            } else {
                t0xVar = new t0x(this, onmVar);
            }
        } else {
            t0xVar = new t0x(this, onmVar);
        }
        t0x t0xVar2 = t0xVar;
        Object obj = t0xVar2.f;
        int i6 = t0xVar2.h;
        rih1 rih1Var2 = d9n.a;
        try {
            if (i6 == 0) {
                hm5.M(obj);
                if (this.a) {
                    if (this.b) {
                        return Boolean.FALSE;
                    }
                    if (t(qrd1Var)) {
                        return Boolean.TRUE;
                    }
                } else {
                    if (t(qrd1Var)) {
                        return Boolean.TRUE;
                    }
                    if (this.b) {
                        return Boolean.FALSE;
                    }
                }
                String str5 = (String) qrd1Var6.get("context");
                bpb1 bpb1Var = (bpb1) this.g;
                Boolean bool = Boolean.FALSE;
                t0xVar2.a = qrd1Var6;
                t0xVar2.b = str5;
                t0xVar2.c = ay0Var3;
                t0xVar2.e = 0;
                t0xVar2.h = 1;
                bpb1Var.emit(bool, t0xVar2);
                if (rih1.a != rih1Var2) {
                    str = str5;
                    ay0Var = ay0Var3;
                    i = 0;
                }
                return rih1Var2;
            }
            if (i6 == 1) {
                int i7 = t0xVar2.e;
                ay0Var = t0xVar2.c;
                str = t0xVar2.b;
                qrd1 qrd1Var7 = t0xVar2.a;
                hm5.M(obj);
                i = i7;
                qrd1Var6 = qrd1Var7;
            } else {
                if (i6 == 2) {
                    i2 = t0xVar2.e;
                    ay0Var = t0xVar2.c;
                    str = t0xVar2.b;
                    qrd1Var2 = t0xVar2.a;
                    hm5.M(obj);
                    pc91Var = (pc91) obj;
                    if (pc91Var instanceof oc91) {
                        oc91Var = (oc91) pc91Var;
                    } else {
                        oc91Var = null;
                    }
                    if (oc91Var != null) {
                        list = oc91Var.b;
                    } else {
                        list = null;
                    }
                    this.b = true;
                    nu0Var = (nu0) this.e;
                    str2 = ay0Var3.a.a;
                    list2 = list;
                    str3 = str;
                    if (list2 != null || list2.isEmpty()) {
                        i3 = 2;
                    } else {
                        i3 = 1;
                    }
                    z6xVar = z6x.a;
                    t0xVar2.a = qrd1Var2;
                    t0xVar2.b = null;
                    t0xVar2.c = ay0Var;
                    t0xVar2.d = list;
                    t0xVar2.e = i2;
                    t0xVar2.h = 3;
                    rih1Var = rih1Var2;
                    qrd1Var3 = qrd1Var2;
                    i4 = i3;
                    str4 = null;
                    if (nu0.a(nu0Var, str2, str3, i4, 1, z6xVar, t0xVar2) == rih1Var) {
                        return rih1Var;
                    }
                    ay0 ay0Var4 = ay0Var;
                    qrd1Var4 = qrd1Var3;
                    list3 = list;
                    ay0Var2 = ay0Var4;
                    list4 = list3;
                    if (list4 != null) {
                    }
                    throw new IllegalStateException("No ads available");
                }
                if (i6 == 3) {
                    int i8 = t0xVar2.e;
                    List list5 = t0xVar2.d;
                    ay0 ay0Var5 = t0xVar2.c;
                    qrd1Var4 = t0xVar2.a;
                    hm5.M(obj);
                    i2 = i8;
                    list3 = list5;
                    ay0Var2 = ay0Var5;
                    str4 = null;
                    rih1Var = rih1Var2;
                    list4 = list3;
                    if (list4 != null || list4.isEmpty()) {
                        throw new IllegalStateException("No ads available");
                    }
                    if (list3.size() == 1) {
                        t0xVar2.a = qrd1Var4;
                        t0xVar2.b = str4;
                        t0xVar2.c = str4;
                        t0xVar2.d = list3;
                        t0xVar2.e = i2;
                        t0xVar2.h = 4;
                        if (ay0Var2.e(t0xVar2) == rih1Var) {
                            return rih1Var;
                        }
                        qrd1Var5 = qrd1Var4;
                    }
                    linkedHashMap.put(qrd1Var4, list3);
                    z = true;
                    return Boolean.valueOf(z);
                }
                if (i6 != 4) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list3 = t0xVar2.d;
                qrd1Var5 = t0xVar2.a;
                hm5.M(obj);
            }
            qrd1Var4 = qrd1Var5;
            linkedHashMap.put(qrd1Var4, list3);
            z = true;
            return Boolean.valueOf(z);
            linkedHashMap.clear();
            t0xVar2.a = qrd1Var6;
            t0xVar2.b = str;
            t0xVar2.c = ay0Var;
            t0xVar2.e = i;
            t0xVar2.h = 2;
            ay0Var.getClass();
            Object objC = ay0.c(ay0Var, qrd1Var6, t0xVar2);
            if (objC == rih1Var2) {
                return rih1Var2;
            }
            qrd1Var2 = qrd1Var6;
            i2 = i;
            obj = objC;
            pc91Var = (pc91) obj;
            if (pc91Var instanceof oc91) {
                oc91Var = (oc91) pc91Var;
            } else {
                oc91Var = null;
            }
            if (oc91Var != null) {
                list = oc91Var.b;
            } else {
                list = null;
            }
            this.b = true;
            nu0Var = (nu0) this.e;
            str2 = ay0Var3.a.a;
            list2 = list;
            str3 = str;
            if (list2 != null) {
                i3 = 2;
            } else {
                i3 = 2;
            }
            z6xVar = z6x.a;
            t0xVar2.a = qrd1Var2;
            t0xVar2.b = null;
            t0xVar2.c = ay0Var;
            t0xVar2.d = list;
            t0xVar2.e = i2;
            t0xVar2.h = 3;
            rih1Var = rih1Var2;
            qrd1Var3 = qrd1Var2;
            i4 = i3;
            str4 = null;
            if (nu0.a(nu0Var, str2, str3, i4, 1, z6xVar, t0xVar2) == rih1Var) {
                return rih1Var;
            }
            ay0 ay0Var6 = ay0Var;
            qrd1Var4 = qrd1Var3;
            list3 = list;
            ay0Var2 = ay0Var6;
            list4 = list3;
            if (list4 != null) {
            }
            throw new IllegalStateException("No ads available");
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            z = false;
        }
    }

    public void o(xpl1 xpl1Var, int i, ArrayList arrayList) {
        zct zctVar = xpl1Var.h;
        zct zctVar2 = xpl1Var.i;
        for (xpl1 xpl1Var2 : zctVar.k) {
            if (xpl1Var2 instanceof zct) {
                e((zct) xpl1Var2, i, arrayList, null);
            } else if (xpl1Var2 instanceof xpl1) {
                e(xpl1Var2.h, i, arrayList, null);
            }
        }
        for (xpl1 xpl1Var3 : zctVar2.k) {
            if (xpl1Var3 instanceof zct) {
                e((zct) xpl1Var3, i, arrayList, null);
            } else if (xpl1Var3 instanceof xpl1) {
                e(xpl1Var3.i, i, arrayList, null);
            }
        }
        if (i == 1) {
            for (xct xctVar : ((s6j1) xpl1Var).k.k) {
                if (xctVar instanceof zct) {
                    e((zct) xctVar, i, arrayList, null);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object q(boolean z, onm onmVar) {
        mx10 mx10Var;
        wk21 wk21VarA;
        if (onmVar instanceof mx10) {
            mx10Var = (mx10) onmVar;
            int i = mx10Var.d;
            if ((i & os00.INVALID_ID) != 0) {
                mx10Var.d = i - os00.INVALID_ID;
            } else {
                mx10Var = new mx10(this, onmVar);
            }
        } else {
            mx10Var = new mx10(this, onmVar);
        }
        Object objA = mx10Var.b;
        int i2 = mx10Var.d;
        lnm lnmVar = null;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objA);
            mx10Var.a = z;
            mx10Var.d = 1;
            if (!this.a && z) {
                eg.m("Employee report logs are unavailable in external builds");
                return null;
            }
            yse0 yse0Var = (yse0) this.g;
            ham hamVar = (ham) ((g580) this.d).f.b;
            Set set = (Set) hamVar.b;
            ArrayList arrayList = new ArrayList();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                r7h.W(((wgn) it.next()).a(), arrayList);
            }
            Set<chn> set2 = (Set) hamVar.c;
            ArrayList<wk21> arrayList2 = new ArrayList();
            for (chn chnVar : set2) {
                if (chnVar instanceof ahn) {
                    ahn ahnVar = (ahn) chnVar;
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ahnVar.b((ugn) it2.next());
                    }
                    wk21VarA = chnVar.a();
                } else {
                    if (!(chnVar instanceof bhn)) {
                        eg.o();
                        return null;
                    }
                    wk21VarA = chnVar.a();
                }
                if (wk21VarA != null) {
                    arrayList2.add(wk21VarA);
                }
            }
            StringBuilder sb = new StringBuilder();
            ham.f(sb, "Table Of Contents", '=');
            for (wk21 wk21Var : arrayList2) {
                sb.append(wk21Var.a.concat(":"));
                sb.append('\n');
                sb.append("  ");
                sb.append(wk21Var.b);
                sb.append('\n');
            }
            for (wk21 wk21Var2 : arrayList2) {
                sb.append('\n');
                ham.f(sb, wk21Var2.a, '-');
                sb.append(wk21Var2.c);
            }
            objA = yse0Var.a(sb.toString());
            if (objA != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objA);
                return objA;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = mx10Var.a;
        hm5.M(objA);
        q8n q8nVar = (q8n) this.f;
        h210 h210Var = new h210(this, (String) objA, lnmVar, (byte) 6);
        mx10Var.a = z;
        mx10Var.d = 2;
        Object objY = fn31.Y(q8nVar, h210Var, mx10Var);
        return objY == obj ? obj : objY;
    }

    public h1d1 r() {
        return (h1d1) this.g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object s(String str, boolean z, boolean z2, onm onmVar) {
        nx10 nx10Var;
        if (onmVar instanceof nx10) {
            nx10Var = (nx10) onmVar;
            int i = nx10Var.c;
            if ((i & os00.INVALID_ID) != 0) {
                nx10Var.c = i - os00.INVALID_ID;
            } else {
                nx10Var = new nx10(this, onmVar);
            }
        } else {
            nx10Var = new nx10(this, onmVar);
        }
        Object objY = nx10Var.a;
        int i2 = nx10Var.c;
        if (i2 == 0) {
            hm5.M(objY);
            q8n q8nVar = (q8n) this.f;
            ox10 ox10Var = new ox10(this, z2, z, str, null);
            nx10Var.c = 1;
            objY = fn31.Y(q8nVar, ox10Var, nx10Var);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objY);
        }
        return ((e331) objY).a;
    }

    public boolean t(qrd1 qrd1Var) {
        List list = (List) ((LinkedHashMap) this.h).get(qrd1Var);
        return (list == null || !(list.isEmpty() ^ true) || ((Boolean) ((bpb1) this.g).getValue()).booleanValue()) ? false : true;
    }

    public void u() {
        this.a = true;
    }

    public void v() {
        this.b = true;
    }

    public boolean w() {
        sk30 sk30Var = (sk30) this.h;
        if (sk30Var != null) {
            return sk30Var.isOpen();
        }
        return false;
    }

    public void x(cjl cjlVar, bjl bjlVar, int i, bjl bjlVar2, int i2) {
        uda udaVar = (uda) this.g;
        udaVar.a = bjlVar;
        udaVar.b = bjlVar2;
        udaVar.c = i;
        udaVar.d = i2;
        ((vda) this.f).b(cjlVar, udaVar);
        cjlVar.T(udaVar.e);
        cjlVar.O(udaVar.f);
        cjlVar.F = udaVar.h;
        cjlVar.K(udaVar.g);
    }

    public void y() {
        vgr vgrVar;
        mda mdaVar;
        for (cjl cjlVar : ((djl) this.c).u0) {
            if (!cjlVar.a) {
                bjl[] bjlVarArr = cjlVar.U;
                boolean z = false;
                bjl bjlVar = bjlVarArr[0];
                bjl bjlVar2 = bjlVarArr[1];
                int i = cjlVar.s;
                int i2 = cjlVar.t;
                bjl bjlVar3 = bjl.c;
                bjl bjlVar4 = bjl.b;
                boolean z2 = bjlVar == bjlVar4 || (bjlVar == bjlVar3 && i == 1);
                if (bjlVar2 == bjlVar4 || (bjlVar2 == bjlVar3 && i2 == 1)) {
                    z = true;
                }
                d5u d5uVar = ((xpl1) cjlVar.d).e;
                boolean z3 = ((zct) d5uVar).j;
                d5u d5uVar2 = ((xpl1) cjlVar.e).e;
                boolean z4 = ((zct) d5uVar2).j;
                boolean z5 = z2;
                bjl bjlVar5 = bjl.a;
                if (z3 && z4) {
                    vgrVar = this;
                    vgrVar.x(cjlVar, bjlVar5, ((zct) d5uVar).g, bjlVar5, ((zct) d5uVar2).g);
                    cjlVar.a = true;
                } else if (z3 && z) {
                    vgrVar = this;
                    vgrVar.x(cjlVar, bjlVar5, ((zct) d5uVar).g, bjlVar4, ((zct) d5uVar2).g);
                    s6j1 s6j1Var = cjlVar.e;
                    if (bjlVar2 == bjlVar3) {
                        ((xpl1) s6j1Var).e.m = cjlVar.m();
                    } else {
                        ((xpl1) s6j1Var).e.d(cjlVar.m());
                        cjlVar.a = true;
                    }
                } else {
                    vgrVar = this;
                    if (z4 && z5) {
                        vgrVar.x(cjlVar, bjlVar4, ((zct) d5uVar).g, bjlVar5, ((zct) d5uVar2).g);
                        ur60 ur60Var = cjlVar.d;
                        if (bjlVar == bjlVar3) {
                            ((xpl1) ur60Var).e.m = cjlVar.s();
                        } else {
                            ((xpl1) ur60Var).e.d(cjlVar.s());
                            cjlVar.a = true;
                        }
                    }
                }
                if (cjlVar.a && (mdaVar = cjlVar.e.l) != null) {
                    mdaVar.d(cjlVar.c0);
                }
                this = vgrVar;
            }
        }
    }

    public void z(y341 y341Var) {
        dyb0 dyb0Var = (dyb0) this.d;
        d441 d441VarG1 = y341Var.g1("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (d441VarG1.f1() && d441VarG1.getLong(0) == 0) {
                z = true;
            }
            o0c.v(d441VarG1, (Throwable) null);
            dyb0Var.a(y341Var);
            if (!z) {
                nql nqlVarX = dyb0Var.x(y341Var);
                if (!nqlVarX.c) {
                    bhn0.B(nqlVarX.b, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            D(y341Var);
            dyb0Var.s();
            Iterator it = ((List) this.e).iterator();
            while (it.hasNext()) {
                ((cn31) it.next()).getClass();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                o0c.v(d441VarG1, th);
                throw th2;
            }
        }
    }

    public vgr(g0l g0lVar, Observable observable, v5u0 v5u0Var, Observable observable2, Scheduler scheduler, Scheduler scheduler2) {
        this.c = g0lVar;
        this.d = observable;
        this.e = v5u0Var;
        this.f = observable2;
        this.g = scheduler;
        this.h = scheduler2;
        this.b = true;
    }

    public vgr(g580 g580Var, xi61 xi61Var, q8n q8nVar, yse0 yse0Var, Context context, ov20 ov20Var, boolean z) {
        this.d = g580Var;
        this.e = xi61Var;
        this.f = q8nVar;
        this.g = yse0Var;
        this.c = context;
        this.h = ov20Var;
        this.a = z;
    }

    public vgr(h0x h0xVar, ay0 ay0Var, nu0 nu0Var, xn0 xn0Var, boolean z) {
        this.c = h0xVar;
        this.d = ay0Var;
        this.e = nu0Var;
        this.f = xn0Var;
        this.a = z;
        this.g = gio1.b(Boolean.FALSE);
        this.h = new LinkedHashMap();
    }

    public vgr(rsm rsmVar, su11 su11Var, e821 e821Var, ae5 ae5Var, t7y t7yVar, dt8 dt8Var, boolean z, boolean z2) {
        this.c = rsmVar;
        this.d = su11Var;
        this.e = e821Var;
        this.f = ae5Var;
        this.g = t7yVar;
        this.h = dt8Var;
        this.a = z;
        this.b = z2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.jgo0 */
    public vgr(c5r c5rVar, cix0 cix0Var, nsm0 nsm0Var) throws jgo0 {
        this.c = c5rVar;
        this.d = new ym31(-1, "", "");
        List list = c5rVar.e;
        List list2 = z6x.a;
        this.e = list == null ? list2 : list;
        waq0 waq0Var = new waq0(this, (byte) 8);
        o7h.O0(new zm31(waq0Var), list == null ? list2 : list);
        throw new jgo0();
    }

    public vgr(djl djlVar) {
        this.a = true;
        this.b = true;
        this.e = new ArrayList();
        new ArrayList();
        this.f = null;
        this.g = new uda();
        this.h = new ArrayList();
        this.c = djlVar;
        this.d = djlVar;
    }

    public vgr(Context context) {
        this.c = context;
        this.d = qp7.f;
    }
}
