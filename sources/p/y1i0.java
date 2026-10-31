package p;

import android.os.Handler;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class y1i0 implements bi7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fzh0 b;
    public final /* synthetic */ ixh0 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y1i0(fzh0 fzh0Var, ixh0 ixh0Var, Object obj, byte b) {
        this.a = b;
        this.b = fzh0Var;
        this.c = ixh0Var;
        this.d = obj;
    }

    public final n8d0 apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                fzh0 fzh0Var = this.b;
                Handler handler = fzh0Var.l;
                vqh0 vqh0Var = new vqh0(fzh0Var, this.c, new vqh0(fzh0Var, (czh0) obj2, (jxh0) obj, (byte) 5), (byte) 3);
                ch61 ch61Var = new ch61(0);
                String str = zoi1.a;
                em61 em61VarY = em61.y();
                zoi1.c0(handler, new vqh0(em61VarY, vqh0Var, ch61Var, (byte) 18));
                return em61VarY;
            default:
                List list = (List) obj;
                fzh0 fzh0Var2 = this.b;
                Handler handler2 = fzh0Var2.l;
                ixh0 ixh0Var = this.c;
                vqh0 vqh0Var2 = new vqh0(fzh0Var2, ixh0Var, new m2d(fzh0Var2, (c2i0) obj2, ixh0Var, list, (byte) 19), (byte) 3);
                ch61 ch61Var2 = new ch61(0);
                String str2 = zoi1.a;
                em61 em61VarY2 = em61.y();
                zoi1.c0(handler2, new vqh0(em61VarY2, vqh0Var2, ch61Var2, (byte) 18));
                return em61VarY2;
        }
    }
}
