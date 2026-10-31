package p;

import com.ravelin.core.model.ErrorMetadata;
import com.ravelin.core.model.Events;
import com.ravelin.core.model.Fingerprint;
import com.ravelin.core.model.Payload;
import com.ravelin.core.model.RavelinError;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ovz0 extends cvz0 {
    public final /* synthetic */ Payload b;
    public final /* synthetic */ pvz0 c;
    public final /* synthetic */ evz0 d;

    public ovz0(Payload payload, pvz0 pvz0Var, evz0 evz0Var) {
        this.b = payload;
        this.c = pvz0Var;
        this.d = evz0Var;
    }

    @Override // p.too1
    public final void n(RavelinError ravelinError) {
        this.c.e(ravelinError, new ErrorMetadata(101, "Tracking", "An error occurred while generating the fingerprint", (String) null, b0o1.b(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null), this.d);
    }

    @Override // p.too1
    public final void u(Object obj) {
        Payload payload = this.b;
        payload.lpt2((Fingerprint) obj);
        String str = pvz0.o;
        String str2 = "FingerPrint = " + payload.getAndroid();
        utw0 utw0Var = ike1.a;
        utw0Var.y(str);
        utw0Var.o(str2, new Object[0]);
        xdf0 xdf0Var = this.c.j;
        if (xdf0Var == null) {
            u890.C("fingerprintRequest");
            throw null;
        }
        ((i6n1) xdf0Var).d = new Events(new Payload[]{payload});
        ((i6n1) xdf0Var).e = null;
        ((i6n1) xdf0Var).f = "fingerprint";
        xdf0Var.b(this.d);
    }
}
