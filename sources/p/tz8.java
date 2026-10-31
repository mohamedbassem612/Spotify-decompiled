package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tz8 extends fin {
    public final String a;
    public final String b;
    public final List c;
    public final fin d;
    public final int e;

    public tz8(String str, String str2, List list, fin finVar, int i) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = finVar;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fin) {
            tz8 tz8Var = (tz8) ((fin) obj);
            if (this.a.equals(tz8Var.a)) {
                String str = tz8Var.b;
                String str2 = this.b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.c.equals(tz8Var.c)) {
                        fin finVar = tz8Var.d;
                        fin finVar2 = this.d;
                        if (finVar2 != null ? finVar2.equals(finVar) : finVar == null) {
                            if (this.e == tz8Var.e) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        fin finVar = this.d;
        return this.e ^ ((iHashCode2 ^ (finVar != null ? finVar.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.a);
        sb.append(", reason=");
        sb.append(this.b);
        sb.append(", frames=");
        sb.append(this.c);
        sb.append(", causedBy=");
        sb.append(this.d);
        sb.append(", overflowCount=");
        return gvg.j(sb, this.e, "}");
    }
}
