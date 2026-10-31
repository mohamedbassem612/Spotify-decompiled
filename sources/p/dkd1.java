package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dkd1 extends s5 {
    public final bkd1 a = new bkd1();
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;

    public dkd1(ArrayList arrayList, ala1 ala1Var) {
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        this.d = true;
        this.c = arrayList;
        arrayList2.add(ala1Var);
    }

    public static ArrayList l(ala1 ala1Var) {
        CharSequence charSequence = ala1Var.a;
        int iW = zno1.w(0, charSequence.length(), charSequence);
        int length = charSequence.length();
        if (charSequence.charAt(iW) == '|') {
            iW++;
            length = zno1.x(charSequence.length() - 1, iW, charSequence) + 1;
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i = iW;
        while (iW < length) {
            char cCharAt = charSequence.charAt(iW);
            if (cCharAt == '\\') {
                int i2 = iW + 1;
                if (i2 >= length || charSequence.charAt(i2) != '|') {
                    sb.append('\\');
                } else {
                    sb.append('|');
                    iW = i2;
                }
            } else if (cCharAt != '|') {
                sb.append(cCharAt);
            } else {
                arrayList.add(new ala1(sb.toString(), ala1Var.a(i, iW).b));
                sb.setLength(0);
                i = iW + 1;
            }
            iW++;
        }
        if (sb.length() > 0) {
            arrayList.add(new ala1(sb.toString(), ala1Var.a(i, ala1Var.a.length()).b));
        }
        return arrayList;
    }

    @Override // p.s5
    public final void a(ala1 ala1Var) {
        this.b.add(ala1Var);
    }

    @Override // p.s5
    public final boolean d() {
        return this.d;
    }

    @Override // p.s5
    public final e6b f() {
        return this.a;
    }

    @Override // p.s5
    public final void i(ug80 ug80Var) {
        bkd1 bkd1Var = this.a;
        List listC = bkd1Var.c();
        sla1 sla1Var = !listC.isEmpty() ? (sla1) listC.get(0) : null;
        lkd1 lkd1Var = new lkd1();
        if (sla1Var != null) {
            lkd1Var.a(sla1Var);
        }
        bkd1Var.b(lkd1Var);
        qkd1 qkd1Var = new qkd1();
        qkd1Var.e(lkd1Var.c());
        lkd1Var.b(qkd1Var);
        ArrayList arrayList = this.b;
        ArrayList arrayListL = l((ala1) arrayList.get(0));
        int size = arrayListL.size();
        for (int i = 0; i < size; i++) {
            qkd1Var.b(k((ala1) arrayListL.get(i), i, ug80Var));
        }
        int i2 = 2;
        ekd1 ekd1Var = null;
        while (i2 < arrayList.size()) {
            ala1 ala1Var = (ala1) arrayList.get(i2);
            sla1 sla1Var2 = i2 < listC.size() ? (sla1) listC.get(i2) : null;
            ArrayList arrayListL2 = l(ala1Var);
            qkd1 qkd1Var2 = new qkd1();
            if (sla1Var2 != null) {
                qkd1Var2.a(sla1Var2);
            }
            int i3 = 0;
            while (i3 < size) {
                qkd1Var2.b(k(i3 < arrayListL2.size() ? (ala1) arrayListL2.get(i3) : new ala1("", null), i3, ug80Var));
                i3++;
            }
            if (ekd1Var == null) {
                ekd1Var = new ekd1();
                bkd1Var.b(ekd1Var);
            }
            ekd1Var.b(qkd1Var2);
            ekd1Var.a(sla1Var2);
            i2++;
        }
    }

    @Override // p.s5
    public final jwg j(cqu cquVar) {
        CharSequence charSequence = cquVar.a.a;
        int iN = zno1.n('|', charSequence, cquVar.f);
        if (iN == -1) {
            return null;
        }
        if (iN != cquVar.f || zno1.w(iN + 1, charSequence.length(), charSequence) != charSequence.length()) {
            return jwg.a(cquVar.c);
        }
        this.d = false;
        return null;
    }

    public final fkd1 k(ala1 ala1Var, int i, ug80 ug80Var) {
        fkd1 fkd1Var = new fkd1();
        sla1 sla1Var = ala1Var.b;
        if (sla1Var != null) {
            fkd1Var.a(sla1Var);
        }
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            int i2 = ((ckd1) arrayList.get(i)).a;
        }
        CharSequence charSequence = ala1Var.a;
        int iW = zno1.w(0, charSequence.length(), charSequence);
        ala1 ala1VarA = ala1Var.a(iW, zno1.x(charSequence.length() - 1, iW, charSequence) + 1);
        ld50 ld50Var = new ld50();
        ld50Var.a.add(ala1VarA);
        ug80Var.e(ld50Var, fkd1Var);
        return fkd1Var;
    }
}
