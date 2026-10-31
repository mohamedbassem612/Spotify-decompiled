package p;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class h1d implements nzc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p1d b;

    public /* synthetic */ h1d(p1d p1dVar, byte b) {
        this.a = b;
        this.b = p1dVar;
    }

    public Object attachCompleter(mzc mzcVar) {
        byte b = this.a;
        p1d p1dVar = this.b;
        switch (b) {
            case 0:
                try {
                    ArrayList arrayList = new ArrayList(p1dVar.a.q().b().c);
                    arrayList.add((h3d) p1dVar.X0.f);
                    arrayList.add(new i1d(p1dVar, mzcVar));
                    p1dVar.b.a.l(p1dVar.i.a, p1dVar.c, kqn1.o(arrayList));
                    return "configAndCloseTask";
                } catch (CameraAccessExceptionCompat | SecurityException e) {
                    p1dVar.t("Unable to open camera for configAndClose: " + e.getMessage());
                    mzcVar.c(e);
                    return "configAndCloseTask";
                }
            default:
                try {
                    p1dVar.c.execute(new ny2(p1dVar, mzcVar, (byte) 22));
                    return "isMeteringRepeatingAttached";
                } catch (RejectedExecutionException unused) {
                    mzcVar.c(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
                    return "isMeteringRepeatingAttached";
                }
        }
    }
}
