package p;

import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class hay {
    static {
        qs10.c("EnqueueRunnable");
    }

    public static void a(nvl1 nvl1Var) {
        awl1 awl1Var = nvl1Var.a;
        if (nvl1.b(nvl1Var, new HashSet())) {
            bhn0.u("WorkContinuation has cycles (", nvl1Var, ")");
            return;
        }
        WorkDatabase workDatabase = awl1Var.c;
        btk btkVar = awl1Var.b;
        workDatabase.c();
        try {
            y7y0.r(workDatabase, btkVar, nvl1Var);
            boolean zB = b(nvl1Var);
            workDatabase.s();
            workDatabase.o();
            if (zB) {
                om41.b(btkVar, awl1Var.c, awl1Var.e);
            }
        } catch (Throwable th) {
            workDatabase.o();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:92:0x0191  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.List] */
    public static boolean b(nvl1 nvl1Var) {
        boolean zB;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        List list;
        boolean z6;
        boolean z7;
        List<nvl1> list2 = nvl1Var.g;
        if (list2 != null) {
            zB = false;
            for (nvl1 nvl1Var2 : list2) {
                if (nvl1Var2.h) {
                    qs10 qs10VarA = qs10.a();
                    TextUtils.join(", ", nvl1Var2.e);
                    qs10VarA.getClass();
                } else {
                    zB |= b(nvl1Var2);
                }
            }
        } else {
            zB = false;
        }
        HashSet hashSetC = nvl1.c(nvl1Var);
        awl1 awl1Var = nvl1Var.a;
        List list3 = nvl1Var.d;
        String[] strArr = (String[]) hashSetC.toArray(new String[0]);
        String str = nvl1Var.b;
        int i = nvl1Var.c;
        ytw0 ytw0Var = awl1Var.b.d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase = awl1Var.c;
        boolean z8 = strArr != null && strArr.length > 0;
        wvl1 wvl1Var = wvl1.c;
        wvl1 wvl1Var2 = wvl1.f;
        wvl1 wvl1Var3 = wvl1.d;
        if (z8) {
            int length = strArr.length;
            int i2 = 0;
            z = false;
            z2 = false;
            z3 = true;
            while (true) {
                if (i2 < length) {
                    int i3 = length;
                    z4 = zB;
                    vwl1 vwl1VarD = workDatabase.A().d(strArr[i2]);
                    if (vwl1VarD == null) {
                        qs10.a().getClass();
                    } else {
                        wvl1 wvl1Var4 = vwl1VarD.b;
                        z3 &= wvl1Var4 == wvl1Var;
                        if (wvl1Var4 == wvl1Var3) {
                            z2 = true;
                        } else if (wvl1Var4 == wvl1Var2) {
                            z = true;
                        }
                        i2++;
                        length = i3;
                        zB = z4;
                    }
                }
                z7 = false;
                nvl1Var.h = true;
                return z4 | z7;
            }
        }
        z = false;
        z2 = false;
        z3 = true;
        z4 = zB;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        wvl1 wvl1Var5 = wvl1.a;
        if (zIsEmpty || z8) {
            z5 = zIsEmpty;
            list = list3;
            z6 = false;
        } else {
            List<twl1> listE = workDatabase.A().e(str);
            if (listE.isEmpty()) {
                z5 = zIsEmpty;
                list = list3;
            } else {
                z5 = zIsEmpty;
                list = list3;
                int i4 = 4;
                if (i == 3 || i == 4) {
                    yct yctVarU = workDatabase.u();
                    ?? arrayList = new ArrayList();
                    for (twl1 twl1Var : listE) {
                        if (!yctVarU.b(twl1Var.a)) {
                            wvl1 wvl1Var6 = twl1Var.b;
                            z3 &= wvl1Var6 == wvl1Var;
                            if (wvl1Var6 == wvl1Var3) {
                                z2 = true;
                            } else if (wvl1Var6 == wvl1Var2) {
                                z = true;
                            }
                            arrayList.add(twl1Var.a);
                        }
                        i4 = 4;
                    }
                    if (i == i4 && (z || z2)) {
                        dxl1 dxl1VarA = workDatabase.A();
                        Iterator it = dxl1VarA.e(str).iterator();
                        while (it.hasNext()) {
                            qyo1.x(dxl1VarA.a, false, true, new jfa(((twl1) it.next()).a, (byte) 28));
                        }
                        arrayList = Collections.EMPTY_LIST;
                        z = false;
                        z2 = false;
                    }
                    strArr = (String[]) arrayList.toArray(strArr);
                    z8 = strArr.length > 0;
                } else {
                    if (i == 2) {
                        Iterator it2 = listE.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                wvl1 wvl1Var7 = ((twl1) it2.next()).b;
                                if (wvl1Var7 == wvl1Var5 || wvl1Var7 == wvl1.b) {
                                    z7 = false;
                                    nvl1Var.h = true;
                                    return z4 | z7;
                                }
                            }
                        }
                    }
                    bzn1.s(str, awl1Var);
                    dxl1 dxl1VarA2 = workDatabase.A();
                    Iterator it3 = listE.iterator();
                    while (it3.hasNext()) {
                        qyo1.x(dxl1VarA2.a, false, true, new jfa(((twl1) it3.next()).a, (byte) 28));
                    }
                    z6 = true;
                }
            }
            z6 = false;
        }
        Iterator it4 = list.iterator();
        boolean z9 = z6;
        while (it4.hasNext()) {
            rwl1 rwl1Var = (rwl1) it4.next();
            vwl1 vwl1Var = rwl1Var.b;
            UUID uuid = rwl1Var.a;
            if (!z8 || z3) {
                vwl1Var.n = jCurrentTimeMillis;
            } else if (z2) {
                vwl1Var.b = wvl1Var3;
            } else if (z) {
                vwl1Var.b = wvl1Var2;
            } else {
                vwl1Var.b = wvl1.e;
            }
            if (vwl1Var.b == wvl1Var5) {
                z9 = true;
            }
            dxl1 dxl1VarA3 = workDatabase.A();
            wvl1 wvl1Var8 = wvl1Var5;
            Iterator it5 = it4;
            boolean z10 = z9;
            qyo1.x(dxl1VarA3.a, false, true, new cxl1(dxl1VarA3, y7y0.T(vwl1Var), (byte) 1));
            if (z8) {
                for (String str2 : strArr) {
                    workDatabase.u().c(new vct(uuid.toString(), str2));
                }
            }
            workDatabase.B().b(uuid.toString(), rwl1Var.c);
            if (!z5) {
                workDatabase.y().a(new fwl1(str, uuid.toString()));
            }
            wvl1Var5 = wvl1Var8;
            it4 = it5;
            z9 = z10;
        }
        z7 = z9;
        nvl1Var.h = true;
        return z4 | z7;
    }
}
