package p;

import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class won0 extends apn0 {
    public final Class r;

    public won0(Class cls) {
        super(true);
        if (!Parcelable.class.isAssignableFrom(cls)) {
            ncn0.d(cls, " does not implement Parcelable.");
            throw null;
        }
        try {
            this.r = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e) {
            eg.j(e);
            throw null;
        }
    }

    @Override // p.apn0
    public final Object a(Bundle bundle, String str) {
        return (Parcelable[]) bundle.get(str);
    }

    @Override // p.apn0
    public final String b() {
        return this.r.getName();
    }

    @Override // p.apn0
    public final Object d(String str) {
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    @Override // p.apn0
    public final void e(Bundle bundle, String str, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        this.r.cast(parcelableArr);
        bundle.putParcelableArray(str, parcelableArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !won0.class.equals(obj.getClass())) {
            return false;
        }
        return u890.j(this.r, ((won0) obj).r);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }
}
