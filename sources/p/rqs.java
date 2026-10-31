package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rqs extends gda {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yq91 b;
    public final /* synthetic */ cu91 c;

    public /* synthetic */ rqs(cu91 cu91Var, yq91 yq91Var, byte b) {
        this.a = b;
        this.c = cu91Var;
        this.b = yq91Var;
    }

    public final void a(kda kdaVar, int i) {
        byte b = this.a;
        yq91 yq91Var = this.b;
        uqs uqsVar = this.c;
        switch (b) {
            case 0:
                xq91 xq91Var = ((er91) uqsVar.d).h;
                if (xq91Var != null) {
                    xq91Var.b();
                }
                ArrayList arrayList = ((kda) yq91Var).l;
                if (arrayList != null) {
                    arrayList.remove(this);
                    break;
                }
                break;
            default:
                ((iu30) ((rl1) uqsVar).e).invoke(Integer.valueOf(i));
                ArrayList arrayList2 = ((kda) yq91Var).l;
                if (arrayList2 != null) {
                    arrayList2.remove(this);
                    break;
                }
                break;
        }
    }

    public final void b(kda kdaVar) {
        switch (this.a) {
            case 0:
                xq91 xq91Var = ((er91) this.c.d).h;
                if (xq91Var != null) {
                    xq91Var.a(this.b);
                }
                break;
            default:
                break;
        }
    }
}
