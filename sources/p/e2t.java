package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e2t implements aey0 {
    public final Map a;

    public e2t(Map map) {
        this.a = map;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0036 A[RETURN] */
    public final Enum a(String str, Enum r6) {
        String str2;
        z0z[] z0zVarArr;
        m67 m67Var = (m67) this.a.get(str);
        if (m67Var != null && (str2 = m67Var.e) != null && (z0zVarArr = (Enum[]) r6.getDeclaringClass().getEnumConstants()) != null) {
            for (z0z z0zVar : z0zVarArr) {
                if (u890.j(z0zVar.value(), str2)) {
                    if (z0zVar == null) {
                        return z0zVar;
                    }
                }
            }
            z0zVar = null;
            if (z0zVar == null) {
                return z0zVar;
            }
        }
        return r6;
    }

    public final int b(int i, int i2, int i3, String str) {
        Integer num;
        int iIntValue;
        m67 m67Var = (m67) this.a.get(str);
        return ((m67Var != null ? m67Var.a() : 0) == 2 && (num = m67Var.d) != null && i <= (iIntValue = num.intValue()) && iIntValue <= i2) ? iIntValue : i3;
    }

    public final boolean c(String str, boolean z) {
        Boolean bool;
        m67 m67Var = (m67) this.a.get(str);
        return ((m67Var != null ? m67Var.a() : 0) != 1 || (bool = m67Var.c) == null) ? z : bool.booleanValue();
    }
}
