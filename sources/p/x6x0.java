package p;

import com.spotify.mobius.Effects;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class x6x0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z6x0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x6x0(z6x0 z6x0Var, byte b) {
        super(0);
        this.a = b;
        this.b = z6x0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        z6x0 z6x0Var = this.b;
        switch (b) {
            case 0:
                return Effects.a(new q4x0[]{new q4x0(z6x0Var.a.a)});
            case 1:
                return Effects.a(new r4x0[]{new r4x0(z6x0Var.a.a)});
            default:
                boolean zJ = u890.j(z6x0Var.f, Boolean.TRUE);
                m3x0 m3x0Var = z6x0Var.a;
                return zJ ? Effects.a(new n4x0[]{new n4x0(m3x0Var.a, z6x0Var.g)}) : Effects.a(new x4x0[]{new x4x0(m3x0Var.a, z6x0Var.Z)});
        }
    }
}
