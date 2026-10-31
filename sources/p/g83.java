package p;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g83 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x83 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g83(x83 x83Var, byte b) {
        super(0);
        this.a = b;
        this.b = x83Var;
    }

    public final Object invoke() {
        byte b = this.a;
        x83 x83Var = this.b;
        switch (b) {
            case 0:
                return gm50.n((Map) x83Var.j.getValue(), x83Var.m.a(), x83Var.k.b(), true);
            case 1:
                return gm50.n((Map) x83Var.j.getValue(), x83Var.m.a(), x83Var.k.b(), true);
            default:
                return new tgm((String) null, false, false, false, false, false, false, (yh10) null, false, false, x83Var.m.a().k.contains(abz0.c) ? 1 : 2, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, false, false, -7169, 1);
        }
    }
}
