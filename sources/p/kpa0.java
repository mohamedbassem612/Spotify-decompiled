package p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kpa0 {
    public static final kpa0 c = new kpa0("COMPOSITION");
    public final List a;
    public lpa0 b;

    public kpa0(kpa0 kpa0Var) {
        this.a = new ArrayList(kpa0Var.a);
        this.b = kpa0Var.b;
    }

    public final kpa0 a(String str) {
        kpa0 kpa0Var = new kpa0(this);
        kpa0Var.a.add(str);
        return kpa0Var;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0088 A[RETURN] */
    public final boolean b(int i, String str) {
        List list = this.a;
        if (i < list.size()) {
            boolean z = i == list.size() - 1;
            String str2 = (String) list.get(i);
            if (!str2.equals("**")) {
                boolean z2 = str2.equals(str) || str2.equals("*");
                if ((z || (i == list.size() - 2 && ((String) list.get(list.size() - 1)).equals("**"))) && z2) {
                    return true;
                }
            } else {
                if (z || !((String) list.get(i + 1)).equals(str)) {
                    if (!z) {
                        int i2 = i + 1;
                        if (i2 >= list.size() - 1) {
                            return ((String) list.get(i2)).equals(str);
                        }
                    }
                    return true;
                }
                if (i == list.size() - 2 || (i == list.size() - 3 && ((String) list.get(list.size() - 1)).equals("**"))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final lpa0 c() {
        return this.b;
    }

    public final int d(int i, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List list = this.a;
        if (((String) list.get(i)).equals("**")) {
            return (i != list.size() - 1 && ((String) list.get(i + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public final boolean e(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.a;
        if (i >= list.size()) {
            return false;
        }
        return ((String) list.get(i)).equals(str) || ((String) list.get(i)).equals("**") || ((String) list.get(i)).equals("*");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kpa0.class == obj.getClass()) {
            kpa0 kpa0Var = (kpa0) obj;
            if (!this.a.equals(kpa0Var.a)) {
                return false;
            }
            lpa0 lpa0Var = this.b;
            lpa0 lpa0Var2 = kpa0Var.b;
            if (lpa0Var != null) {
                return lpa0Var.equals(lpa0Var2);
            }
            if (lpa0Var2 == null) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.a;
        return i < list.size() - 1 || ((String) list.get(i)).equals("**");
    }

    public final kpa0 g(lpa0 lpa0Var) {
        kpa0 kpa0Var = new kpa0(this);
        kpa0Var.b = lpa0Var;
        return kpa0Var;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        lpa0 lpa0Var = this.b;
        return iHashCode + (lpa0Var != null ? lpa0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.a);
        sb.append(",resolved=");
        return f4i1.g(sb, this.b != null, '}');
    }

    public kpa0(String... strArr) {
        this.a = Arrays.asList(strArr);
    }
}
