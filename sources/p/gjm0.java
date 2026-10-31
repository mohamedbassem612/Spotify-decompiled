package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gjm0 implements Update {
    public final /* synthetic */ Class a;
    public final /* synthetic */ Class b;
    public final /* synthetic */ nve0 c;

    public gjm0(Class cls, Class cls2, nve0 nve0Var) {
        this.a = cls;
        this.b = cls2;
        this.c = nve0Var;
    }

    public final Next a(Object obj, Object obj2) {
        Map map = (Map) obj;
        if (!this.a.isAssignableFrom(obj2.getClass())) {
            return Next.j();
        }
        map.getClass();
        Class cls = this.b;
        Next nextA = this.c.b().a(dug.l(cls, map), obj2);
        Set setP1 = o7h.p1(nextA.b());
        if (!nextA.d()) {
            return Next.a(setP1);
        }
        map.put(cls, nextA.g());
        return Next.i(map, setP1);
    }
}
