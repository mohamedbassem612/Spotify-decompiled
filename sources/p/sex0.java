package p;

import android.content.Context;
import android.os.ProfilingManager;
import android.os.ProfilingResult;
import android.os.ProfilingTrigger;
import com.spotify.base.java.logging.Logger;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sex0 {
    public static final int[] j = {2};
    public final Executor a;
    public final ro30 b;
    public final nit c;
    public final ProfilingManager d;
    public final gmt e;
    public final idd1 g;
    public boolean i;
    public final zy4 f = new zy4();
    public final rex0 h = new rex0(this, (byte) 0);

    public sex0(Context context, Executor executor, d2u d2uVar, y0u y0uVar, ro30 ro30Var, nit nitVar) {
        this.a = executor;
        this.b = ro30Var;
        this.c = nitVar;
        this.d = (ProfilingManager) context.getSystemService(ProfilingManager.class);
        this.e = new gmt(new t0r0(0, d2uVar, d2u.class, "getSessionHistory", "getSessionHistory()Ljava/util/List;", 0, (byte) 29));
        this.g = new idd1(new d4v0(context, y0uVar, this, (byte) 8));
    }

    public final void a() {
        if (this.i) {
            try {
                ProfilingManager profilingManager = this.d;
                if (profilingManager != null) {
                    profilingManager.unregisterForAllProfilingResults(this.h);
                }
            } catch (RuntimeException e) {
                Logger.e(e, "Failed to unregister Android profiling listener", new Object[0]);
            } finally {
                this.i = false;
            }
        }
    }

    public final void b() {
        ProfilingManager profilingManager = this.d;
        ro30 ro30Var = this.b;
        if (profilingManager == null) {
            ro30Var.t("Android profiling is unavailable because ProfilingManager is missing");
            return;
        }
        try {
            int[] iArr = j;
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(new ProfilingTrigger.Builder(iArr[0]).build());
            profilingManager.addProfilingTriggers(arrayList);
        } catch (RuntimeException e) {
            hg.i(profilingManager, ro30Var);
            ro30Var.t("Failed to register ANR ProfilingManager trigger due to ".concat(e.getClass().getSimpleName()));
            Logger.e(e, "Failed to register Android profiling triggers", new Object[0]);
        }
    }

    public final void c(ProfilingResult profilingResult) {
        profilingResult.getTriggerType();
        profilingResult.getErrorCode();
        boolean zL = f46.L(j, profilingResult.getTriggerType());
        ro30 ro30Var = this.b;
        if (!zL) {
            ro30Var.t("Ignored Android profiling result with unsupported trigger type " + profilingResult.getTriggerType());
            profilingResult.getTriggerType();
            return;
        }
        if (profilingResult.getErrorCode() == 0) {
            String resultFilePath = profilingResult.getResultFilePath();
            if (resultFilePath == null) {
                ro30Var.t("Android profiling succeeded without a result file path");
                Logger.d("Android profiling succeeded without a result file path", new Object[0]);
                return;
            } else {
                ro30Var.t("Android profiling returned a result file path for intake");
                ((bz4) this.g.getValue()).a(new File(resultFilePath));
                return;
            }
        }
        int errorCode = profilingResult.getErrorCode();
        String errorMessage = profilingResult.getErrorMessage();
        String strConcat = errorMessage != null ? ": ".concat(errorMessage) : null;
        if (strConcat == null) {
            strConcat = "";
        }
        ro30Var.t("Android profiling failed with error code " + errorCode + strConcat);
        Logger.d("Android profiling failed with error code %d", new Object[]{Integer.valueOf(profilingResult.getErrorCode())});
    }

    public final void d() {
        bz4 bz4Var = (bz4) this.g.getValue();
        bz4Var.getClass();
        synchronized (bz4.h) {
            try {
                File[] fileArrListFiles = bz4Var.a.listFiles();
                if (fileArrListFiles == null) {
                    fileArrListFiles = new File[0];
                }
                for (File file : fileArrListFiles) {
                    if (new File(bz4Var.b, file.getName() + ".json").isFile()) {
                        bz4Var.g.t("Attempting to recover Android profile " + file.getName() + " from a previous process");
                        bz4Var.a(file);
                    } else if (file.isFile() && file.lastModified() < ((Number) bz4Var.f.invoke()).longValue() - 86400000) {
                        file.delete();
                    }
                }
                File[] fileArrListFiles2 = bz4Var.b.listFiles();
                if (fileArrListFiles2 == null) {
                    fileArrListFiles2 = new File[0];
                }
                for (File file2 : fileArrListFiles2) {
                    File file3 = new File(bz4Var.a, ihc1.J0(file2.getName(), ".json"));
                    if (nhc1.R(file2.getName(), ".tmp", false) || (nhc1.R(file2.getName(), ".json", false) && !file3.exists())) {
                        file2.delete();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        if (this.i) {
            return;
        }
        ProfilingManager profilingManager = this.d;
        ro30 ro30Var = this.b;
        if (profilingManager == null) {
            Logger.d("Android profiling is unavailable because ProfilingManager is missing", new Object[0]);
            ro30Var.t("Android profiling is unavailable because ProfilingManager is missing");
            return;
        }
        try {
            profilingManager.registerForAllProfilingResults(this.a, this.h);
            this.i = true;
            ro30Var.t("Registered Android profiling listener");
        } catch (RuntimeException e) {
            ro30Var.t("Failed to register Android profiling listener due to ".concat(e.getClass().getSimpleName()));
            Logger.e(e, "Failed to register Android profiling listener", new Object[0]);
        }
    }
}
