package p;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yr31 {
    public int a;
    public int b;
    public int c;
    public final Serializable d;
    public Object e;

    public yr31(ArrayList arrayList) {
        this.e = new ala1("", null);
        this.c = 0;
        this.d = arrayList;
        this.a = 0;
        this.b = 0;
        if (arrayList.isEmpty()) {
            return;
        }
        b(0, 0);
        ala1 ala1Var = (ala1) arrayList.get(0);
        this.e = ala1Var;
        this.c = ala1Var.a.length();
    }

    public zr31 a() {
        return new zr31(this);
    }

    public void b(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        if (i < 0 || i >= arrayList.size()) {
            hhg1.n(cy30.i(i, "Line index ", arrayList.size(), " out of range, number of lines: "));
            return;
        }
        ala1 ala1Var = (ala1) arrayList.get(i);
        if (i2 < 0 || i2 > ala1Var.a.length()) {
            hhg1.n(cy30.i(i2, "Index ", ala1Var.a.length(), " out of range, line length: "));
        }
    }

    public int c(char c) {
        int i = 0;
        while (true) {
            char cK = k();
            if (cK == 0) {
                return -1;
            }
            if (cK == c) {
                return i;
            }
            i++;
            h();
        }
    }

    public ld50 d(d9z0 d9z0Var, d9z0 d9z0Var2) {
        ArrayList arrayList = (ArrayList) this.d;
        int i = d9z0Var.b;
        int i2 = d9z0Var.c;
        int i3 = d9z0Var2.b;
        int i4 = d9z0Var2.c;
        if (i == i3) {
            ala1 ala1Var = (ala1) arrayList.get(i);
            CharSequence charSequenceSubSequence = ala1Var.a.subSequence(i2, i4);
            sla1 sla1Var = ala1Var.b;
            ala1 ala1Var2 = new ala1(charSequenceSubSequence, sla1Var != null ? sla1Var.a(i2, i4) : null);
            ld50 ld50Var = new ld50();
            ld50Var.a.add(ala1Var2);
            return ld50Var;
        }
        ld50 ld50Var2 = new ld50();
        ala1 ala1Var3 = (ala1) arrayList.get(i);
        ala1 ala1VarA = ala1Var3.a(i2, ala1Var3.a.length());
        ArrayList arrayList2 = ld50Var2.a;
        arrayList2.add(ala1VarA);
        while (true) {
            i++;
            if (i >= i3) {
                arrayList2.add(((ala1) arrayList.get(i3)).a(0, i4));
                return ld50Var2;
            }
            arrayList2.add((ala1) arrayList.get(i));
        }
    }

    public boolean e() {
        return this.b < this.c || this.a < ((ArrayList) this.d).size() - 1;
    }

    public int f(bv40 bv40Var) {
        int i = 0;
        while (((BitSet) bv40Var.b).get(k())) {
            i++;
            h();
        }
        return i;
    }

    public int g(char c) {
        int i = 0;
        while (k() == c) {
            i++;
            h();
        }
        return i;
    }

    public void h() {
        ArrayList arrayList = (ArrayList) this.d;
        int i = this.b + 1;
        this.b = i;
        if (i > this.c) {
            int i2 = this.a + 1;
            this.a = i2;
            if (i2 < arrayList.size()) {
                ala1 ala1Var = (ala1) arrayList.get(this.a);
                this.e = ala1Var;
                this.c = ala1Var.a.length();
            } else {
                ala1 ala1Var2 = new ala1("", null);
                this.e = ala1Var2;
                this.c = ala1Var2.a.length();
            }
            this.b = 0;
        }
    }

    public boolean i(char c) {
        if (k() != c) {
            return false;
        }
        h();
        return true;
    }

    public boolean j(String str) {
        int i = this.b;
        if (i < this.c && str.length() + i <= this.c) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (((ala1) this.e).a.charAt(this.b + i2) == str.charAt(i2)) {
                }
            }
            this.b = str.length() + this.b;
            return true;
        }
        return false;
    }

    public char k() {
        int i = this.b;
        if (i < this.c) {
            return ((ala1) this.e).a.charAt(i);
        }
        return this.a < ((ArrayList) this.d).size() + (-1) ? '\n' : (char) 0;
    }

    public d9z0 l() {
        return new d9z0((byte) 2, this.a, this.b);
    }

    public void m() {
        this.b = 0;
    }

    public void n(d9z0 d9z0Var) {
        int i = d9z0Var.b;
        int i2 = d9z0Var.c;
        b(i, i2);
        this.a = i;
        this.b = i2;
        ala1 ala1Var = (ala1) ((ArrayList) this.d).get(i);
        this.e = ala1Var;
        this.c = ala1Var.a.length();
    }

    public int o() {
        int i = 0;
        while (true) {
            char cK = k();
            if (cK != ' ') {
                switch (cK) {
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                        break;
                    default:
                        return i;
                }
            }
            i++;
            h();
        }
    }

    public yr31(String str) {
        o0c.l(!TextUtils.isEmpty(str));
        this.d = str;
        this.a = 1;
        this.c = 0;
    }
}
