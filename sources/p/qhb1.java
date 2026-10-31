package p;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qhb1 extends j0h1 {
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qhb1(Object obj, byte b) {
        this.c = b;
        this.d = obj;
    }

    @Override // p.j1h1
    public boolean a() {
        switch (this.c) {
            case 1:
                return false;
            default:
                return super.a();
        }
    }

    @Override // p.j1h1
    public boolean e() {
        switch (this.c) {
            case 1:
                return ((Map) this.d).isEmpty();
            default:
                return super.e();
        }
    }

    @Override // p.j0h1
    public final e1h1 g(h0h1 h0h1Var) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                if (((ArrayList) obj).contains(h0h1Var)) {
                    return o1h1.j((y0h1) h0h1Var.s());
                }
                return null;
            default:
                return (e1h1) ((Map) obj).get(h0h1Var);
        }
    }
}
