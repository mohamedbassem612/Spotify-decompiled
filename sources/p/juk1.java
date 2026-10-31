package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class juk1 implements rij0 {
    public final String a;
    public final String b;

    public juk1(String str, String str2) {
        this.a = eth.Z(str);
        this.b = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p.rij0
    public final void b(upq upqVar) {
        String str = this.a;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    b = 0;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    b = 1;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    b = 2;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    b = 3;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    b = 4;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    b = 5;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    b = 6;
                }
                break;
            case 905239725:
                if (str.equals("DISCSUBTITLE")) {
                    b = 7;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    b = 8;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    b = 9;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    b = 10;
                }
                break;
        }
        String str2 = this.b;
        switch (b) {
            case 0:
                Integer numH0 = bmq0.h0(str2);
                if (numH0 != null) {
                    upqVar.f152p = numH0;
                }
                break;
            case 1:
                Integer numH1 = bmq0.h0(str2);
                if (numH1 != null) {
                    upqVar.E = numH1;
                }
                break;
            case 2:
                Integer numH2 = bmq0.h0(str2);
                if (numH2 != null) {
                    upqVar.o = numH2;
                }
                break;
            case 3:
                upqVar.c = str2;
                break;
            case 4:
                upqVar.F = str2;
                break;
            case 5:
                upqVar.a = str2;
                break;
            case 6:
                upqVar.g = str2;
                break;
            case 7:
                upqVar.C = str2;
                break;
            case 8:
                Integer numH3 = bmq0.h0(str2);
                if (numH3 != null) {
                    upqVar.D = numH3;
                }
                break;
            case 9:
                upqVar.d = str2;
                break;
            case 10:
                upqVar.b = str2;
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && juk1.class == obj.getClass()) {
            juk1 juk1Var = (juk1) obj;
            if (this.a.equals(juk1Var.a) && this.b.equals(juk1Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + cy30.d(527, 31, this.a);
    }

    public final String toString() {
        return "VC: " + this.a + "=" + this.b;
    }
}
