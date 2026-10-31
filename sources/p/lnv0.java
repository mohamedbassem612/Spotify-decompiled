package p;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lnv0 {
    public final String a;
    public final ze3 b;
    public final iu30 c;
    public final c9n d;
    public final Object e = new Object();
    public volatile knv0 f;

    public lnv0(String str, ze3 ze3Var, iu30 iu30Var, c9n c9nVar) {
        this.a = str;
        this.b = ze3Var;
        this.c = iu30Var;
        this.d = c9nVar;
    }

    public final Object a(Object obj, mma0 mma0Var) {
        knv0 knv0Var;
        Context context = (Context) obj;
        knv0 knv0Var2 = this.f;
        if (knv0Var2 != null) {
            return knv0Var2;
        }
        synchronized (this.e) {
            try {
                if (this.f == null) {
                    Context applicationContext = context.getApplicationContext();
                    ekb ekbVar = this.b;
                    List list = (List) this.c.invoke(applicationContext);
                    c9n c9nVar = this.d;
                    wpu0 wpu0Var = new wpu0(applicationContext, this, (byte) 24);
                    mif1 mif1Var = mif1.o1;
                    isr0 isr0Var = new isr0(wpu0Var, (byte) 27);
                    if (ekbVar == null) {
                        ekbVar = new ekb((byte) 17);
                    }
                    this.f = new knv0(new h191(isr0Var, mif1Var, Collections.singletonList(new vdd(list, null, (byte) 1)), ekbVar, c9nVar));
                }
                knv0Var = this.f;
                knv0Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return knv0Var;
    }
}
