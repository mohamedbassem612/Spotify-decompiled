package p;

import com.spotify.mobius.MobiusLoop;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fas extends hab0 implements Function0 {
    public final /* synthetic */ gas a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fas(gas gasVar) {
        super(0);
        this.a = gasVar;
    }

    public final Object invoke() {
        MobiusLoop.Controller controller = this.a.c;
        if (controller != null) {
            return (ph20) controller.a();
        }
        return null;
    }
}
