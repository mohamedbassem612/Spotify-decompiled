package p;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class v8e1 extends am70 {
    public final String b;
    public final b380 c;

    public v8e1(String str, String str2, bg11 bg11Var) {
        super(str);
        dm5.m(!bg11Var.isEmpty());
        this.b = str2;
        b380 b380VarP = b380.p(bg11Var);
        this.c = b380VarP;
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    @Override // p.rij0
    public final void b(upq upqVar) {
        byte b;
        Integer numValueOf;
        switch (this.a) {
            case "TAL":
                b = 0;
                break;
            case "TCM":
                b = 1;
                break;
            case "TDA":
                b = 2;
                break;
            case "TP1":
                b = 3;
                break;
            case "TP2":
                b = 4;
                break;
            case "TP3":
                b = 5;
                break;
            case "TRK":
                b = 6;
                break;
            case "TT2":
                b = 7;
                break;
            case "TXT":
                b = 8;
                break;
            case "TYE":
                b = 9;
                break;
            case "TALB":
                b = 10;
                break;
            case "TCOM":
                b = 11;
                break;
            case "TCON":
                b = 12;
                break;
            case "TDAT":
                b = 13;
                break;
            case "TDRC":
                b = 14;
                break;
            case "TDRL":
                b = 15;
                break;
            case "TEXT":
                b = 16;
                break;
            case "TIT2":
                b = 17;
                break;
            case "TPE1":
                b = 18;
                break;
            case "TPE2":
                b = 19;
                break;
            case "TPE3":
                b = 20;
                break;
            case "TPOS":
                b = 21;
                break;
            case "TRCK":
                b = 22;
                break;
            case "TSST":
                b = 23;
                break;
            case "TYER":
                b = 24;
                break;
            default:
                b = -1;
                break;
        }
        b380 b380Var = this.c;
        try {
            switch (b) {
                case 0:
                case 10:
                    upqVar.c = (CharSequence) b380Var.get(0);
                    break;
                case 1:
                case 11:
                    upqVar.A = (CharSequence) b380Var.get(0);
                    break;
                case 2:
                case 13:
                    String str = (String) b380Var.get(0);
                    int i = Integer.parseInt(str.substring(2, 4));
                    int i2 = Integer.parseInt(str.substring(0, 2));
                    upqVar.u = Integer.valueOf(i);
                    upqVar.v = Integer.valueOf(i2);
                    break;
                case 3:
                case 18:
                    upqVar.b = (CharSequence) b380Var.get(0);
                    break;
                case 4:
                case 19:
                    upqVar.d = (CharSequence) b380Var.get(0);
                    break;
                case 5:
                case 20:
                    upqVar.B = (CharSequence) b380Var.get(0);
                    break;
                case 6:
                case 22:
                    String str2 = (String) b380Var.get(0);
                    String str3 = zoi1.a;
                    String[] strArrSplit = str2.split("/", -1);
                    int i3 = Integer.parseInt(strArrSplit[0]);
                    numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    upqVar.o = Integer.valueOf(i3);
                    upqVar.f152p = numValueOf;
                    break;
                case 7:
                case 17:
                    upqVar.a = (CharSequence) b380Var.get(0);
                    break;
                case 8:
                case 16:
                    upqVar.z = (CharSequence) b380Var.get(0);
                    break;
                case 9:
                case 24:
                    upqVar.t = Integer.valueOf(Integer.parseInt((String) b380Var.get(0)));
                    break;
                case 12:
                    Integer numH0 = bmq0.h0((String) b380Var.get(0));
                    if (numH0 != null) {
                        String strA = cm70.a(numH0.intValue());
                        if (strA != null) {
                            upqVar.F = strA;
                        }
                    } else {
                        upqVar.F = (CharSequence) b380Var.get(0);
                    }
                    break;
                case 14:
                    ArrayList arrayListD = d((String) b380Var.get(0));
                    int size = arrayListD.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                upqVar.v = (Integer) arrayListD.get(2);
                            }
                        }
                        upqVar.u = (Integer) arrayListD.get(1);
                    }
                    upqVar.t = (Integer) arrayListD.get(0);
                    break;
                case 15:
                    ArrayList arrayListD2 = d((String) b380Var.get(0));
                    int size2 = arrayListD2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                upqVar.y = (Integer) arrayListD2.get(2);
                            }
                        }
                        upqVar.x = (Integer) arrayListD2.get(1);
                    }
                    upqVar.w = (Integer) arrayListD2.get(0);
                    break;
                case 21:
                    String str4 = (String) b380Var.get(0);
                    String str5 = zoi1.a;
                    String[] strArrSplit2 = str4.split("/", -1);
                    int i4 = Integer.parseInt(strArrSplit2[0]);
                    numValueOf = strArrSplit2.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit2[1])) : null;
                    upqVar.D = Integer.valueOf(i4);
                    upqVar.E = numValueOf;
                    break;
                case 23:
                    upqVar.C = (CharSequence) b380Var.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v8e1.class != obj.getClass()) {
            return false;
        }
        v8e1 v8e1Var = (v8e1) obj;
        if (!this.a.equals(v8e1Var.a) || !Objects.equals(this.b, v8e1Var.b)) {
            return false;
        }
        b380 b380Var = v8e1Var.c;
        b380 b380Var2 = this.c;
        b380Var2.getClass();
        return z1p1.j(b380Var2, b380Var);
    }

    public final int hashCode() {
        int iD = cy30.d(527, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((iD + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // p.am70
    public final String toString() {
        return this.a + ": description=" + this.b + ": values=" + this.c;
    }
}
