package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class m4p1 extends i4p1 {
    public final /* synthetic */ byte c;
    public final transient Object d;

    public /* synthetic */ m4p1(Object obj, byte b) {
        this.c = b;
        this.d = obj;
    }

    @Override // p.j3p1
    public final k5n1 b() {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new b4p1((p4p1) obj);
            default:
                return new v4p1(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        byte b = this.c;
        Object obj2 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    Collection collection = (Collection) ((c6p1) ((p4p1) obj2).a()).get(key);
                    if (collection != null && collection.contains(value)) {
                        return true;
                    }
                }
                return false;
            default:
                return obj2.equals(obj);
        }
    }

    @Override // p.j3p1
    public final boolean f() {
        switch (this.c) {
        }
        return false;
    }

    @Override // p.i4p1, java.util.Collection, java.util.Set
    public int hashCode() {
        switch (this.c) {
            case 1:
                return this.d.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // p.j3p1
    public int i(Object[] objArr) {
        switch (this.c) {
            case 1:
                objArr[0] = this.d;
                return 1;
            default:
                return super.i(objArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new b4p1((p4p1) obj);
            default:
                return new v4p1(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.c) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return ((p4p1) this.d).b;
            default:
                return 1;
        }
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        switch (this.c) {
            case 1:
                String string = this.d.toString();
                return l1d.q(new StringBuilder(String.valueOf(string).length() + 2), "[", string, "]");
            default:
                return super.toString();
        }
    }
}
