package p;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sxl1 {
    public final vwl1 a;
    public final Context b;
    public final String c;
    public final dwl1 d;
    public final btk e;
    public final lsw0 f;
    public final WorkDatabase g;
    public final dxl1 h;
    public final yct i;
    public final ArrayList j;
    public final gaa0 k;

    public sxl1(k1i k1iVar) {
        vwl1 vwl1Var = (vwl1) k1iVar.e;
        this.a = vwl1Var;
        this.b = (Context) k1iVar.g;
        this.c = vwl1Var.a;
        this.d = (dwl1) k1iVar.b;
        this.e = (btk) k1iVar.a;
        this.f = (lsw0) k1iVar.c;
        WorkDatabase workDatabase = (WorkDatabase) k1iVar.d;
        this.g = workDatabase;
        this.h = workDatabase.A();
        this.i = workDatabase.u();
        ArrayList arrayList = (ArrayList) k1iVar.f;
        this.j = arrayList;
        o7h.y0(arrayList, ",", (String) null, (String) null, (iu30) null, 62);
        this.k = op71.f();
    }

    public final void a(int i) {
        dxl1 dxl1Var = this.h;
        wvl1 wvl1Var = wvl1.a;
        String str = this.c;
        dxl1Var.g(wvl1Var, str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        en31 en31Var = dxl1Var.a;
        qyo1.x(en31Var, false, true, new zwl1((byte) 1, jCurrentTimeMillis, str));
        qyo1.x(en31Var, false, true, new ydd1(str, this.a.v, (byte) 1));
        dxl1Var.f(-1L, str);
        dxl1Var.h(i, str);
    }

    public final void b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        dxl1 dxl1Var = this.h;
        en31 en31Var = dxl1Var.a;
        String str = this.c;
        qyo1.x(en31Var, false, true, new zwl1((byte) 1, jCurrentTimeMillis, str));
        dxl1Var.g(wvl1.a, str);
        en31 en31Var2 = dxl1Var.a;
        ((Number) qyo1.x(en31Var2, false, true, new jfa(str, (byte) 24))).intValue();
        qyo1.x(en31Var2, false, true, new ydd1(str, this.a.v, (byte) 1));
        qyo1.x(en31Var2, false, true, new jfa(str, (byte) 25));
        dxl1Var.f(-1L, str);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object c(onm onmVar) {
        rxl1 rxl1Var;
        ewq ewqVarA;
        btk btkVar = this.e;
        ixl1 ixl1Var = btkVar.e;
        if (onmVar instanceof rxl1) {
            rxl1Var = (rxl1) onmVar;
            int i = rxl1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rxl1Var.c = i - Integer.MIN_VALUE;
            } else {
                rxl1Var = new rxl1(this, onmVar);
            }
        } else {
            rxl1Var = new rxl1(this, onmVar);
        }
        rxl1 rxl1Var2 = rxl1Var;
        Object objH = rxl1Var2.a;
        int i2 = rxl1Var2.c;
        try {
            if (i2 == 0) {
                hm5.M(objH);
                boolean zN = vhc.n();
                vwl1 vwl1Var = this.a;
                String str = vwl1Var.x;
                if (zN && str != null) {
                    vhc.a(str, vwl1Var.hashCode());
                }
                Function0 ww21Var = new ww21(new mxl1(this, (byte) 0), (byte) 1);
                WorkDatabase workDatabase = this.g;
                if (((Boolean) workDatabase.r(ww21Var)).booleanValue()) {
                    return new pxl1();
                }
                boolean zC = vwl1Var.c();
                String str2 = this.c;
                if (zC) {
                    ewqVarA = vwl1Var.e;
                } else {
                    if (zj20.a(vwl1Var.d) == null) {
                        int i3 = txl1.a;
                        qs10.a().getClass();
                        return new nxl1();
                    }
                    ArrayList arrayListN0 = o7h.N0((List) qyo1.x(this.h.a, true, false, new jfa(str2, (byte) 26)), k4p1.x(vwl1Var.e));
                    cwq cwqVar = new cwq();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it = arrayListN0.iterator();
                    while (it.hasNext()) {
                        linkedHashMap.putAll(Collections.unmodifiableMap(((ewq) it.next()).a));
                    }
                    cwqVar.d(linkedHashMap);
                    ewqVarA = cwqVar.a();
                }
                UUID uuidFromString = UUID.fromString(str2);
                int i4 = vwl1Var.k;
                ExecutorService executorService = btkVar.a;
                fns fnsVar = btkVar.b;
                dwl1 dwl1Var = this.d;
                mwl1 mwl1Var = new mwl1(workDatabase, dwl1Var);
                tvl1 tvl1Var = new tvl1(workDatabase, this.f, dwl1Var);
                WorkerParameters workerParameters = new WorkerParameters();
                workerParameters.a = uuidFromString;
                workerParameters.b = ewqVarA;
                new HashSet(this.j);
                workerParameters.c = i4;
                workerParameters.d = executorService;
                workerParameters.e = fnsVar;
                workerParameters.f = dwl1Var;
                workerParameters.g = ixl1Var;
                workerParameters.h = mwl1Var;
                workerParameters.i = tvl1Var;
                try {
                    z8d0 z8d0VarB = ixl1Var.b(this.b, vwl1Var.c, workerParameters);
                    z8d0VarB.d = true;
                    faa0 faa0VarA = rxl1Var2.getContext().A(fkj0.W0);
                    faa0VarA.getClass();
                    faa0 faa0Var = faa0VarA;
                    faa0Var.L(new b15(z8d0VarB, zN, str, this, (byte) 1));
                    if (!((Boolean) workDatabase.r(new ww21(new mxl1(this, (byte) 1), (byte) 1))).booleanValue()) {
                        return new pxl1();
                    }
                    if (faa0Var.isCancelled()) {
                        return new pxl1();
                    }
                    q8n q8nVarQ = qgo1.q(dwl1Var.d);
                    xoh1 xoh1Var = new xoh1(this, z8d0VarB, tvl1Var, (lnm) null, (byte) 9);
                    rxl1Var2.c = 1;
                    objH = c921.H(q8nVarQ, xoh1Var, rxl1Var2);
                    d9n d9nVar = d9n.a;
                    if (objH == d9nVar) {
                        return d9nVar;
                    }
                } catch (Throwable unused) {
                    int i5 = txl1.a;
                    qs10.a().getClass();
                    return new nxl1();
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objH);
            }
            y8d0 y8d0Var = (y8d0) objH;
            y8d0Var.getClass();
            return new oxl1(y8d0Var);
        } catch (CancellationException e) {
            int i6 = txl1.a;
            qs10.a().getClass();
            throw e;
        } catch (Throwable unused2) {
            int i7 = txl1.a;
            qs10.a().getClass();
            return new nxl1();
        }
    }

    public final void d(y8d0 y8d0Var) {
        String str = this.c;
        ArrayList arrayListO = p7h.O(new String[]{str});
        while (true) {
            boolean zIsEmpty = arrayListO.isEmpty();
            dxl1 dxl1Var = this.h;
            if (zIsEmpty) {
                ewq ewqVarB = ((v8d0) y8d0Var).b();
                qyo1.x(dxl1Var.a, false, true, new ydd1(str, this.a.v, (byte) 1));
                qyo1.x(dxl1Var.a, false, true, new vae1(ewqVarB, str, (byte) 15));
                return;
            }
            String str2 = (String) r7h.d0(arrayListO);
            if (dxl1Var.c(str2) != wvl1.f) {
                dxl1Var.g(wvl1.d, str2);
            }
            arrayListO.addAll(this.i.a(str2));
        }
    }
}
