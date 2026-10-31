package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class mfz {
    public boolean a(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    public int b(Object obj) {
        return obj.hashCode();
    }

    public final boolean c(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return a(obj, obj2);
    }
}
