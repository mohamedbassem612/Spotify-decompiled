package p;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f6b1 extends ojs {
    public final List e;
    public final boolean f;
    public final o5n g;
    public final boolean h;
    public final mge i;

    public f6b1(Context context, sr20 sr20Var, List list, boolean z, o5n o5nVar, boolean z2) {
        super(context);
        this.e = list;
        this.f = z;
        this.g = o5nVar;
        this.h = z2;
        this.i = sr20Var != null ? new mge(new l2a(sr20Var, (byte) 1)) : null;
    }

    @Override // p.ojs, p.rd21
    public final jca[] b(Handler handler, qwj1 qwj1Var, t38 t38Var, hbe1 hbe1Var, plj0 plj0Var) {
        return super.b(handler, qwj1Var, t38Var, hbe1Var, plj0Var);
    }

    @Override // p.ojs
    public final ygr c(Context context, boolean z) {
        List listN = p7h.N(this.i);
        List list = this.e;
        f18[] f18VarArr = (f18[]) o7h.N0(list, listN).toArray(new f18[0]);
        boolean zIsEmpty = list.isEmpty();
        boolean z2 = this.f;
        if (zIsEmpty) {
            return super.c(context, z2);
        }
        vgr vgrVar = new vgr(context);
        f18VarArr.getClass();
        vgrVar.e = new k9r(f18VarArr);
        vgrVar.a = z2;
        return vgrVar.g();
    }

    @Override // p.ojs
    public final void d(Context context, int i, Handler handler, qwj1 qwj1Var, long j, ArrayList arrayList) {
        kkh0 kkh0Var = new kkh0(context);
        kkh0Var.d = j;
        kkh0Var.e = this.h;
        kkh0Var.f = handler;
        kkh0Var.g = qwj1Var;
        kkh0Var.h = (byte) 50;
        kkh0Var.c = e();
        arrayList.add(new e6b1(kkh0Var));
    }

    @Override // p.ojs
    public final xjh0 e() {
        return new r2a1(this.g, this.b, (byte) 11);
    }
}
