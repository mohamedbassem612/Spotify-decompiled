package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Action;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gna implements Action {
    public final /* synthetic */ hna a;
    public final /* synthetic */ int b;

    public gna(hna hnaVar, int i) {
        this.a = hnaVar;
        this.b = i;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a8 A[Catch: all -> 0x009c, Exception -> 0x009e, TRY_LEAVE, TryCatch #0 {Exception -> 0x009e, blocks: (B:19:0x0095, B:26:0x00a0, B:28:0x00a8), top: B:48:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x007a A[SYNTHETIC] */
    public final void run() throws Throwable {
        b7x b7xVar;
        gxu gxuVarA;
        rwu rwuVar;
        hna hnaVar = this.a;
        rma rmaVar = hnaVar.h;
        e8c0 e8c0Var = rmaVar.a().b;
        ytw0 ytw0Var = jfv.b;
        long jU = jfv.u(fdg1.k0(this.b, ngv.h), ngv.e);
        String str = e8c0Var.b;
        vna vnaVar = hnaVar.b;
        boolean z = rmaVar.a().B1 == ttp0.b;
        List<ctp0> list = (List) qyo1.x(vnaVar.a.u().a, true, false, new nrj0((byte) 22));
        if (list.isEmpty()) {
            b7xVar = b7x.a;
        } else {
            b7x linkedHashMap = new LinkedHashMap();
            for (ctp0 ctp0Var : list) {
                linkedHashMap.put(ctp0Var.a(), new b8c0(ctp0Var.b()));
            }
            b7xVar = linkedHashMap;
        }
        for (Map.Entry entry : b7xVar.entrySet()) {
            String str2 = (String) entry.getKey();
            b8c0 b8c0Var = (b8c0) entry.getValue();
            rwu rwuVar2 = null;
            if (z) {
                gxuVarA = hnaVar.a.a(str2);
                if (gxuVarA != null) {
                    rwuVar = (rwu) hnaVar.a(gxuVarA, str2).blockingGet();
                    if (!hnaVar.b(str2, rwuVar)) {
                    }
                    rwuVar2 = rwuVar;
                }
            } else {
                try {
                    try {
                        if (hnaVar.c(jU, b8c0Var, str)) {
                            gxuVarA = hnaVar.a.a(str2);
                            if (gxuVarA != null) {
                                rwuVar = (rwu) hnaVar.a(gxuVarA, str2).blockingGet();
                                try {
                                    if (!hnaVar.b(str2, rwuVar) && z) {
                                        vnaVar.a(str2);
                                    }
                                    rwuVar2 = rwuVar;
                                } catch (Exception e) {
                                    rwuVar2 = rwuVar;
                                    e = e;
                                    Logger.l(e, "Unable to refresh license", new Object[0]);
                                    if (rwuVar2 != null) {
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    rwuVar2 = rwuVar;
                                    if (rwuVar2 != null) {
                                        rwuVar2.a();
                                    }
                                    throw th;
                                }
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        Logger.l(e, "Unable to refresh license", new Object[0]);
                        if (rwuVar2 != null) {
                            rwuVar2.a();
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (rwuVar2 != null) {
                        rwuVar2.a();
                    }
                    throw th;
                }
            }
            if (rwuVar2 != null) {
                rwuVar2.a();
            }
        }
    }
}
