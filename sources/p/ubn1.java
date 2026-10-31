package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ubn1 {
    public static final ubn1 e = new ubn1(new int[0], new Object[0], false);
    public final int[] a;
    public final Object[] b;
    public int c = -1;
    public boolean d;

    public ubn1(int[] iArr, Object[] objArr, boolean z) {
        this.a = iArr;
        this.b = objArr;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ubn1)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 506991;
    }
}
