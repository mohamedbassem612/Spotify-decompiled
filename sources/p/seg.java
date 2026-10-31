package p;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class seg {
    public final int a;
    public final Method b;

    public seg(Method method, int i) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof seg)) {
            return false;
        }
        seg segVar = (seg) obj;
        return this.a == segVar.a && this.b.getName().equals(segVar.b.getName());
    }

    public final int hashCode() {
        return this.b.getName().hashCode() + (this.a * 31);
    }
}
