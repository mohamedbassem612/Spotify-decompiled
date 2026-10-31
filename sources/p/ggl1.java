package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ggl1 implements Comparable {
    public final int a() {
        return hgl1.a().intValue();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ggl1 ggl1Var = (ggl1) obj;
        ggl1Var.getClass();
        if (a() == ggl1Var.a()) {
            return 0;
        }
        return a() > ggl1Var.a() ? 1 : -1;
    }
}
