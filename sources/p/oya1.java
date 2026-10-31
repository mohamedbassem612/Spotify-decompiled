package p;

import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oya1 implements SplitInstallStateUpdatedListener {
    public final /* synthetic */ pya1 a;

    public oya1(pya1 pya1Var) {
        this.a = pya1Var;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener, p.sqb1
    public final void onStateUpdate(Object obj) {
        SplitInstallSessionState splitInstallSessionState = (SplitInstallSessionState) obj;
        if (this.a.d == splitInstallSessionState.sessionId()) {
            boolean zHasTerminalStatus = splitInstallSessionState.hasTerminalStatus();
            pya1 pya1Var = this.a;
            if (!zHasTerminalStatus) {
                c921.y(pya1Var.f, (o8n) null, 0, new nya1(pya1Var, splitInstallSessionState, (lnm) null, (byte) 0), 3);
                return;
            }
            synchronized (pya1Var.h) {
                pya1Var.c.unregisterListener(pya1Var.i);
                bpb1 bpb1Var = (wen0) o7h.p0(pya1Var.g.values());
                nhv nhvVarE = pya1.e(splitInstallSessionState);
                bpb1 bpb1Var2 = bpb1Var;
                bpb1Var2.getClass();
                bpb1Var2.m((Object) null, nhvVarE);
                LinkedHashMap linkedHashMap = pya1Var.g;
                linkedHashMap.remove(o7h.p0(linkedHashMap.keySet()));
                String str = (String) o7h.r0(pya1Var.g.keySet());
                if (str != null) {
                    pya1Var.c(str);
                }
            }
        }
    }
}
