package p;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mia0 implements Function0 {
    public final /* synthetic */ byte a;
    public final oia0 b;

    public /* synthetic */ mia0(oia0 oia0Var, byte b) {
        this.a = b;
        this.b = oia0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        oia0 oia0Var = this.b;
        switch (b) {
            case 0:
                List listSingletonList = Collections.singletonList(cg5.a(oia0Var.a.e, "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", "", "WARNING"));
                return listSingletonList.isEmpty() ? rzs0.g : new hg5(listSingletonList, (byte) 0);
            default:
                return oia0Var.a.e.f();
        }
    }
}
