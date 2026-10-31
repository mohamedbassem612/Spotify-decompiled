package p;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class iev implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ iev(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                ((yjq) obj6).i((n3d) obj5, (n3d) obj4, (n3d1) obj3, (n3d1) obj2, (Map.Entry) obj);
                break;
            default:
                erw0 erw0Var = (erw0) obj5;
                iac0 iac0Var = (Activity) obj4;
                law0 law0Var = (law0) obj2;
                ((nt21) obj6).b = erw0Var;
                f5d f5dVar = new f5d(iac0Var);
                ((ViewGroup) obj3).addView(f5dVar, 0);
                law0Var.C(f5dVar.getSurfaceProvider());
                erw0Var.a(iac0Var, u4d.c, law0Var, (uq70) obj);
                break;
        }
    }
}
