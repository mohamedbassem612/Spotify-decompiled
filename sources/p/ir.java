package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ir {
    public final c380 a;
    public final boolean b;

    public ir(hr hrVar) {
        List<ev> list = hrVar.a;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (ev evVar : list) {
            String str = evVar.c;
            String str2 = str == null ? "" : str;
            String str3 = evVar.a;
            String str4 = evVar.b;
            String str5 = str4 == null ? "" : str4;
            Integer num = evVar.d;
            arrayList.add(new phx(num != null ? u7h.b(z4p1.e(num.intValue()), 1.0f, 0.0f, 0.0f, 0.0f, 14) : u7h.k, str2, str3, str5));
        }
        c380 c380VarA = mqo1.A(arrayList);
        boolean z = !hrVar.b;
        this.a = c380VarA;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ir)) {
            return false;
        }
        ir irVar = (ir) obj;
        return this.a.equals(irVar.a) && this.b == irVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
