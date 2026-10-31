package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class f141 implements aey0 {
    public final Map a;

    public f141(Map map) {
        this.a = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // p.aey0
    public final Enum a(String str, Enum r7) {
        m67 m67VarD = d(3, str);
        ?? r6 = 0;
        String str2 = m67VarD != null ? m67VarD.e : null;
        Object[] objArr = (Enum[]) r7.getDeclaringClass().getEnumConstants();
        if (str2 != null && objArr != null) {
            for (Object obj : objArr) {
                if (u890.j(((z0z) obj).value(), str2)) {
                    r6 = obj;
                    break;
                }
            }
            if (r6 != 0) {
                return r6;
            }
        }
        return r7;
    }

    @Override // p.aey0
    public final int b(int i, int i2, int i3, String str) {
        Integer num;
        int iIntValue;
        m67 m67VarD = d(2, str);
        return (m67VarD == null || (num = m67VarD.d) == null || i > (iIntValue = num.intValue()) || iIntValue > i2) ? i3 : iIntValue;
    }

    @Override // p.aey0
    public final boolean c(String str, boolean z) {
        Boolean bool;
        m67 m67VarD = d(1, str);
        return (m67VarD == null || (bool = m67VarD.c) == null) ? z : bool.booleanValue();
    }

    public final m67 d(int i, String str) {
        m67 m67Var = (m67) this.a.get(str);
        if (m67Var == null || i != m67Var.a()) {
            return null;
        }
        return m67Var;
    }
}
