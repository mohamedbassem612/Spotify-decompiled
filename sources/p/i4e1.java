package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class i4e1 implements CharSequence {
    public final List a;
    public final List b;
    public final b8e1 c;
    public final CharSequence d;
    public final long e;
    public final nbe1 f;
    public final mmr0 g;

    public i4e1(CharSequence charSequence, long j, nbe1 nbe1Var, mmr0 mmr0Var, List list, List list2, b8e1 b8e1Var, int i) {
        nbe1Var = (i & 4) != 0 ? null : nbe1Var;
        mmr0Var = (i & 8) != 0 ? null : mmr0Var;
        list = (i & 16) != 0 ? null : list;
        list2 = (i & 32) != 0 ? null : list2;
        b8e1Var = (i & 64) != 0 ? null : b8e1Var;
        this.a = list;
        this.b = list2;
        this.c = b8e1Var;
        this.d = charSequence instanceof i4e1 ? ((i4e1) charSequence).d : charSequence;
        this.e = e6p1.f(charSequence.length(), j);
        this.f = nbe1Var != null ? new nbe1(e6p1.f(charSequence.length(), nbe1Var.a)) : null;
        this.g = mmr0Var != null ? new mmr0(mmr0Var.a, new nbe1(e6p1.f(charSequence.length(), ((nbe1) mmr0Var.b).a))) : null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.d.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i4e1.class != obj.getClass()) {
            return false;
        }
        i4e1 i4e1Var = (i4e1) obj;
        if (nbe1.c(this.e, i4e1Var.e) && u890.j(this.f, i4e1Var.f) && u890.j(this.g, i4e1Var.g) && u890.j(this.a, i4e1Var.a)) {
            return nhc1.O(this.d, i4e1Var.d) && u890.j(this.c, i4e1Var.c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        int i = nbe1.c;
        int iF = cy30.f(iHashCode, this.e, 31);
        nbe1 nbe1Var = this.f;
        int iHashCode2 = (iF + (nbe1Var != null ? Long.hashCode(nbe1Var.a) : 0)) * 31;
        mmr0 mmr0Var = this.g;
        int iHashCode3 = (iHashCode2 + (mmr0Var != null ? mmr0Var.hashCode() : 0)) * 31;
        List list = this.a;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        b8e1 b8e1Var = this.c;
        return iHashCode4 + (b8e1Var != null ? b8e1Var.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.d.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.d.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.d.toString();
    }
}
