package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v730 {
    public final int a;
    public final int b;
    public final int c;

    public v730(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v730)) {
            return false;
        }
        v730 v730Var = (v730) obj;
        return this.a == v730Var.a && this.b == v730Var.b && this.c == v730Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
