package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class raf extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d3f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ raf(d3f d3fVar, byte b) {
        super(1);
        this.a = b;
        this.b = d3fVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        d3f d3fVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return Boolean.valueOf(u890.j(((tom) obj).a, d3fVar.a));
            default:
                tom tomVar = (tom) obj;
                List list = tomVar.h;
                String str = d3fVar.b.a;
                List<gxz0> list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                for (gxz0 gxz0VarA : list2) {
                    if (u890.j(gxz0VarA.a, str)) {
                        gxz0VarA = gxz0.a(gxz0VarA, (w4i1) null, 15);
                    }
                    arrayList.add(gxz0VarA);
                }
                return tom.a(tomVar, (w4i1) null, (upl) null, (rom) null, arrayList, (List) null, (nom) null, false, 3967);
        }
    }
}
