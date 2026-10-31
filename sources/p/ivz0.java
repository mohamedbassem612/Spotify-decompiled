package p;

import com.ravelin.core.model.ErrorMetadata;
import com.ravelin.core.model.RavelinError;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ivz0 extends cvz0 {
    public final /* synthetic */ pvz0 b;
    public final /* synthetic */ evz0 c;

    public ivz0(pvz0 pvz0Var, evz0 evz0Var) {
        this.b = pvz0Var;
        this.c = evz0Var;
    }

    @Override // p.too1
    public final void n(RavelinError ravelinError) {
        this.b.e(ravelinError, new ErrorMetadata(100, "Tracking", "An error occurred while generating the payload", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null), this.c);
    }
}
