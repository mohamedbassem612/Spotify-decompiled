package p;

import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yon0 extends apn0 {
    public final Class r;

    public yon0(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            ncn0.d(cls, " does not implement Serializable.");
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
        return (Serializable[]) bundle.get(str);
    }

    @Override // p.apn0
    public final String b() {
        return this.r.getName();
    }

    @Override // p.apn0
    public final Object d(String str) {
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
    @Override // p.apn0
    public final void e(Bundle bundle, String str, Object obj) {
        ?? r3 = (Serializable[]) obj;
        this.r.cast(r3);
        bundle.putSerializable(str, r3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !yon0.class.equals(obj.getClass())) {
            return false;
        }
        return u890.j(this.r, ((yon0) obj).r);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }
}
