package p;

import java.text.BreakIterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zf extends yf {
    public static zf e;
    public static zf f;
    public static zf g;
    public final /* synthetic */ byte c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zf(byte b) {
        super((byte) 0);
        this.c = b;
    }

    @Override // p.yf
    public final int[] f(int i) {
        int iD;
        switch (this.c) {
            case 0:
                int length = m().length();
                if (length <= 0 || i >= length) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator == null) {
                        u890.C("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = (BreakIterator) this.d;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            u890.C("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return l(i, iFollowing);
                    }
                    if (breakIterator2 == null) {
                        u890.C("impl");
                        throw null;
                    }
                    i = breakIterator2.following(i);
                } while (i != -1);
                return null;
            case 1:
                if (m().length() <= 0 || i >= m().length()) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                while (!y(i) && (!y(i) || (i != 0 && y(i - 1)))) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 == null) {
                        u890.C("impl");
                        throw null;
                    }
                    i = breakIterator3.following(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 == null) {
                    u890.C("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator4.following(i);
                if (iFollowing2 == -1 || !x(iFollowing2)) {
                    return null;
                }
                return l(i, iFollowing2);
            default:
                if (m().length() <= 0 || i >= m().length()) {
                    return null;
                }
                y9e1 y9e1Var = (y9e1) this.d;
                if (i < 0) {
                    if (y9e1Var == null) {
                        u890.C("layoutResult");
                        throw null;
                    }
                    iD = y9e1Var.b.d(0);
                } else {
                    if (y9e1Var == null) {
                        u890.C("layoutResult");
                        throw null;
                    }
                    int iD2 = y9e1Var.b.d(i);
                    iD = v(iD2, 2) == i ? iD2 : iD2 + 1;
                }
                y9e1 y9e1Var2 = (y9e1) this.d;
                if (y9e1Var2 == null) {
                    u890.C("layoutResult");
                    throw null;
                }
                if (iD >= y9e1Var2.b.f) {
                    return null;
                }
                return l(v(iD, 2), v(iD, 1) + 1);
        }
    }

    @Override // p.yf
    public final int[] r(int i) {
        int iD;
        switch (this.c) {
            case 0:
                int length = m().length();
                if (length <= 0 || i <= 0) {
                    return null;
                }
                if (i > length) {
                    i = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator == null) {
                        u890.C("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = (BreakIterator) this.d;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            u890.C("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return l(iPreceding, i);
                    }
                    if (breakIterator2 == null) {
                        u890.C("impl");
                        throw null;
                    }
                    i = breakIterator2.preceding(i);
                } while (i != -1);
                return null;
            case 1:
                int length2 = m().length();
                if (length2 <= 0 || i <= 0) {
                    return null;
                }
                if (i > length2) {
                    i = length2;
                }
                while (i > 0 && !y(i - 1) && !x(i)) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 == null) {
                        u890.C("impl");
                        throw null;
                    }
                    i = breakIterator3.preceding(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 == null) {
                    u890.C("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator4.preceding(i);
                if (iPreceding2 == -1 || !y(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !y(iPreceding2 - 1)) {
                    return l(iPreceding2, i);
                }
                return null;
            default:
                if (m().length() <= 0 || i <= 0) {
                    return null;
                }
                int length3 = m().length();
                y9e1 y9e1Var = (y9e1) this.d;
                if (i > length3) {
                    if (y9e1Var == null) {
                        u890.C("layoutResult");
                        throw null;
                    }
                    iD = y9e1Var.b.d(m().length());
                } else {
                    if (y9e1Var == null) {
                        u890.C("layoutResult");
                        throw null;
                    }
                    int iD2 = y9e1Var.b.d(i);
                    iD = v(iD2, 1) + 1 == i ? iD2 : iD2 - 1;
                }
                if (iD < 0) {
                    return null;
                }
                return l(v(iD, 2), v(iD, 1) + 1);
        }
    }

    public int v(int i, int i2) {
        y9e1 y9e1Var = (y9e1) this.d;
        if (y9e1Var == null) {
            u890.C("layoutResult");
            throw null;
        }
        int i3 = y9e1Var.i(i);
        y9e1 y9e1Var2 = (y9e1) this.d;
        if (y9e1Var2 == null) {
            u890.C("layoutResult");
            throw null;
        }
        int iJ = y9e1Var2.j(i3);
        y9e1 y9e1Var3 = (y9e1) this.d;
        if (i2 != iJ) {
            if (y9e1Var3 != null) {
                return y9e1Var3.i(i);
            }
            u890.C("layoutResult");
            throw null;
        }
        if (y9e1Var3 != null) {
            return y9e1Var3.b.c(i, false) - 1;
        }
        u890.C("layoutResult");
        throw null;
    }

    public void w(String str) {
        switch (this.c) {
            case 0:
                this.a = str;
                BreakIterator breakIterator = (BreakIterator) this.d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    u890.C("impl");
                    throw null;
                }
            default:
                this.a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    u890.C("impl");
                    throw null;
                }
        }
    }

    public boolean x(int i) {
        if (i <= 0 || !y(i - 1)) {
            return false;
        }
        return i == m().length() || !y(i);
    }

    public boolean y(int i) {
        if (i < 0 || i >= m().length()) {
            return false;
        }
        return Character.isLetterOrDigit(m().codePointAt(i));
    }
}
