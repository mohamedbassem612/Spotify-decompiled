package p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ddc1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pbq b;

    public /* synthetic */ ddc1(pbq pbqVar, byte b) {
        this.a = b;
        this.b = pbqVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        hdc1 hdc1Var = hdc1.d;
        pbq pbqVar = this.b;
        switch (b) {
            case 0:
                List list = (List) obj;
                pbqVar.getClass();
                boolean zIsEmpty = list.isEmpty();
                gdc1 gdc1Var = (gdc1) pbqVar.f;
                bpb1 bpb1Var = gdc1Var.k;
                if (!zIsEmpty) {
                    idc1 idc1Var = new idc1(list);
                    if (gdc1Var.h != null) {
                        gdc1Var.d(idc1Var);
                    } else {
                        gdc1Var.l = idc1Var;
                    }
                } else if (gdc1Var.h != null) {
                    gdc1Var.d(hdc1Var);
                } else {
                    gdc1Var.l = hdc1Var;
                    Boolean bool = Boolean.TRUE;
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, bool);
                }
                break;
            case 1:
                pbqVar.getClass();
                gdc1 gdc1Var2 = (gdc1) pbqVar.f;
                bpb1 bpb1Var2 = gdc1Var2.k;
                if (gdc1Var2.h != null) {
                    gdc1Var2.d(hdc1Var);
                } else {
                    gdc1Var2.l = hdc1Var;
                    Boolean bool2 = Boolean.TRUE;
                    bpb1Var2.getClass();
                    bpb1Var2.m((Object) null, bool2);
                }
                break;
            default:
                pbqVar.getClass();
                break;
        }
    }
}
