package p;

import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m590 extends apn0 {
    public final Class r;
    public final Class s;

    public m590(Class cls) {
        super(true);
        this.r = cls;
        if (!Serializable.class.isAssignableFrom(cls)) {
            ncn0.d(cls, " does not implement Serializable.");
            throw null;
        }
        if (cls.isEnum()) {
            this.s = cls;
        } else {
            ncn0.d(cls, " is not an Enum type.");
            throw null;
        }
    }

    @Override // p.apn0
    public final Object a(Bundle bundle, String str) {
        Object obj = bundle.get(str);
        if (obj instanceof Serializable) {
            return (Serializable) obj;
        }
        return null;
    }

    @Override // p.apn0
    public final String b() {
        return this.s.getName();
    }

    @Override // p.apn0
    public final Object d(String str) {
        Object obj = null;
        if (str.equals("null")) {
            return null;
        }
        Class cls = this.s;
        Object[] enumConstants = cls.getEnumConstants();
        enumConstants.getClass();
        for (Object obj2 : enumConstants) {
            Enum r5 = (Enum) obj2;
            r5.getClass();
            if (nhc1.S(r5.name(), str, true)) {
                obj = obj2;
                break;
            }
        }
        Enum r1 = (Enum) obj;
        if (r1 != null) {
            return r1;
        }
        StringBuilder sbT = l1d.t("Enum value ", str, " not found for type ");
        sbT.append(cls.getName());
        sbT.append('.');
        throw new IllegalArgumentException(sbT.toString());
    }

    @Override // p.apn0
    public final void e(Bundle bundle, String str, Object obj) {
        bundle.putSerializable(str, (Serializable) this.r.cast((Serializable) obj));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m590)) {
            return false;
        }
        return this.r.equals(((m590) obj).r);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }
}
