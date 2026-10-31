package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b861 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f861 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b861(f861 f861Var, byte b) {
        super(1);
        this.a = b;
        this.b = f861Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        f861 f861Var = this.b;
        switch (b) {
            case 0:
                ArrayList<m761> arrayList = f861Var.b;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                for (m761 m761Var : arrayList) {
                    arrayList2.add(new h8k1(m761Var, m761Var.a));
                }
                return new huz(new hj50(arrayList2, (ioj0) null), (byte) 10);
            default:
                return new uv11(((m761) obj).a, f861Var.a, (Integer) null, (String) null, (cqs0) null, (tv11) null, 0, 252);
        }
    }
}
