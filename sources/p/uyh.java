package p;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uyh {
    public static final uyh a;
    public static final /* synthetic */ uyh[] b;

    /* JADX INFO: Fake field, exist only in values array */
    uyh EF0;

    static {
        uyh uyhVar = new uyh("NOT_SET", 0);
        uyh uyhVar2 = new uyh("EVENT_OVERRIDE", 1);
        a = uyhVar2;
        b = new uyh[]{uyhVar, uyhVar2};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, uyhVar);
        sparseArray.put(5, uyhVar2);
    }

    public static uyh valueOf(String str) {
        return (uyh) Enum.valueOf(uyh.class, str);
    }

    public static uyh[] values() {
        return (uyh[]) b.clone();
    }
}
