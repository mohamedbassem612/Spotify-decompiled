package p;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xon0 extends apn0 {
    public final Class r;

    public xon0(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
            this.r = cls;
        } else {
            ncn0.d(cls, " does not implement Parcelable or Serializable.");
            throw null;
        }
    }

    @Override // p.apn0
    public final Object a(Bundle bundle, String str) {
        return bundle.get(str);
    }

    @Override // p.apn0
    public final String b() {
        return this.r.getName();
    }

    @Override // p.apn0
    public final Object d(String str) {
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // p.apn0
    public final void e(Bundle bundle, String str, Object obj) {
        this.r.cast(obj);
        if (obj == null || (obj instanceof Parcelable)) {
            bundle.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !xon0.class.equals(obj.getClass())) {
            return false;
        }
        return this.r.equals(((xon0) obj).r);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }
}
