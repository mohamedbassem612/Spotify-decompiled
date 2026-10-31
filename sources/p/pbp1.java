package p;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pbp1 implements mbp1 {
    public final ArrayList a;

    public pbp1(Context context, kbp1 kbp1Var) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        kbp1Var.getClass();
        arrayList.add(new pcp1(context, kbp1Var));
    }

    @Override // p.mbp1
    public final void a(jcp1 jcp1Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((mbp1) it.next()).a(jcp1Var);
        }
    }
}
