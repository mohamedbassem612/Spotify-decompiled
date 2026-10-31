package p;

import android.content.Intent;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tjc1 implements rq21 {
    public final gjc1 a;

    public tjc1(gjc1 gjc1Var) {
        this.a = gjc1Var;
    }

    public final nq21 b(Intent intent) {
        String type;
        boolean z = (intent.getFlags() & 1048576) == 0 && u890.j(intent.getAction(), "android.intent.action.VIEW") && (type = intent.getType()) != null && nhc1.Y(type, "audio/", false);
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(intent.getDataString());
        if (z || s4b1VarX.c == blc0.ka || u890.j(s4b1VarX.E(), "spotify:playlist:37i9dQZEVXhds8kU6ckEgw")) {
            m9d0[] m9d0VarArr = {sc41.b};
            gjc1 gjc1Var = this.a;
            if (gjc1Var.a(m9d0VarArr)) {
                gjc1Var.c.getClass();
            }
        }
        return mq21.a;
    }
}
