package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class fv implements Update {
    public final Next a(Object obj, Object obj2) {
        dr drVar = (dr) obj2;
        if (drVar instanceof br) {
            br brVar = (br) drVar;
            String str = brVar.a;
            return (str == null || ihc1.y0(str)) ? Next.i(new zu(3), Collections.singleton(new vq(false))) : Next.i(new zu(2), Collections.singleton(new wq(str, brVar.b, brVar.c)));
        }
        if (drVar instanceof ar) {
            return ((ar) drVar).a ? Next.i(new zu(5), Collections.singleton(new vq(true))) : Next.i(new zu(4), Collections.singleton(new vq(false)));
        }
        if (drVar instanceof cr) {
            return Next.i(new zu(2), Collections.singleton(new xq(((cr) drVar).a)));
        }
        eg.o();
        return null;
    }
}
