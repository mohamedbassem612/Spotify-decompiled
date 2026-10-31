package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class if5 {
    public final Integer a;
    public final String b;
    public final b2i c;
    public final hf5 d;

    public if5(Integer num, String str, b2i b2iVar, hf5 hf5Var, int i) {
        num = (i & 1) != 0 ? null : num;
        str = (i & 2) != 0 ? null : str;
        b2iVar = (i & 4) != 0 ? null : b2iVar;
        hf5Var = (i & 8) != 0 ? null : hf5Var;
        this.a = num;
        this.b = str;
        this.c = b2iVar;
        this.d = hf5Var;
    }

    public final j2i a(qim0 qim0Var, lee1 lee1Var, u7h u7hVar, ib60 ib60Var, b0k b0kVar, int i) {
        ib60 ib60Var2;
        j2i j2iVar;
        String strK;
        if ((i & 1) != 0) {
            qim0Var = nim0.a;
        }
        qim0 qim0Var2 = qim0Var;
        lee1 lee1Var2 = (i & 2) != 0 ? null : lee1Var;
        u7h u7hVar2 = (i & 4) != 0 ? null : u7hVar;
        hf5 hf5Var = this.d;
        if (hf5Var != null) {
            ib60Var2 = ib60Var;
            j2iVar = new j2i(-247872458, new jb1(hf5Var, ib60Var2, lee1Var2, u7hVar2, qim0Var2, (byte) 2), true);
        } else {
            ib60Var2 = ib60Var;
            b2i b2iVar = this.c;
            if (b2iVar != null) {
                j2iVar = new j2i(-1381132514, new jb1(b2iVar, ib60Var2, lee1Var2, u7hVar2, qim0Var2, (byte) 1), true);
            } else {
                String str = this.b;
                j2iVar = str != null ? new j2i(-1465842740, new jb1(str, ib60Var2, lee1Var2, u7hVar2, qim0Var2, (byte) 3), true) : null;
            }
        }
        if (j2iVar != null) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(-1122295248);
            x340Var.r(false);
            return j2iVar;
        }
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.i0(-431128901);
        Integer num = this.a;
        if (num == null) {
            x340Var2.i0(-431166474);
            x340Var2.r(false);
            strK = null;
        } else {
            strK = kk0.k(x340Var2, -431166473, num, x340Var2, false);
        }
        j2i j2iVar2 = strK != null ? new j2i(-1465842740, new jb1(strK, ib60Var2, lee1Var2, u7hVar2, qim0Var2, (byte) 3), true) : null;
        x340Var2.r(false);
        return j2iVar2;
    }

    public final j2i b(qim0 qim0Var, lee1 lee1Var, u7h u7hVar, b0k b0kVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            qim0Var = nim0.a;
        }
        return a(qim0Var, (i2 & 2) != 0 ? null : lee1Var, (i2 & 4) != 0 ? null : u7hVar, null, b0kVar, 0);
    }

    public final String c(b0k b0kVar) {
        String str;
        af5 af5VarH;
        hf5 hf5Var = this.d;
        if (hf5Var == null) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(-249192858);
            x340Var.r(false);
            str = null;
        } else {
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(-249192857);
            x340Var2.i0(-1809153613);
            str = hf5Var.a.o(hf5Var.b, x340Var2).b;
            x340Var2.r(false);
            x340Var2.r(false);
        }
        if (str == null) {
            x340 x340Var3 = (x340) b0kVar;
            x340Var3.i0(-249103019);
            b2i b2iVar = this.c;
            if (b2iVar == null) {
                x340Var3.i0(-249112041);
                x340Var3.r(false);
                af5VarH = null;
            } else {
                x340Var3.i0(-1809151190);
                af5VarH = b2iVar.h(x340Var3);
                x340Var3.r(false);
            }
            String str2 = af5VarH != null ? af5VarH.b : null;
            x340Var3.r(false);
            str = str2;
        } else {
            x340 x340Var4 = (x340) b0kVar;
            x340Var4.i0(-1809154464);
            x340Var4.r(false);
        }
        if (str != null) {
            x340 x340Var5 = (x340) b0kVar;
            x340Var5.i0(-1809154426);
            x340Var5.r(false);
            return str;
        }
        x340 x340Var6 = (x340) b0kVar;
        x340Var6.i0(-1809150241);
        String strU = zmo1.u(this.a, this.b, x340Var6);
        x340Var6.r(false);
        return strU;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof if5)) {
            return false;
        }
        if5 if5Var = (if5) obj;
        return u890.j(this.a, if5Var.a) && u890.j(this.b, if5Var.b) && u890.j(this.c, if5Var.c) && u890.j(this.d, if5Var.d);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        b2i b2iVar = this.c;
        int iHashCode3 = (iHashCode2 + (b2iVar == null ? 0 : b2iVar.hashCode())) * 31;
        hf5 hf5Var = this.d;
        return iHashCode3 + (hf5Var != null ? hf5Var.hashCode() : 0);
    }
}
