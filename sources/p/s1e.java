package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class s1e implements Update {
    public final Next a(Object obj, Object obj2) {
        po41 po41Var = (po41) obj;
        qyd qydVar = (qyd) obj2;
        String str = po41Var.c;
        if (qydVar instanceof lyd) {
            return po41Var.equals(po41.d) ? Next.h(((lyd) qydVar).a) : Next.j();
        }
        if (qydVar instanceof jyd) {
            return Next.a(f46.S0(new u9[]{new lxd(str, p791.b), new fxd(str)}));
        }
        if (qydVar instanceof oyd) {
            return Next.a(f46.S0(new u9[]{new cxd(1), new exd(str)}));
        }
        if (qydVar instanceof myd) {
            myd mydVar = (myd) qydVar;
            String str2 = mydVar.a;
            return Next.a(f46.S0(new u9[]{new kxd(str2), new jxd(str, mydVar.b, str2)}));
        }
        if (qydVar instanceof pyd) {
            return Next.a(Collections.singleton(new mxd("Skipped")));
        }
        if (!(qydVar instanceof nyd)) {
            eg.o();
            return null;
        }
        nyd nydVar = (nyd) qydVar;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = nydVar.b;
        linkedHashSet.add(new gxd(str, i));
        int i2 = nydVar.a;
        if (i2 >= 0 && i2 != i) {
            linkedHashSet.add(new hxd(str, i2, i));
        }
        oo41 oo41Var = (oo41) o7h.t0(i, po41Var.a);
        if (oo41Var != null) {
            String str3 = oo41Var.f;
            if (str3.length() > 0) {
                linkedHashSet.add(new ixd(str, i, str3));
            }
        }
        if (i2 < 0) {
            linkedHashSet.add(new dxd(str));
        }
        return Next.a(linkedHashSet);
    }
}
