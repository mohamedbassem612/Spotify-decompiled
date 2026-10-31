package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class mwv implements Update {
    public final Next a(Object obj, Object obj2) {
        qwv qwvVar = (qwv) obj;
        awv awvVar = (awv) obj2;
        Set set = qwvVar.b;
        if (awvVar instanceof wvv) {
            wvv wvvVar = (wvv) awvVar;
            if (set.isEmpty()) {
                return Next.j();
            }
            return wvvVar.a == 1 ? Next.a(Collections.singleton(new tvv(1, set))) : Next.h(qwv.a(qwvVar, false, null, true, 3));
        }
        if (awvVar instanceof yvv) {
            return Next.h(qwv.a(qwvVar, ((yvv) awvVar).a, null, false, 6));
        }
        if (awvVar instanceof zvv) {
            return Next.h(qwv.a(qwvVar, false, ((zvv) awvVar).a, false, 5));
        }
        if (awvVar instanceof xvv) {
            qwv qwvVarA = qwv.a(qwvVar, false, null, false, 3);
            return ((xvv) awvVar).a ? Next.i(qwvVarA, Collections.singleton(new tvv(2, set))) : Next.h(qwvVarA);
        }
        eg.o();
        return null;
    }
}
