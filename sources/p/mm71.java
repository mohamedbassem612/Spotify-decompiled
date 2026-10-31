package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mm71 implements xpw {
    public final flw0 a;
    public final am71 b;
    public final u7h1 c;
    public final psw d;

    public mm71(nn61 nn61Var, c380 c380Var, wh71 wh71Var, hyl0 hyl0Var, flw0 flw0Var) {
        this.a = flw0Var;
        Iterator it = c380Var.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (((bb71) it.next()).a()) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i;
        ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
        Iterator it2 = c380Var.iterator();
        while (it2.hasNext()) {
            String str = ((bb71) it2.next()).a.c.c;
            if (str == null) {
                str = "";
            }
            arrayList.add(str);
        }
        this.b = new am71(i2, arrayList, (q8n) nn61Var.b, (flw0) nn61Var.c, wh71Var);
        this.c = eth.a0((vu30) null, new u451(hyl0Var, (byte) 22), 1);
        j2i j2iVar = new j2i(-348555360, new c771(this, (byte) 10), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.c;
    }

    public final jsw c() {
        return this.d;
    }

    public final mqw getBehavior() {
        return this.b;
    }
}
