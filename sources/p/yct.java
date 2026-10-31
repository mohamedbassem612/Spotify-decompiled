package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yct {
    public final en31 a;
    public final qs0 b = new qs0((byte) 2);

    public yct(en31 en31Var) {
        this.a = en31Var;
    }

    public final List a(String str) {
        return (List) qyo1.x(this.a, true, false, new jfa(str, (byte) 4));
    }

    public final boolean b(String str) {
        return ((Boolean) qyo1.x(this.a, true, false, new jfa(str, (byte) 3))).booleanValue();
    }

    public final void c(vct vctVar) {
        qyo1.x(this.a, false, true, new b6(this, vctVar, (byte) 17));
    }
}
