package p;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tvo1 implements ovo1 {
    public final ArrayList a;

    public tvo1(Context context, kvo1 kvo1Var) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        kvo1Var.getClass();
        arrayList.add(new kwo1(context, kvo1Var));
    }

    @Override // p.ovo1
    public final void a(zxl1 zxl1Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ovo1) it.next()).a(zxl1Var);
        }
    }
}
