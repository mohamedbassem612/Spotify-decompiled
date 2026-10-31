package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class c8 implements Map.Entry {
    public final /* synthetic */ byte a;

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (zno1.k(getKey(), entry.getKey()) && zno1.k(getValue(), entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry2 = (Map.Entry) obj;
                    if (poo1.K(getKey(), entry2.getKey()) && poo1.K(getValue(), entry2.getValue())) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Object key = getKey();
                Object value = getValue();
                return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
            default:
                Object key2 = getKey();
                Object value2 = getValue();
                return (key2 == null ? 0 : key2.hashCode()) ^ (value2 != null ? value2.hashCode() : 0);
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return getKey() + "=" + getValue();
            default:
                return f4i1.f(String.valueOf(getKey()), "=", String.valueOf(getValue()));
        }
    }
}
