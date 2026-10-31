package p;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class byn0 implements hvn0 {
    public final /* synthetic */ eyn0 a;

    public byn0(eyn0 eyn0Var) {
        this.a = eyn0Var;
    }

    public final void a() {
        boolean zIsEmpty;
        ArrayList arrayList;
        Intent intent;
        ggs0 ggs0Var = (ggs0) this.a.b;
        synchronized (ggs0Var.d) {
            zIsEmpty = ggs0Var.c.isEmpty();
        }
        if (zIsEmpty) {
            return;
        }
        eyn0 eyn0Var = this.a;
        ggs0 ggs0Var2 = (ggs0) eyn0Var.b;
        synchronized (ggs0Var2.d) {
            arrayList = new ArrayList(ggs0Var2.c);
        }
        Collection collectionQ = ((a44) eyn0Var.k).h() ? ((d520) eyn0Var.j).q(arrayList) : ((io60) eyn0Var.i).b(arrayList);
        ggs0 ggs0Var3 = (ggs0) eyn0Var.b;
        synchronized (ggs0Var3.d) {
            ggs0Var3.c.clear();
            ggs0Var3.c.addAll(collectionQ);
            ggs0Var3.T();
        }
        while (true) {
            ggs0 ggs0Var4 = (ggs0) this.a.b;
            synchronized (ggs0Var4.d) {
                Object objPoll = ggs0Var4.c.poll();
                ggs0Var4.T();
                intent = (Intent) objPoll;
            }
            if (intent == null) {
                return;
            }
            this.a.a(intent);
            ((o0g1) this.a.d).p(intent);
        }
    }
}
