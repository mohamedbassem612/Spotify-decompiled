package p;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class eno1 extends vmo1 {
    public final /* synthetic */ byte m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eno1(zaa zaaVar, byte b) {
        super(zaaVar);
        this.m = b;
    }

    @Override // p.wan1
    public void b1(v3o1 v3o1Var) {
        switch (this.m) {
            case 1:
                Status statusQ = zko1.q(v3o1Var.a);
                List<okn1> list = v3o1Var.b;
                HashMap map = new HashMap();
                if (list != null) {
                    for (okn1 okn1Var : list) {
                        map.put(okn1Var.b, new ien1(okn1Var));
                    }
                }
                i1(new wen1(statusQ, map));
                break;
            default:
                super.b1(v3o1Var);
                break;
        }
    }

    @Override // p.wan1
    public void d1(DataHolder dataHolder) {
        switch (this.m) {
            case 4:
                i1(new hzq(dataHolder));
                break;
            default:
                super.d1(dataHolder);
                break;
        }
    }

    @Override // p.wan1
    public void e1(d3o1 d3o1Var) {
        switch (this.m) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                i1(new oyn1(zko1.q(d3o1Var.a), d3o1Var.b));
                break;
            default:
                super.e1(d3o1Var);
                break;
        }
    }

    @Override // p.wan1
    public void f1(i8o1 i8o1Var) {
        switch (this.m) {
            case 3:
                ArrayList arrayList = new ArrayList();
                List list = i8o1Var.b;
                if (list != null) {
                    arrayList.addAll(list);
                }
                i1(new bho1(zko1.q(i8o1Var.a), arrayList));
                break;
            default:
                super.f1(i8o1Var);
                break;
        }
    }

    @Override // p.wan1
    public void g1(p7o1 p7o1Var) {
        switch (this.m) {
            case 2:
                i1(new qho1(zko1.q(p7o1Var.a), p7o1Var.b));
                break;
            default:
                super.g1(p7o1Var);
                break;
        }
    }
}
