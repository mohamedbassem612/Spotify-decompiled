package p;

import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wy91 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xy91 b;
    public final /* synthetic */ qy91 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wy91(xy91 xy91Var, qy91 qy91Var, byte b) {
        super(0);
        this.a = b;
        this.b = xy91Var;
        this.c = qy91Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qy91 qy91Var = this.c;
        xy91 xy91Var = this.b;
        switch (b) {
            case 0:
                int i = xy91.j;
                xy91Var.g.z((Integer) null, qy91Var.d, qy91Var.f, qy91Var.g, qy91Var.h, new wy91(xy91Var, qy91Var, (byte) 1), gr81.O0);
                break;
            default:
                g2z g2zVar = xy91Var.f;
                String str = qy91Var.e;
                String str2 = qy91Var.h;
                Set set = s4b1.f;
                g2zVar.A(str, 2131960511, new xvy(g2zVar, str2, uic.x(str).s(), (byte) 10), new vn30(g2zVar, null, (byte) 2));
                break;
        }
        return rih1Var;
    }
}
