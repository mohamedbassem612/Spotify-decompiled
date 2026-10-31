package p;

import java.util.Iterator;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lbh0 extends k6 {
    public final /* synthetic */ mbh0 a;

    public lbh0(mbh0 mbh0Var) {
        this.a = mbh0Var;
    }

    @Override // p.k6
    public final int b() {
        return this.a.a.groupCount() + 1;
    }

    public final p8h0 c(int i) {
        Matcher matcher = this.a.a;
        tr80 tr80VarQ = yoi1.Q(matcher.start(i), matcher.end(i));
        if (tr80VarQ.a >= 0) {
            return new p8h0(matcher.group(i), tr80VarQ);
        }
        return null;
    }

    @Override // p.k6, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof p8h0) {
            return super.contains((p8h0) obj);
        }
        return false;
    }

    @Override // p.k6, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new xpc1(new sgg1(new gv20(this, (byte) 22), new i46(p7h.K(this), (byte) 1)));
    }
}
