package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qya1 implements Iterator {
    public String b;
    public final CharSequence c;
    public final xme d;
    public final boolean e;
    public int g;
    public final /* synthetic */ byte h;
    public final /* synthetic */ sya1 i;
    public int a = 2;
    public int f = 0;

    public qya1(sya1 sya1Var, tya1 tya1Var, CharSequence charSequence, byte b) {
        this.h = b;
        this.i = sya1Var;
        this.d = tya1Var.a;
        this.e = tya1Var.b;
        this.g = tya1Var.d;
        this.c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        int length;
        xme xmeVar;
        dm5.y(this.a != 4);
        int iC = l1d.C(this.a);
        if (iC == 0) {
            return true;
        }
        if (iC != 2) {
            this.a = 4;
            int i = this.f;
            while (true) {
                int iB = this.f;
                if (iB != -1) {
                    byte b = this.h;
                    k0p1 k0p1Var = this.i;
                    CharSequence charSequence = this.c;
                    switch (b) {
                        case SplitInstallErrorCode.NO_ERROR /* 0 */:
                            iB = ((rme) ((ks21) k0p1Var).b).b(charSequence, iB);
                            break;
                        default:
                            String str = k0p1Var.a;
                            int length2 = str.length();
                            int length3 = charSequence.length() - length2;
                            while (true) {
                                if (iB > length3) {
                                    iB = -1;
                                    break;
                                } else {
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 >= length2) {
                                            break;
                                        } else if (charSequence.charAt(i2 + iB) != str.charAt(i2)) {
                                            iB++;
                                        } else {
                                            i2++;
                                        }
                                    }
                                }
                            }
                            break;
                    }
                    if (iB == -1) {
                        iB = charSequence.length();
                        this.f = -1;
                        length = -1;
                    } else {
                        switch (b) {
                            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                                length = iB + 1;
                                break;
                            default:
                                length = k0p1Var.a.length() + iB;
                                break;
                        }
                        this.f = length;
                    }
                    if (length == i) {
                        int i3 = length + 1;
                        this.f = i3;
                        if (i3 > charSequence.length()) {
                            this.f = -1;
                        }
                    } else {
                        while (true) {
                            xmeVar = this.d;
                            if (i < iB && xmeVar.d(charSequence.charAt(i))) {
                                i++;
                            }
                        }
                        while (iB > i && xmeVar.d(charSequence.charAt(iB - 1))) {
                            iB--;
                        }
                        if (this.e && i == iB) {
                            i = this.f;
                        } else {
                            int i4 = this.g;
                            if (i4 == 1) {
                                iB = charSequence.length();
                                this.f = -1;
                                while (iB > i && xmeVar.d(charSequence.charAt(iB - 1))) {
                                    iB--;
                                }
                            } else {
                                this.g = i4 - 1;
                            }
                            string = charSequence.subSequence(i, iB).toString();
                        }
                    }
                } else {
                    this.a = 3;
                    string = null;
                }
            }
            this.b = string;
            if (this.a != 3) {
                this.a = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            hhg1.k();
            return null;
        }
        this.a = 2;
        String str = this.b;
        this.b = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
