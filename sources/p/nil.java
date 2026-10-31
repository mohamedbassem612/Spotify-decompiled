package p;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nil implements lil, ky11 {
    public final xhl a;
    public Handler b;
    public final gw91 c = new gw91(new mil(this, (byte) 0));
    public boolean d = true;
    public final mil e = new mil(this, (byte) 1);
    public final ArrayList f = new ArrayList();

    public nil(xhl xhlVar) {
        this.a = xhlVar;
    }

    @Override // p.lil
    public final boolean a(List list) {
        if (this.d) {
            return true;
        }
        int size = list.size();
        ArrayList arrayList = this.f;
        if (size != arrayList.size()) {
            return true;
        }
        int size2 = list.size();
        for (int i = 0; i < size2; i++) {
            Object objG = ((afh0) list.get(i)).g();
            if (!u890.j(objG instanceof vhl ? (vhl) objG : null, arrayList.get(i))) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        this.c.e();
    }

    @Override // p.lil
    public final void c(ynb1 ynb1Var, List list) {
        this.f.clear();
        this.c.d(rih1.a, this.e, new d1c(list, this, ynb1Var, (byte) 29));
        this.d = false;
    }

    public final void h() {
        gw91 gw91Var = this.c;
        gw91Var.f();
        gw91Var.a();
    }

    public final void f() {
    }
}
