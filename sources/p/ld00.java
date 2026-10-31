package p;

import java.util.AbstractList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ld00 {
    public final en31 a;
    public final qs0 b = new qs0((byte) 4);

    public ld00(en31 en31Var) {
        this.a = en31Var;
    }

    public final void a(AbstractList abstractList) {
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM EventSequenceNumbers WHERE sequenceId IN (");
        anm1.h(abstractList.size(), sb);
        sb.append(")");
        qyo1.x(this.a, false, true, new f0z(sb.toString(), abstractList, (byte) 11));
    }
}
