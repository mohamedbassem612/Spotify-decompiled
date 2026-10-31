package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class olt {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final Integer d;
    public final Integer e;

    public olt(String str, boolean z, boolean z2, Integer num, Integer num2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = num;
        this.e = num2;
    }

    public static olt a(olt oltVar, String str, boolean z, boolean z2, Integer num, Integer num2, int i) {
        if ((i & 1) != 0) {
            str = oltVar.a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            z = oltVar.b;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            z2 = oltVar.c;
        }
        boolean z4 = z2;
        if ((i & 8) != 0) {
            num = oltVar.d;
        }
        Integer num3 = num;
        if ((i & 16) != 0) {
            num2 = oltVar.e;
        }
        oltVar.getClass();
        return new olt(str2, z3, z4, num3, num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof olt)) {
            return false;
        }
        olt oltVar = (olt) obj;
        return this.a.equals(oltVar.a) && this.b == oltVar.b && this.c == oltVar.c && u890.j(this.d, oltVar.d) && u890.j(this.e, oltVar.e);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        int iHashCode = (iG + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }
}
