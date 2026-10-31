package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class oaf extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gxz0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oaf(gxz0 gxz0Var, byte b) {
        super(1);
        this.a = b;
        this.b = gxz0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        gxz0 gxz0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                tom tomVar = (tom) obj;
                ArrayList arrayList = new ArrayList(tomVar.h);
                arrayList.add(gxz0Var);
                return tom.a(tomVar, (w4i1) null, (upl) null, (rom) null, arrayList, (List) null, (nom) null, false, 3967);
            default:
                tom tomVar2 = (tom) obj;
                List list = tomVar2.h;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (!u890.j(((gxz0) obj2).a, gxz0Var.a)) {
                        arrayList2.add(obj2);
                    }
                }
                return tom.a(tomVar2, (w4i1) null, (upl) null, (rom) null, arrayList2, (List) null, (nom) null, false, 3967);
        }
    }
}
