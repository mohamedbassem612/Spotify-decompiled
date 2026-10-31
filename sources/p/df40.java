package p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class df40 extends xe40 implements u2j0 {
    public m220 b = m220.c;
    public boolean c;

    public final void e(ef40 ef40Var) {
        ig91 ig91Var;
        if (!this.c) {
            this.b = this.b.clone();
            this.c = true;
        }
        m220 m220Var = this.b;
        m220 m220Var2 = ef40Var.a;
        m220Var.getClass();
        int i = 0;
        while (true) {
            int size = m220Var2.a.b.size();
            ig91Var = m220Var2.a;
            if (i >= size) {
                break;
            }
            m220Var.g((Map.Entry) ig91Var.b.get(i));
            i++;
        }
        Iterator it = ig91Var.c().iterator();
        while (it.hasNext()) {
            m220Var.g((Map.Entry) it.next());
        }
    }
}
