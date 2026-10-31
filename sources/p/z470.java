package p;

import android.util.SparseArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z470 {
    private static final wu30 GET_ID = new y470(0);
    private static final wu30 GET_BINDER_ID = new y470(1);

    private z470() {
    }

    public static <T extends Enum<T> & x470> zpb0 asLazySparseArray(Class<T> cls) {
        return new zpb0(new nay(cls, (byte) 27));
    }

    public static <T extends Enum<T> & x470> le70 asRegistry(Class<T> cls) {
        j3v j3vVar = new j3v();
        j3vVar.g(asSparseArray(cls));
        return new le70((SparseArray) j3vVar.b);
    }

    public static <T extends Enum<T> & x470> SparseArray<n570> asSparseArray(Class<T> cls) {
        Object[] objArr = (Enum[]) cls.getEnumConstants();
        SparseArray<n570> sparseArray = new SparseArray<>(objArr.length);
        for (Object obj : objArr) {
            k570 k570Var = (k570) ((x470) obj);
            k570Var.getClass();
            sparseArray.put(2131429145, k570Var.b);
        }
        return sparseArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static wu30 getBinderId() {
        return GET_BINDER_ID;
    }

    public static wu30 getId() {
        return GET_ID;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String lambda$static$0(w570 w570Var) {
        w570Var.getClass();
        return w570Var.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Integer lambda$static$1(x470 x470Var) {
        x470Var.getClass();
        return 2131429145;
    }

    public static <T extends Enum<T> & w570 & x470> e670 makeResolver(Class<T> cls) {
        return new mjv(new rm5(cls, getId()), (byte) 24);
    }
}
