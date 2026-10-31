package p;

import android.content.Intent;
import java.util.LinkedList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z0r0 implements hvn0 {
    public final /* synthetic */ p410 a;

    public z0r0(p410 p410Var) {
        this.a = p410Var;
    }

    @Override // p.hvn0
    public final void a() {
        p410 p410Var = this.a;
        LinkedList linkedList = (LinkedList) p410Var.f;
        if (linkedList.isEmpty()) {
            return;
        }
        for (Intent intent = (Intent) linkedList.poll(); intent != null; intent = (Intent) linkedList.poll()) {
            jvn0 jvn0Var = (jvn0) p410Var.h;
            ozp0 ozp0Var = new ozp0(p410Var, intent, (byte) 14);
            th61 th61Var = jvn0Var.d;
            if (th61Var != null) {
                ozp0Var.invoke(th61Var);
            }
        }
    }
}
