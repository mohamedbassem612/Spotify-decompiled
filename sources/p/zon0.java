package p;

import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class zon0 extends apn0 {
    public final Class r;

    public zon0(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            ncn0.d(cls, " does not implement Serializable.");
            throw null;
        }
        if (cls.isEnum()) {
            ncn0.d(cls, " is an Enum. You should use EnumType instead.");
            throw null;
        }
        this.r = cls;
    }

    @Override // p.apn0
    public final Object a(Bundle bundle, String str) {
        return (Serializable) bundle.get(str);
    }

    @Override // p.apn0
    public String b() {
        return this.r.getName();
    }

    @Override // p.apn0
    public final void e(Bundle bundle, String str, Object obj) {
        Serializable serializable = (Serializable) obj;
        this.r.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zon0)) {
            return false;
        }
        return this.r.equals(((zon0) obj).r);
    }

    @Override // p.apn0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Serializable d(String str) {
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public zon0(Class cls, int i) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.r = cls;
        } else {
            ncn0.d(cls, " does not implement Serializable.");
            throw null;
        }
    }
}
