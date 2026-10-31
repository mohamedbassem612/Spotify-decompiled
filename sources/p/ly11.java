package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class ly11 implements Function0 {
    public final /* synthetic */ id41 a;
    public final /* synthetic */ cf41 b;
    public final /* synthetic */ nd41 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object[] f;

    public /* synthetic */ ly11(id41 id41Var, cf41 cf41Var, nd41 nd41Var, String str, Object obj, Object[] objArr) {
        this.a = id41Var;
        this.b = cf41Var;
        this.c = nd41Var;
        this.d = str;
        this.e = obj;
        this.f = objArr;
    }

    public final Object invoke() {
        boolean z;
        id41 id41Var = this.a;
        nd41 nd41Var = id41Var.b;
        nd41 nd41Var2 = this.c;
        boolean z2 = true;
        if (nd41Var != nd41Var2) {
            id41Var.b = nd41Var2;
            z = true;
        } else {
            z = false;
        }
        String str = id41Var.c;
        String str2 = this.d;
        if (u890.j(str, str2)) {
            z2 = z;
        } else {
            id41Var.c = str2;
        }
        id41Var.a = this.b;
        id41Var.d = this.e;
        id41Var.e = this.f;
        md41 md41Var = id41Var.f;
        if (md41Var != null && z2) {
            md41Var.unregister();
            id41Var.f = null;
            id41Var.a();
        }
        return rih1.a;
    }
}
