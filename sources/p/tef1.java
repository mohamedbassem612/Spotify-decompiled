package p;

import com.spotify.martini.martinidata.model.Mode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tef1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uef1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tef1(uef1 uef1Var, byte b) {
        super(0);
        this.a = b;
        this.b = uef1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        uef1 uef1Var = this.b;
        switch (b) {
            case 0:
                return uef1Var.d.a(nik1.z0, false, Mode.TOP_STORIES);
            default:
                return new evt0(uef1Var.c, uef1Var.b, uef1Var.h, uef1Var.g, uef1Var.i);
        }
    }
}
