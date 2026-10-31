package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u140 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w140 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u140(w140 w140Var, byte b) {
        super(1);
        this.a = b;
        this.b = w140Var;
    }

    public final Object invoke(Object obj) {
        List listM;
        byte b = this.a;
        w140 w140Var = this.b;
        switch (b) {
            case 0:
                n140 n140Var = (n140) obj;
                z040 z040Var = n140Var.d;
                String str = n140Var.a;
                if (z040Var instanceof y040) {
                    listM = Collections.singletonList(str);
                } else {
                    if (!(z040Var instanceof x040)) {
                        eg.o();
                        return null;
                    }
                    listM = p7h.M(new String[]{str, ((x040) z040Var).a.b});
                }
                return new ipr(yoi1.g(w140Var.a.d(listM)), w140Var, n140Var, (byte) 18);
            default:
                return w140Var.e((n140) obj, b7x.a);
        }
    }
}
