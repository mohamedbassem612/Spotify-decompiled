package p;

import defpackage.d;
import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ue00 {
    public Long a;
    public final en31 b;
    public final qs0 c = new qs0((byte) 5);

    public ue00(en31 en31Var) {
        this.b = en31Var;
    }

    public final void a(AbstractList abstractList) {
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM Events WHERE id IN (");
        anm1.h(abstractList.size(), sb);
        sb.append(")");
        qyo1.x(this.b, false, true, new d((Object) sb.toString(), (Object) abstractList, (byte) 9));
    }

    public final List b(long j, String str) {
        en31 en31Var = this.b;
        return str != null ? (List) qyo1.x(en31Var, true, false, new se00(j, b3o1.u(str))) : (List) qyo1.x(en31Var, true, false, new ps((byte) 9, j));
    }
}
