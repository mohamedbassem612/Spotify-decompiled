package p;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vtm implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ mr20 d;
    public final /* synthetic */ Object e;

    public vtm(plu pluVar, boolean z, yqg yqgVar, wm70 wm70Var) {
        this.a = (byte) 2;
        this.d = pluVar;
        this.c = z;
        this.b = yqgVar;
        this.e = wm70Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj = this.e;
        Object obj2 = this.b;
        ay8 ay8Var = this.d;
        switch (b) {
            case 0:
                ay8Var.collect(new ln1(vr20Var, (String) obj2, (som) obj, this.c, (byte) 1), lnmVar);
                return d9nVar;
            case 1:
                Object objCollect = ay8Var.collect(new ln1(vr20Var, (d3o0) obj, (String) obj2, this.c, (byte) 2), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 2:
                Object objCollect2 = ((plu) ay8Var).collect(new ln1(vr20Var, this.c, (yqg) obj2, (wm70) obj), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            default:
                ay8Var.collect(new ln1(vr20Var, (ArrayList) obj2, (ArrayList) obj, this.c, (byte) 6), lnmVar);
                return d9nVar;
        }
    }

    public /* synthetic */ vtm(ay8 ay8Var, Serializable serializable, Object obj, boolean z, byte b) {
        this.a = b;
        this.d = ay8Var;
        this.b = serializable;
        this.e = obj;
        this.c = z;
    }

    public vtm(bpb1 bpb1Var, d3o0 d3o0Var, String str, boolean z) {
        this.a = (byte) 1;
        this.d = bpb1Var;
        this.e = d3o0Var;
        this.b = str;
        this.c = z;
    }
}
