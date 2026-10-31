package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class q8w implements Update {
    public static final q8w a = new q8w();

    public final Next a(Object obj, Object obj2) {
        s8w s8wVar = (s8w) obj;
        m8w m8wVar = (m8w) obj2;
        if (m8wVar instanceof j8w) {
            return Next.a(Collections.singleton(new e8w(s8wVar.b, s8wVar.c, ((j8w) m8wVar).a)));
        }
        if (m8wVar.equals(k8w.a)) {
            return Next.a(Collections.singleton(new f8w()));
        }
        if (m8wVar.equals(l8w.a)) {
            return Next.a(Collections.singleton(new f8w()));
        }
        eg.o();
        return null;
    }
}
