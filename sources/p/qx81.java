package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class qx81 extends gmh1 implements sx81, c0h1 {
    @Override // p.gmh1
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public abstract qx81 x0(boolean z);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] strArr = {"[", cht.e.v((pf5) it.next(), null), "] "};
            for (int i = 0; i < 3; i++) {
                sb.append(strArr[i]);
            }
        }
        sb.append(t0());
        if (!r0().isEmpty()) {
            o7h.x0(r0(), sb, ", ", "<", ">", (iu30) null, 112);
        }
        if (u0()) {
            sb.append("?");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: B0 */
    public qx81 z0(e0h1 e0h1Var) {
        return this;
    }
}
