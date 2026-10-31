package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pun1 implements Map, Serializable {
    public final /* synthetic */ byte a;
    public final transient Object[] b;
    public transient AbstractCollection c;
    public transient AbstractCollection d;
    public transient AbstractCollection e;

    public /* synthetic */ pun1(Object[] objArr, byte b) {
        this.a = b;
        this.b = objArr;
    }

    @Override // java.util.Map
    public final void clear() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return get(obj) != null;
            case 1:
                return get(obj) != null;
            default:
                return get(obj) != null;
        }
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        byte b = this.a;
        Object[] objArr = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                rqn1 lun1Var = (lun1) this.e;
                if (lun1Var == null) {
                    lun1Var = new lun1(1, objArr);
                    this.e = lun1Var;
                }
                return lun1Var.contains(obj);
            case 1:
                zzn1 zzn1Var = (zzn1) this.e;
                if (zzn1Var == null) {
                    zzn1Var = new zzn1(1, objArr);
                    this.e = zzn1Var;
                }
                return zzn1Var.contains(obj);
            default:
                d1p1 whp1Var = (whp1) this.e;
                if (whp1Var == null) {
                    whp1Var = new whp1(1, this.b);
                    this.e = whp1Var;
                }
                return whp1Var.contains(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Serializable, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Serializable, java.lang.Object[]] */
    @Override // java.util.Map
    public final Set entrySet() {
        byte b = this.a;
        ?? r1 = this.b;
        byte b2 = 0;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                eun1 eun1Var = (eun1) this.c;
                if (eun1Var != null) {
                    return eun1Var;
                }
                e5n1 eun1Var2 = new eun1(this, r1, (byte) 0);
                this.c = eun1Var2;
                return eun1Var2;
            case 1:
                pzn1 pzn1Var = (pzn1) this.c;
                if (pzn1Var != null) {
                    return pzn1Var;
                }
                pzn1 pzn1Var2 = new pzn1(this, r1, b2);
                this.c = pzn1Var2;
                return pzn1Var2;
            default:
                ffp1 ffp1Var = (ffp1) this.c;
                if (ffp1Var != null) {
                    return ffp1Var;
                }
                wso1 ffp1Var2 = new ffp1(this, this.b, (byte) 0);
                this.c = ffp1Var2;
                return ffp1Var2;
        }
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Map) {
                    return entrySet().equals(((Map) obj).entrySet());
                }
                return false;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Map) {
                    return entrySet().equals(((Map) obj).entrySet());
                }
                return false;
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Map) {
                    return entrySet().equals(((Map) obj).entrySet());
                }
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:5:0x000c  */
    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        byte b = this.a;
        Object[] objArr = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (obj == null) {
                    obj2 = null;
                } else {
                    Object obj5 = objArr[0];
                    Objects.requireNonNull(obj5);
                    if (obj5.equals(obj)) {
                        obj2 = objArr[1];
                        Objects.requireNonNull(obj2);
                    } else {
                        obj2 = null;
                    }
                }
                if (obj2 == null) {
                    return null;
                }
                return obj2;
            case 1:
                if (obj == null) {
                    obj3 = null;
                } else {
                    Object obj6 = objArr[0];
                    Objects.requireNonNull(obj6);
                    if (obj6.equals(obj)) {
                        obj3 = objArr[1];
                        Objects.requireNonNull(obj3);
                    } else {
                        obj3 = null;
                    }
                }
                if (obj3 == null) {
                    return null;
                }
                return obj3;
            default:
                if (obj == null) {
                    obj4 = null;
                } else {
                    Object obj7 = objArr[0];
                    obj7.getClass();
                    if (obj7.equals(obj)) {
                        obj4 = objArr[1];
                        obj4.getClass();
                    } else {
                        obj4 = null;
                    }
                }
                if (obj4 == null) {
                    return null;
                }
                return obj4;
        }
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Object obj3 = get(obj);
                return obj3 != null ? obj3 : obj2;
            case 1:
                Object obj4 = get(obj);
                return obj4 != null ? obj4 : obj2;
            default:
                Object obj5 = get(obj);
                return obj5 != null ? obj5 : obj2;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Serializable, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.io.Serializable, java.lang.Object[]] */
    @Override // java.util.Map
    public final int hashCode() {
        byte b = this.a;
        ?? r1 = this.b;
        byte b2 = 0;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                e5n1 eun1Var = (eun1) this.c;
                if (eun1Var == null) {
                    eun1Var = new eun1(this, r1, (byte) 0);
                    this.c = eun1Var;
                }
                Iterator it = eun1Var.iterator();
                int iHashCode = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    iHashCode += next != null ? next.hashCode() : 0;
                }
                return iHashCode;
            case 1:
                pzn1 pzn1Var = (pzn1) this.c;
                if (pzn1Var == null) {
                    pzn1Var = new pzn1(this, r1, b2);
                    this.c = pzn1Var;
                }
                Iterator it2 = pzn1Var.iterator();
                int iHashCode2 = 0;
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    iHashCode2 += next2 != null ? next2.hashCode() : 0;
                }
                return iHashCode2;
            default:
                wso1 ffp1Var = (ffp1) this.c;
                if (ffp1Var == null) {
                    ffp1Var = new ffp1(this, this.b, (byte) 0);
                    this.c = ffp1Var;
                }
                Iterator it3 = ffp1Var.iterator();
                int iHashCode3 = 0;
                while (it3.hasNext()) {
                    Object next3 = it3.next();
                    iHashCode3 += next3 != null ? next3.hashCode() : 0;
                }
                return iHashCode3;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        switch (this.a) {
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        byte b = this.a;
        Object[] objArr = this.b;
        byte b2 = 1;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                eun1 eun1Var = (eun1) this.d;
                if (eun1Var != null) {
                    return eun1Var;
                }
                e5n1 eun1Var2 = new eun1(this, new lun1(0, objArr), (byte) 1);
                this.d = eun1Var2;
                return eun1Var2;
            case 1:
                pzn1 pzn1Var = (pzn1) this.d;
                if (pzn1Var != null) {
                    return pzn1Var;
                }
                pzn1 pzn1Var2 = new pzn1(this, new zzn1(0, objArr), b2);
                this.d = pzn1Var2;
                return pzn1Var2;
            default:
                ffp1 ffp1Var = (ffp1) this.d;
                if (ffp1Var != null) {
                    return ffp1Var;
                }
                wso1 ffp1Var2 = new ffp1(this, new whp1(0, this.b), (byte) 1);
                this.d = ffp1Var2;
                return ffp1Var2;
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final int size() {
        switch (this.a) {
        }
        return 1;
    }

    public final String toString() {
        boolean z = true;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                StringBuilder sb = new StringBuilder((int) Math.min(8L, 1073741824L));
                sb.append('{');
                for (Map.Entry entry : (eun1) entrySet()) {
                    if (!z) {
                        sb.append(", ");
                    }
                    sb.append(entry.getKey());
                    sb.append('=');
                    sb.append(entry.getValue());
                    z = false;
                }
                sb.append('}');
                return sb.toString();
            case 1:
                StringBuilder sb2 = new StringBuilder((int) Math.min(8L, 1073741824L));
                sb2.append('{');
                for (Map.Entry entry2 : (pzn1) entrySet()) {
                    if (!z) {
                        sb2.append(", ");
                    }
                    sb2.append(entry2.getKey());
                    sb2.append('=');
                    sb2.append(entry2.getValue());
                    z = false;
                }
                sb2.append('}');
                return sb2.toString();
            default:
                StringBuilder sb3 = new StringBuilder((int) Math.min(8L, 1073741824L));
                sb3.append('{');
                for (Map.Entry entry3 : (ffp1) entrySet()) {
                    if (!z) {
                        sb3.append(", ");
                    }
                    sb3.append(entry3.getKey());
                    sb3.append('=');
                    sb3.append(entry3.getValue());
                    z = false;
                }
                sb3.append('}');
                return sb3.toString();
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        byte b = this.a;
        Object[] objArr = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                rqn1 rqn1Var = (lun1) this.e;
                if (rqn1Var != null) {
                    return rqn1Var;
                }
                rqn1 lun1Var = new lun1(1, objArr);
                this.e = lun1Var;
                return lun1Var;
            case 1:
                zzn1 zzn1Var = (zzn1) this.e;
                if (zzn1Var != null) {
                    return zzn1Var;
                }
                zzn1 zzn1Var2 = new zzn1(1, objArr);
                this.e = zzn1Var2;
                return zzn1Var2;
            default:
                d1p1 d1p1Var = (whp1) this.e;
                if (d1p1Var != null) {
                    return d1p1Var;
                }
                d1p1 whp1Var = new whp1(1, this.b);
                this.e = whp1Var;
                return whp1Var;
        }
    }
}
