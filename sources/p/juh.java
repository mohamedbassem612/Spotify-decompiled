package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class juh extends AbstractSet {
    public final /* synthetic */ byte a;
    public final /* synthetic */ muh b;

    public /* synthetic */ juh(muh muhVar, byte b) {
        this.a = b;
        this.b = muhVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        byte b = this.a;
        muh muhVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                muhVar.clear();
                break;
            default:
                muhVar.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        byte b = this.a;
        muh muhVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Map mapC = muhVar.c();
                if (mapC != null) {
                    return mapC.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iE = muhVar.e(entry.getKey());
                    if (iE != -1 && zno1.k(muhVar.l()[iE], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return muhVar.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.a;
        muh muhVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Map mapC = muhVar.c();
                return mapC != null ? mapC.entrySet().iterator() : new iuh(muhVar, (byte) 1);
            default:
                Map mapC2 = muhVar.c();
                return mapC2 != null ? mapC2.keySet().iterator() : new iuh(muhVar, (byte) 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        byte b = this.a;
        muh muhVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Map mapC = muhVar.c();
                if (mapC != null) {
                    return mapC.entrySet().remove(obj);
                }
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (muhVar.h()) {
                    return false;
                }
                int iD = muhVar.d();
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = muhVar.a;
                Objects.requireNonNull(obj2);
                int iO = x9p1.o(key, value, iD, obj2, muhVar.j(), muhVar.k(), muhVar.l());
                if (iO == -1) {
                    return false;
                }
                muhVar.g(iO, iD);
                muhVar.f--;
                muhVar.e += 32;
                return true;
            default:
                Map mapC2 = muhVar.c();
                if (mapC2 != null) {
                    return mapC2.keySet().remove(obj);
                }
                return muhVar.i(obj) != muh.t;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        byte b = this.a;
        muh muhVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
        }
        return muhVar.size();
    }
}
