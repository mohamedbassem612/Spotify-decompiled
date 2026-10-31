package p;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rsy extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ xtb0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rsy(c380 c380Var, xtb0 xtb0Var, byte b) {
        super(0);
        this.a = b;
        this.b = c380Var;
        this.c = xtb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    public final Object invoke() {
        qtb0 qtb0Var;
        byte b = this.a;
        boolean z = true;
        xtb0 xtb0Var = this.c;
        c380 c380Var = this.b;
        switch (b) {
            case 0:
                if (c380Var.size() <= 1 || ((qtb0Var = (qtb0) o7h.C0(xtb0Var.h().l)) != null && qtb0Var.a == c380Var.size() - 1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                i25 i25Var = xtb0Var.e;
                if (c380Var.size() <= 1 || (((err0) i25Var.b).s() <= 0 && ((err0) i25Var.c).s() <= 0)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                if (!c380Var.isEmpty()) {
                    if (c380Var.isEmpty()) {
                        z = false;
                    } else {
                        Iterator it = c380Var.iterator();
                        while (it.hasNext()) {
                            if (!(((cwl) it.next()) instanceof ivl)) {
                                if (xtb0Var.h().l.isEmpty()) {
                                    z = false;
                                }
                            }
                        }
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
