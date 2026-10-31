package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uhq0 extends xiy0 {
    public uhq0(ghy0 ghy0Var, vyq0 vyq0Var, h661 h661Var) {
        super(ghy0Var, vyq0Var, h661Var);
        if (h661Var.d() != 1) {
            nkx0.o("Implementation of oneOf type ", h661Var.h(), " should contain only 1 element, but get ", h661Var.d());
            throw null;
        }
        List listF = h661Var.f(0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF) {
            if (obj instanceof zhy0) {
                arrayList.add(obj);
            }
        }
        if (((zhy0) o7h.X0(arrayList)) != null) {
            return;
        }
        bhn0.k("Implementation of oneOf type ", h661Var.h(), " should have @ProtoNumber annotation");
        throw null;
    }
}
