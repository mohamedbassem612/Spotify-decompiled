package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hwa1 {
    public final bnl1 a;
    public final List b;

    public hwa1(bnl1 bnl1Var, List list) {
        this.a = bnl1Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwa1)) {
            return false;
        }
        hwa1 hwa1Var = (hwa1) obj;
        return this.a.equals(hwa1Var.a) && u890.j(this.b, hwa1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
