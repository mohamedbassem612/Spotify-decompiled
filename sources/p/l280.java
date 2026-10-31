package p;

import com.google.common.collect.BiMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class l280 extends j380 implements BiMap {
    public static l280 p(HashMap map) {
        Set setEntrySet = map.entrySet();
        j280 j280Var = new j280(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        j280Var.i(setEntrySet);
        return j280Var.d();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public final Object forcePut(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public final q280 o() {
        return ((ag11) this).h.i();
    }

    public final Collection values() {
        return ((ag11) this).h.i();
    }

    public Object writeReplace() {
        return new k280(this);
    }

    /* JADX INFO: renamed from: values, reason: collision with other method in class */
    public final Set m215values() {
        return ((ag11) this).h.i();
    }
}
