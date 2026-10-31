package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class idc {
    public final Object a;
    public final String b;

    public idc(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final String a() {
        return "[" + this.b + ", " + ldc.i(this.a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
