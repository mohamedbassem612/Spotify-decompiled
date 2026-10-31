package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class zym1 implements Update {
    public final Next a(Object obj, Object obj2) {
        yym1 yym1Var = (yym1) obj2;
        if (yym1Var instanceof tym1) {
            tym1 tym1Var = (tym1) yym1Var;
            return Next.a(Collections.singleton(new nym1(tym1Var.a, tym1Var.b)));
        }
        if (yym1Var instanceof sym1) {
            return Next.a(Collections.singleton(new pym1(((sym1) yym1Var).a)));
        }
        if (yym1Var instanceof uym1) {
            return Next.a(Collections.singleton(new oym1(((uym1) yym1Var).a)));
        }
        if (yym1Var instanceof vym1) {
            return Next.a(Collections.singleton(new qym1(((vym1) yym1Var).a)));
        }
        if (yym1Var instanceof wym1) {
            wym1 wym1Var = (wym1) yym1Var;
            return Next.a(Collections.singleton(new mym1(wym1Var.a, wym1Var.b)));
        }
        if (yym1Var instanceof xym1) {
            xym1 xym1Var = (xym1) yym1Var;
            return Next.a(Collections.singleton(new rym1(xym1Var.a, xym1Var.b)));
        }
        eg.o();
        return null;
    }
}
