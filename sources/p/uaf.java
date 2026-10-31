package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uaf extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p2f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uaf(p2f p2fVar, byte b) {
        super(1);
        this.a = b;
        this.b = p2fVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        p2f p2fVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return Boolean.valueOf(u890.j(((tom) obj).a, p2fVar.a));
            default:
                tom tomVar = (tom) obj;
                c8b1 c8b1Var = new c8b1(2);
                c8b1Var.b(tomVar.h.toArray(new gxz0[0]));
                c8b1Var.a(p2fVar.b);
                ArrayList arrayList = c8b1Var.a;
                return tom.a(tomVar, (w4i1) null, (upl) null, (rom) null, p7h.M(arrayList.toArray(new gxz0[arrayList.size()])), (List) null, (nom) null, false, 3967);
        }
    }
}
