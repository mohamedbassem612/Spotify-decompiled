package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class czg {
    public static final czg c = new czg(1.092f, p7h.M(new jcg[]{new jcg(0.5698f, 0.2849f, 0.2609f), new jcg(0.4717f, 0.7641f, 0.5709f), new jcg(0.3472f, 0.3779f, 0.8407f)}));
    public static final czg d = new czg(1.0849f, p7h.M(new jcg[]{new jcg(0.5374f, 0.2687f, 0.2477f), new jcg(0.4448f, 0.7776f, 0.4313f), new jcg(0.395f, 0.3399f, 0.7458f), new jcg(0.306f, 0.758f, 0.859f)}));
    public static final czg e = new czg(0.8968f, p7h.M(new jcg[]{new jcg(0.5374f, 0.2687f, 0.2996f), new jcg(0.4448f, 0.7776f, 0.4226f), new jcg(0.3274f, 0.1815f, 0.8095f), new jcg(0.2776f, 0.516f, 0.7817f), new jcg(0.2278f, 0.8114f, 0.873f)}));
    public final List a;
    public final float b;

    public czg(float f, List list) {
        this.a = list;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czg)) {
            return false;
        }
        czg czgVar = (czg) obj;
        return this.a.equals(czgVar.a) && Float.compare(this.b, czgVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
