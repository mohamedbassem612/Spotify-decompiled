package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class q94 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p811 b;

    public /* synthetic */ q94(p811 p811Var, byte b) {
        this.a = b;
        this.b = p811Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        boolean z = true;
        p811 p811Var = this.b;
        switch (b) {
            case 0:
                p811Var.a = (d030) obj;
                return Boolean.TRUE;
            case 1:
                pj40 pj40Var = (pj40) obj;
                if (u890.j(pj40Var.Q(), "waiting")) {
                    p811Var.a = pj40Var;
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                cy60 cy60Var = (cy60) obj;
                Object obj2 = p811Var.a;
                if (obj2 == null && cy60Var.Q0) {
                    p811Var.a = cy60Var;
                } else if (obj2 != null) {
                    cy60Var.getClass();
                }
                return Boolean.TRUE;
            case 3:
                pim0 pim0Var = (dpg1) obj;
                if (pim0Var.a.N0) {
                    p811Var.a = pim0Var;
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                tsb0 tsb0Var = ((dpg1) obj).O0;
                List listO = (List) p811Var.a;
                if (listO != null) {
                    listO.add(tsb0Var);
                } else {
                    listO = p7h.O(new tsb0[]{tsb0Var});
                }
                p811Var.a = listO;
                return cpg1.b;
            default:
                p811Var.a = (ega0) obj;
                return rih1.a;
        }
    }
}
