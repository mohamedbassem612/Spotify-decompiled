package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xr1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c380 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xr1(c380 c380Var, byte b) {
        super(1);
        this.a = b;
        this.b = c380Var;
    }

    public final Object invoke(Object obj) {
        Object next;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c380 c380Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                String str = (String) obj;
                Iterator it = c380Var.iterator();
                while (it.hasNext()) {
                    next = it.next();
                    ot1 ot1Var = (ot1) next;
                    if (!ihc1.y0(str) && !ihc1.y0(ot1Var.c) && nhc1.R(str, ot1Var.c, false)) {
                        return (ot1) next;
                    }
                }
                next = null;
                return (ot1) next;
            case 1:
                b261.k((e261) obj, new d4h(c380Var.size(), 1));
                return rih1Var;
            case 2:
                b261.k((e261) obj, new d4h(1, c380Var.size()));
                return rih1Var;
            case 3:
                int iIntValue = ((Number) obj).intValue();
                h5f h5fVar = (h5f) o7h.t0(iIntValue, c380Var);
                return h5fVar == null ? Integer.valueOf(iIntValue) : h5fVar;
            case 4:
                b261.k((e261) obj, new d4h(c380Var.size(), 1));
                return rih1Var;
            case 5:
                return (c380) c380Var.get(((Number) obj).intValue());
            case 6:
                return (c380) c380Var.get(((Number) obj).intValue());
            case 7:
                b261.l((e261) obj, new f4h(0, c380Var.size()));
                return rih1Var;
            case 8:
                int iIntValue2 = ((Number) obj).intValue();
                return iIntValue2 == 0 ? ((y5c1) c380Var.get(0)).a : f4i1.c(iIntValue2, "column_");
            default:
                int iIntValue3 = ((Number) obj).intValue();
                return iIntValue3 + "-" + ((qhi1) c380Var.get(iIntValue3)).c;
        }
    }
}
