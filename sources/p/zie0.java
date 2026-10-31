package p;

import android.location.Location;
import java.util.function.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zie0 implements Consumer {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;

    public zie0(y16 y16Var) {
        this.b = y16Var;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Location location = (Location) obj;
                ohd ohdVar = (ohd) obj2;
                if (ohdVar.s() instanceof ago0) {
                    ohdVar.resumeWith(location != null ? new irt(location.getLatitude(), location.getLongitude(), location.getAccuracy(), location.getTime()) : null);
                    return;
                }
                return;
            default:
                if (obj != null) {
                    throw new ClassCastException();
                }
                ((y16) obj2).toString();
                throw null;
        }
    }

    public zie0(ohd ohdVar, aje0 aje0Var) {
        this.b = ohdVar;
    }
}
