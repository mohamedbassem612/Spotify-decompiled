package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class zs71 {
    static {
        Float.floatToRawIntBits(3.0f);
        Float.floatToRawIntBits(3.0f);
    }

    public static final boolean a(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((ys71) list.get(i)).c().b()) {
                return true;
            }
        }
        return false;
    }
}
