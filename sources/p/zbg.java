package p;

import android.os.Message;
import java.util.Comparator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zbg implements Comparator {
    public final /* synthetic */ byte a;

    public /* synthetic */ zbg(byte b) {
        this.a = b;
    }

    public static int a(b0o1 b0o1Var) {
        if (b0o1Var instanceof chm) {
            return 0;
        }
        if (b0o1Var instanceof ygm) {
            return 1;
        }
        if (b0o1Var instanceof bhm) {
            return 2;
        }
        if (b0o1Var instanceof ahm) {
            return 3;
        }
        if (b0o1Var instanceof zgm) {
            return 4;
        }
        if (b0o1Var == null) {
            return Integer.MAX_VALUE;
        }
        eg.o();
        return 0;
    }

    public static int b(b0o1 b0o1Var) {
        if (b0o1Var instanceof ygm) {
            return ((ygm) b0o1Var).r();
        }
        if (b0o1Var instanceof bhm) {
            return ((bhm) b0o1Var).r();
        }
        if (u890.j(b0o1Var, ahm.c) || u890.j(b0o1Var, zgm.c) || u890.j(b0o1Var, chm.c) || b0o1Var == null) {
            return 2;
        }
        eg.o();
        return 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2 = 2;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                int iMin = Math.min(str.length(), str2.length());
                for (int i3 = 4; i3 < iMin; i3++) {
                    char cCharAt = str.charAt(i3);
                    char cCharAt2 = str2.charAt(i3);
                    if (cCharAt != cCharAt2) {
                        if (u890.q(cCharAt, cCharAt2) < 0) {
                            return -1;
                        }
                        return 1;
                    }
                }
                int length = str.length();
                int length2 = str2.length();
                if (length == length2) {
                    return 0;
                }
                if (length < length2) {
                    return -1;
                }
                return 1;
            case 1:
                return pap1.t(((nvg) obj).d(), ((nvg) obj2).d());
            case 2:
                hmb0 hmb0Var = (hmb0) obj;
                hmb0 hmb0Var2 = (hmb0) obj2;
                int iQ = u890.q(hmb0Var.Q0, hmb0Var2.Q0);
                return iQ != 0 ? iQ : u890.q(hmb0Var.hashCode(), hmb0Var2.hashCode());
            case 3:
                return ((i4u) obj).a - ((i4u) obj2).a;
            case 4:
                ssp0 ssp0Var = (ssp0) obj;
                ssp0 ssp0Var2 = (ssp0) obj2;
                if (ssp0Var.c() == 6) {
                    return -1;
                }
                if (ssp0Var2.c() != 6) {
                    if (ssp0Var.d() && ssp0Var2.d()) {
                        return u890.r(ssp0Var2.b(), ssp0Var.b());
                    }
                    if (!ssp0Var.d() && !ssp0Var2.d()) {
                        return ssp0Var2.a() - ssp0Var.a();
                    }
                    if (ssp0Var.d()) {
                        return -1;
                    }
                }
                return 1;
            case 5:
                ((lzp0) obj2).getClass();
                ((lzp0) obj).getClass();
                return pap1.t(2, 2);
            case 6:
                b0o1 b0o1VarM = xio1.m((jhm) obj);
                b0o1 b0o1VarM2 = xio1.m((jhm) obj2);
                int iA = a(b0o1VarM);
                int iA2 = a(b0o1VarM2);
                if (iA != iA2) {
                    return u890.q(iA, iA2);
                }
                int iC = l1d.C(b(b0o1VarM));
                if (iC == 0) {
                    i = 1;
                } else {
                    if (iC != 1) {
                        if (iC == 2) {
                            i = 3;
                        }
                        eg.o();
                        return 0;
                    }
                    i = 2;
                }
                int iC2 = l1d.C(b(b0o1VarM2));
                if (iC2 == 0) {
                    i2 = 1;
                } else if (iC2 != 1) {
                    if (iC2 == 2) {
                        i2 = 3;
                    }
                    eg.o();
                    return 0;
                }
                return u890.q(i, i2);
            default:
                return pap1.t(Long.valueOf(((Message) obj).getWhen()), Long.valueOf(((Message) obj2).getWhen()));
        }
    }
}
