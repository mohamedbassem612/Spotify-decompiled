package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class uwj {
    public final float a;
    public final float b;

    public uwj(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uwj)) {
            return false;
        }
        uwj uwjVar = (uwj) obj;
        return Float.compare(this.a, uwjVar.a) == 0 && Float.compare(this.b, uwjVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
