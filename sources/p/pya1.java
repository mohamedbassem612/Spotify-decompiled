package p;

import com.google.android.gms.tasks.Task;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pya1 implements mya1 {
    public final q8n a;
    public final x15 b;
    public final SplitInstallManager c;
    public int d;
    public final llm f;
    public final LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap g = new LinkedHashMap();
    public final Object h = new Object();
    public final oya1 i = new oya1(this);

    public pya1(q8n q8nVar, x15 x15Var, nhc nhcVar, SplitInstallManager splitInstallManager) {
        this.a = q8nVar;
        this.b = x15Var;
        this.c = splitInstallManager;
        this.f = smo1.e(q8nVar);
    }

    public static nhv e(SplitInstallSessionState splitInstallSessionState) {
        int iStatus = splitInstallSessionState.status();
        if (iStatus == 0) {
            return jhv.e;
        }
        if (iStatus == 5) {
            return mhv.a;
        }
        if (iStatus == 6) {
            return new khv(String.valueOf(splitInstallSessionState.errorCode()));
        }
        if (iStatus != 7) {
            return iStatus != 8 ? new lhv(splitInstallSessionState.bytesDownloaded(), splitInstallSessionState.totalBytesToDownload()) : jhv.d;
        }
        return jhv.a;
    }

    @Override // p.mya1
    public final Set a() {
        Set<String> installedModules = this.c.getInstalledModules();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = installedModules.iterator();
        while (it.hasNext()) {
            ohv ohvVarT = t4n1.t((String) it.next());
            if (ohvVarT != null) {
                arrayList.add(ohvVarT);
            }
        }
        return o7h.p1(arrayList);
    }

    @Override // p.mya1
    public final mr20 b(ohv ohvVar) {
        m441 m441VarJ;
        synchronized (this.h) {
            wen0 wen0Var = (wen0) this.g.get(ohvVar.a);
            m441VarJ = wen0Var != null ? z4p1.J(wen0Var, new lag0()) : c(ohvVar.a);
        }
        return m441VarJ;
    }

    public final mr20 c(String str) {
        bpb1 bpb1VarB;
        if (this.c.getInstalledModules().contains(str)) {
            return h4p1.m(mhv.a);
        }
        synchronized (this.h) {
            if (((String) o7h.r0(this.g.keySet())) != null && !u890.j(o7h.r0(this.g.keySet()), str)) {
                bpb1 bpb1VarB2 = gio1.b(jhv.c);
                this.g.put(str, bpb1VarB2);
                return bpb1VarB2;
            }
            synchronized (this.h) {
                try {
                    bpb1VarB = (wen0) this.g.get(str);
                    if (bpb1VarB == null) {
                        bpb1VarB = gio1.b(jhv.e);
                    }
                    bpb1VarB.m((Object) null, jhv.e);
                    this.g.put(str, bpb1VarB);
                } catch (Throwable th) {
                    throw th;
                }
            }
            SplitInstallRequest splitInstallRequestBuild = SplitInstallRequest.newBuilder().addModule(str).build();
            this.c.registerListener(this.i);
            Task taskStartInstall = this.c.startInstall(splitInstallRequestBuild);
            h8q0 zb91Var = new zb91(this, str);
            hfp1 hfp1Var = (hfp1) taskStartInstall;
            hfp1Var.getClass();
            hfp1Var.d(dsd1.a, zb91Var);
            hfp1Var.m(new hp91(str, bpb1VarB, this, (byte) 11));
            return z4p1.J(bpb1VarB, new lag0());
        }
    }

    public final boolean d(String str) {
        LinkedHashMap linkedHashMap = this.e;
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            obj = 0;
        }
        linkedHashMap.put(str, Integer.valueOf(new AtomicInteger(((Number) obj).intValue()).incrementAndGet()));
        Integer num = (Integer) linkedHashMap.get(str);
        return num != null && num.intValue() == 1;
    }
}
