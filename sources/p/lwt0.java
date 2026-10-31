package p;

import android.app.Activity;
import com.spotify.player.model.PlayOrigin;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lwt0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s24 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lwt0(s24 s24Var, byte b) {
        super(0);
        this.a = b;
        this.b = s24Var;
    }

    public final Object invoke() {
        byte b = this.a;
        s24 s24Var = this.b;
        switch (b) {
            case 0:
                qbq qbqVar = (qbq) s24Var.c;
                iac0 iac0Var = (iac0) s24Var.h;
                teq teqVar = qbqVar.a.d;
                return new xqt0((y390) teqVar.o3.get(), (yh2) teqVar.f3.get(), new uip0((Activity) teqVar.f.a, (byte) 12), (x290) teqVar.q8.get(), iac0Var);
            default:
                return ((pp11) s24Var.e).a(((iac0) s24Var.h).getLifecycle(), false, false, (PlayOrigin) s24Var.t);
        }
    }
}
