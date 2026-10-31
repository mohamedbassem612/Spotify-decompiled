package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gng1 implements EventSource {
    public final k8g1 a;
    public final d0r b;
    public final tag1 c;
    public final boolean d;
    public final q8n e;

    public gng1(k8g1 k8g1Var, d0r d0rVar, tag1 tag1Var, boolean z, q8n q8nVar) {
        this.a = k8g1Var;
        this.b = d0rVar;
        this.c = tag1Var;
        this.d = z;
        this.e = q8nVar;
    }

    public static f901 b(k8g1 k8g1Var) {
        int i;
        String str = k8g1Var.b;
        qpe1 qpe1Var = k8g1Var.X;
        String str2 = k8g1Var.e;
        int i2 = k8g1Var.f;
        int i3 = k8g1Var.g;
        int i4 = k8g1Var.h;
        List list = k8g1Var.i;
        boolean z = k8g1Var.t;
        if (k8g1Var.Y && qpe1Var == qpe1.b) {
            i = 2;
        } else if (qpe1Var == qpe1.c) {
            i = 1;
        } else {
            i = qpe1Var == qpe1.d ? 4 : 3;
        }
        return new f901(str, str2, i2, i3, i4, list, z, i, k8g1Var.Z);
    }

    public final Disposable a(Consumer consumer) {
        if (!this.d) {
            return yu2.f;
        }
        o3r o3rVarO = w3p1.o(new l4r(pwc0.w, 1, zdg1.Y0, new j4r(zdg1.a1), zdg1.Z0), zdg1.b1);
        l811 l811Var = new l811();
        l811Var.a = true;
        mr20[] mr20VarArr = {hu20.e(this.c.b(this.a.a), new m53(l811Var, this, o3rVarO, (lnm) null, (byte) 15))};
        FlowEventSources.a.getClass();
        return new b(this.e, mr20VarArr).a(new v7i1(consumer, (byte) 1));
    }
}
